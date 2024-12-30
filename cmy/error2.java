package cmy;
import java.util.Scanner;
public class error2 {
    public static void main(String[] args) {
        String pinpai="华为";
        float size=5.5f;
        float price=3688.88f;
        String peizhi="8+128g 全面刘海屏";
        System.out.println("品牌型号: "+pinpai);
        System.out.println("尺寸: "+size);
        System.out.println("价格: "+price);
        System.out.println("配置: "+peizhi);
        Scanner s1=new Scanner(System.in);
        System.out.println("请输入华为手机的库存数量：");
         int kucun=s1.nextInt();
         System.out.println("华为手机的总金额为："+kucun*price);

        String pinpai1="小米";
        float size1=5.0f;
        float price1=2988.88f;
        String peizhi1="4+64g 全面屏";
        System.out.println("品牌型号: "+pinpai1);
        System.out.println("尺寸: "+size1);
        System.out.println("价格: "+price1);
        System.out.println("配置: "+peizhi1);
        Scanner s11=new Scanner(System.in);
        System.out.println("请输入小米手机的库存数量：");
        int kucun1=s11.nextInt();
        System.out.println("小米手机的总金额为："+kucun1*price1);
        System.out.println("-----------库存清单------------");
        System.out.println("品牌型号    尺寸    价格    配置    库存    总金额");
        System.out.println(pinpai+"    "+size+"    "+price+"    "+kucun+"    "+kucun*price);
        System.out.println(pinpai1+"    "+size1+"    "+price1+"    "+kucun1+"    "+kucun1*price1);
        System.out.println("------------------");
        System.out.println("总库存"+(kucun*kucun1));
        System.out.println("手机总金额"+(kucun*price+kucun1*price1));

    }
}
