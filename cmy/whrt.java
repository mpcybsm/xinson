package cmy;

import java.util.Scanner;

public class whrt {
    public static void main(String[] args) {
        int money=20;
        int money1=money-12;
        int num1=money1/1;
        System.out.println("购买的铅笔数量为"+num1);
        int num2=money1/2;
        System.out.println("购买的橡皮擦数量为"+num2);
        int num3=money1/3;
        int yue=money1%3;
        System.out.println("购买的可乐数量为"+num3+"余额还有"+yue);
        int num4=money1/5;
        int yue1=money1%5;
        System.out.println("购买的零食数量为"+num4+"余额还有"+yue1);
    }
}
