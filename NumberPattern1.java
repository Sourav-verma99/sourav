public class NumberPattern1{
public static void main(String...args){
int n=5;
for(int a=1;a<=4;a++){
for(int b=4;b>=a;b--){
System.out.print(" ");}
for(int c=1;c<=a;c++){
System.out.print("*");}
System.out.println();}
for(int i=n;i>=1;i--){
for(int j=4;j>=i;j--){
System.out.print(" ");
}
for(int k=1;k<=i;k++){
System.out.print("*");
}
System.out.println();
}
}}