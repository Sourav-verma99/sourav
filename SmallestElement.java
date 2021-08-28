public class SmallestElement{
public static void main(String...args){
int arr[] = {13,27,15,6,23};
int min=arr[0];
System.out.println("The Given Array Element are ");
for(int i=0;i<arr.length;i++){
if(arr[i]<min){
min=arr[i];
}
}
for(int i=0;i<arr.length;i++){
System.out.print(arr[i]+ ",");
}


System.out.println();System.out.println();
System.out.println("Smallest element is :" +min);
}
}