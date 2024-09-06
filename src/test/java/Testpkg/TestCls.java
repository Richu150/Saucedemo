package Testpkg;

       
 import org.testng.annotations.Test;

import Basepkg.BaseCls;
import Pagepkg.PageCls;
import Utilitypkg.UtitilyCls;




	   public class TestCls extends BaseCls {
	   	@Test
	   	public void verifyLoginWithValidCred() throws InterruptedException
	   	{
	   		PageCls p1=new PageCls(driver);
	   		String xl="\"C:\\Users\\91755\\OneDrive\\Documents\\Book1.1.xlsx\"";
	   		String Sheet="Sheet1";
	   		int rowCount=UtitilyCls.getRowCount(xl, Sheet);
	   		for(int i=1;i<=rowCount;i++)
	   		{
	   	
	   			String Username=UtitilyCls.getCellValues(xl, Sheet, i, 0);
	   			System.out.println("username----"+Username);
	   			
	   			String Password=UtitilyCls.getCellValues(xl, Sheet, i, 1);
	   			System.out.println("password----"+Password);
	   			
	   			
	   			p1.setvalues(Username, Password);
	   			p1.login();
	   			
	   			driver.navigate().refresh();
	   		}
	   			Thread.sleep(30);
	   			p1.Products();
	   			Thread.sleep(30);
	   			p1.cart();
	   			Thread.sleep(30);
	   			p1.checkoutclick();
	   			Thread.sleep(30);
	   			p1.details("Richu", "KS", "680701");
	   			Thread.sleep(30);
	   			p1.logout();
//	   			
	   			//driver.navigate().back();
	   			
	   			
	   		}
	   	}
		