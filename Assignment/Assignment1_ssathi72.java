package testingPackage;

public class Assignment1 {

	void oddOrEven(int iInput)
	{
			
		if (iInput%2 == 0) 
			{
				System.out.println("Given number is even");
			} 
		
		else
			{
				System.out.println("Given number is Odd");
			}
	}
	
	void dayOfTheWeek(int iDay)
	{
		switch(iDay)
			{
				case 1:
					System.out.println("Sunday");
					break;
				
				case 2:
					System.out.println("Monday");
					break;
					
				case 3:
					System.out.println("Tuesday");
					break;
				
				case 4:
					System.out.println("Wednesday");
					break;
					
				case 5:
					System.out.println("Thursday");
					break;
				
				case 6:
					System.out.println("Friday");
					break;
					
				default:
					System.out.println("Saturday");
			}			
		}
	
	void printAtoZ()
	{
		for(int i=65; i<=90; i++)
		{
			Character ch = (char) i;
			System.out.println(ch);
		}
	}
	
	void oneTo100()
	{
		int i = 1;
		while (i <= 100) 
			{
				System.out.println(i);
				i = i + 1;
				
			}
	}
	
	public static void main(String[] args) {
		
		Assignment1 assignment = new Assignment1();
		
		int iInput = 3;
		assignment.oddOrEven(iInput);

		int iDay = 10;
		assignment.dayOfTheWeek(iDay);
		
		assignment.printAtoZ();
		
		assignment.oneTo100();
	}

}
