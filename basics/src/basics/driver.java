package basics;

public class driver 
{
	public static void main(String [] args) 
	{
		datatypes dt = new datatypes();
		int sum= dt.add(12, 15);
		System.out.println(sum);
		dog felix = new dog();
		felix.name= "felix";
		dt.printDogName(felix);
	}
}
