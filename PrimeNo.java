public class PrimeNo{
public static void main (String [] args){
int n=10;
int a=1,j=0;
while(a<=n){
for(int i=1;i<=a;i++){
if(a%i==0){
j++;
}
}
if(j==2){
System.out.println("no is prime");
}
j=0;
a++;
else{
System.out.println("no is not prime");
}
}
}
}