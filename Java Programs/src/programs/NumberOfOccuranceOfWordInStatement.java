package programs;

import java.util.LinkedHashSet;

public class NumberOfOccuranceOfWordInStatement {

	public static void main(String[] args) {

		String s = "welcome to java programming and to java session";
		
		//step 1: create a set
		//step 2: add all words of a statement to set
		//step 3: compare each word of set with every words of string
		
		String[] strArr = s.split(" ");
		
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		
		//step 2: add all words of a statement to set
		for(String word : strArr) {
//			System.out.println(word);
			set.add(word);
		}
		
		for(String word :set) {
			int count =0;
			for(String arrword : strArr) {
				if(word.equals(arrword)) {
					count++;
				}
			}
//			System.out.println(word + ":"+count);
//			if(count>1) {                                     //to get the duplicate count
//				System.out.println(word + ":"+ count);
//			}
			if(count == 1){                               // to get unique excluding duplicates
				System.out.println(word+":"+count);
			}
		}
	}

}
