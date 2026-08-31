import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();//abcd
		int[] count = new int[26];
	
		for(int i=0;i<str.length();i++){
		    int val = str.charAt(i) - 97;
		    count[val]++;
		}
		System.out.println();

		for(int i=0;i<str.length();i++){
		    int val = str.charAt(i) - 97;
		    if(count[val]>0){
		        System.out.println(str.charAt(i)+" "+count[val]);
		    }
		    if(count[val]>1){
		        count[val]=0;
		    }
		}
	}
}
