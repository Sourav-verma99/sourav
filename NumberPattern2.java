public class NumberPattern2{
public static void main(String...args){
int a=1;
int b=1; 
for(int i=1;i<=5;i++){
for(int j=1;j<=i;j++){
if(a<=9){
System.out.print(a++ +" ");
}
if(a>9 && b<=9){
System.out.print(b++ + " ");
}
else {
System.out.print(" ");
}
}
System.out.println();
}
}}
 