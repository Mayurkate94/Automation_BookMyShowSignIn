package bookmyshowSignIn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

		public class BookMyShow {
		    public static void main(String[] args) {
		        ChromeOptions options = new ChromeOptions();
		        options.setBinary("C:/Selenium Files/Selenium Browser Drivers/chrome-win64/chrome-win64/chrome.exe");
		        options.addArguments("--remote-allow-origins=*");
		        System.setProperty("webdriver.chrome.driver", "C:/Selenium Files/Chrome Drivers/chromedriver.exe");
		       // WebDriverManager.chromedriver().setup();
		    	WebDriver driver = new ChromeDriver();
		        driver.manage().window().maximize();

		        // Open the book_my_show website
		        driver.get("https://in.bookmyshow.com/explore/home/");

		        // Select city display on web page
		        driver.findElement(By.className("changeLocation")).click();
		        driver.findElement(By.linkText("Bengaluru")).click();

		        // Sign In
		        driver.findElement(By.id("signin-icon")).click();

		        // Continue with Email
		        driver.findElement(By.className("continueBtn")).click();

		        // Enter email
		        driver.findElement(By.name("email")).sendKeys("selauto@yopmail.com");
		        driver.findElement(By.className("continueBtn")).click();

		        // Open Yopmail site
		        driver.get("http://www.yopmail.com/en/");

		        // Enter email and access inbox
		        driver.findElement(By.id("login")).sendKeys("selauto@yopmail.com");
		        driver.findElement(By.className("sbut")).click();

		        // Wait for email and fetch OTP
		        try {
		            Thread.sleep(10000);  // Adjust timing as needed
		        } catch (InterruptedException e) {
		            e.printStackTrace();
		        }
		        driver.switchTo().frame("ifmail");
		        WebElement lestEmail = driver.findElement(By.cssSelector(".mda6 > span"));
		        lestEmail.click();

		        // Fetch OTP from email content
		        String emailCnt = driver.findElement(By.id("mailmillieu")).getText();
		        String otp = emailCnt.split("Your OTP for BookMyShow is ")[1].split("\\.")[0];

		        // Go back to BookMyShow
		        driver.get("https://in.bookmyshow.com/explore/home/");

		        // Enter OTP
		        driver.findElement(By.id("otp")).sendKeys(otp);
		        driver.findElement(By.id("verificationSignInButton")).click();

		        // Validate successful sign in
		        String hiGuestTxt = driver.findElement(By.className("userName")).getText();
		        if (hiGuestTxt.contains("Hi, Guest")) {
		            System.out.println("User Successfully Signed In");
		        } else {
		            System.out.println("Sign in Failed");
		        }

		        // Close the browser
		        driver.quit();
		    }
		
		
	

}
