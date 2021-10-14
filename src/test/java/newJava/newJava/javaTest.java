package newJava.newJava;

public class javaTest{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		bc b=new bc();	
System.out.println(b.m1(1, 2));
System.out.println(b.m1(1, 2,3));
System.out.println(New2.m11(1, 2));
JavaVariable JV=new JavaVariable();
JV.variable();
//JavaVariable.javaStatic.staticm();
JavaEncap JE=new JavaEncap();
JE.seta(3);
System.out.println(JE.geta());
	}

static {
	
	System.out.println("This is static block");
}

	

}

