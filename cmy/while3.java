package cmy;
import java.util.Arrays;
public class while3 {
        public static void main(String[] args) {
            int[] arr = {1,8,10,89,1000,1200};
            int targetIndex = fibonaciiSearch(arr,1200);
            System.out.println(targetIndex);
        }

        //斐波那契数列
        private static int[] fibonaciiList = getFibonaciiList(20);

        /**
         * 斐波那契查找算法(非递归算法)
         * 思路是利用数组长度，计算数组中的黄金分割点mid
         * 首先要清楚我们要把斐波那契数列中的每一个值当成数组的长度去看待，那么该数组长度的黄金分割点就是斐波那契数列的前一个值
         * @param arr
         * @param target
         * @return
         */
        public static int fibonaciiSearch(int[] arr, int target) {
            //举例arr数组｛1,8,10,89,1000,1200｝

            int left = 0;
            int right = arr.length - 1;

            //k是指向斐波那契数列的索引,k所对应的斐波那契值(fibonaciiList[k])则是当前在left到right范围内数组的长度
            int k = 0;

            //找到该数组长度所位于斐波那契数列的位置索引k，再强调一下，斐波那契数列的每一个值我们都看成是数组的长度
            //现在要找的k，是当前数组长度在斐波那契数列中的位置索引
            while (arr.length > fibonaciiList[k]){
                k++;
            }

            //                          k
            //                          ↓
            //斐波那契数组：   ｛1,1,2,3,5,8,13,...｝，里面每一个值都看成是数组长度
            //斐波那契数组索引: [0,1,2,3,4,5, 6,...]
            //                          ↑
            //                          k

            //假设我们要找的数组是：｛1，8，10，89，1000，1200｝，数组长度是6，那么该数组长度在斐波那契数列中对应的数组长度就应该是8
            //k是斐波那契数列的索引，所以k应该是5


            //如果当前k值对应的斐波那契值大于数组下标，则需要创建临时数组复制原数组并扩容至fibonaciiList[k]
            //再说一遍，斐波那契数组里面的每一个值都看成是数组的长度，那么，当前k所指向的斐波那契值是8，也就是要求要查找的数组arr需要有8个元素才符合对黄金分割点mid的计算
            int[] temp = Arrays.copyOf(arr, fibonaciiList[k]);
            //将填充的数据替换成arr的最后一个元素
            for (int i = arr.length; i < temp.length; i++) {
                temp[i] = arr[arr.length - 1];
            }
            //扩充并替换后的数组temp：｛1,8,10,89,1000,1200,1200,1200｝

            //mid是黄金分割点的索引
            int mid = 0;
            while (left <= right){
                //k == 0 说明当前查找的子序列只剩下一个元素。别忘了，k是斐波那契数列的下标，k==0说明f[k]==1，说明当前子序列长度为1
                if (k == 0){
                    mid = left;
                }else {

                    //斐波那契数组：   ｛1,1,2,3,5,8,13,...｝，里面每一个值都看成是数组长度
                    //                          ↑
                    //                          k

                    //先摆公式      mid = left + f[k-1] -1

                    //我们知道，黄金分割点mid的索引，其实是当前数组长度f[k],在斐波那契数列中位置的前一个斐波那契值f[k-1]
                    //比如，当前数组长度是8，那么他的黄金分割比例就应该是5:3。再比如，如果当前数组长度是13，那么他的黄金分割比例应该是8:5
                    //而黄金分割点mid，就是用来分割数组的，mid索引左右两边的子序列长度应该要满足黄金分割的比例


                    //             left          mid  right
                    //               ↓            ↓   ↓
                    //数组temp:      {1,8,10,89,1000,1200,1200,1200}
                    //temp数组索引:   [0,1, 2, 3,  4 , 5  ,  6 , 7  ]
                    //                           ↑
                    //                          mid

                    //也就是说，我们应该要保证   mid的左子序列(包含mid)要有5个元素，  mid的右子序列(不包含mid)要有3个元素
                    //所以黄金分割点按照上面的分析应该是mid = f[k-1] = 5，但是公式 mid = left + f[k-1] - 1 ，为什么最后还要再减1呢？
                    //很显然，别忘记我们编程世界里的数组下标都是从0开始的，temp数组的索引是从0开始的，如果我们直接把f[k-1]当成mid的索引，显然不符合黄金分割比例的
                    mid = left + fibonaciiList[k - 1] - 1;
                }

                if (target == temp[mid]){
                    //如果temp[mid]就是目标值，而且当前mid不在扩充区就直接返回mid索引，否则返回right索引

                    //                                 left
                    //                                   ↓
                    //比如数组temp:      {1,8,10,89,1000,1200,1200,1200} ，显然最后两个元素是扩充区，是原本arr数组没有的
                    //                                   ↑    ↑
                    //                                right  mid
                    //这里说一下为什么mid会跑到left跟right的限定范围外？
                    //因为当我们要找的目标值大于temp[mid]的时候，想要向右找子序列只会动left索引，right索引并不会去动它，计算出来的mid值是有可能超过left的，所以就可能会出现上面这种情况
                    if (mid <= right) {
                        return mid;
                    }else {
                        return right;
                    }

                } else if (target < temp[mid]) {
                    //目标值小于mid，向左找
                    //这里解释为什么要k--？

                    //                          k
                    //                          ↓
                    //斐波那契数组：   ｛1,1,2,3,5,8,13,...｝，里面每一个值都看成是数组长度

                    //数组temp:      {1,8,10,89,1000,1200,1200,1200}
                    //               ↑           ↑    ↑
                    //             left         mid  right

                    //因为当前数组长度是8，那么按照黄金分割比例，应该是mid左边(含mid)有五个元素，mid右边(不含mid)有3个元素
                    //当我们想往左找目标值的时候，刚好k-1对应的斐波那契值就是5，而左边的子序列长度就是4，这时候就不需要扩容操作了，因为后面有元素，不会出现数组下标越界的情况
                    //k--就是为了下一次循环做准备
                    right = mid - 1;
                    k--;
                } else if (target > temp[mid]) {
                    //目标值大于mid，向右找
                    //同往左找同理，往右找为什么需要k-2 ？
                    //因为mid右边的子序列长度是3，刚好k-2对应的斐波那契值就是3，这样k=k-2就能保证我们下一次循环的k能够跟子序列数组长度3对应上
                    left = mid + 1 ;
                    k -= 2;
                }

            }
            //能出循环说明没找到目标值
            return -1;


        }

        /**
         * 获取斐波那契数列
         * @return
         */
        public static int[] getFibonaciiList(int maxSize){
            int[] fibonaciiList = new int[maxSize];
            fibonaciiList[0] = 1;
            fibonaciiList[1] = 1;
            for (int i = 2; i < fibonaciiList.length; i++) {
                fibonaciiList[i] = fibonaciiList[i - 1] + fibonaciiList[i - 2];
            }
            return fibonaciiList;
        }
    }


