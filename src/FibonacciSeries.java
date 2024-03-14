import java.util.Scanner;

public class FibonacciSeries {
    public void fib(int N){
        int num1=0,num2=1;
        for (int i=0;i<N;i++){
            System.out.print(num1+" ");
            int num3=num2+num1;
            num1=num2;
            num2=num3;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(("Enter N value: "));
        int N=sc.nextInt();
        System.out.println("Fibonacci Series:");
        FibonacciSeries fibonacciSeries=new FibonacciSeries();
        fibonacciSeries.fib(N);
    }
}
