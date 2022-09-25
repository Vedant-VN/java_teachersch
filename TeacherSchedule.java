import java.util.*;
import java.io.*;
class TeacherSchedule
{
	ArrayList<String> teacherName=new ArrayList<String>();
	ArrayList<String> teacherQualification=new ArrayList<String>();
	ArrayList<String> teacherSubject=new ArrayList<String>();
	ArrayList<String> teacherPassword=new ArrayList<String>();
	ArrayList<Integer> teacherAge=new ArrayList<Integer>();
	ArrayList<Long> teacherMobileNumber=new ArrayList<Long>();
	ArrayList<String> teacherCity=new ArrayList<String>();

	ArrayList<Integer> studentAge=new ArrayList<Integer>();
	ArrayList<String> studentName=new ArrayList<String>();
	ArrayList<String> studentGender=new ArrayList<String>();
	ArrayList<String> studentPassword=new ArrayList<String>();
	ArrayList<String> studentConfirmPassword=new ArrayList<String>();
	ArrayList<Long> studentMobileNumber=new ArrayList<Long>();

	ArrayList<Integer> studentAgeBooking=new ArrayList<Integer>();
	ArrayList<String> studentNameBooking=new ArrayList<String>();
	ArrayList<String> studentGenderBooking=new ArrayList<String>();
	ArrayList<Byte> teacherID=new ArrayList<Byte>();

	void dataAdd()		//method for creating Default docotr list present in the database.
	{
		teacherName.add("Nagarjun Raut");
		teacherName.add("Ankush Nag");
		teacherName.add("Prashant Jha");
		teacherName.add("Ashish Gadpayle");
		teacherName.add("Sandip Paul");
		teacherName.add("Himanshu Pokhle");
		teacherName.add("Amit Mule");

		teacherQualification.add("MBBS");
		teacherQualification.add("Er, MBBS");
		teacherQualification.add("MBBS, MD");
		teacherQualification.add("MBBS,MD");
		teacherQualification.add("BAMS");
		teacherQualification.add("MBBS, MD, Surgeon");
		teacherQualification.add("BAMS");

		teacherSubject.add("Physics");
		teacherSubject.add("Chemistry");
		teacherSubject.add("Mathematics");
		teacherSubject.add("Biology");
		teacherSubject.add("Zoology");
		teacherSubject.add("Literature");
		teacherSubject.add("Computer Programming");

		teacherPassword.add("Nagarjun123");
		teacherPassword.add("Ankush123");
		teacherPassword.add("Prashant123");
		teacherPassword.add("Ashish123");
		teacherPassword.add("Sandip123");
		teacherPassword.add("Himanshu123");
		teacherPassword.add("Amit123");

		teacherAge.add(25);
		teacherAge.add(24);
		teacherAge.add(29);
		teacherAge.add(29);
		teacherAge.add(28);
		teacherAge.add(23);
		teacherAge.add(30);

		teacherMobileNumber.add(9422887565l);
		teacherMobileNumber.add(123l);
		teacherMobileNumber.add(123l);
		teacherMobileNumber.add(123l);
		teacherMobileNumber.add(123l);
		teacherMobileNumber.add(123l);
		teacherMobileNumber.add(123l);

		teacherCity.add("Gondiya");
		teacherCity.add("Ranchi");
		teacherCity.add("Nagpur");
		teacherCity.add("Nagpur");
		teacherCity.add("Mumbai");
		teacherCity.add("Delhi");
		teacherCity.add("Chennai");

	}

