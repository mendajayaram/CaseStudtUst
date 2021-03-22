package sample;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ConvertCollToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Country> list=new HashSet<>();
		
		list.add(new Country("in","India"));
		list.add(new Country("us","USA"));
		
		Country[] arr5=list.toArray(Country[]::new);
		
		System.out.println("Array is...."+Arrays.toString(arr5));
		
		
		
		List<Integer> list1=List.of(1,2,3,4,6);
		
		Integer[] l1=list1.toArray(Integer[]::new);
		
		System.out.println(Arrays.toString(l1));
	}

}
