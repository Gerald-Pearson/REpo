package bankingApp;



public class employee
{
	int empID;
	String empFirstName;
	String empLastName;
	 

	public employee(int empId,String empFName,String empLName) 
	{
		// TODO Auto-generated constructor stub
		empId=this.empID;
		empFName= this.empFirstName;
		empLName=this.empLastName;
	}
	public int getEmpId()
	{
		return this.empID;
		
	}
	public String getEmpFName()
	{
		return this.empFirstName;
	}
	public String getEmpLName()
	{
		return this.empLastName;
	}
	public void viewAccount(int acctNum,String type)
	{
		accounts custAccount= new accounts(acctNum,type);
		custAccount.viewAccount(acctNum,type);
	
	}
	public void cancelAccount(accounts obj)
	{
		//
	}

}
