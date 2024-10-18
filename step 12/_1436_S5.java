import java.io.*;

public class _1436_S5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine())-1;
        int x = N/19;
        int y = N%19;
        if (x != 0) System.out.print(x);
        if (x == 0 && y == 0) System.out.println("666");
        else if (y <= 5) System.out.println(y+"666");
        else if (6 <= y && y <=15) System.out.println("666"+(y-6));
        else System.out.println((y-9)+"666");
    }
}