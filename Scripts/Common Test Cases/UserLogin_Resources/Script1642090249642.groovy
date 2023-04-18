import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.awt.Robot as Robot
import java.awt.event.KeyEvent as KeyEvent
import org.openqa.selenium.By as By
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.ui.ExpectedConditions as ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait as WebDriverWait
import com.kms.katalon.core.configuration.RunConfiguration as RC
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium as WebDriverBackedSelenium
import internal.GlobalVariable
import jdk.nashorn.internal.runtime.options.LoggingOption.LoggerInfo as GlobalVariable

WebUI.openBrowser('')

def executionProfile = RC.getExecutionProfile()

String baseUrl = 'https://mdpm-qa.lupin.com/Thingworx/FormLogin/Lupin.Org'

def driver = DriverFactory.getWebDriver()

selenium = new WebDriverBackedSelenium(driver, baseUrl)

WebDriverWait wait = new WebDriverWait(driver, 5)

//WebUI.navigateToUrl(GlobalVariable.url)
try {
WebUI.navigateToUrl('https://mdpm-qa.lupin.com/Thingworx/FormLogin/Lupin.Org')
//Handle redirection delay
}
finally {
	println("Navigating & waiting for redirection to MSAD")
	Thread.sleep(2000)
}

WebUI.setViewPortSize(1920, 1080)
Thread.sleep(1000)
//GlobalVariable.ad_username
WebUI.setText(findTestObject('Object Repository/Lupin/MS_AD/ad_username'), 'sumeetbobhate@lupin.com')
WebUI.click(findTestObject('Object Repository/Lupin/MS_AD/ad_next_button'))
Thread.sleep(1000)
//GlobalVariable.ad_password
WebUI.setText(findTestObject('Object Repository/Lupin/MS_AD/ad_password'), 'Kalypso@2023')
WebUI.click(findTestObject('Object Repository/Lupin/MS_AD/ad_signin_button'))
Thread.sleep(1000)
WebUI.click(findTestObject('Object Repository/Lupin/MS_AD/ad_no_button'))
Thread.sleep(500)

// Navigate to Lupin TWX login experience
WebUI.navigateToUrl('https://mdpm-qa.lupin.com/Thingworx/FormLogin/Lupin.Org')
WebUI.setText(findTestObject('Object Repository/Lupin/Page_Log in/thingworx-form-userid'),   'Lupin.SiteHead')
WebUI.setText(findTestObject('Object Repository/Lupin/Page_Log in/thingworx-form-password'), 'lupin@11223344')
Thread.sleep(1000)
WebUI.click(findTestObject('Object Repository/Lupin/Page_Log in/input_Lupin.Org_Login'))
Thread.sleep(10000)


// EHS Test
String text1 = "EHS";

WebElement ehs_string
String sdom_js2
sdom_js2 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-3_ptcslabel-52").shadowRoot.querySelector("#label")'

ehs_string = WebUI.executeJavaScript(sdom_js2, null)
text2=ehs_string.getText()
println(text2)
if (text1==text2) {
  println("Text is matching for EHS ")
}
else
{
	println("Text is not matching !!")
}


//Morale Test

String Text1 ="Morale"
sdom_js2='return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-3_ptcslabel-48").shadowRoot.querySelector("#label")'
ehs_string = WebUI.executeJavaScript(sdom_js2, null)
Text2=ehs_string.getText()
println(Text2)
if (Text1==Text2) {
	println("Text is matching for Morale")
  }
  else
  {
	  println("Text is not matching !!")
  }

//Total Employee Count for YTD 2021-22
  
  String emp_count_21_22="8,671"
  sdom_js2='return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-3_ptcsgrid-319").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(1) > ptcs-label").shadowRoot.querySelector("#label")'
  //write a code for highlighting
  ehs_string = WebUI.executeJavaScript(sdom_js2, null)
  exp_emp_count_21_22=ehs_string.getText()
  println(exp_emp_count_21_22)
  
  if (emp_count_21_22==exp_emp_count_21_22) {
	  println("Text is matching for Total Employee Count For YTD 2021-22")
	}
	else
	{
		println("Text is not matching !!")
	}
	
  
  
//Total Employee Count for YTD 2022-23
  
  String emp_count="8,678"
  
  sdom_js2='return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-3_ptcsgrid-319").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(2) > ptcs-label").shadowRoot.querySelector("#label")'
  //write a code for highlighting
  ehs_string = WebUI.executeJavaScript(sdom_js2, null)
  exp_emp_count=ehs_string.getText()
  println(exp_emp_count)
  if (emp_count==exp_emp_count) {
	  println("Text is matching for Total Employee Count For YTD 2022-23")
	}
	else
	{
		println("Text is not matching !!")
	}
	


//WebUI.click(findTestObject('Lupin/Page_Lupin DPM/Button_Logout'))



