public class HCF{
public static void main(String...args){
int n1=625;
int n2=125;

for(int a=n1;a>=1;a--){
if (n1%a==0&&n2%a==0){

System.out.println(a);
break;}
}
}}