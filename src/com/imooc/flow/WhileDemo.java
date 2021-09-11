package com.imooc.flow;
public class WhileDemo {
    public static void main(String[] args){
        int n=1;
        int sum=0;
        while (n<=5){
             sum=sum+n;
             n++;
        };
        System.out.println("1到5的累加和是："+sum);



    }
}
