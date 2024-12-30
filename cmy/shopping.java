package cmy;
import java.util.Scanner;
public class shopping {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("请输入：");
        int r=s1.nextInt();
        double money = r;
        double price = 0;
        if (money >= 800) {
            System.out.println("折扣为20%");
            price = money * 0.8;
        }
        else if (money >= 500 && money < 800) {
            System.out.println("折扣为15%");
            price = money * 0.85;
        }
        else if (money >= 300 && money < 500) {
            System.out.println("折扣为10%");
            price =money*0.9;
        }
        else {
            System.out.println("没有折扣");
        }
        System.out.println("折扣价格为："+price);
    }
}