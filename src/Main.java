import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <a ; i++) {
            int b = sc.nextInt();
            list.add(b);
        }
        int c = list.get(0);
        for (int i : list){
            c=Math.min(c,i);
        }
        ArrayList<Integer> et = new ArrayList<>();
        for (int i = 2; i <c+1 ; i++) {
            for (int j : list) {
                if (et.contains(j % i) == false) {
                    et.add(j % i);
                }
            }

            if (et.size()==1) {
                System.out.println(i);
            }
            et.clear();
        }
    }
}
dd