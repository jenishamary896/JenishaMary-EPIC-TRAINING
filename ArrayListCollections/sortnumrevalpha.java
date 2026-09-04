import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();//p@j7$k2i61a
		List<Character> num = new ArrayList<>();
		List<Character> alp = new ArrayList<>();
		for(int i=0;i<str.length();i++){
		    if(Character.isDigit(str.charAt(i))){
		       num.add(str.charAt(i));
		    }
		    else if(Character.isLetter(str.charAt(i))){
		        alp.add(str.charAt(i));
		    }
		    
		}
		Collections.sort(num);
		Collections.reverse(alp);
		String emp="";
		int alpInd=0,numInd=0;
		for(int i=0;i<str.length();i++){
		    if(Character.isDigit(str.charAt(i))){
		       emp+=num.get(numInd);
		        numInd++;
		    }
		    else if(Character.isLetter(str.charAt(i))){
		        emp+=alp.get(alpInd);
		        alpInd++;
		    }
		    else{
		        emp+=str.charAt(i);
		    }
		}
		
		System.out.println(emp);
	}
}
