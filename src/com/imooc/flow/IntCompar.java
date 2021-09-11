package com.imooc.flow;

public class IntCompar {
    public static void main(String[] args){
        int x=11,y=10;
        if(x!=y){
            if(x>y){
                System.out.println(x+"大于"+y);
            }else {
                System.out.println(x+"小于"+y);
            }
        }else{
            System.out.println(x+"和"+y+"相等");
        }
    }
}
