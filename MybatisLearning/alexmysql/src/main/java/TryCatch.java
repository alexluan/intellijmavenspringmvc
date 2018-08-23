package com.page.objectclass;

import sun.jvm.hotspot.oops.ExceptionTableElement;

public class TryCatch {

    public static void main(String[] args){
        try{
            int a[] = new int[2];
            System.out.println(100/0);
//            System.out.println("Access element three :" + a[3]);
        }catch(ArithmeticException e){
            System.out.println("Exception thrown  :" + e);
        }
        System.out.println("Out of the block");


    }
}
