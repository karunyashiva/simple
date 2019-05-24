import java.util.*;
public class Seggregation{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++){
	a[i]=s.nextInt();	
}
int i=0,j=n-1,temp;
while(i<j){
if(a[i]==1){
	if(a[j]==0){
	temp=a[i];
	a[i]=a[j];
	a[j]=temp;
	}
	else if(a[j]==1)
	j--;
}
else
i++;	
}	
for(i=0;i<n;i++){
	System.out.print(a[i]+" ");
}	
}
}