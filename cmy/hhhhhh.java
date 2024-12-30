package cmy;
import java.util.Scanner;
public class hhhhhh {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("请输入：");
        int r=s1.nextInt();
        double money = r;
        switch (r) {
            case 1:
            case 2:
                System.out.println("今天学习计算机基础");
                break;
            case 3:
                System.out.println("今天学习英语");
                break;
            case 4:
            case 5:
                System.out.println("今天学习编程");
                break;
            case 6:
            case 7:
                System.out.println("今天休息");
        }
    }
}