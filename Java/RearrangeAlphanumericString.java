import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] l = new char[str.length()];
        char[] d = new char[str.length()];
        int lc = 0;
        int dc = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= '0' && ch <= '9') {
                d[dc++] = ch;
            } else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                l[lc++] = ch;
            }
        }
        for (int i = 0; i < dc - 1; i++) {
            for (int j = 0; j < dc - i - 1; j++) {
                if (d[j] > d[j + 1]) {
                    char temp = d[j];
                    d[j] = d[j + 1];
                    d[j + 1] = temp;
                }
            }
        }
        int dI = 0;
        int lI = lc - 1;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= '0' && ch <= '9')
                System.out.print(d[dI++]);
            else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
                System.out.print(l[lI--]);
            else
                System.out.print(ch);
        }
    }
}
