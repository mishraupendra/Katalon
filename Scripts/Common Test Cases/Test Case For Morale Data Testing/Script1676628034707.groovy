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

 
// //YTD_resignation
// // Var vs PY for YTD_resignation
 
  sdom_js4='return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-3_ptcsgrid-320").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(1) > ptcs-label").shadowRoot.querySelector("#label")'
  YTD_resignation = WebUI.executeJavaScript(sdom_js4, null)
  println("YTD_resignation >> Var vs PY(%)")
  println(YTD_resignation.getText())
  text1=YTD_resignation.getText()

//// YTD 2021-22 for YTD_resignation
sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-3_ptcsgrid-320").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(2) > ptcs-label").shadowRoot.querySelector("#label")'

YTD_resignation = WebUI.executeJavaScript(sdom_js4, null)
println("YTD_resignation >> YTD 2021-22")
println(YTD_resignation.getText())
text3=YTD_resignation.getText()

////YD 2022-23 for YTD_resignation

sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-3_ptcsgrid-320").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(3) > ptcs-label").shadowRoot.querySelector("#label")'

YTD_resignation = WebUI.executeJavaScript(sdom_js4, null)
println("YTD_resignation >> YTD 2022-23")
println(YTD_resignation.getText())
text5=YTD_resignation.getText()
 
//YTD Attrition
 WebElement Total_Incidents
 
  String sdom_js5

  //Var vs PY for YTD Attrition
  sdom_js5 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-3_ptcsgrid-321").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(1) > ptcs-label").shadowRoot.querySelector("#label")'
  
  Total_Incidents = WebUI.executeJavaScript(sdom_js5, null)
  println("YTD Attrition >>  Var vs PY(%)")
  println(Total_Incidents.getText())
  text7=Total_Incidents.getText()
  
  // YTD 2021-22 for YTD Attrition
  sdom_js5 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-3_ptcsgrid-321").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(2) > ptcs-label").shadowRoot.querySelector("#label")'
  
  Total_Incidents = WebUI.executeJavaScript(sdom_js5, null)
  println("YTD Attrition >> YTD 2021-22")
  println(Total_Incidents.getText())
  text9=Total_Incidents.getText()
  
  // YTD 2022-23 for YTD Attrition
  sdom_js5 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-3_ptcsgrid-321").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(3) > ptcs-label").shadowRoot.querySelector("#label")'
  
  Total_Incidents = WebUI.executeJavaScript(sdom_js5, null)
  println("YTD Attrition >> YTD 2022-23")
  println(Total_Incidents.getText())
  text11=Total_Incidents.getText()
  
  
