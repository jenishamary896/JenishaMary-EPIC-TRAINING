import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[][] arr = new int[n][n];
        for (int i = 0 ; i < n ; i++) {
            for(int j = 0 ; j < n ; j++){
                arr[i][j] = in.nextInt();
            }
        }
        boolean u = false;
        boolean l = false;
            for (int i = 0;i < n;i++){
                for (int j = 0 ; j < n;j++){
                    if (i > j && arr[i][j] != 0 ){
                        u = true;
                        break;
                    }
                    else if (i < j && arr[i][j] != 0) {
                        l = true;
                        break;
                    }
                }
            }
            if(u){
                System.out.println("Upper Triangle");
            }
            else if (l) {
                System.out.println("Lower Triangle");
            }
            else{
                System.out.println("Enter valid input");
            }
	}
}
