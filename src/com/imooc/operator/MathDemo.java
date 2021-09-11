package com.imooc.operator;

public class MathDemo {
    public static void main(String[] args){
        int numu1=10, numu2=5;
        int result;
        //加法
        result=numu1+numu2;
        System.out.println(numu1+"+"+numu2+"="+result);
        //字符串连接运算
        System.out.println(""+numu1+numu2);
        //减法
        result=numu1-numu2;
        System.out.println(numu1+"-"+numu2+"="+result);
        //乘法
        result=numu1*numu2;
        System.out.println(numu1+"*"+numu2+"="+result);
        //除法
        result=numu1/numu2;
        System.out.println(numu1+"/"+numu2+"="+result);
        //分子分母都是整型时，结果为整除后的结果
        System.out.println(13/5);
        System.out.println("13.0/5"+13.0/5);

        result=13%numu2;
        System.out.println("13%"+numu2+"="+result);
        System.out.println("13.5%5="+(13.5%5));
    }

}
