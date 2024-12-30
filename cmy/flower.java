package cmy;

public class flower {
    public static void main(String[] args) {
        int num=749;
        int a=num/100;
        int b=num/10%10;
        int c=num%10;
        if (a*a*a+b*b*b+c*c*c==num){
            System.out.println("他是水仙花数");
        }
        else {
            System.out.println("不是水仙花数");
        }
        int i;
        for (i=100;i<=999;i++){
            int A=i/100;
            int B=i/10%10;
            int C=i%10;
            if (A*A*A+B*B*B+C*C*C==i){
                System.out.println(i);
            }
        }
    }
}

