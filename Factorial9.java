public class Factorial9{
public static void main(String[] args){
int fact=1;
int num=Integer.parseInt(args[0]);
for(int i=fact;i<=num;i++){
fact=fact*i;
System.out.println(i+"="+fact);
}
}}