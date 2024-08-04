package org.example;

import java.util.Arrays;
import java.util.List;

public class SecondLargest {
    public static void main(String[] args) {

        String[] arr = {"I","Like","Apple"};
        String str = "I Like Apple";
        //,9,14,20,21};



        //int[] arrs = {0, 2, 4, 6, 8};//,9,10,12};
        System.out.println(matchString(str , arr));

       // System.out.println(reversedString("utkarsh".toCharArray()));
    }

    public static boolean matchString(String str,String[] arr) {
        //boolean flg = false;
        String[] ss = str.split(" ");
        for(int i=0;i<arr.length;i++){
            if(!ss[i].equals(arr[i])){
                return false;
            }
        }
        return true;
    }
    public static String reversedString(char[] str) {
//        StringBuilder sb = new StringBuilder(arr);
//        return sb.reverse().toString().toUpperCase();

        String string = "";
        for(int i=0,j=str.length-1;i<str.length/2;i++,j--){
            System.out.println("# "+str[i]+"  "+str[j]);
            str[i] = (char) (str[i] ^ str[j]);
            str[j] = (char) (str[i] ^ str[j]);
            str[i] = (char) (str[i] ^ str[j]);
          //   swap(str[i],str[j]);
            System.out.println("after "+str[i]+"  "+str[j]);

        }
        return  String.valueOf(str).toUpperCase();
    }

    public static int secondLargest(int[] arr) {
        int first = Integer.MIN_VALUE,second = Integer.MIN_VALUE;;

        for (int i=0;i<arr.length;i++){
            if (first < arr[i]){
                second = first;
                first = arr[i];

                //System.out.println(second+" "+first);
            }else if(first != arr[i] && second < arr[i]){
                //System.out.println(second);
                second = arr[i];
            }
        }
        return second;
    }
}
