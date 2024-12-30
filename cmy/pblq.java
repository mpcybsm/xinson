package cmy;

public class pblq {
    public static void main(String[] args) {
        int num1=1;
        int num2=1;
        int sum=0;
        System.out.println(num1);
        System.out.println(num2);
        for (int i=3;i<=10 ;i++){
            sum=num1+num2;
            System.out.println(sum);
            num1=num2;
            num2=sum;
        }
    }
}
