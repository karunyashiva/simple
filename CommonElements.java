import java.util.*;
public class CommonElements{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int i,j=0,k;
System.out.print("1st array no:");
int n=s.nextInt();
System.out.print("1st array elements:");
int ar1[]=new int[n];
for(i=0;i<n;i++){
ar1[i]=s.nextInt();
}
System.out.print("2nd array no:");
int m=s.nextInt();
System.out.print("2nd array elements:");
int ar2[]=new int[m];
for(i=0;i<m;i++){
ar2[i]=s.nextInt();
}
System.out.print("3rd array no:");
int l=s.nextInt();
System.out.print("3rd array elements:");
int ar3[]=new int[l];
for(i=0;i<l;i++){
ar3[i]=s.nextInt();
}
int tmp=0;
if(n>m){
 tmp=n;
}
else{
tmp=m;
}
int arr[]=new int[tmp];
k=0;
for(i=0;i<n;i++){
	for(j=0;j<m;j++){
		if(ar1[i]==ar2[j]){
		arr[k]=ar1[i];
		k++;
		}
	}
}
for(i=0;i<l;i++){
	for(j=0;j<tmp;j++){
		if(ar3[i]==arr[j]){
		System.out.print(" "+arr[j]);
		}
	}

}
}
}