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