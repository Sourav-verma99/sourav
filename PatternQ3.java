public class PatternQ3{
public static void main(String...args){
for(int i=1;i<=5;i++){

for(int j=1;j<=5;j++){
if(i==1||i==5){
System.out.print("0");
}
System.out.println();
}
if(i>=1||i<=5){
for(int j=1;j<=5;j++){
if(j==1&&j==5){
System.out.print("0");
}
else if(j>=1||j<=5){
System.out.print("1");
}
}}
System.out.println();


}
}}
