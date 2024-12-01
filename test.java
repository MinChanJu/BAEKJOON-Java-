import java.util.*;

public class test {
    public static void main(String[] args) {
        int[][] tmp = {{1,2},{1,3}};
        int n = tmp[0].length;
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(4);
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 3);
        System.out.println("다시 한번");
        System.out.println(n);
    }
}