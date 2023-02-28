package org.example;

public class NoAdd {
    public int noadd(int num1,int num2){
        /*不用加减乘除做加法,范围为-10到1000*/
                // add表示进位值
                int add = num2;
                // sum表示总和
                int sum = num1;
                // 当不再有进位的时候终止循环
                while(add != 0) {
                    // 将每轮的无进位和与进位值做异或求和
                    int temp = sum ^ add;
                    // 进位值是用与运算产生的
                    add = (sum & add) << 1;
                    // 更新sum为新的和
                    sum = temp;
                }
                return sum;




    }
}
