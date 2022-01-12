package bankingApp;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class driver {

	public static void main(String[] args) throws Throwable
	{
		/*employee emp1= new employee(123,"Jones","Frankly");
		Scanner sn = new Scanner(System.in);
		emp1.viewAccount(123, "checking");
		String empUser,empPw;
		empUser= sn.next();
		empPw=sn.next();
		emp1.empLogin(empUser, empPw);*/
		//customer cust1= new customer();
		banking bk= new banking();
		try
		{
			bk.doBanking();
		}
		catch(Exception e)
		{
			e.getStackTrace();
		}
	}

}
