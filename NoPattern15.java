public class NoPattern15{
public static void main(String...args){
int a=4;
for(int i=5;i>=1;i--){
for(int j=1;j<=i;j++){
System.out.print(j+a);
}
a--;
System.out.println();
}
}}