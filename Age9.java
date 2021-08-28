import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Age9{
public static void main(String args[]) throws Exception{
Calendar c=Calendar.getInstance();
int currentyear=c.get(Calendar.YEAR);
int currentmonth=c.get(Calendar.MONTH);
SimpleDateFormat sdf =new SimpleDateFormat("dd/MM/yyyy");
Date d1=sdf.parse(args[0]);
String str =sdf.format(d1);
System.out.println(str);

SimpleDateFormat sdf1=new SimpleDateFormat("dd");
String d=sdf1.format(d1);
int day =Integer.parseInt(d);

SimpleDateFormat sdf2=new SimpleDateFormat("MM");
String m=sdf2.format(d1);
int month =Integer.parseInt(m);

SimpleDateFormat sdf3=new SimpleDateFormat("yyyy");
String y=sdf3.format(d1);
int year =Integer.parseInt(y);

int age=currentyear-year;
System.out.println(age  );


int month2=age*12-12+month;
System.out.println(month2);

int day2 =age*365;
System.out.println(day2);

}} 