package basic.helloworld;

import sun.awt.windows.WPrinterJob;

/*

 */
public class Operation {
    public static void main(String[] args) {
        System.out.println(5/4);
        System.out.println(-3/2);
        System.out.println(5/-4);
        System.out.println(-5/-4);

        int i=100;
        System.out.println(i++); //100，先取值再自增
        System.out.println(i); //101
        System.out.println(++i); //102，先自增再取值
        System.out.println(i); //102

        int j;
        j = 1>0?1:2; //1
        System.out.println(j);
    }
}
