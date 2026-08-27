import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    int row1 = in.nextInt();
	    int col1= in.nextInt();
	    int row2 = in.nextInt();
	    int col2= in.nextInt();
	    if(col1==row2){
	    int[][] arr1 = new int[row1][col1];
		int[][] arr2 = new int[row2][col2];
		int[][] out= new int[row1][col2];
		
		
		
		for(int i=0;i<row1;i++){
		    for(int j=0;j<col1;j++){
		        arr1[i][j] = in.nextInt();
		    }
		}
		for(int i=0;i<row2;i++){
		    for(int j=0;j<col2;j++){
		        arr2[i][j] = in.nextInt();
		    }
		}
		
		int sum;
		for(int k=0;k<row1;k++){
		    
    		for(int i=0;i<col2;i++){
    		     sum = 0;
    		    for(int j=0;j<col1;j++){
    		        sum+=arr1[k][j] * arr2[j][i];

    		    }
    		    out[k][i]=sum;
    		    }
    			}
		for(int i=0;i<row1;i++){
		    for(int j=0;j<col2;j++){
		        System.out.print(out[i][j]+" ");
		    }
		    System.out.println();
		}
	    }
	    else{
	        System.out.println("enter valid matrix size");
	    }
	    
	
		
		
		
		
		
		
		
		
		
		
	}
}
