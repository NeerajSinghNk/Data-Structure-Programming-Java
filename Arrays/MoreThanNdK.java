/*
    Given an array of size n, find all elements in array that appear more than n/k times. 
    For example, if the input arrays is {3, 1, 2, 2, 1, 2, 3, 3} and k is 4, then the output should
    be [2, 3]. Note that size of array is 8 (or n = 8), so we need to find all elements that appear 
    more than 2 (or 8/4) times. There are two elements that appear more than two times, 2 and 3. 


*/ 

import java.util.*;

public class MoreThanNdK {
    public static void moreThanNdK(int[] arr,int n,int k){
        int x = n/k;
        HashMap<Integer, Integer> hs = new HashMap<>();

        for(int i=0;i<n;i++){
            if(!hs.containsKey(arr[i])){
                hs.put(arr[i],1);
            }
            else{
                int count = hs.get(arr[i]);
                hs.put(arr[i], count+1);
            }
        }
        for(Map.Entry m : hs.entrySet()){
            Integer temp =  (Integer)m.getValue();
            if(temp > x){
                System.out.println(m.getKey());
            }
        }
    }

    public static void main(String args[]){
        int a[] = new int[] { 1, 1, 2, 2, 3, 5, 4,
            2, 2, 3, 1, 1, 1 };
        int n = 12;
        int k = 4;
        moreThanNdK(a,n,k);
    }
}