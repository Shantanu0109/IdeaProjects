import java.util.Scanner;

public class function {
    public static void printhello() {
        System.out.println("helloworld");
        System.out.println("helloworld");
        System.out.println("helloworld");
    }

    public static int calculatesum(int num1, int num2) { //parameters or formal parameters
        int sum = num1 + num2;
        return sum;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum=calculatesum(a, b); //arguments or actual parameters
        System.out.println("sum is " + sum);
    }
}
