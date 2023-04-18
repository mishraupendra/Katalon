import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint

import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//System.setProperty("webdriver.chrome.driver", "C:\Users\PMitra1\chromedriver_win32 \\chromedriver.exe");
//
//// set up the webdriver
//WebDriver driver = new ChromeDriver();
//
//// navigate to the webpage
//driver.get("https://mdpm-qa.lupin.com/Thingworx/FormLogin/Lupin.Org");
//
//// find the element to highlight
//WebElement element = driver.findElement(By.xpath("//*[@id='label']"));
//
//// create an action chain to highlight the element
//Actions action = new Actions(driver);
//action.moveToElement(element).perform();
//
//// highlight the element by changing its border and background color
//JavascriptExecutor js = (JavascriptExecutor) driver;
//js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red; background-color: yellow;');", element);
//
//// wait for a few seconds to see the highlight effect
//Thread.sleep(3000);
//
//// close the browser
//driver.quit()

WebElement emailTxt = driver.findElement(By.id("label"));
JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
jsExecutor.executeScript("arguments[0].style.background='yellow'", emailTxt);








