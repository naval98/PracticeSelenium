package Javaselenium;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class BillPay {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/index.htm?utm_source=chatgpt.com");
		driver.manage().window().maximize();

		WebElement Register = driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/p[2]/a"));
		Register.click();
		WebElement FirstName = driver.findElement(By.id("customer.firstName"));
		FirstName.sendKeys("Naval");
		WebElement LastName = driver.findElement(By.name("customer.lastName"));
		LastName.sendKeys("Saxena");
		WebElement Address = driver.findElement(By.xpath("//*[@id=\"customer.address.street\"]"));
		Address.sendKeys("e456323");
		WebElement City = driver.findElement(By.xpath("//*[@id=\"customer.address.city\"]"));
		City.sendKeys("Delhi");
		WebElement state = driver.findElement(By.name("customer.address.state"));
		state.sendKeys("New Delhi");
		WebElement zipcode = driver.findElement(By.id("customer.address.zipCode"));
		zipcode.sendKeys("110067");
		WebElement phone = driver.findElement(By.name("customer.phoneNumber"));
		phone.sendKeys("6789543278");
		WebElement SSN = driver.findElement(By.xpath("//*[@id=\"customer.ssn\"]"));
		SSN.sendKeys("67777");
		WebElement username = driver.findElement(By.cssSelector("#customer\\.username"));
		username.sendKeys("Admin24");
		WebElement password = driver.findElement(By.xpath("//*[@id=\"customer.password\"]"));
		password.sendKeys("Delhi@123");
		WebElement confirmpassword = driver.findElement(By.xpath("//*[@id=\"repeatedPassword\"]"));
		confirmpassword.sendKeys("Delhi@123");
		WebElement Login = driver.findElement(By.xpath("//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input"));
		Login.click();

		WebElement BillPay = driver.findElement(By.xpath("//a[normalize-space()='Bill Pay']"));
		BillPay.click();

		WebElement PayeeName = driver.findElement(By.xpath("//input[@name='payee.name']"));
		PayeeName.sendKeys("Saxena");

		WebElement Address1 = driver.findElement(By.xpath("//input[@name='payee.address.street']"));
		Address1.sendKeys("r6678888");
		WebElement City1 = driver.findElement(By.xpath("//input[@name='payee.address.city']"));
		City1.sendKeys("Delhi");
		WebElement state1 = driver.findElement(By.xpath("//input[@name='payee.address.state']"));
		state1.sendKeys("New Delhi");
		WebElement zipcode1 = driver.findElement(By.xpath("//input[@name='payee.address.zipCode']"));
		zipcode1.sendKeys("110067");
		WebElement Phone1 = driver.findElement(By.name("payee.phoneNumber"));
		Phone1.sendKeys("999999999");


		WebElement Account = driver.findElement(By.xpath("//input[@name='payee.accountNumber']"));
		Account.sendKeys("777777777");
		WebElement verifyAccount = driver.findElement(By.name("verifyAccount"));
		verifyAccount.sendKeys("777777777");

		WebElement Amount = driver.findElement(By.xpath("//input[@name='amount']"));
		Amount.sendKeys("23000");

		WebDriverWait Wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement sendPayment = Wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Send Payment']")));
		sendPayment.click();



		String actualTitle = driver.getTitle();
		String ExpectedTitle = ("https://parabank.parasoft.com/parabank/index.htm?utm_source=chatgpt.com");
		if(actualTitle.equals(ExpectedTitle)) {
			System.out.println("actual title is equal to expected title");
		}

		else {
			System.out.println("actual title is not equal to expected title");
		}

	}
	//Reusable code
	@Test (priority = 1)
	public void FirstName() {
		System.out.println("Firstname entered successfully");
	}

	@Test (priority = 2)
	public void LastName() {
		System.out.println("LastName entered successfully");
	}
	@Test (priority = 3)
	public void Address() {
		System.out.println("Address entered successfully");
	}
	@Test (priority = 4)
	public void City() {
		System.out.println("City entered successfully");
	}
	@Test (priority = 5)
	public void state() {
		System.out.println("state entered successfully");
	}
	@Test (priority = 6)
	public void zipcode() {
		System.out.println("zipcode entered successfully");
	}
	@Test (priority = 7)
	public void phone () {
		System.out.println("phone entered successfully");
	}
	@Test (priority = 8)
	public void SSN() {
		System.out.println("SSN entered successfully");
	}
	@Test (priority = 9)
	public void username() {
		System.out.println("username entered successfully");
	}
	@Test (priority = 10)
	public void password() {
		System.out.println("password entered successfully");
	}
	@Test (priority = 11)
	public void confirmpassword() {
		System.out.println("confirmed password entered successfully");
	}
	@Test (priority = 12)
	public void Login() {
		System.out.println("Login clicked successfully");
	}

	@Test(priority = 13)
	public void Register() {
		System.out.println("Register done successfully");
	}

	@Test(priority = 14)
	public void BillPay() {
		System.out.println("Bill Pay successfully");
	}

	@Test (priority = 15)
	public void Account() {
		System.out.println("Account successfully");
	}

	@Test (priority = 16)
	public void AccountVerify() {
		System.out.println("Account verify successfully");
	}


	@Test (priority = 17)
	public void Amount() {
		System.out.println("Amount sent successfully");
	}


	@Test (priority = 18)
	public void sendPayment() {
		System.out.println("Payment sent successfully");
	}

}


