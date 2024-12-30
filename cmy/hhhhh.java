package cmy;

public class hhhhh {
    public static void main(String[] args) {
        int age=18;
        if (age>=18){
            System.out.println("他是成年人");
        }
        else {
            System.out.println("他不是成年人");
        }

        int ages=19;
        //ages>18?(System.out.println("他是成年人");):(System.out.println("他不是成年人");)
        String reslut=ages>18?("成年人"):("未成年人");
        System.out.println(reslut);

        //成绩合格判断
        int grade=80;
        String result1=grade>=60?("合格"):("不合格");
        System.out.println(result1);

    }
}
