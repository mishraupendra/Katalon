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
import java.awt.event.KeyEvent
import java.util.concurrent.ConcurrentHashMap.KeySetView

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
WebElement YTD_resignation

 String sdom_js4

 
// //Delivery
// // R v C PY 
 
  sdom_js4='return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-3_ptcsgrid-314").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(1) > ptcs-label").shadowRoot.querySelector("#label")'
  YTD_resignation = WebUI.executeJavaScript(sdom_js4, null)
  println("R v C >> PY")
  println(YTD_resignation.getText())
  text1=YTD_resignation.getText()

// Delivery -- 
 // R v C CY
sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-3_ptcsgrid-314").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(2) > ptcs-label").shadowRoot.querySelector("#label")'

YTD_resignation = WebUI.executeJavaScript(sdom_js4, null)
println("R v C >> CY")
println(YTD_resignation.getText())
text3=YTD_resignation.getText()

//// Delivery -- 
// // C v A

sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-3_ptcsgrid-315").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(1) > ptcs-label").shadowRoot.querySelector("#label")'

YTD_resignation = WebUI.executeJavaScript(sdom_js4, null)
println(" C v A >> PY")
println(YTD_resignation.getText())
text5=YTD_resignation.getText()
 
//// Delivery -- 
// // C v A
 WebElement Total_Incidents
 
  String sdom_js5

  
  sdom_js5 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-3_ptcsgrid-315").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(2) > ptcs-label").shadowRoot.querySelector("#label")'
  
  Total_Incidents = WebUI.executeJavaScript(sdom_js5, null)
  println(" C v A >> CY")
  println(Total_Incidents.getText())
  text7=Total_Incidents.getText()
  
  // Delivery >> Forecast Accuracy
  sdom_js5 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-3_ptcsgrid-382").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(1) > ptcs-label").shadowRoot.querySelector("#label")'
  
  Total_Incidents = WebUI.executeJavaScript(sdom_js5, null)
  println("Forecast Accuracy >> PY")
  println(Total_Incidents.getText())
  text9=Total_Incidents.getText()
  
  // Delivery >> Forecast Accuracy
  sdom_js5 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-3_ptcsgrid-382").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(2) > ptcs-label").shadowRoot.querySelector("#label")'
  
  Total_Incidents = WebUI.executeJavaScript(sdom_js5, null)
  println("Forecast Accuracy >> CY")
  println(Total_Incidents.getText())
  text11=Total_Incidents.getText()
  
  
// Forecast Fidelity
  
  WebElement Near_miss
  
  String sdom_js6
 
  //Forecast Fidelity>>PY 
  
  sdom_js6 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-3_ptcsgrid-383").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(1) > ptcs-label").shadowRoot.querySelector("#label")'
  
  Near_miss = WebUI.executeJavaScript(sdom_js6, null)
  println("Forecast Fidelity >> PY")
  println(Near_miss.getText())
  text13=Near_miss.getText()
  

  
//  //Forecast Fidelity>>CY
  sdom_js6 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-3_ptcsgrid-383").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(2) > ptcs-label").shadowRoot.querySelector("#label")'
  
  Near_miss = WebUI.executeJavaScript(sdom_js6, null)
  println("Forecast Fidelity >> CY")
  println(Near_miss.getText())
  text15=Near_miss.getText()
  
  
 //Customer OTIF Hit >> PY
  sdom_js6 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-3_ptcsgrid-384").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(1) > ptcs-label").shadowRoot.querySelector("#label")'
  
  Near_miss = WebUI.executeJavaScript(sdom_js6, null)
  println("Customer OTIF Hit >> PY")
  println(Near_miss.getText())
  text17=Near_miss.getText()
  //Customer OTIF Hit >> CY
  sdom_js6 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-3_ptcsgrid-384").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(2) > ptcs-label").shadowRoot.querySelector("#label")'
  
  Near_miss = WebUI.executeJavaScript(sdom_js6, null)
  println("Customer OTIF Hit >> CY")
  println(Near_miss.getText())
  text19=Near_miss.getText()
  
  //Backorders (Qty) >> PY
  sdom_js6 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-3_ptcsgrid-316").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(1)")'
  
  Near_miss = WebUI.executeJavaScript(sdom_js6, null)
  println("Backorders (Qty) >> PY")
  println(Near_miss.getText())
  text21=Near_miss.getText()
  
  //Backorders (Qty) >> CY
  sdom_js6 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-3_ptcsgrid-316").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(2) > ptcs-label").shadowRoot.querySelector("#label")'
  
  Near_miss = WebUI.executeJavaScript(sdom_js6, null)
  println("Backorders (Qty) >> CY")
  println(Near_miss.getText())
  text23=Near_miss.getText()
  
 
////WebUI.click(findTestObject('Lupin/Page_Lupin DPM/Button_Logout')