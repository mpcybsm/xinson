package cmy;

public class h {
    public static void main(String[] args) {
        //if条件语句
        int x = -3;
        if (x > 0) {
            System.out.println("他是+");
        }
        if (x < 0) {
            System.out.println("他是-");

            //判断成绩是否合格
            int grade = 80;
            if (grade > 60) {
                System.out.println("成绩合格");
            }
            if (grade < 60) {
                System.out.println("成绩不合格");
            }
        }
        //输出值
        int x1 = 5, y;
        if (0 < x1 && x1 < 5) {
            y = x1 * x1;
        }
            if (x1 >=5) {
                y = 2 * x1 + 1;
                System.out.println(y);
            }
            //判断奇
        int x2=11;
            if (x2%2==0){
                System.out.println("他是s");
            }
            else {
                System.out.println("他是m");
            }
        }
    }