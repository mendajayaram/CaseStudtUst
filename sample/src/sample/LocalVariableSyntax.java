package sample;

import java.util.Arrays;

public class LocalVariableSyntax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		var arr= new Integer[] {10,30,40,3,4};
		
		long count=Arrays.stream(arr).filter(y ->(null!=y && y>10)).count();
		
		System.out.println("count===="+count);

	}

}
