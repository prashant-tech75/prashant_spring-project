package com.debug;

public class Test {
    public static void main(String[] args) {
        System.out.println("Trial of debugging");
        int[] myarray ={2,5,7,81};
        int sum=getSum(myarray);
        System.out.println(sum);


    }
    public static int getSum(int arr[]){
        int s=0;
        for(int i=0;i<arr.length;i++){
            s=s+arr[i];

        }
        s=s+4;
        return s;
    }


}
