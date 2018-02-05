package com.company;

public class Main {

    public static void main(String[] args) {
        int[] a = new int[]{9,6,7,6,5,8,7,9,8,10};
        int  resalt = 0;
        System.out.println("Массив a :");
        for( int sum: a){
            System.out.println( sum + " ");
        }
        for( int i =0; i < a.length;i++ ){
            resalt +=  a[i];
        }
        if ( resalt >= 88)
            System.out.println("Спортсмен проходит в следующий этап с баллом :" + resalt);
        else
            System.out.println( " Спортсмен выбыл");

    }
}
