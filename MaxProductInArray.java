Maximum product of two numbers

Given an array with all elements greater than or equal to zero. Return the maximum product of two numbers possible.

Note : Save the file / class as “maxProductInArray” with appropriate file extension.

Input:
The first line of input contains an integer T denoting the number of test cases.
The first line of each test case is N, size of array. The second line of each test case contains array elements.

Output:
Print the maximum product of two numbers possible.

program: 

import java.util.*;
public class MaxProductInArray{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int testcase=s.nextInt();
	do{
	int n=s.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++){
		a[i]=s.nextInt();
	}
	Arrays.sort(a);
	int product=a[n-1]*a[n-2];
	System.out.println(product);
	testcase--;
	}while(testcase>0);
}
}
