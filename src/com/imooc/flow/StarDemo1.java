package com.imooc.flow;

public class StarDemo1 {
    public static void main(String[] args){
        int m=1;
        int n=1;
        System.out.println("输入4行4列的型号");
        //外重循环控制输出几行
        while (m<=5){
            //内行循环控制每行输出几个型号
            n=1;
            while (n<=4){
                System.out.print("*");
                n++;
            }
            System.out.println();
            m++;
        }
    }
}
