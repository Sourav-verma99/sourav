import java.util.ArrayList;
public class ArrarListRetainAllMethod{
public static void main(String...args){

ArrayList al=new ArrayList();

al.add(10);
al.add("abc");
al.add('a');
al.add(true);
al.add(22.3);
al.add(10);

ArrayList al1=new ArrayList();

al1.add("ad");
al1.add("ar");
al1.add("re");
al1.add("ag");

ArrayList al2=new ArrayList();
al2.add("qw");
al2.add("er");
al2.add("yu");
al2.add("oi");

ArrayList al3=new ArrayList();
al3.addAll(al);
al3.addAll(al1);
al3.addAll(al2);

System.out.println(al3);

ArrayList al4=new ArrayList();
al4.removeAll(al);
al4.removeAll(al1);
al4.removeAll(al2);

System.out.println(al4);

al3.retainAll(al1);

System.out.println();System.out.println();System.out.println();System.out.println();
System.out.println(al3);
   }}