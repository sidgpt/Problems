/**
Given an unsorted array A of size N that contains only non-negative integers, find a continuous sub-array which adds to a given number S.

Example 1:

Input:
N = 5, S = 12
A[] = {1,2,3,7,5}
Output: 2 4
Explanation: The sum of elements 
from 2nd position to 4th position 
is 12.
 

Example 2:

Input:
N = 10, S = 15
A[] = {1,2,3,4,5,6,7,8,9,10}
Output: 1 5
Explanation: The sum of elements 
from 1st position to 5th position
is 15.
 

Your Task:
You don't need to read input or print anything. The task is to complete the function subarraySum() which takes arr, N and S as input parameters and returns a list containing the starting and ending positions of the first such occurring subarray from the left where sum equals to S. The two indexes in the list should be according to 1-based indexing. If no such subarray is found, return -1. 


Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)


Constraints:
1 <= N <= 105
1 <= Ai <= 1010

//Sliding pattern question 
//Input:- Array (Non Sorted)-->Non negative no.  ,   sum =k
//Goal:- sub array ( having sum equal to input)
**/


import java.lang.*;

 /* Name of the class has to be "Main" only if the class is public. */
 class test
 {
     public static void main (String[] args) throws java.lang.Exception
     {
         int arr[] = new int[] {13,5,7,2,7,4,8};
         int target_sum = 12;
         int cur_sum = arr[0];
         int start_index = 0;
         int end_index = 0;
         for(;start_index< arr.length && end_index < arr.length;) {
             if(cur_sum < target_sum && end_index != arr.length-1) {
                 end_index ++;
                 cur_sum += arr[end_index];
             }
             if(cur_sum > target_sum && start_index != arr.length-1) {
                 cur_sum -= arr[start_index];
                 start_index ++;
             }
             if(cur_sum == target_sum) {
                 System.out.println(start_index+","+end_index);
                 break;
             } else if(end_index == arr.length -1) {
                 System.out.println(-1);
                 break;
             }
         }
     }
 }
