public class GetProduct{
public static void main(String... args){

int p=1;
int n=1670;

while(n!=0){
p=p*(n%10);
n=n/10;

System.out.println("Product of given no is :"+ p);
}
}
}