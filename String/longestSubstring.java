import java.util.Scanner;

public class Main{
    static int longestSubString(String str){
   
		int maxlen=0;
		
		for(int i=0;i<str.length();i++){
		    int sum=0;
		    for(int j=i;j<str.length();j++){
		        if(str.charAt(j)=='1'){
		            sum+=1;
		        }
		        else if(str.charAt(j)=='0'){
		            sum-=1;
		        }
		       if(sum==0){
		           int len=(j-i)+1;
		       
		       if(len>maxlen){
		           maxlen=len;
		       }
		    }
		    }
		}
	return maxlen;
}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
        System.out.println(Main.longestSubString(str));
	}
}
