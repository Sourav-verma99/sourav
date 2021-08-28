public class ArrayIndex{
public static void main(String...args){

int [] arr=new int [10];
arr[0]=34;
arr[1]=45;
arr[2]=23;
arr[3]=47;
arr[4]=67;
arr[5]=89;
arr[6]=78;
arr[7]=39;
arr[8]=87;
arr[9]=98;
for(int  i=0;i<arr.length;i++){
if(arr[i]==23){
System.out.println("The index of " +arr[i] +" is : " +i  );
}
}
}}