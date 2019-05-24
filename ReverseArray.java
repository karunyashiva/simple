import java.util.*;
public class ReverseArray{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++){
a[i]=s.nextInt();
}
int i=0,j=n-1,temp;
	while(i<j){
	temp=a[i];
	a[i]=a[j];
	a[j]=temp;
i++;
j--;	
	}
System.out.println("")
for(i=0;i<n;i++){
System.out.print(a[i]+" ");
}
}
}