// Total Programs
  
  WebElement Near_miss
  
  String sdom_js6
 
  //YTD 2022-23 for Total Programs
  
  sdom_js6 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-3_ptcsgrid-322").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div > ptcs-label").shadowRoot.querySelector("#label")'
  
  Near_miss = WebUI.executeJavaScript(sdom_js6, null)
  println("Total Programs >> YTD 2022-23")
  println(Near_miss.getText())
  text13=Near_miss.getText()
  

  
  //Total Trained YTD 2022-23
  sdom_js6 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-3_ptcsgrid-323").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div > ptcs-label").shadowRoot.querySelector("#label")'
  
  Near_miss = WebUI.executeJavaScript(sdom_js6, null)
  println("Total Trained >> YTD 2022-23")
  println(Near_miss.getText())
  text15=Near_miss.getText()
  
  
 //Total Mandays YTD 2022-23
  sdom_js6 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-3_ptcsgrid-324").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div > ptcs-label").shadowRoot.querySelector("#label")'
  
  Near_miss = WebUI.executeJavaScript(sdom_js6, null)
  println("Total Mandays >> YTD 2022-23")
  println(Near_miss.getText())
  text17=Near_miss.getText()
  //Overdue Training Var vs PY
  sdom_js6 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-3_ptcsgrid-325").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(1) > ptcs-label").shadowRoot.querySelector("#label")'
  
  Near_miss = WebUI.executeJavaScript(sdom_js6, null)
  println("Overdue Training >>  Var vs PY(%)")
  println(Near_miss.getText())
  text19=Near_miss.getText()
  
  //Overdue Training YTD 2022
  sdom_js6 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-3_ptcsgrid-325").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(2) > ptcs-label").shadowRoot.querySelector("#label")'
  
  Near_miss = WebUI.executeJavaScript(sdom_js6, null)
  println("Counselling Sessions >> YTD 2022")
  println(Near_miss.getText())
  text21=Near_miss.getText()
  
  //Overdue Training YTD 2023
  sdom_js6 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-3_ptcsgrid-325").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(3) > ptcs-label").shadowRoot.querySelector("#label")'
  
  Near_miss = WebUI.executeJavaScript(sdom_js6, null)
  println("Overdue Training >> YTD 2023")
  println(Near_miss.getText())
  text23=Near_miss.getText()
  
  //GMP Training Completion Var vs PY
  sdom_js6 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-3_ptcsgrid-326").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(1)")'
  
  Near_miss = WebUI.executeJavaScript(sdom_js6, null)
  println("GMP Training Completion >>  Var vs PY(%)")
  println(Near_miss.getText())
  text25=Near_miss.getText()
  
  //GMP Training Completion 2022
  sdom_js6 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-3_ptcsgrid-326").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(2) > ptcs-label").shadowRoot.querySelector("#label")'
  
  Near_miss = WebUI.executeJavaScript(sdom_js6, null)
  println("GMP Training Completion >> YTD 2022")
  println(Near_miss.getText())
  text27=Near_miss.getText()
  
  //GMP Training Completion 2023
  sdom_js6 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-3_ptcsgrid-326").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(3)")'
  
  Near_miss = WebUI.executeJavaScript(sdom_js6, null)
  println("GMP Training Completiont >> YTD 2023")
  println(Near_miss.getText())
  
  text29=Near_miss.getText()

  //BB Certified YTD 2022-23
  sdom_js6 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-3_ptcsgrid-331").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div > ptcs-label").shadowRoot.querySelector("#label")'
  
  Near_miss = WebUI.executeJavaScript(sdom_js6, null)
  println("BB Certified >> YTD 2022-23")
  println(Near_miss.getText())
  
  text31=Near_miss.getText()
  
 
  //BB Trained YTD 2022-23
  sdom_js6 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-3_ptcsgrid-330").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div > ptcs-label").shadowRoot.querySelector("#label")'
  
  Near_miss = WebUI.executeJavaScript(sdom_js6, null)
  println("BB Trained >> YTD 2022-23")
  println(Near_miss.getText())
  
  text33=Near_miss.getText()
  
  //GB Certified YTD 2022-23
  sdom_js6 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-3_ptcsgrid-329").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div > ptcs-label").shadowRoot.querySelector("#label")'
  
  Near_miss = WebUI.executeJavaScript(sdom_js6, null)
  println("ZLD Total Cost >> YTD 2022-23")
  println(Near_miss.getText())
  
  text35=Near_miss.getText()
  
  //GB Trained YTD 2022-23
  sdom_js6 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-3_ptcsgrid-328").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div > ptcs-label").shadowRoot.querySelector("#label")'
  
  Near_miss = WebUI.executeJavaScript(sdom_js6, null)
  println("GB Trained >> YTD 2022-23")
  println(Near_miss.getText())
  
  text37=Near_miss.getText()
  
  //GB Trained-SL YTD 2022-23
  sdom_js6 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-3_ptcsgrid-372").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div > ptcs-label").shadowRoot.querySelector("#label")'
  
  Near_miss = WebUI.executeJavaScript(sdom_js6, null)
  println("GB Trained-SL >> YTD 2022-23")
  println(Near_miss.getText())
  
  text39=Near_miss.getText()
  
  //eGB Passed YTD 2022-23
  sdom_js6 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-3_ptcsgrid-327").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div > ptcs-label").shadowRoot.querySelector("#label")'
  
  Near_miss = WebUI.executeJavaScript(sdom_js6, null)
  println("eGB Passed >> YTD 2022-23")
  println(Near_miss.getText())
  
  text41=Near_miss.getText()
  //Function Tab ------------------------------------------------------------------------------------------------------------------
  
  sdom_js6 = 'document.querySelector("#root_ptcsmenubar-64").shadowRoot.querySelector("#flyout").shadowRoot.querySelector("#primaryitems > ptcs-menu-item:nth-child(2)").shadowRoot.querySelector("ptcs-icon:nth-child(2)").shadowRoot.querySelector("div > img").click()'
  
  Near_miss = WebUI.executeJavaScript(sdom_js6, null)
  
  Thread.sleep(7000)
  
  //WebUI.mouseOver(findTestObject('MouseOverTest/Page_Lupin DPM/ptcs-menu-submenu'))
  //WebUI.mouseOverOffset(findTestObject('MouseOverTest/Page_Lupin DPM/ptcs-menu-submenu'),10,-100)
  WebUI.clickOffset(findTestObject('MouseOverTest/Page_Lupin DPM/ptcs-menu-submenu'), 10,-50)
  
  Thread.sleep(7000)
  
  
  sdom_js4='return document.querySelector("#root_pagemashupcontainer-2_ptcsgrid-291").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(1) > ptcs-label").shadowRoot.querySelector("#label")'
  YTD_resignation = WebUI.executeJavaScript(sdom_js4, null)
  println("YTD_resignation >> Var vs PY(%)")
  println(YTD_resignation.getText())
  text2=YTD_resignation.getText()
