import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String str = "1";

        for(int i = 0; i < n; i++) {

            int count = 1;
            String empstr = "";

            System.out.println(str);

            for(int j = 0; j < str.length(); j++) {

                

                if(j + 1 < str.length() &&
                      str.charAt(j) == str.charAt(j + 1)) {
                    count++;
                    j++;
                }

                empstr += count;
                empstr += str.charAt(j);
            }

            str = empstr;
        }
    }
}
