import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int pic = in.nextInt();//2
		int n = in.nextInt();//3
		int[] dis = new int[n];//1 5 3
		int[] cap = new int[n];//6 4 2
		boolean fin=true;
		for(int i=0;i<n;i++){
		    dis[i] = in.nextInt();
		}
		for(int i=0;i<n;i++){
		    cap[i] = in.nextInt();
		}
		
		for(int i=0;i<n;i++){
		    pic-= dis[i];
		    if (pic < 0){
		        fin = false;
		        break;
		    }
		    pic+= cap[i];
		}
		if (fin){
		System.out.println("The Petrol Remaining is: "+pic);
		} else {
            System.out.println("Cannot travel");
        }
	}
}


A man his driving car from home to office with X petrol. There are N number of petrol bunks in the city with only
few capacities and each petrol is located in different places For one km one liter will consume. So he fill up petrol in his petrol tank in each petrol bunks. 
Output the remaining petrol if he has or tell him that he cannot travel if he is out of petrol.

Input:

Petrol in car. 2 Liters

Petrol bunks: A B C

Distance from petrol each petrol bunks: 1, 5, 3

Capacities of each petrol bunk: 6, 4, 2