//
//// YTD 2021-22 for YTD_resignation
sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_ptcsgrid-291").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(2) > ptcs-label").shadowRoot.querySelector("#label")'

YTD_resignation = WebUI.executeJavaScript(sdom_js4, null)
println("YTD_resignation >> YTD 2021-22")
println(YTD_resignation.getText())
text4=YTD_resignation.getText()

////YD 2022-23 for YTD_resignation

sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_ptcsgrid-291").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(3) > ptcs-label").shadowRoot.querySelector("#label")'

YTD_resignation = WebUI.executeJavaScript(sdom_js4, null)
println("YTD_resignation >> YTD 2022-23")
println(YTD_resignation.getText())
text6=YTD_resignation.getText()
 
//YTD Attrition
 

  //Var vs PY for YTD Attrition
  sdom_js5 = 'return document.querySelector("#root_pagemashupcontainer-2_ptcsgrid-292").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(1) > ptcs-label").shadowRoot.querySelector("#label")'
  
  Total_Incidents = WebUI.executeJavaScript(sdom_js5, null)
  println("YTD Attrition >>  Var vs PY(%)")
  println(Total_Incidents.getText())
  text8=Total_Incidents.getText()
  
  // YTD 2021-22 for YTD Attrition
  sdom_js5 = 'return document.querySelector("#root_pagemashupcontainer-2_ptcsgrid-292").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(2) > ptcs-label").shadowRoot.querySelector("#label")'
  
  Total_Incidents = WebUI.executeJavaScript(sdom_js5, null)
  println("YTD Attrition >> YTD 2021-22")
  println(Total_Incidents.getText())
  text10=Total_Incidents.getText()
  
  // YTD 2022-23 for YTD Attrition
  sdom_js5 = 'return document.querySelector("#root_pagemashupcontainer-2_ptcsgrid-292").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(3) > ptcs-label").shadowRoot.querySelector("#label")'
  
  Total_Incidents = WebUI.executeJavaScript(sdom_js5, null)
  println("YTD Attrition >> YTD 2022-23")
  println(Total_Incidents.getText())
  text12=Total_Incidents.getText()
  
  
