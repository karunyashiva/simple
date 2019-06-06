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