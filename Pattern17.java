public class Pattern17{
public static void main(String...args){

int a=5;
for(int i=1;i<=a;i++){
for(int j=1;j<=a;j++){
if(i==j ||i+j==a+1 ){
System.out.print("1");
}
else{
System.out.print("0");
}} 
System.out.println();
}
}}