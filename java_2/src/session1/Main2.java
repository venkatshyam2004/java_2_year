package session1;

import java.util.Scanner;
class Solution {
    public int threeSumClosest(int[] nums, int target) {
       int near=1000,sum=0,dif;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(j!=i){
                    sum=sum+nums[j];
                }
            }
           
            dif = Math.abs(sum-target);
            System.out.println(dif);
            if(dif<near && sum>=target){
                near=sum;
            }
            sum=0;
        }
        return near;
    }
}

public class Main2{
        public static void main(String args[]){
            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = s.nextInt();
            }
            int t = s.nextInt();
            Solution so = new Solution();
            int val = so.threeSumClosest(arr, t);
            System.out.println(val);
        }
}