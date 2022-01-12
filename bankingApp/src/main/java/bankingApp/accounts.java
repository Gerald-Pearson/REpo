package bankingApp;

public class accounts 
{
	int accountNum;
	double acountBalance;
	String typeAccount;
	public accounts()
	{
		
	}
	public accounts(int accNum,String type)
	{
		this.accountNum=accNum;
		this.typeAccount=type;
	}
	public int getAccNum()
	{
		return this.accountNum;
	}
	public double getAccBal()
	{
		return this.acountBalance;
	}
	public String getAccType() 
	{
		return this.typeAccount;
	}
	public void setAccNum(int accNum)
	{
		this.accountNum=accNum;
	}
	public void setAccType(String accType)
	{
		this.typeAccount= accType;
	}
	public void setAccBal(double accBalance)
	{
		this.acountBalance=accBalance;
	}
	
	public void viewAccount(int accountNum,String Type)
	{
		if(accountNum == this.accountNum)
		{
			System.out.println("For Account Number:"+this.getAccNum()+" the current amount is:"+ "$"+ this.getAccBal());
		}
		else
		{
			System.out.println("Can not access account");
		}
		
	}
	public void depositAcc(int accID, double amount,String accType)
	{
		if(this.getAccNum()== accID && this.getAccType()==accType)
		{
			this.acountBalance+= amount;
		}
		else
		{
			System.out.println("Please try again");
		}
		
	}
	public void withDrawAcc(int accID, double amount,String accType)
	{
		if(this.getAccNum()== accID && this.getAccType()==accType)
		{
			this.acountBalance-= amount;
		}
		else
		{
			System.out.println("Please try again");
		}
	}
	

}
