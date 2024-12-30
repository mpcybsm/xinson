package cmy;

public class bds {
    public static void main(String[] args) {
        int a=5;
        int b=8;
        int c=3;
        if (a>b&&a>c) {
                System.out.println("最大值MAX="+a);
            }
            else if (b>a&&b>c){
                System.out.println("最大值MAX="+b);
        }
            else if (c>a&&c>b){
                System.out.println("最大值MAX="+c);
        }
             if (a<b&&a<c) {
            System.out.println("最小值MIN="+a);
        }
        else if (b<a&&b<c){
            System.out.println("最小值MIN="+b);
        }
        else if (c<a&&c<b){
            System.out.println("最小值MIN="+c);
            }
    }
}
