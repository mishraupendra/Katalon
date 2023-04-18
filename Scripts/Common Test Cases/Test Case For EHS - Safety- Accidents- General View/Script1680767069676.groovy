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

 //General View Tab 
 sdom_js6 = 'document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-308_mashupcontainer-117_mashupcontainer-102_ptcstogglebutton-111").shadowRoot.querySelector("div > div").click()'
 
 Near_miss = WebUI.executeJavaScript(sdom_js6, null)
 
 Thread.sleep(7000)
  
 
 WebElement Total_Accidents
 
 String sdom_js4
 String Site

 //EHS >Accidents--------------------------------------------------------------------------------------------------------
  //ANK Data
 

  
 sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-308_mashupcontainer-117_ptcschartbar-179").shadowRoot.querySelector("#xaxis").shadowRoot.querySelector("#ticks > ptcs-label:nth-child(2)").shadowRoot.querySelector("#label")'

 Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)

 println('Site')

 println(Total_Accidents.getText())
 Site= Total_Accidents.getText()
 
 //Site == ANK
 //Current Year Data
 sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-308_mashupcontainer-117_ptcschartbar-179").shadowRoot.querySelector("#chart").shadowRoot.querySelector("#bars > div:nth-child(2) > ptcs-div > div > div")'
 
 Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)
 
 println('ANK >> Current Year Data')
 
 println(Total_Accidents.getText())
 
 
 //AUR Data
 
sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-308_mashupcontainer-117_ptcschartbar-179").shadowRoot.querySelector("#xaxis").shadowRoot.querySelector("#ticks > ptcs-label:nth-child(3)").shadowRoot.querySelector("#label")'

Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)

println('Site')

println(Total_Accidents.getText())
Site= Total_Accidents.getText()

//Site == AUR
//Current Year Data
sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-308_mashupcontainer-117_ptcschartbar-179").shadowRoot.querySelector("#chart").shadowRoot.querySelector("#bars > div:nth-child(3) > ptcs-div > div > div")'

Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)

println('AUR >> Current Year Data')

println(Total_Accidents.getText())
 

//BIO Data

sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-308_mashupcontainer-117_ptcschartbar-179").shadowRoot.querySelector("#xaxis").shadowRoot.querySelector("#ticks > ptcs-label:nth-child(4)").shadowRoot.querySelector("#label")'

Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)

println('Site')

println(Total_Accidents.getText())
Site= Total_Accidents.getText()

//Site == BIO
//Current Year Data
sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-308_mashupcontainer-117_ptcschartbar-179").shadowRoot.querySelector("#chart").shadowRoot.querySelector("#bars > div:nth-child(4) > ptcs-div > div > div")'

Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)

println('BIO >> Current Year Data')

println(Total_Accidents.getText())
 

//DBH Data

sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-308_mashupcontainer-117_ptcschartbar-179").shadowRoot.querySelector("#xaxis").shadowRoot.querySelector("#ticks > ptcs-label:nth-child(5)").shadowRoot.querySelector("#label")'

Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)

println('Site')

println(Total_Accidents.getText())
Site= Total_Accidents.getText()

//Site == DBH
//Current Year Data
sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-308_mashupcontainer-117_ptcschartbar-179").shadowRoot.querySelector("#chart").shadowRoot.querySelector("#bars > div:nth-child(5) > ptcs-div > div > div")'

Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)

println('DBH >> Current Year Data')

println(Total_Accidents.getText())



//GOA Data

sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-308_mashupcontainer-117_ptcschartbar-179").shadowRoot.querySelector("#xaxis").shadowRoot.querySelector("#ticks > ptcs-label:nth-child(6)").shadowRoot.querySelector("#label")'

Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)

println('Site')

println(Total_Accidents.getText())
Site= Total_Accidents.getText()

//Site == GOA
//Current Year Data
sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-308_mashupcontainer-117_ptcschartbar-179").shadowRoot.querySelector("#chart").shadowRoot.querySelector("#bars > div:nth-child(6) > ptcs-div > div > div")'

Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)

println('GOA >> Current Year Data')

println(Total_Accidents.getText())

//IDR Data

sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-308_mashupcontainer-117_ptcschartbar-179").shadowRoot.querySelector("#xaxis").shadowRoot.querySelector("#ticks > ptcs-label:nth-child(7)").shadowRoot.querySelector("#label")'

Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)

println('Site')

println(Total_Accidents.getText())
Site= Total_Accidents.getText()

//Site == IDR
//Current Year Data
sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-308_mashupcontainer-117_ptcschartbar-179").shadowRoot.querySelector("#chart").shadowRoot.querySelector("#bars > div:nth-child(7) > ptcs-div > div > div")'

Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)

println('IDR >> Current Year Data')

println(Total_Accidents.getText())


