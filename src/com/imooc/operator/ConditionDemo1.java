package com.imooc.operator;

public class ConditionDemo1 {
    public static void main(String[] args) {
        double price1,price2;
        price1=80;
        price2=55;
        double sum = price1+price2;
        //输出原价
        System.out.println("原价为"+sum);
        //折后价格
        if (sum >= 100){
            sum-=20; //sum=sum-20
        }
        System.out.println("折后价格为"+sum);
    }
}
