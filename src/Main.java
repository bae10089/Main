import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;


class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int h = Integer.parseInt(br.readLine());
        StringBuffer[] sb = new StringBuffer[h];
        for (int i = 0; i <h ; i++) {
            sb[i]=new StringBuffer();
        }
        int[] arr = new int[(int)Math.pow(2,h)-1];
        String[] S =br.readLine().split(" ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=Integer.parseInt(S[i]);
        }
        solve(0,arr.length-1,0,arr,h,sb);
    }
    public static void solve(int start,int end,int floor,int[] arr,int h,StringBuffer[] sb){
        if(floor==h){
            return;
        }
        int m =(start+end)/2;
        sb[floor].append(arr[m]+" ");

        solve(start,m-1,floor+1,arr,h,sb);
        solve(m+1,end,floor+1,arr,h,sb);

    }
}