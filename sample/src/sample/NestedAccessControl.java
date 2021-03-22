package sample;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class NestedAccessControl {
	
	public void mypublic()
	{
		System.out.println("this is my public method");
	}
	
	public void myprivate()
	{
		System.out.println("this is my private method");
	}
	
	/*public class Inner{
		
		public void nestedPublic()
		{
			myprivate();
		}
		
	}*/

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
		NestedAccessControl obj=new NestedAccessControl();
		Method met=obj.getClass().getDeclaredMethod("myprivate");
		
		met.invoke(obj);
		
	}

}
