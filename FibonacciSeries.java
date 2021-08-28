public class FibonacciSeries{
public static void main(String...args){
int n=100;
int a=0;
int b=1;
int c=a+b;
while(c<=n){
System.out.println(c);
c=a+b;
a=b;
b=c;
}
}}