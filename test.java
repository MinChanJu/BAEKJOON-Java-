import java.io.*;
import java.util.*;

public class test {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());
        StringTokenizer st;
        String str;

        for (int i=0; i<T; i++){
            st=new StringTokenizer(br.readLine(), " ");
            int R=Integer.parseInt(st.nextToken());
            str=st.nextToken();
            for (int j=0; j<str.length(); j++){
                for (int k=0; k<R; k++){
                    System.out.print(str.charAt(j));
                }
            }
            System.out.println();
        }

        br.close();
    }
}