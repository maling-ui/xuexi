package com.imooc.flow;

import java.util.Scanner;

public class WeekDemo2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入表示星期的英文单词：");
        String week=sc.next();
        week=week.toUpperCase();
        switch (week){
            case "MONDAY":System.out.println("星期1");break;
            case "TUESDAY":System.out.println("星期2");break;
            case "WEDNESDAY":System.out.println("星期3");break;
            case "THURSDAY":System.out.println("星期4");break;
            case "FRIDAY":System.out.println("星期5");break;
            case "SATURDAY":System.out.println("星期6");break;
            case "SUNDAY":System.out.println("星期7");break;
            default:System.out.println("单词输入错误");
        }
    }
}