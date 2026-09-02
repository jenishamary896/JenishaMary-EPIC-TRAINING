 import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str1 = in.nextLine();
		String str2 = in.nextLine();
		int[] count1 = new int[26];
		int[] count2 = new int[26];
		for(int i=0;i<str1.length();i++){
		    int val = str1.charAt(i) - 97;
		    	count1[val]++;
		}
	
			for(int i=0;i<str2.length();i++){
		    int val = str2.charAt(i) - 97;
		    	count2[val]++;
		}
	     int out=0;
		for(int i=0;i<26;i++){
		    	if(count1[i]!=count2[i]){
		    	   out=1;
		    	   break;
		    	}
		}
	if(out==0){
	    System.out.println("anagram");
	}
	else{
	    System.out.println("not anagram");
	}
	}
	
}
