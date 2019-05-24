import java.util.*;
public class ValueOfIndex{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int max=0;
int a[]=new int[n];
for(int i=0;i<n;i++){
a[i]=s.nextInt();
if(a[i]>max)
	max=a[i];
}
int b[]=new int[max+1];
for(int i=0;i<max;i++){
	b[i]=-1;
}
int temp=0;
for(int i=0;i<a.length;i++){
	temp=a[i];
	b[temp]=temp;	
}
for(int i=0;i<=max;i++){
System.out.print(b[i]+" ");
}
}
}