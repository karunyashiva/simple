Decode the pattern

Given a pattern as below and an integer n your task is to decode it and print nth row of it. The pattern follows as :
11
121
1331
14641

Note : Save the file / class as “oneOnePattern” with appropriate file extension.

Input:
The first line of input is the number of test cases .  Then T test cases follow . The first line of each test case is an integer N.

Output:
For each test case print the required nth row of the pattern.

program:

import java.util.*;
public class oneOnePattern{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int testcase=s.nextInt();
	do{
		int n=s.nextInt();
		for(int i=1;i<=n;i++){
			int num=(int)(Math.pow(11,i));
			System.out.println(num);
		}
	
	testcase--;
	}while(testcase>0);
}
}
