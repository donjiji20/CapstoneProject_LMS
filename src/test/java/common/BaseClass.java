package common;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class BaseClass
{
private WebDriver driver;

public WebDriver getDriver()
{
return driver;
}
public void setDriver()
 {
	System.setProperty("webdriver.edge.driver", "C:\\Drivers\\edgedriver_win64\\msedgedriver.exe");
driver = new EdgeDriver();

driver.manage().window().maximize();
}
}