	void admin() throws Exception
	{
		Scanner sc=new Scanner(System.in);
		byte choice;
		boolean flag=true;

		while(flag)
		{
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			System.out.println("\t\t  _________________________");
			System.out.println("\t\t |                         |");
			System.out.println("\t\t |       Welcome Admin     |");
			System.out.println("\t\t |_________________________|");
			System.out.print("\n\n1. Teacher's list \t2. Registered Students \t3.Student's Who Enrolled  \n\nEnter Your Choice.");
			choice=sc.nextByte();
			switch(choice)
			{
			case 1:
				for(int i=0; i<=teacherName.size()-1; i++)
				{
					System.out.println("Name: \t "+teacherName.get(i));
				
				}
				byte menuCHoice;
				System.out.println("\n\n1. Main menu\t 2. Previous menu");
				menuCHoice=sc.nextByte();
				if(menuCHoice==1)
				{
					flag=false;
					
				}
				else
				{
					break;
				}

				break;

			case 2:
					if(studentName.isEmpty())
					{
						System.out.println("No Registered Patients yet.");
						Thread.sleep(3000);
						break;
					}
					else 
					{
						for(int i=0; i<=studentName.size()-1; i++)
						{
							System.out.println(i+". "+studentName.get(i));
						}

						System.out.println("\n\n1. Main menu\t 2. Previous menu");
						menuCHoice=sc.nextByte();
						if(menuCHoice==1)
						{
							flag=false;
							
						}
						else
						{
							break;
						}
					}
					
					break;
				
			case 3:
				if(studentNameBooking.isEmpty())
				{
					System.out.println("\nNo Appointments yet.");
					Thread.sleep(3000);
					break;
				}
				
				else
				{
					for(int i=0; i<=studentNameBooking.size()-1; i++)
					{
						System.out.println(i+". "+studentNameBooking.get(i));
					}

					Thread.sleep(5000);
					flag=false;

				}
				break;
			default:
					System.out.println("Wrong choice");
					Thread.sleep(1000);
					flag=true;
			}


		}
		
	}

	void patient() throws Exception
	{
		Scanner sc=new Scanner(System.in);
		boolean flag=true;
		while(flag)
		{
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			System.out.println("\t\t  _________________________");
			System.out.println("\t\t |                         |");
			System.out.println("\t\t | Welcome to Student Page!|");
			System.out.println("\t\t |_________________________|");
			System.out.println(" ");
			System.out.println("1.Login \t 2.Registration\n");
			int ch=sc.nextInt();
			switch(ch)
			{
				case 1:
					if(studentMobileNumber.isEmpty())
					{
						System.out.println("First register yourself then login..!");
						Thread.sleep(500);
						break;
					}
					else
					{
						studentLogin();
						flag=false;
						
					}
					
					break;
				case 2:
					studentRegistration();
					flag=false;
					break;
				

				default:
					System.out.println("\nYou entered wrong choice. enter your choice again....!!!");
					flag= true;
					Thread.sleep(1000);
					break;
			}
		}
	}


	void teacher() throws Exception
	{
		
		
		Scanner sc=new Scanner(System.in);
		int choice=0;
		
		boolean flag=true;
		while(flag)
		{
			//Thread.sleep(1000);
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

			System.out.println("\t\t  __________________________");
			System.out.println("\t\t |                          |");
			System.out.println("\t\t | Welcome to Teacher Page! |");
			System.out.println("\t\t |__________________________|");
			System.out.println(" ");
			

			System.out.println("1. Login \t 2.Registration");
			choice=sc.nextInt();

			switch(choice)
			{
			case 1:
				if(teacherMobileNumber.isEmpty())
				{
					System.out.println("Register first...!");
					flag=false;
					Thread.sleep(500);
					break;

				}
				else
				{
					teacherLogin();
					flag=false;
				}

				break;
			case 2:
				teacherRegistration();
				flag= false;
				break;

			default:
				System.out.println("Entered Wrong choice..");
				flag=true;
			}
		}	

	}
	

