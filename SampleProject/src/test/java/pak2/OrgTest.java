package pak2;

import org.testng.annotations.Test;

public class OrgTest {
	@Test
	public void createOrgTest()
	{
		System.out.println("execute create org test");
		
		String URL=System.getProperty("url");
		String BROWSER=System.getProperty("chrme","pppp");
		String USERNAME=System.getProperty("username","honey");
		String PASSWORD=System.getProperty("password","****");
		
		System.out.println(URL);
		System.out.println(BROWSER);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);

	}
	@Test
	public void modifyOrgTest()
	{
		System.out.println("execute modifyOrgTest");
	}

}
