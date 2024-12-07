import java.io.*;
import java.util.*;

public class test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        Map<Integer, Integer> dic = new HashMap<>();
        int x = Integer.parseInt(br.readLine());
        dic.put(x,1);
        sb.append(dic.get(x));

        bw.write(sb.toString());
        bw.flush();
    }
}