package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        System.out.println("Hello world!");
        LilyNumber x=new LilyNumber();
        x.litynumber();
        /*水仙化数计算*/

        /*
        Scanner scan = new Scanner(System.in);
        double sum=0;
        for(int i=0;i<5;i++){
            sum+= scan.nextDouble();
        }
        BoydHigh y=new BoydHigh();
        System.out.println("五数之平均数为"+y.boydhigh(sum));
        /*计算五数之和*/

        /*
        Scanner username=new Scanner(System.in);
        Scanner password=new Scanner(System.in);
        String name=username.next();
        String pass=password.next();s
        PasswrodNumber z=new PasswrodNumber();
        System.out.println(z.NAME(name));
        /*用来进行匹配用户名与密码*/

        /*
        NoAdd noAdd=new NoAdd();
        System.out.println(noAdd.noadd(2,3));
        /*不用加减法做加法*/

        /*
        int[] ascii = {73, 32, 99, 97, 110, 32, 100, 111, 32, 105, 116, 33};
        for (int i = 0; i < ascii.length; i++) {System.out.println((char) ascii[i]);}
       /*换成asc2值*/

        Scanner scan = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            double[] arr = new double[5];
            for (int j = 0; j < arr.length; j++) {
                arr[j] = scan.nextDouble();
            }
            double totalScore = 0;
            for (int j = 0; j < arr.length; j++) {
                System.out.printf("%.1f ", arr[j]);
                totalScore += arr[j];
            }
            System.out.println(totalScore);
        /*五个学生五科成绩*/

        }

    }
}