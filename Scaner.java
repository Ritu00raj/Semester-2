import java.util.*;

public class Scaner {
    public static void main(String[] args) {
        int a, b, sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The First number : ");
        a = sc.nextInt();
        System.out.println("Enter the Second number : ");
        b = sc.nextInt();
        sum = a + b;
        System.out.println("Addition of Both Number = " + sum);
    }
}