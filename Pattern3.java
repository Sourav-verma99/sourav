public class Pattern3{
public static void main(String [] args){
for(int i=5;i>=1;i--){
for(int j=1;j<=5;j++){
if(i>=j||j>=5+i){
System.out.print("*");
}
else {
System.out.print(" ");
}
}
System.out.println();
} 
}}