 Geek and Coffee Shop
 
Geek loves to drink cold coffee after coding for long hours. One fine day a Geek went to his favorite coffee shop in the town and asked 
for a cup of cold coffee. The shopkeeper told him that he is their lucky customer and had an offer for the Geek.
The offer was that for an amount of N they will fill Geek's cup with N units of cold coffee and after consuming initial N unit 
of coffee the shopkeeper will again refill his cup with half the amount of coffee that Geek consumed in previous refill, 
and will keep on refilling his cup by half of the previous cycle till the amount to refill becomes nil i.e. 0 (Assume Geek can consume 
infinite amount of coffee and shop also has infinite amount coffee). Now Geek is curious to know that how many units of coffee will Geek
get for Mth refill. Being Geek's friend help him out with his problem.    

Note : Save the file / class as “geeksCoffee” with appropriate file extension.

Input:
The first line of the input contains an integer T, denoting the number of test cases. The T test case follow. The only line of each test case contains two space separated integers N and M respectively.

Output:
For each test case output a single integer on a new line denoting the required answer.

program :
import java.util.*;
public class geeksCoffee{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int testcase=s.nextInt();
	do{
		int n=s.nextInt();
		int m=s.nextInt();
		int i=1;
		while(i<m){
			n=n/2;
			i++;
		}
		System.out.println(n);
	testcase--;
	}while(testcase>0);
}
}
