
public class MethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    MethodsDemo d = new MethodsDemo();
    String name = getData();
    System.out.println(name);
    MethodDemo2 d2 = new MethodDemo2();
     d2.getUserData();
     String name2 = getData2();
     System.out.println(name2);
     getData2();
     
	}
	
	public static String getData()
	{
		System.out.println("hello world");
		return "Shashank Jain";
	}
	
	public static String getData2()
	{
		System.out.println("hello world");
		return "Shashank Jain";
	}

}
