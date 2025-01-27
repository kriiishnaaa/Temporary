import java.util.*;
public class Prime{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
int number=12;
int [] arr=new int[6];
int k=0;
for(int i=1;i<=number;i++){
int count=0;
for(int j=2;j<=i/2;j++){
if(i%j==0)
count++;}
if(count==0){
arr[k]=i;
k++;
}
}
System.out.println("The prime numbers are");
for(int i=0;i<arr.length;i++){
System.out.print(arr[i]+" ");
}
}
}
