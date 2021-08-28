public class LinearSearch{
public static void main (String [] args) {
int i;
int searchElement=Integer.parseInt(args[0]);
int [] arr={78,23,34,43,54,65,64,67,123,76};
for(i=0;i<arr.length;i++){
if(arr[i]==searchElement){
System.out.println( searchElement   +" Found at index" +  i);
break; 
}
}
if(i==arr.length){
System.out.println("Element not found");
}
}}