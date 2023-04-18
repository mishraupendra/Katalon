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

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.awt.Robot as Robot
import java.awt.event.KeyEvent as KeyEvent
import org.openqa.selenium.By as By
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.support.ui.ExpectedConditions as ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait as WebDriverWait
import com.kms.katalon.core.configuration.RunConfiguration as RC
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword as WebUIAbstractKeyword
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium as WebDriverBackedSelenium
import internal.GlobalVariable as GlobalVariable
import jdk.nashorn.internal.runtime.options.LoggingOption.LoggerInfo as GlobalVariable
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint

WebUI.openBrowser('')

def executionProfile = RC.getExecutionProfile()

String baseUrl = 'https://mdpm-qa.lupin.com/Thingworx/FormLogin/Lupin.Org'

def driver = DriverFactory.getWebDriver()

selenium = new WebDriverBackedSelenium(driver, baseUrl)

WebDriverWait wait = new WebDriverWait(driver, 5)

//WebUI.navigateToUrl(GlobalVariable.url)
try {
	WebUI.navigateToUrl('https://mdpm-qa.lupin.com/Thingworx/FormLogin/Lupin.Org' //Handle redirection delay
		)
}
finally {
	println('Navigating & waiting for redirection to MSAD')

	Thread.sleep(2000)
}

WebUI.setViewPortSize(1920, 1080)

Thread.sleep(1000)

//GlobalVariable.ad_username
WebUI.setText(findTestObject('Object Repository/Lupin/MS_AD/ad_username'), 'sumeetbobhate@lupin.com')

WebUI.click(findTestObject('Object Repository/Lupin/MS_AD/ad_next_button'))

Thread.sleep(1000)

//GlobalVariable.ad_password
WebUI.setText(findTestObject('Object Repository/Lupin/MS_AD/ad_password'), 'Rockwell@123')

WebUI.click(findTestObject('Object Repository/Lupin/MS_AD/ad_signin_button'))

Thread.sleep(1000)

WebUI.click(findTestObject('Object Repository/Lupin/MS_AD/ad_no_button'))

Thread.sleep(500)

// Navigate to Lupin TWX login experience
WebUI.navigateToUrl('https://mdpm-qa.lupin.com/Thingworx/FormLogin/Lupin.Org')

WebUI.setText(findTestObject('Object Repository/Lupin/Page_Log in/thingworx-form-userid'), 'Lupin.CXO')

WebUI.setText(findTestObject('Object Repository/Lupin/Page_Log in/thingworx-form-password'), 'lupin@11223344')

Thread.sleep(1000)

WebUI.click(findTestObject('Object Repository/Lupin/Page_Log in/input_Lupin.Org_Login'))

Thread.sleep(7000)

Thread.sleep(7000)

Thread.sleep(2000)






//Function Tab ------------------------------------------------------------------------------------------------------------------

sdom_js6 = 'document.querySelector("#root_ptcsmenubar-64").shadowRoot.querySelector("#flyout").shadowRoot.querySelector("#primaryitems > ptcs-menu-item:nth-child(2)").shadowRoot.querySelector("ptcs-icon:nth-child(2)").shadowRoot.querySelector("div > img").click()'

Near_miss = WebUI.executeJavaScript(sdom_js6, null)

Thread.sleep(7000)

//WebUI.mouseOver(findTestObject('MouseOverTest/Page_Lupin DPM/ptcs-menu-submenu'))
//WebUI.mouseOverOffset(findTestObject('MouseOverTest/Page_Lupin DPM/ptcs-menu-submenu'),10,-100)
WebUI.clickOffset(findTestObject('MouseOverTest/Page_Lupin DPM/ptcs-menu-submenu'), 10,-100)

Thread.sleep(7000)


 // Safety Tab
 sdom_js6 = 'document.querySelector("#root_pagemashupcontainer-2_ptcstabset-278").shadowRoot.querySelector("#tabs-header > ptcs-tab:nth-child(4) > ptcs-label").shadowRoot.querySelector("#label").click()'
 
 Near_miss = WebUI.executeJavaScript(sdom_js6, null)
 
 Thread.sleep(7000)

 
 
 WebElement Total_Accidents
 
 String sdom_js4
 
 
 //Previous Year Data
 sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-308_mashupcontainer-117_ptcschartbar-140").shadowRoot.querySelector("#chart").shadowRoot.querySelector("#bars > div:nth-child(6) > ptcs-div:nth-child(1)")'
 
 Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)
 
 println('GOA >> Previous Year Data')
 
 println(Total_Accidents.getText())
 text1=Total_Accidents.getText()
 
 ////Current Year Data
 sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-308_mashupcontainer-117_ptcschartbar-140").shadowRoot.querySelector("#chart").shadowRoot.querySelector("#bars > div:nth-child(6) > ptcs-div:nth-child(2)")'
 
 Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)
 
 println('GOA >> Current Year Data')
 
 println(Total_Accidents.getText())
 text2=Total_Accidents.getText()
 
 
 
 //Click on GOA Site 
 sdom_js6 = 'document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-308_mashupcontainer-117_ptcschartbar-140").shadowRoot.querySelector("#chart").shadowRoot.querySelector("#bars > div:nth-child(6) > ptcs-div:nth-child(1)").click()'
 
 Near_miss = WebUI.executeJavaScript(sdom_js6, null)
 
 Thread.sleep(7000)
 
 // Selected Item
 sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-308_mashupcontainer-117_mashupcontainer-148_ptcslist-20").shadowRoot.querySelector("#chunker > div > div > ptcs-list-item:nth-child(5) > ptcs-div > ptcs-label").shadowRoot.querySelector("#label")'
 
 Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)
 
 println('Selected Item')
 
 println(Total_Accidents.getText())
 Selected_Item=Total_Accidents.getText()
 
// if(Selected_Item==GOA)
//	 println("The Selected Item is Correct")
// 
 
//WebUI.getAttribute(findTestObject(‘GOA’),‘null’)
 
 
 
// //Previous Year Data
// sdom_js4 = 'return document.querySelector("#cell_Lupin_Safety_DVAccidentCell_Mashup-6_ptcschartbar-92").shadowRoot.querySelector("#chart").shadowRoot.querySelector("#bars > ptcs-div:nth-child(2) > div > div")'
// 
// Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)
// 
// println('GOA >> Previous Year Data')
// 
// println(Total_Accidents.getText())
// text3=Total_Accidents.getText()
// 
// ////Current Year Data
// sdom_js4 = 'return document.querySelector("#cell_Lupin_Safety_DVAccidentCell_Mashup-3_ptcschartbar-92").shadowRoot.querySelector("#chart").shadowRoot.querySelector("#bars > ptcs-div:nth-child(7) > div > div")'
// 
// Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)
// 
// println('GOA >> Current Year Data')
// 
// println(Total_Accidents.getText())
// text4=Total_Accidents.getText()
 
 
 
 
 
 
 
 
 
 
 
 
 