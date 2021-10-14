package newJava.newJava;

public class JavaVariable {
	int a=10;
	static int b=20;
	
	
	public void variable() {
		JavaVariable ob1= new JavaVariable();
		System.out.println(ob1.a);
		System.out.println(ob1.b);
		ob1.a= 1000;
		ob1.b=2000;
		JavaVariable ob2= new JavaVariable();
		System.out.println(ob2.a);
		System.out.println(ob2.b);
		javaStatic.staticm();
		
	}
	 static class javaStatic{
		
		public static void staticm() {
			System.out.println("this is static method "+  b);
		}
	}

}
