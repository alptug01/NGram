import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NGram {
	private String str;
	private ArrayList<String> ogrenciNotlari = new ArrayList<String>();
	public NGram(String str,int n) {
		stringOperations(str);
		ngramOperations(n);
	}
	private void stringOperations(String text) {
		str = text.replaceAll("[\\p{Punct}&&[^']]", "").replaceAll("\n", " ").replaceAll("'", " ").replaceAll("\\s+", " ");
		str=str.toLowerCase();
	}
	private void ngramOperations(int n) {
		HashMap<String, Integer> ngram_map = new HashMap<>();
	    String[] words = str.split("\\s+");
	    for (int i = 0; i <= words.length - n; i++) {
	        StringBuilder temp_str = new StringBuilder();
	        for (int j = 0; j < n; j++) {
	            temp_str.append(words[i + j]);
	            if (j < n - 1) {
	                temp_str.append(" ");
	            }
	        }
	        String final_str = temp_str.toString();
	        if (ngram_map.containsKey(final_str)) {
	            ngram_map.put(final_str, ngram_map.get(final_str) + 1);
	        } else {
	            ngram_map.put(final_str, 1);
	        }
	    }
	    print_hashmap(ngram_map);		
	}
	private void print_hashmap(HashMap<String, Integer> ngram_map) {
		List<Map.Entry<String, Integer>> entryList = new ArrayList<>(ngram_map.entrySet());
        entryList.sort(Map.Entry.comparingByValue(Collections.reverseOrder()));
        
        int count=0;
        for (Map.Entry<String, Integer> entry : entryList) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
            count++;
            if(count==20) {
            	break;
            }
        }
	}
}
