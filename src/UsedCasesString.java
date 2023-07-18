
public class UsedCasesString {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub

		
	    String s = "Shashank Jain Trainer";
		String[] splittedString = s.split("Jain"); //To split the String
		for(String val : splittedString)
		{
			System.out.println(val);
			
		}
		
		System.out.println("**********");
		
		for(String val : splittedString)
		{
		System.out.println(val.trim());  //To trim the extra space
		}
		
		System.out.println("**********");
		
		for(int i=0;i<s.length();i++)
		{
			System.out.println(s.charAt(i));  //To print the character
		}
		
        System.out.println("**********");
		
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.println(s.charAt(i));  //To print the character in reverse order
		}
	}

}
