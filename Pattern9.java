public class Pattern9{
public static void main(String [] args){
for(int i=0;i<=9;i++){
System.out.print("5");
}
System.out.println("");
for(int j=0;j<=9;j++){
if(j==0||j==9){
System.out.print("5");
}
else {
System.out.print("4");
}}
System.out.println("");
for(int k=0;k<=9;k++){
if(k==0||k==9){
System.out.print("5");
}
else if(k==1||k==8){
System.out.print("4");
}
else{
System.out.print("3");
}}
System.out.println("");
for(int l=0;l<=9;l++){
if(l==0||l==9){
System.out.print("5");
}
else if(l==1||l==8){
System.out.print("4");
}
else if(l==2||l==7){
System.out.print("3");
}
else{
System.out.print("2");
}}
System.out.println("");

for(int m=0;m<=9;m++){
if(m==0||m==9){
System.out.print("5");
}
else if(m==1||m==8){
System.out.print("4");
}
else if(m==2||m==7){
System.out.print("3");
}
else if(m==3||m==6){
System.out.print("2");
}
else{
System.out.print("1");
}}
}}