//JMU Data

sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-308_mashupcontainer-117_ptcschartbar-179").shadowRoot.querySelector("#xaxis").shadowRoot.querySelector("#ticks > ptcs-label:nth-child(8)").shadowRoot.querySelector("#label")'

Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)

println('Site')

println(Total_Accidents.getText())
Site= Total_Accidents.getText()

//Site == JMU
//Current Year Data
sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-308_mashupcontainer-117_ptcschartbar-179").shadowRoot.querySelector("#chart").shadowRoot.querySelector("#bars > div:nth-child(8) > ptcs-div > div > div")'

Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)

println('JMU >> Current Year Data')

println(Total_Accidents.getText())


//LRP Data

sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-308_mashupcontainer-117_ptcschartbar-179").shadowRoot.querySelector("#xaxis").shadowRoot.querySelector("#ticks > ptcs-label:nth-child(9)").shadowRoot.querySelector("#label")'

Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)

println('Site')

println(Total_Accidents.getText())
Site= Total_Accidents.getText()

//Site == LRP
//Current Year Data
sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-308_mashupcontainer-117_ptcschartbar-179").shadowRoot.querySelector("#chart").shadowRoot.querySelector("#bars > div:nth-child(9) > ptcs-div > div > div")'

Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)

println('LRP >> Current Year Data')

println(Total_Accidents.getText())


//MDP Data

sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-308_mashupcontainer-117_ptcschartbar-179").shadowRoot.querySelector("#xaxis").shadowRoot.querySelector("#ticks > ptcs-label:nth-child(10)").shadowRoot.querySelector("#label")'

Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)

println('Site')

println(Total_Accidents.getText())
Site= Total_Accidents.getText()

//Site == MDP
//Current Year Data
sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-308_mashupcontainer-117_ptcschartbar-179").shadowRoot.querySelector("#chart").shadowRoot.querySelector("#bars > div:nth-child(10) > ptcs-div > div > div")'

Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)

println('MDP >> Current Year Data')

println(Total_Accidents.getText())


//NGP Data

sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-308_mashupcontainer-117_ptcschartbar-179").shadowRoot.querySelector("#xaxis").shadowRoot.querySelector("#ticks > ptcs-label:nth-child(11)").shadowRoot.querySelector("#label")'

Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)

println('Site')

println(Total_Accidents.getText())
Site= Total_Accidents.getText()

//Site == NGP
//Current Year Data
sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-308_mashupcontainer-117_ptcschartbar-179").shadowRoot.querySelector("#chart").shadowRoot.querySelector("#bars > div:nth-child(11) > ptcs-div > div > div")'

Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)

println('NGP >> Current Year Data')

println(Total_Accidents.getText())


//SKM  Data

sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-308_mashupcontainer-117_ptcschartbar-179").shadowRoot.querySelector("#xaxis").shadowRoot.querySelector("#ticks > ptcs-label:nth-child(12)").shadowRoot.querySelector("#label")'

Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)

println('Site')

println(Total_Accidents.getText())
Site= Total_Accidents.getText()

//Site == SKM
//Current Year Data
sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-308_mashupcontainer-117_ptcschartbar-179").shadowRoot.querySelector("#chart").shadowRoot.querySelector("#bars > div:nth-child(12) > ptcs-div > div > div")'

Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)

println('SKM >> Current Year Data')

println(Total_Accidents.getText())


//TRP  Data

sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-308_mashupcontainer-117_ptcschartbar-179").shadowRoot.querySelector("#xaxis").shadowRoot.querySelector("#ticks > ptcs-label:nth-child(13)").shadowRoot.querySelector("#label")'

Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)

println('Site')

println(Total_Accidents.getText())
Site= Total_Accidents.getText()

//Site == TRP
//Current Year Data
sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-308_mashupcontainer-117_ptcschartbar-179").shadowRoot.querySelector("#chart").shadowRoot.querySelector("#bars > div:nth-child(13) > ptcs-div > div > div")'

Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)

println('TRP >> Current Year Data')

println(Total_Accidents.getText())

//VZG  Data

sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-308_mashupcontainer-117_ptcschartbar-179").shadowRoot.querySelector("#xaxis").shadowRoot.querySelector("#ticks > ptcs-label:nth-child(14)").shadowRoot.querySelector("#label")'

Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)

println('Site')

println(Total_Accidents.getText())
Site= Total_Accidents.getText()

//Site == VZG
//Current Year Data
sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-308_mashupcontainer-117_ptcschartbar-179").shadowRoot.querySelector("#chart").shadowRoot.querySelector("#bars > div:nth-child(14) > ptcs-div > div > div")'

Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)

println('VZG >> Current Year Data')

println(Total_Accidents.getText())

//WebUI.closeBrowser()


 
 
 
