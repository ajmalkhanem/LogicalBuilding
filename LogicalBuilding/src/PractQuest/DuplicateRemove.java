package PractQuest;

import java.util.Scanner;

public class DuplicateRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str =s.next();  
        int[] freq = new int[str.length()];  
        int i, j;  
          
       
        char string[] = str.toCharArray();  
          
        for(i = 0; i <str.length(); i++) {  
            freq[i] = 1;  
            for(j = i+1; j <str.length(); j++) {  
            	
                if(string[i] == string[j]) {  
                    freq[i]++;  
                      
                    string[j] = '0';  
                }  
            }  
        }  

        for(i = 0; i <freq.length; i++) {  
            if(string[i] != ' ' && string[i] != '0')  
                System.out.println(string[i] + "-" + freq[i]); 
	    }  

    
}
}
