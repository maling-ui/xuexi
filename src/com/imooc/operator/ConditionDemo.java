package com.imooc.operator;

public class ConditionDemo {
    public static void main(String[] args) {
        int a=10,b=7;
        //求a和b最大值
        int max;
        if(a>b){
            max=a;
        }else{
            max=b;
        }
        System.out.println("max="+max);
        max=a>b?a:b;
        System.out.println("max="+max);
        boolean b1=a>b?(3<6):(true==false);
        System.out.println("b1="+b1);

        int z=4,y=6;
        int n= z*y+(z%2)-(z-y);
        System.out.println(n);
        }



}