// Total Programs
  
 
 
  //YTD 2022-23 for Total Programs
  
  sdom_js6 = 'return document.querySelector("#root_pagemashupcontainer-2_ptcsgrid-293").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div > ptcs-label").shadowRoot.querySelector("#label")'
  
  Near_miss = WebUI.executeJavaScript(sdom_js6, null)
  println("Total Programs >> YTD 2022-23")
  println(Near_miss.getText())
  text14=Near_miss.getText()
  

  
  //Total Trained YTD 2022-23
  sdom_js6 = 'return document.querySelector("#root_pagemashupcontainer-2_ptcsgrid-294").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div > ptcs-label").shadowRoot.querySelector("#label")'
  
  Near_miss = WebUI.executeJavaScript(sdom_js6, null)
  println("Total Trained >> YTD 2022-23")
  println(Near_miss.getText())
  text16=Near_miss.getText()
  
  
  
 //Total Mandays YTD 2022-23
  sdom_js6 = 'return document.querySelector("#root_pagemashupcontainer-2_ptcsgrid-295").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div > ptcs-label").shadowRoot.querySelector("#label")'
  
  Near_miss = WebUI.executeJavaScript(sdom_js6, null)
  println("Total Mandays >> YTD 2022-23")
  println(Near_miss.getText())
  text18=Near_miss.getText()
  //Overdue Training Var vs PY
  sdom_js6 = 'return document.querySelector("#root_pagemashupcontainer-2_ptcsgrid-296").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(1) > ptcs-label").shadowRoot.querySelector("#label")'
  
  Near_miss = WebUI.executeJavaScript(sdom_js6, null)
  println("Overdue Training >>  Var vs PY(%)")
  println(Near_miss.getText())
  text20=Near_miss.getText()
  
  //Overdue Training YTD 2022
  sdom_js6 = 'return document.querySelector("#root_pagemashupcontainer-2_ptcsgrid-296").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(2) > ptcs-label").shadowRoot.querySelector("#label")'
  
  Near_miss = WebUI.executeJavaScript(sdom_js6, null)
  println("Counselling Sessions >> YTD 2022")
  println(Near_miss.getText())
  text22=Near_miss.getText()
  
  //Overdue Training YTD 2023
  sdom_js6 = 'return document.querySelector("#root_pagemashupcontainer-2_ptcsgrid-296").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(3) > ptcs-label").shadowRoot.querySelector("#label")'
  
  Near_miss = WebUI.executeJavaScript(sdom_js6, null)
  println("Overdue Training >> YTD 2023")
  println(Near_miss.getText())
  text24=Near_miss.getText()
  
  //GMP Training Completion Var vs PY
  sdom_js6 = 'return document.querySelector("#root_pagemashupcontainer-2_ptcsgrid-297").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(1)")'
  
  Near_miss = WebUI.executeJavaScript(sdom_js6, null)
  println("GMP Training Completion >>  Var vs PY(%)")
  println(Near_miss.getText())
  text26=Near_miss.getText()
  
  
  //GMP Training Completion 2022
  sdom_js6 = 'return document.querySelector("#root_pagemashupcontainer-2_ptcsgrid-297").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(2) > ptcs-label").shadowRoot.querySelector("#label")'
  
  Near_miss = WebUI.executeJavaScript(sdom_js6, null)
  println("GMP Training Completion >> YTD 2022")
  println(Near_miss.getText())
  text28=Near_miss.getText()
  
  //GMP Training Completion 2023
  sdom_js6 = 'return document.querySelector("#root_pagemashupcontainer-2_ptcsgrid-297").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(3)")'
  
  Near_miss = WebUI.executeJavaScript(sdom_js6, null)
  println("GMP Training Completiont >> YTD 2023")
  println(Near_miss.getText())
  text30=Near_miss.getText()

  //BB Certified YTD 2022-23
  sdom_js6 = 'return document.querySelector("#root_pagemashupcontainer-2_ptcsgrid-302").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div > ptcs-label").shadowRoot.querySelector("#label")'
  
  Near_miss = WebUI.executeJavaScript(sdom_js6, null)
  println("BB Certified >> YTD 2022-23")
  println(Near_miss.getText())
  text32=Near_miss.getText()
  
 
  //BB Trained YTD 2022-23
  sdom_js6 = 'return document.querySelector("#root_pagemashupcontainer-2_ptcsgrid-301").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div > ptcs-label").shadowRoot.querySelector("#label")'
  
  Near_miss = WebUI.executeJavaScript(sdom_js6, null)
  println("BB Trained >> YTD 2022-23")
  println(Near_miss.getText())
  text34=Near_miss.getText()
  
  //GB Certified YTD 2022-23
  sdom_js6 = 'return document.querySelector("#root_pagemashupcontainer-2_ptcsgrid-300").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div > ptcs-label").shadowRoot.querySelector("#label")'
  
  Near_miss = WebUI.executeJavaScript(sdom_js6, null)
  println("ZLD Total Cost >> YTD 2022-23")
  println(Near_miss.getText())
  text36=Near_miss.getText()
  
  //GB Trained YTD 2022-23
  sdom_js6 = 'return document.querySelector("#root_pagemashupcontainer-2_ptcsgrid-299").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div > ptcs-label").shadowRoot.querySelector("#label")'
  
  Near_miss = WebUI.executeJavaScript(sdom_js6, null)
  println("GB Trained >> YTD 2022-23")
  println(Near_miss.getText())
  text38=Near_miss.getText()
  
  //GB Trained-SL YTD 2022-23
  sdom_js6 = 'return document.querySelector("#root_pagemashupcontainer-2_ptcsgrid-355").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div > ptcs-label").shadowRoot.querySelector("#label")'
  
  Near_miss = WebUI.executeJavaScript(sdom_js6, null)
  println("GB Trained-SL >> YTD 2022-23")
  println(Near_miss.getText())
  text40=Near_miss.getText()
  
  //eGB Passed YTD 2022-23
  sdom_js6 = 'return document.querySelector("#root_pagemashupcontainer-2_ptcsgrid-298").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div > ptcs-label").shadowRoot.querySelector("#label")'
  
  Near_miss = WebUI.executeJavaScript(sdom_js6, null)
  println("eGB Passed >> YTD 2022-23")
  println(Near_miss.getText())
  text42=Near_miss.getText()

