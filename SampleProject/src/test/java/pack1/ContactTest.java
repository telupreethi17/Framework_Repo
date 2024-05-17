package pack1;

import org.testng.annotations.Test;

public class ContactTest {
	@Test
	public void createcontactTest()
	{
		String URL=System.getProperty("url");
		String BROWSER=System.getProperty("chrme");
		String USERNAME=System.getProperty("username");
		String PASSWORD=System.getProperty("password");
		
		System.out.println(URL);
		System.out.println(BROWSER);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);


	}
	@Test
	public void modifyContactTest()
	{
		System.out.println("execute crmodifyContactTest");
	}
	
	@Test
	public void deleteContactTest()
	{
		System.out.println("execute deleteContactTest");
	}


}
