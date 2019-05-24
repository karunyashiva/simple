import java.util.*;
public class Pattern{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt(),k=1;
int ar[][]=new int[n+1][n+1];
for(int i=0;i<n;i++){
for(int j=0;j<=i;j++){
ar[i][j]=k;
k++;
}
}
System.out.println("");
for(int i=n-1;i>=0;i--){
for(int j=0;j<=i;j++){
System.out.print(ar[i][j]+" ");
}System.out.println("");
}
}
}