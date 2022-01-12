package bankingApp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;
import java.util.Scanner;

public class banking 
{
	Path path = Paths.get("C:\\Users\\gpear\\Documents\\workspace-spring-tool-suite-4-4.13.0.RELEASE\\bankingApp\\src\\main\\resources\\customer.txt");
	Path path2= Paths.get("C:\\Users\\gpear\\Documents\\workspace-spring-tool-suite-4-4.13.0.RELEASE\\bankingApp\\src\\main\\resources\\accounts.txt");
	public void doBanking() 
	{
		customer custObj = new customer();
		String fName,lName,userName,pWord,opt1;
		
		
		
		Path path3= Paths.get("C:\\Users\\gpear\\Documents\\workspace-spring-tool-suite-4-4.13.0.RELEASE\\bankingApp\\src\\main\\resources\\employee.txt");
		Scanner sn= new Scanner(System.in);
		

		int choice;
		Random rand = new Random(10);
		int newAccNum;
		try
		{
			System.out.println("Welcome Customer");
			Thread.sleep(1000);
			System.out.println("What would you operation do you want to do");
			Thread.sleep(1000);
			System.out.println("1. Create new account");
			System.out.println("2. Login Existing Account");
			System.out.println("3. Exit Banking Application");
			Thread.sleep(1000);
			System.out.println("Please Enter your choice now");
			choice= sn.nextInt();
			switch(choice)
			{
			case 1:
			{
				
				System.out.println("Please Enter your First Name");
				fName=sn.next();
				custObj.setFName(fName);
				
				System.out.println("Please Enter your Last Name");
				lName=sn.next();
				custObj.setlName(lName);
				
				System.out.println("Please Enter a New User Name");
				userName=sn.next();
				custObj.setUserName(userName);
				
				System.out.println("Please Enter a Password");
				pWord=sn.next();
				custObj.setPassWord(pWord);
				
				System.out.println("The information you entered"+ " First Name: "+
				custObj.getFirstName()+ " Last Name: "+ custObj.getLastName()+ 
				" User Name: " +custObj.getUserName()+ " your password: "+ custObj.getPWord());
				System.out.println("\n If correct Please press Y , If not correct press N");
				opt1=sn.next().toUpperCase();
				
				if(opt1.toUpperCase()!="N")
				{
					BufferedWriter custWriter= Files.newBufferedWriter(path);
					custWriter.write(custObj.getFirstName()+","+custObj.getLastName()+","+custObj.getUserName()+","+custObj.getPWord());
					custWriter.close();
					newAccNum=rand.nextInt(0,10000);
					createAcc(newAccNum,"checking");
					sn.close();
					break;
				}
				else
				{
					System.out.println("Thank you for visiting");
					break;
				}
				
				
			}
			case 2:
			{
				String uName,uPword;
				try
				{
					Scanner custReader= new Scanner(Files.newBufferedReader(path));
					custReader.useDelimiter(",");
					while(custReader.hasNext())
					{
						fName=custReader.next();
						lName=custReader.next();
						userName=custReader.next();
						pWord=custReader.next();
						customer loginCust = new customer();
						customer dataCust = new customer();
						dataCust.setFName(fName);
						dataCust.setlName(lName);
						dataCust.setUserName(userName);
						dataCust.setPassWord(pWord);
						System.out.println("Please Enter Username");
						uName=sn.next();
						loginCust.setUserName(uName);
						System.out.println("Please Enter your Password");
						uPword=sn.next();
						loginCust.setPassWord(uPword);

						custReader.close();
						
						if(dataCust.getUserName().equals(loginCust.getUserName())&& dataCust.getPWord().equals(loginCust.getPWord()))
						{
							System.out.println("Welcome "+ loginCust.getUserName()+"\n");
							System.out.println("Please select from the following options: \n"+
							"1. Deposit\n"+"2. withdraw \n"+
									"3. transfer \n"+ "4. Exit");
							choice= sn.nextInt();
							switch(choice)
							{
							case 1:
							{
								int uAccNum;
								double uAccBal,deposit;
								String uAccType;
								accounts uAcc= new accounts();
								
								Scanner accReader = new Scanner(Files.newBufferedReader(path2));
								accReader.useDelimiter(",");
								uAccNum=accReader.nextInt();
								uAccBal=accReader.nextDouble();
								uAccType=accReader.next();
								uAcc.setAccNum(uAccNum);
								uAcc.setAccBal(uAccBal);
								uAcc.setAccType(uAccType);
								accReader.close();
								System.out.println("How much do you want to deposit");
								while(!sn.hasNextDouble())
								{
									System.out.println("The deposit you entered was incorrect, Please reenter");
									sn.nextDouble();
								}
								deposit= sn.nextDouble();
								uAcc.depositAcc(uAccNum, deposit, uAccType);
								System.out.println("Your new balance is:"+ uAcc.getAccBal());
								BufferedWriter accWriter= Files.newBufferedWriter(path2);
								
								
								accWriter.write(uAcc.getAccNum()+","+uAcc.getAccBal()+","+ uAcc.getAccType());
								accWriter.close();
								break;
							}
							
							case 2:
							{
								int uAccNum;
								double uAccBal,deposit;
								String uAccType;
								accounts uAcc= new accounts();
								
								Scanner accReader = new Scanner(Files.newBufferedReader(path2));
								accReader.useDelimiter(",");
								uAccNum=accReader.nextInt();
								uAccBal=accReader.nextDouble();
								uAccType=accReader.next();
								uAcc.setAccNum(uAccNum);
								uAcc.setAccBal(uAccBal);
								uAcc.setAccType(uAccType);
								accReader.close();
								System.out.println("How much do you want to withdraw");
								while(!sn.hasNextDouble())
								{
									System.out.println("The withdraw you entered was incorrect, Please reenter");
									sn.nextDouble();
								}
								deposit= sn.nextDouble();
								uAcc.withDrawAcc(uAccNum, deposit, uAccType);
								System.out.println("Your new balance is:"+ uAcc.getAccBal());
								BufferedWriter accWriter= Files.newBufferedWriter(path2);
								
								
								accWriter.write(uAcc.getAccNum()+","+uAcc.getAccBal()+","+ uAcc.getAccType());
								accWriter.close();
								break;
							}
							
							case 3:
							case 4:
							default:
								break;
							}
							
						}
						else {System.out.println("params not found");}
						
					
					}
				}
				catch(IOException e)
				{
					e.getStackTrace();
				}
				catch(Exception e)
				{
					e.getStackTrace();					
				}
			}
			case 3:
			default:
				break;
					
			}
		}
		catch(Exception e)
		{
			e.getStackTrace();
		}
	}
	
	public void doBanking(employee empObj,accounts accObj)
	{
		
	}
	public void createAcc(int accNum,String type)
	{
		
		
		try 
		{
			BufferedWriter accWriter= Files.newBufferedWriter(path2);
			accounts ac= new accounts(accNum,type);
			ac.setAccBal(10000);
			accWriter.write(ac.getAccNum()+","+ac.getAccBal()+","+ ac.getAccType());
			accWriter.close();
			System.out.println("Your new about has been Created:\n " +"your account Number:"+ ac.getAccNum()+"\n" + "Your Account Balance"+ ac.getAccBal()+"\n" +
			"Your Account Type:"+ ac.getAccType());
			
		} 
		catch (NullPointerException e)
		{
			e.getStackTrace();
			
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			
				
		}
	}

}
