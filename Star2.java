public class Star2{
public static void main(String [] args){
for(int i=5;i>=-5;i--){
for(int j=1;j<=Math.abs(i);j++){
System.out.print(" ");
}
for(int k=5;k>=Math.abs(i);k--){
System.out.print("* ");
}
System.out.println();
}
}}