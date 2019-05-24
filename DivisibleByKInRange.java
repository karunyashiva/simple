import java.util.*;
public class DivisibleByKInRange{
public static int Range(int f,int l,int k){
int count=0;
for(int i=f;i<=l;i++){
		if(i%k==0){
		count++;
		}
	}
return count;
}
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int testcase=s.nextInt();
do{
	int f=s.nextInt();
	int l=s.nextInt();
	int k=s.nextInt();
	System.out.println("result : "+Range(f,l,k));
testcase--;
}while(testcase>0);
}
}