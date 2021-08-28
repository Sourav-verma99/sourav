public class NoPattern1{
public static void main(String...args){

int a=5;

for(int i=1;i<=a;i++){
for(int j=i;j<=a;j++){
System.out.print(j+"  ");
}
for(int k=i-1;k>=1;k--){
System.out.print(k+"  ");
}
System.out.println();
}
}}