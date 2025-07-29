package Day8;

public class wrapper2 {
public static void main(String[] args) {
	String s="123";
	int a=Integer.parseInt(s);
	System.out.println(a);
	String s2="574.23";
	double d=Double.parseDouble(s2);
	System.out.println(d);
	String s3="true";
	boolean b=Boolean.getBoolean(s3);
	System.out.println(b);
	String s4="99.50";
	float f=Float.parseFloat(s4);
    System.out.println(f);
    String s5="Hello";
    char c= s5.charAt(2);
    System.out.println(c);
    String s6="103";
    byte b1=Byte.parseByte(s6);
    System.out.println(b1*100);
     
     
     

}
}