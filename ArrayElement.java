public class ArrayElement{
public static void main(String...args){
int s=0;
int ss=0;
int arr[]={10,14,6,25,8,67,17,35,15,78};
if(arr[0]>arr[1]){
s=arr[1];
ss=arr[0];}
else{
s=arr[0];
ss=arr[1];}
for(int i=0;i<arr.length;i++){
if(arr[i]<s){
ss=s;
s=arr[i];
System.out.println("Smallest element of array is :" + s);}
else if(arr[i]>s && arr[i]<ss){
ss=arr[i];}}
System.out.println("Second smallest element of array is :" + ss);}}