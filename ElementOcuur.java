import java.util.*;
public class ElementOcuur{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("Enter the n");
int n=s.nextInt();
int a[]=new int[n];
System.out.println("Enter the elements");
for(int i=0;i<n;i++){
a[i]=s.nextInt();
}
System.out.println("Enter the elements time : ");
int k=s.nextInt();
for(int i=0;i<n;i++){
	int count=0;
	for(int j=0;j<n;j++){
		if(a[i]==a[j]){
			count++;
		}
	}
if(count==k){
System.out.println(a[i]);
break;
}
}
}
}