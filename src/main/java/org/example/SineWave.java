package org.example;

public class SineWave {

    public static void main(String[] args) {

       int[] arr = {1,3,4,5,7};//,9,14,20,21};

        int[] arrs = {0,2,4,6,8};//,9,10,12};
        int[] arra = mergeArr(arr,arrs);
       // System.out.print("{");
        System.out.println(arra.length);
        for (int i=0;i<arra.length;i++) {
           // if (i!=arrs.length-1){
                System.out.println(arra[i]);
              //  System.out.print(", ");
           // }else {
               // System.out.print("}");
           // }
        }

    }
    public static int[] mergeArr(int[] arr1, int[] arr2){
        int[] res = new int[arr1.length+arr2.length];
//        for(int g:res){
//
//
        boolean l = false;
        int x=0,y=0;
        for(int i=0;i<res.length;i++){

            if(i < res.length-1){
            if (arr1[x]< arr2[y]){
                res[i]=arr1[x];
                x++;
                if(x>arr1.length-1){
                    l = true;
                }
            }else {
                res[i]=arr2[y];
                y++;

            }
            }else {
                if(l){
                    res[res.length-1] = arr2[arr2.length-1];
                }else {
                    res[res.length-1] = arr1[arr1.length-1];
                }
            }
        }

      return res;
    }
    public static int[] sineWave(int[] arr){
        for (int i=0;i<arr.length;i++){
            if(i%2==0){
                if(arr[i]>arr[i+1]){
                    int temp = arr[i+1];
                    arr[i+1] = arr[i];
                    arr[i] = temp;

                }
            }else {
                if(arr[i]<arr[i+1]) {
                    int temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }

    public static int[] shiftZeroToLeft(int[] arr){
        int i=0,j=arr.length-1;
        while (i<j){
          //  System.out.println(arr[i]+"  "+arr[j]+" ");
            if(arr[i]==0){
                if (arr[j]!=0){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                    i++;
                }
                j--;


            }
            if (arr[i]!=0) {
                if(arr[j]==0){
                j--;
                }
                i++;
            }

        }
        return arr;
    }




}
