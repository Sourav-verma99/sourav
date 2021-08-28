public class AverageOfArray{
public static void main(String...args){
double arr[] = {10, 12.2, 23.5, 35.1, 40.9};
double sum=0;

for(int i=0;i<arr.length;i++){
sum=sum+arr[i];
}
double average=sum/arr.length;




System.out.println("The Average of Array is :" +average);
}}