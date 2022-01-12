package bankingApp;

public class customer 
{
	private String firstName;
	private String lastName;
	private String userName;
	private String passWord;
	public customer()
	{
		
		
	}
	/*first name last name userName password */
/*	public customer(String fName, String lName) 
	{
		fName= this.firstName;
		lName= this.lastName;
		// TODO Auto-generated constructor stub
	}*/
/*	public customer(String fName,String lName,String UName,String pWord)
	{
		fName=this.firstName;
		lName=this.lastName;
		UName=this.userName;
		pWord=this.passWord;
	}*/
	public void setFName(String fName)
	{
		 this.firstName=fName;
	}
	public void setlName(String lName)
	{
		this.lastName=lName;
	}
	public void setUserName(String userName)
	{
		this.userName=userName;
	}
	public void setPassWord(String pWord)
	{
		this.passWord=pWord;
	}
	public String getFirstName()
	{
		return this.firstName;
	}
	public String getLastName()
	{
		return this.lastName;
	}
	public String getUserName()
	{
		return this.userName;
	}
	public String getPWord()
	{
		return this.passWord;
	}


	
	public Boolean isloginCorrect(String userName,String userPw)
	{
		
		System.out.println("invaild UserName or Password");
		return false;
	}
	
	/******from banking customer needs to*****
	 * account number
	 *withdraw
	 *deposit
	 *apply for account
	 *transfer
	*******/

}