//Comparision------------------------------------------------------------------------------------------------------------------------------------------------------  
  println("YTD_resignation >> Var vs PY")
  if (text1==text2) {
	  println("For both Home and Functions >> Morale Tab : Text is matching!!")
	}
	else
	{
		println("For both Home and Functions >> Morale Tab : Text is not matching!! !!")
	}
	
  println("YTD_resignation >> YTD 2021-22")
	if (text3==text4) {
		println("For both Home and Functions >> Morale Tab : Text is matching!!")
	  }
	  else
	  {
		  println("For both Home and Functions >> Morale Tab : Text is not matching!! !!")
	  }
  println("YTD_resignation >>YTD 2022-23")
	  if (text5==text6) {
		  println("For both Home and Functions >> Morale Tab : Text is matching!!")
		}
		else
		{
			println("For both Home and Functions >> Morale Tab : Text is not matching!! !!")
		}
  
  println("YTD Attrition >> VAR VS PY")
		if (text7==text8) {
			println("For both Home and Functions >> Morale Tab : Text is matching!!")
		  }
		  else
		  {
			  println("For both Home and Functions >> Morale Tab : Text is not matching!! !!")
		  }
  
  println("YTD Attrition >> YTD 2021-22")
		  if (text9==text10) {
			  println("For both Home and Functions >> Morale Tab : Text is matching!!")
			}
			else
			{
				println("For both Home and Functions >> Morale Tab : Text is not matching!! !!")
			}
			
			
  println("YTD Attrition >> YTD 2022-23")
			if (text11==text12) {
				println("For both Home and Functions >> Morale Tab : Text is matching!!")
			  }
			  else
			  {
				  println("For both Home and Functions >> Morale Tab : Text is not matching!! !!")
			  }
			  
			  
	   println("Total Programs(L & D)  >> YTD 2022-23")
			  if (text13==text14) {
				  println("For both Home and Functions >> Morale Tab : Text is matching!!")
				}
				else
				{
					println("For both Home and Functions >> Morale Tab : Text is not matching!! !!")
				}
		
		println("Total Trained (L& D) >> YTD 2022-23")
				if (text15==text16) {
					println("For both Home and Functions >> Morale Tab : Text is matching!!")
				  }
				  else
				  {
					  println("For both Home and Functions >> Morale Tab : Text is not matching!! !!")
				  }
				  
				  
		println("Total Mandays(L & D) >> YTD 2022-23")
				  if (text17==text18) {
					  println("For both Home and Functions >> Morale Tab : Text is matching!!")
					}
					else
					{
						println("For both Home and Functions >> Morale Tab : Text is not matching!! !!")
					}
					
		println("Overdue Training(Tech. Tr.) >> VAR VS PY")
					if (text19==text20) {
						println("For both Home and Functions >> Morale Tab : Text is matching!!")
					  }
					  else
					  {
						  println("For both Home and Functions >> Morale Tab : Text is not matching!! !!")
					  }
			  
	    println("Overdue Training(Tech. Tr.) >> YTD 2021-22")
					  if (text21==text22) {
						  println("For both Home and Functions >> Morale Tab : Text is matching!!")
						}
						else
						{
							println("For both Home and Functions >> Morale Tab : Text is not matching!! !!")
						}
						
						
		println("Overdue Training(Tech. Tr.) >> YTD 2022-23")
						if (text23==text24) {
							println("For both Home and Functions >> Morale Tab : Text is matching!!")
						  }
						  else
						  {
							  println("For both Home and Functions >> Morale Tab : Text is not matching!! !!")
						  }
						  
		println("GMP Training Completion (Tech. Tr.) >> VAR VS PY")
						  if (text25==text26) {
							  println("For both Home and Functions >> Morale Tab : Text is matching!!")
							}
							else
							{
								println("For both Home and Functions >> Morale Tab : Text is not matching!! !!")
							}
					
	    println("GMP Training Completion (Tech. Tr.) >> YTD 2021-22")
							if (text27==text28) {
								println("For both Home and Functions >> Morale Tab : Text is matching!!")
							  }
							  else
							  {
								  println("For both Home and Functions >> Morale Tab : Text is not matching!! !!")
							  }
							  
							  
		println("GMP Training Completion (Tech. Tr.)>> YTD 2022-23")
							  if (text29==text30) {
								  println("For both Home and Functions >> Morale Tab : Text is matching!!")
								}
								else
								{
									println("For both Home and Functions >> Morale Tab : Text is not matching!! !!")
								}
								
		println("BB Certified >> YTD 2022-23")
								if (text31==text32) {
									println("For both Home and Functions >> Morale Tab : Text is matching!!")
								  }
								  else
								  {
									  println("For both Home and Functions >> Morale Tab : Text is not matching!! !!")
								  }
	    println(" BB Trained >> YTD 2022-23")
								  if (text33==text34) {
									  println("For both Home and Functions >> Morale Tab : Text is matching!!")
									}
									else
									{
										println("For both Home and Functions >> Morale Tab : Text is not matching!! !!")
									}
									
		println(" GB Certified  >> YTD 2022-23")
									if (text35==text36) {
										println("For both Home and Functions >> Morale Tab : Text is matching!!")
									  }
									  else
									  {
										  println("For both Home and Functions >> Morale Tab : Text is not matching!! !!")
									  }
									  
	   println(" GB Trained >> YTD 2022-23")
									  if (text37==text38) {
										  println("For both Home and Functions >> Morale Tab : Text is matching!!")
										}
										else
										{
											println("For both Home and Functions >> Morale Tab : Text is not matching!! !!")
										}
										
		println("GB Trained - SL >> YTD 2022-23")
										if (text39==text40) {
											println("For both Home and Functions >> Morale Tab : Text is matching!!")
										  }
										  else
										  {
											  println("For both Home and Functions >> Morale Tab : Text is not matching!! !!")
										  }
										  
	    println(" eGB Passed >> YTD 2022-23")
										  if (text41==text42) {
											  println("For both Home and Functions >> Morale Tab : Text is matching!!")
											}
											else
											{
												println("For both Home and Functions >> Morale Tab : Text is not matching!! !!")
											}
  
WebUI.closeBrowser()
  
////WebUI.click(findTestObject('Lupin/Page_Lupin DPM/Button_Logout')