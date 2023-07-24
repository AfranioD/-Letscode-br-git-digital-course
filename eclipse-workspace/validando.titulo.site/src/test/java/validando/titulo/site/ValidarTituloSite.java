package validando.titulo.site;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidarTituloSite {
	
	WebDriver driver;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void e2etreinamentos () {
		driver.get("https://www.e2etreinamentos.com.br");
		
		String titulo = driver.getTitle();
		assertEquals("E2E Treinamentos", titulo);
				
	}
	
	@Test
	public void google () {
		driver.get("https://www.google.com.br");
		
		String titulo = driver.getTitle();
		assertEquals("Google", titulo);
		
	}
	
	@Test
	public void amazon () {
		driver.get("https://www.amazon.com.br");
		
		String titulo = driver.getTitle();
		assertEquals("Amazon.com.br | Tudo pra você, de A a Z.", titulo);
		
	}

}
