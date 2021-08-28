public class PrimeMethod{
public static int prime(int a){
return a;
}
public static void main(String...args){
int p=prime(10);
for(int j=2;j<=p-1;j++){
if(p%j==0){
System.out.println("no is not prime");
break;
}
else{
System.out.println("no is prime");
break;
}
}
}}