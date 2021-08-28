public class Pattern20{
public static void main(String...args){
for(int i=1;i<=5;i=i+2){
for(int j=1;j<=i;j++){
System.out.print("*");
}
System.out.println();
}
for(int k=1;k<=5;k=k+2){
for(int l=3;l>=k;l--){
System.out.print("*");
}
System.out.println();
}
}}