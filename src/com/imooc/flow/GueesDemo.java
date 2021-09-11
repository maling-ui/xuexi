package com.imooc.flow;

import java.util.Scanner;

public class GueesDemo {
    public static void main(String[] args){
        int n= (int) (Math.random()*10+1);//使用随机数形成1-10整数
        int guess;
        System.out.println("猜一个介于1-10的数字");
        do{
            System.out.println("请输入您猜的数");
            Scanner sc=new Scanner(System.in);
            guess=sc.nextInt();
            if(guess>n){
                System.out.println("太大了");
            }else if (guess<n){
                System.out.println("太小了");
            }
        }while(n!=guess);
            System.out.println("您猜对了"+n);

    }
}
