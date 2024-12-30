package cmy;
import java.util.Scanner;
public class error1 {
    public static void main(String[] args) {
//        int a1=689;
        //cjds
        Scanner sc=new Scanner(System.in);
        System.out.println("psr3ws:");
        int a1=sc.nextInt();
        int a=a1/100;
        int b=a1/10%10;
        int c=a1%10;
        int sum=a+b+c;
        System.out.println(sum);
    }
}