	void studentLogin()throws Exception
	{

		Scanner sc=new Scanner(System.in);
		boolean flag=true;
		long mobileNumber;
		byte choice;
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		System.out.println("\t\t  _________________________");
		System.out.println("\t\t |                         |");
		System.out.println("\t\t |         Login 		   |");
		System.out.println("\t\t |_________________________|");

		System.out.println("Enter your Mobile Number");
		mobileNumber=sc.nextLong();
		System.out.println("Enter your Password");
		String password=sc.next();
	
 		
 		boolean flag1=false;
 		int j;
		for(j=0; j<=studentMobileNumber.size()-1;j++)
		{
			
			if((studentMobileNumber.get(j)).equals(mobileNumber)&&(studentPassword.get(j)).equals(password))
			{
				flag1=true;

				break;
			}
			
		}
		if(flag1==true)
		{		
			Thread.sleep(1000);
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
				System.out.println("\t\t  _________________________");
				System.out.println("\t\t |                         |");
				System.out.println("\t\t |     Enroll Yourself     |");
				System.out.println("\t\t |_________________________|");
			System.out.println("\n Welcome "+studentName.get(j)+", to Enroll For Your Respective Class, Please Choose your Teacher..");
			
			for(int i=0; i<=teacherName.size()-1; i++)
			{
				System.out.println((i+1)+". "+teacherName.get(i));
			}
			choice=sc.nextByte();
			teacherID.add(choice);
			

			
			while(flag)
			{
				Thread.sleep(1000);

				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
				System.out.println("\t\t  _________________________");
				System.out.println("\t\t |                         |");
				System.out.println("\t\t |     Enroll Yourself     |");
				System.out.println("\t\t |_________________________|");
				
				
				//for(int i=0; i<=teacherName.size()-1;i++)
				//{
					if(choice<=teacherName.size() && choice>0)
					{
						System.out.println("\n\nName: \t "+teacherName.get(choice-1)+"\nAge: \t "+teacherAge.get(choice-1)+"\nMobile:  "+teacherMobileNumber.get(choice-1)+"\nCity: \t "+teacherCity.get(choice-1));
						System.out.println("\n Enter your name: \t");
						sc.nextLine();
						studentNameBooking.add(sc.nextLine());
						System.out.println(" Enter your age: \t");
						studentAgeBooking.add(sc.nextInt());
						System.out.println(" Enter your gender: \t");
						studentGenderBooking.add(sc.next());

						System.out.println("\n Booking Successfull..");

						Thread.sleep(1000);
						flag=false;
						break;
					}
					else 
					{
						System.out.println("\n enter correct input..");
						flag=true;
						Thread.sleep(1000);
					}
				
					
				//}
			}	

		}
		else 
		{
			System.out.println("Login unsuccessfull..");
			Thread.sleep(900);
			flag=false;
		}
	}

	void studentRegistration() throws Exception
	{
		Scanner sc=new Scanner(System.in);
		int i=0;
		long mobileNumber;
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		System.out.println("\n");
		System.out.println("\t\t | Welcome to Student Enrollment Registration Page!|");
		System.out.println("\n");
		System.out.println("Please enter your name");
		studentName.add(sc.nextLine());
		System.out.println("enter your age: ");
		studentAge.add(sc.nextInt());
		System.out.println("Please enter your Mobile number");
		mobileNumber=sc.nextLong();
		long mno;
		
		boolean flag=true, flag1=true;
		
		if(studentMobileNumber.isEmpty())
		{
			studentMobileNumber.add((mobileNumber));
			System.out.println("Enter password");
			studentPassword.add(sc.next());
			System.out.println("Registration is Successfull.");
			
			Thread.sleep(900);
			flag1=false;
						
		}
		else 
		{
			for(i=0;i<=studentMobileNumber.size()-1;i++)
			{
				mno=studentMobileNumber.get(i);
				
				if(mno==mobileNumber)
				{
					
					flag1=false;
					break;
				}
					
			}
			if(flag1==true)
			{
			studentMobileNumber.add(mobileNumber);
			System.out.println("Enter password");
			studentPassword.add(sc.next());
			System.out.println("Registration is Successfull.");
			Thread.sleep(900);
			}
			else 
			{
				System.out.println("same mobile numebr is not allowed\n");
				Thread.sleep(500);
			}
		}
	}
	

