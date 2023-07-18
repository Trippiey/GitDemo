import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayandArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = {1,2,3,4,5,6,7,8,9,10};
		
		//Table of 2
		for (int i=0;i<array.length;i++)
		{
			if (array[i] % 2 == 0)
			{
				System.out.println(array[i]);
				break; //To exit from the loop, if result is achieved
			}
			else
			{
				System.out.println(array[i] + "is not mutiple of 2");
			}
		}
		
		//create object of the class then to use -> object.method
		ArrayList<String> a = new ArrayList<String>();
		
		//create an ArrayList
		a.add("Shashank");
		a.add("Jain");
		a.add("Trainer");
		a.remove(2); //Remove any of the array
		
		System.out.println(a);
		System.out.println(a.get(1));
		
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
		
		System.out.println("************");
		
		//Enhanced way of printing the ArrayList
		for(String val : a)
		{
			System.out.println(val);
		}
		
		//To check if item is present is Arraylist
		System.out.println(a.contains("selenium"));
		
		//To convert the normal array into arraylist
		String[] name = {"Shashank","Jain","Trainer"};
		List nameArrayList = Arrays.asList(name);
		System.out.println(nameArrayList);
	}

}
