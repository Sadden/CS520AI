package sadden.LCS.typical;
import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class J_Test {

	@Before
	public void Inite()
	{
		System.out.println("Inite");
	}
	
	@Test
	public void Test()
	{
		Word_function wor = new Word_function();
		try {
			String like = wor.FindMostLike("epple");
			System.out.println(like);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}
	@After
	public void delete()
	{
		System.out.println("End");
	}
	
	
}