	void teacherRegistration() throws Exception
	{
		Scanner sc=new Scanner(System.in);
		int i=0;
		long mobileNumber;
		boolean flag=true, flag1=true;
					
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

			System.out.println("\t\t ------------------------------------");
			System.out.println("\t\t| This is Teacher registration Page |");
			System.out.println("\t\t ------------------------------------");
			System.out.println("\n");
			
			System.out.println("Please enter your name");
			teacherName.add(sc.nextLine());

			System.out.println("Please enter your Mobile number");
			mobileNumber=(sc.nextLong());
			
			long mno;

				if(teacherMobileNumber.isEmpty())
					{
						teacherMobileNumber.add((mobileNumber));
						System.out.println("Enter password");
							teacherPassword.add(sc.next());
							System.out.println("Registration is Successfull.");
							Thread.sleep(900);
							flag1=false;
				
						
					}
				else 
				{
					for(i=0;i<=teacherMobileNumber.size()-1;i++)
					{
						mno=teacherMobileNumber.get(i);
						
						if(mno==mobileNumber)
						{
							
							flag1=false;
							break;
						}
							
					}
					if(flag1==true)
					{

								teacherMobileNumber.add(mobileNumber);
								System.out.println("Enter age:");
								teacherAge.add(sc.nextInt());
								System.out.println("Enter City: ");
								teacherCity.add(sc.next());
								System.out.println("Enter password");
								teacherPassword.add(sc.next());
								System.out.println("Registration is Successfull.");
								System.out.println("Details: Name: "+doctorName+" number:"+teacherMobileNumber);
								Thread.sleep(900);

					}
					else {
						System.out.println("same mobile numebr is not allowed\n");
						int index=teacherName.size()-1;
						teacherName.remove(index);
						Thread.sleep(500);

					}

				}
	}

	void teacherLogin() throws Exception
	{
		Scanner sc=new Scanner(System.in);
		Long mobileNumber;
		//Thread.sleep(500);
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		System.out.println("\t\t---------------------------------");
		System.out.println("\t\t| This is Teacher login page    |");
		System.out.println("\t\t---------------------------------");
		System.out.println("Enter your Username(mobilenumber)");
		mobileNumber=sc.nextLong();
		System.out.println("Enter your Password");
		String password=sc.next();
		int i=0;
		byte choice;
 		
 		boolean flag=false;
 		boolean flag11=true;

		for(i=0; i<=teacherMobileNumber.size()-1;i++)
		{
			
			if((teacherMobileNumber.get(i)).equals(mobileNumber)&&(teacherPassword.get(i)).equals(password))
			{
				flag=true;
				break;
			}
		}
		
			if(flag==true)
			{
				while(flag11)
				{
					new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
					System.out.println("\t\t-----------------------------------------");
					System.out.println("\t\t| Welcome Teacher "+teacherName.get(i)+"|");
					System.out.println("\t\t-----------------------------------------");
					System.out.println("\n\nPress 1 to see your Enrolled Students. \n");
					choice=sc.nextByte();
					byte j=0;
					switch(choice)
					{
					case 1:
						if((teacherID.isEmpty()!=true))
						{
							while(j<=teacherID.size()-1)
							{


								if( (i+1)== teacherID.get(j) )
								{
									System.out.println("patient name: "+studentNameBooking.get(j) );
									j++;
									
								}
							}
							Thread.sleep(4000);
							
						}
						else 
							{
								System.out.println("No Students Enrolled For You...!");
								Thread.sleep(3000);
								flag11=true;
							}

						break;
					}
				}
				
				{
					System.out.println("Login unsuccessfull..");
					Thread.sleep(900);
					
					
				}
			}	
	}

	public static void main(String[] args) throws Exception   
	{
		TeacherSchedule ap=new TeacherSchedule();
		Scanner sc=new Scanner(System.in);
		ap.dataAdd();
		boolean flag=true;
		while(flag=true)
		{
			
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		
			System.out.println("---------------------------------------------------------------------");
			System.out.println("\t\t              | Welcome to Teacher Enrollment |");
			System.out.println("----------------------------------------------------------------------\n\n");
				System.out.println("\n1. Teacher \t 2. Student \t 3. Admin \t 4. Exit");
			int choice=sc.nextInt();
			switch(choice)
			{
				case 1:
					ap.teacher();
					flag=true;
					break;
					case 2:
					ap.student();										
					flag=true;
					break;
					case 3:
					
					ap.admin();
					flag= true;
					//Thread.sleep(1000);
					break;
					default:
					System.exit(0);

		}	}
	}
}
