package com.masai;
//Print the first ten even numbers, with the help of do-while loop
//        and continue keyword.
//        Sample output:
//        2, 4, 6, 8, 10, 12, 14, 16, 18, 20
public class TenEvenNumber {
    public static void main(String[] args){
        int i=1;
        do{
            if(i%2==0){
                System.out.println(i);
            }
//            else{
//                continue;
//            }
            i++;
        }while (i<=20);
    }
}
