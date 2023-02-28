package org.example;

public  class LilyNumber {
    /*水仙花数，将数拆开并相乘，结果之和为其本身即为水仙花数*/
    /*求五位数中的水仙花数*/
    public void litynumber(){


    for(int i=10000;i<=99999;i++){
        int a=i/10000*(i%10000);
        int b=i/1000*(i%1000);
        int c=i/100*(i%100);
        int d=i/10*(i%10);
        if(i==a+b+c+d){
            System.out.println("此水仙化数为"+i);
        }

    }}
}
