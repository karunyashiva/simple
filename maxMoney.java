import java.util.*;
public class maxMoney{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int testcase=s.nextInt();

do{
	int count=0;
	int n=s.nextInt();
	int m=s.nextInt();
	for(int i=0;i<n;i++){
		if(i%2==0){
		count++;
		}
	}
int val=count*m;
System.out.println(val);
testcase--;
}while(testcase>0);
}
}