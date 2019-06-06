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