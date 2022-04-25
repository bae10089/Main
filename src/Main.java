import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Main{

    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String[] B =br.readLine().split(" ");
        int a = Integer.parseInt(B[0]);
        int b = Integer.parseInt(B[1]);
        int count = 0;

        for (int i = a; i <= b ; i++) {
            boolean is = true;
            String[] s =String.valueOf(i).split("");
            for(String n: s){
                if(Integer.parseInt(n)!=4 && Integer.parseInt(n)!=7){
                    is = false;
                    break;
                }
            }
            if(is){
                count++;
            }
        }
        System.out.println(count);
    }
}