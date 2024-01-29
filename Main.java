import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("1-Bilim İş Başında\n2-Bozkırda\n3-Değişim\n4-Denemeler\n5-Grimms Fairy Tales\nSelect the book:");
		int option = input.nextInt();
		if(option<=0 || option>5) {
			System.out.println("Wrong choice");
		}
		else {
			String[] book_names= {"BİLİM İŞ BAŞINDA.txt","BOZKIRDA.txt","DEĞİŞİM.txt","DENEMELER.txt","grimms-fairy-tales_P1.txt"};
			String file_name=book_names[option-1];
			try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file_name), Charset.forName("ISO-8859-9")))) {
	
	            String line;
	            String text="";
	            while ((line = br.readLine()) != null) {
	            	text+=line+"\n";
	            }
	            System.out.print("Please select the n for n-grams (1,2,3): ");
	            int n=input.nextInt();
				if(n<=0 || n>3) {
					System.out.println("Wrong n value");
				}else {
					long startTime = System.currentTimeMillis();
					System.out.println("\nThe "+n+"-grams for the top 20 elements of "+file_name);
				    NGram ngram = new NGram(text,n);
				    long endTime = System.currentTimeMillis();
				    long finalTime = endTime - startTime;
				    System.out.println("Time: "+finalTime+"ms");
				}
	               	
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	  } 

	}

}
