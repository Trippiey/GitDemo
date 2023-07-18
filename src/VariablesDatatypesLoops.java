
public class VariablesDatatypesLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Variables & Data Types
		int num = 1;
		String Goal = "I will master Selenium with Java";
		char alphabet = 'S';
	    double Rupees = 1.00;
	    boolean Success = true;
	    
	    System.out.println(Success + " is my mostly used word.");
	    
	    
	    //Arrays
	    int [] array = new int[5];
	    array[0] = 1;
	    array[1] = 2;
	    array[2] = 3;
	    array[3] = 2;
	    array[4] = 6;
	    
	    int[] easyarray = {1,2,3,4,5};
	    
	    System.out.println(easyarray[4]);
	    
	    
	    //for loop
	    for(int i = 0; i< array.length; i++)
	    {
	    	System.out.println(array[i]); 
	    }
	    
	    //for length ++i
	    for(int i = 0; i< array.length; ++i)
	    {
	    	System.out.println(easyarray[i] + " is from easyarray"); 
	    }
	    
	    String[] name = {"Shashank","Jain","Selenium"};
	    
	    for(int i=0; i<name.length;i++)
	    {
	    	System.out.println(name[i]);
	    }
	    
	    //Alternate way to iterate the array using loop
	    for(String s:name)
	    {
	    	System.out.println(s);
	    }
	}

}
