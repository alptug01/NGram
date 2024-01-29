The algorithm, in summary, takes 2 inputs from the user: book titles and the value of 'n' to be used in n-grams. The project primarily consists of 2 classes: Main and NGram. Input retrieval from the user and reading the txt file are performed in the Main class. The 'text' variable, which is the string representation of the txt file, and the 'n' variable are passed as parameters to the NGram class. Within the NGram class, there are 3 functions: stringOperations, ngramOperations, and print_hashmap. In the stringOperations function, operations such as removing punctuation marks and extra spaces from the string are performed. The entire string is converted to its lowercase version. In the ngramOperations function, a HashMap is created. The string is split by space to create a new array. Then, a temporary string is created to hold n-grams until it reaches 'n'. Once the temp string reaches 'n', the HashMap is checked. If the string is already in the HashMap, its count is incremented by 1. If not, the string and 1 are added to the HashMap. After the operations are completed, the program is directed to the print_hashmap function. Each entry in the HashMap is returned as a Map. Entry, and these entries are added to an ArrayList. The ArrayList is then sorted in descending order, and the top 20 elements are printed to the screen.
