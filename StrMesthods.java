package lang;

import java.lang.reflect.Method;

public class StrMesthods {

	public static void main(String[] args) throws Exception{
	   int count=0;
	   Class c=Class.forName("java.lang.String");
	   Method []m=c.getDeclaredMethods();
	   for(Method m1:m)
	   {
		   count++;
		   
		   System.out.println(m1.getName());
	   }
	   System.out.println("number of methods"+count);
	   
	}

}
