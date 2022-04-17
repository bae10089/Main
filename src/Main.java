import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

class Main{
    public static void NGE(int[] a){
        Stack<Integer>stack = new Stack<>();
        int[] arr=new int[a.length];
        int num = -1;
        int numl = 0;
        for(int s: a){
            stack.push(s);
        }
        num = stack.peek();
        numl = stack.peek();
        stack.pop();
        arr[a.length-1]=-1;
        while (stack.size()!=0){
            if(stack.peek()>=numl&&stack.peek()>=num){
                num = stack.peek();
                numl = stack.peek();
                arr[stack.size()-1]=-1;
                stack.pop();
            }else if(num>=stack.peek()&&numl>=stack.peek()){
                arr[stack.size()-1]=numl;
                numl = stack.peek();
                stack.pop();
            }else if(num==numl&&num>=stack.peek()){
                arr[stack.size()-1]=num;
                numl = stack.peek();
                stack.pop();
            }else if(num>=stack.peek()&&numl<stack.peek()){
                arr[stack.size()-1]=num;
                numl = stack.peek();
                stack.pop();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] ar= new int[a];
        for (int i = 0; i <a ; i++) {
            int b =sc.nextInt();
            ar[i]=b;
        }
        NGE(ar);
    }
}