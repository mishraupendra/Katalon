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
import java.lang.Math;

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


WebElement Near_miss
String sdom_js6


//Function Tab ------------------------------------------------------------------------------------------------------------------

sdom_js6 = 'document.querySelector("#root_ptcsmenubar-64").shadowRoot.querySelector("#flyout").shadowRoot.querySelector("#primaryitems > ptcs-menu-item:nth-child(2)").shadowRoot.querySelector("ptcs-icon:nth-child(2)").shadowRoot.querySelector("div > img").click()'

Near_miss = WebUI.executeJavaScript(sdom_js6, null)

Thread.sleep(7000)


WebUI.clickOffset(findTestObject('MouseOverTest/Page_Lupin DPM/ptcs-menu-submenu'), 10,-100)

Thread.sleep(7000)


 // Safety Tab
 sdom_js6 = 'document.querySelector("#root_pagemashupcontainer-2_ptcstabset-278").shadowRoot.querySelector("#tabs-header > ptcs-tab:nth-child(4) > ptcs-label").shadowRoot.querySelector("#label").click()'
 
 Near_miss = WebUI.executeJavaScript(sdom_js6, null)
 
 Thread.sleep(7000)

 
 
 WebElement Total_Accidents
 
 String sdom_js4
 String Site
 
 
 //NGP >> Accidents--------------------------------------------------------------------------------------------------------
  //NGP Data
  
 
 sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-308_mashupcontainer-117_ptcschartbar-140").shadowRoot.querySelector("#xaxis").shadowRoot.querySelector("#ticks > ptcs-label:nth-child(11)").shadowRoot.querySelector("#label")'

 Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)

 println('Site')

 println(Total_Accidents.getText())
 Site= Total_Accidents.getText()


 //Site == NGP
 //Previous Year Data
 sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-308_mashupcontainer-117_ptcschartbar-140").shadowRoot.querySelector("#chart").shadowRoot.querySelector("#bars > div:nth-child(11) > ptcs-div:nth-child(1) > div > div")'
 
 Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)
 
 println('NGP >> Previous Year Data')
 
 println(Total_Accidents.getText())
 text1=Total_Accidents.getText()
 
 //typecasting
 int GOA_PY=Integer.parseInt(text1);
 
 
 ////Current Year Data
 sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-308_mashupcontainer-117_ptcschartbar-140").shadowRoot.querySelector("#chart").shadowRoot.querySelector("#bars > div:nth-child(11) > ptcs-div:nth-child(2) > div > div")'
 
 Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)
 
 println('NGP >> Current Year Data')
 
 println(Total_Accidents.getText())
 text2=Total_Accidents.getText()
 //type casting
 
 int GOA_CY=Integer.parseInt(text2);
 
 
 if(GOA_CY==0 && GOA_PY == 0 )
	 println("NGP Site is not applicable for Accidents")
 
 else if(GOA_PY==0)
    {
		 Color_coding_Accident_AC = Math.round(GOA_CY * 100)
		 println(Color_coding_Accident_AC)
    } 
 else
    {
		 Color_coding_Accident_AC= Math.round(((GOA_CY - GOA_PY)/GOA_PY)*100)
		 //Math.round(Color_coding_Accident_AC)
		 println(Color_coding_Accident_AC)
    }
 
 
 //Incidents Tab -----------------------------------------------------------------------------------------------------------------

  //Incidents
 sdom_js6 = 'document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-308_ptcstabset-103").shadowRoot.querySelector("#tabs-header > ptcs-tab:nth-child(3) > ptcs-label").shadowRoot.querySelector("#label").click()'
 
 Near_miss = WebUI.executeJavaScript(sdom_js6, null)
 
 Thread.sleep(7000)
  
 //NGP >> Incidents--------------------------------------------------------------------------------------------------------
  //NGP Data
 
 //Site == NGP
 //Previous Year Data
 sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-308_mashupcontainer-118_ptcschartbar-140").shadowRoot.querySelector("#chart").shadowRoot.querySelector("#bars > div:nth-child(11) > ptcs-div:nth-child(1) > div > div")'
 
 Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)
 
 println('NGP >> Previous Year Data')
 
 println(Total_Accidents.getText())
 text3=Total_Accidents.getText()
 
 //typecasting
 int GOA_PY_Incidents=Integer.parseInt(text3);
 
 
// ////Current Year Data
 sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-308_mashupcontainer-118_ptcschartbar-140").shadowRoot.querySelector("#chart").shadowRoot.querySelector("#bars > div:nth-child(11) > ptcs-div:nth-child(2) > div > div")'
 
 Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)
 
 println('NGP >> Current Year Data')
 
 println(Total_Accidents.getText())
 text4=Total_Accidents.getText()
 //type casting
 
 int GOA_CY_Incidents=Integer.parseInt(text4);
 
 
 if(GOA_PY_Incidents==0 && GOA_CY_Incidents==0)
 {
	 println("GOA is not applicable for Incidents")
 }
 else if(GOA_PY_Incidents==0)
	 {
		  Color_coding_Incident_GOA = Math.round(GOA_CY_Incidents * 100)
		  println(Color_coding_Incident_GOA)
	 }
 else
	 {
		 Color_coding_Incident_GOA=Math.round(((GOA_CY_Incidents - GOA_PY_Incidents)/GOA_PY_Incidents)*100)
		 //Math.round(Color_coding_Incident_GOA)
		 println(Color_coding_Incident_GOA)
	 } 
// Near Misses Tab
 sdom_js6 = 'document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-308_ptcstabset-103").shadowRoot.querySelector("#tabs-header > ptcs-tab:nth-child(4) > ptcs-label").shadowRoot.querySelector("#label").click()'
 
 Near_miss = WebUI.executeJavaScript(sdom_js6, null)
 
 Thread.sleep(7000)
 
 
 //EHS >> Safety >> Near Misses --------------------------------------------------------------------------------------------------------
  
 
 //Site == NGP
 //Previous Year Data
 sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-308_mashupcontainer-119_ptcschartbar-140").shadowRoot.querySelector("#chart").shadowRoot.querySelector("#bars > div:nth-child(11) > ptcs-div:nth-child(1) > div > div")'
 
 Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)
 
 println('NGP >> Previous Year Data')
 
 println(Total_Accidents.getText())
 text5=Total_Accidents.getText()
 
 //typecasting
 int ANK_PY_NearMiss=Integer.parseInt(text5);
 
 
 ////Current Year Data
 sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-308_mashupcontainer-119_ptcschartbar-140").shadowRoot.querySelector("#chart").shadowRoot.querySelector("#bars > div:nth-child(11) > ptcs-div:nth-child(2) > div > div")'
 
 Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)
 
 println('NGP >> Current Year Data')
 
 println(Total_Accidents.getText())
 text6=Total_Accidents.getText()
 //type casting
 
 int ANK_CY_NearMiss=Integer.parseInt(text6);
 
 
 if(ANK_PY_NearMiss==0 && ANK_CY_NearMiss==0)
	 {
	 println("NGP is not applicable for Near Misses")
	 }
 else if(ANK_PY_NearMiss==0)
	 {
		  Color_coding_NearMiss = Math.round(ANK_CY_NearMiss * 100)
		  println(Color_coding_NearMiss)
	 }
	 
 else
	 {
		 Color_coding_NearMiss=Math.round(((ANK_CY_NearMiss - ANK_PY_NearMiss)/ANK_PY_NearMiss)*100)
		 println(Color_coding_NearMiss)
	 }
		
//// Training Hours & Man Hours Worked Tab
 sdom_js6 = 'document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-308_ptcstabset-103").shadowRoot.querySelector("#tabs-header > ptcs-tab:nth-child(5) > ptcs-label").shadowRoot.querySelector("#label").click()'
 
 Near_miss = WebUI.executeJavaScript(sdom_js6, null)
 
 Thread.sleep(7000)

 
 //Site == NGP
 //Previous Year Data
 sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-308_mashupcontainer-120_ptcschartbar-140").shadowRoot.querySelector("#chart").shadowRoot.querySelector("#bars > div:nth-child(11) > ptcs-div:nth-child(1) > div > div")'
 
 Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)
 
 println('NGP >> Previous Year Data')
	 
	 println(Total_Accidents.getText())
	 text7=Total_Accidents.getText()
 
//	 //typecasting
 int ANK_PY_TH=Integer.parseInt(text7);
 
	 
 ////Current Year Data
 sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-308_mashupcontainer-120_ptcschartbar-140").shadowRoot.querySelector("#chart").shadowRoot.querySelector("#bars > div:nth-child(11) > ptcs-div:nth-child(2) > div > div")'
 
 Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)
 
 println('NGP >> Current Year Data')
 
 println(Total_Accidents.getText())
 text8=Total_Accidents.getText()
 //type casting
 
 int ANK_CY_TH=Integer.parseInt(text8);
 
 
 if(ANK_PY_TH==0 && ANK_CY_TH==0)
	{
	 println("ANK is not applicable for Training Hours & Man Hours Worked")
    }
 else if(ANK_PY_TH==0)
	{
		 Color_coding_TH = Math.round(ANK_CY_TH * 100)
		 println(Color_coding_TH)
	}
 
 else
	 {
	 
		 Color_coding_TH=Math.round(((ANK_CY_TH - ANK_PY_TH)/ANK_PY_TH)*100)
		 println(Color_coding_TH)
	 }
		
//Site Tab ------------------------------------------------------------------------------------------------------------------
sdom_js6 = 'document.querySelector("#root_ptcsmenubar-64").shadowRoot.querySelector("#flyout").shadowRoot.querySelector("#primaryitems > ptcs-menu-item:nth-child(3)").shadowRoot.querySelector("ptcs-icon:nth-child(2)").shadowRoot.querySelector("div > img").click()'

Near_miss = WebUI.executeJavaScript(sdom_js6, null)

Thread.sleep(7000)

// EHS Tab
WebUI.clickOffset(findTestObject('MouseOverTest/Page_Lupin DPM/ptcs-menu-submenu'), 10, -50)

Thread.sleep(7000)

if(Site=="NGP")
{
	//NGP Tab
	sdom_js6 = 'document.querySelector("#root_pagemashupcontainer-2_ptcsdropdown-312").shadowRoot.querySelector("#select > ptcs-list-item > ptcs-div > ptcs-label").shadowRoot.querySelector("#label").click()'
	
	Near_miss = WebUI.executeJavaScript(sdom_js6, null)
	
	Thread.sleep(7000)
	
	sdom_js6='document.querySelector("#root_pagemashupcontainer-2_ptcsdropdown-312-external-wc").shadowRoot.querySelector("#chunker > div > div > ptcs-list-item:nth-child(11) > ptcs-div > ptcs-label").shadowRoot.querySelector("#label").click()'
	Near_miss = WebUI.executeJavaScript(sdom_js6, null)
	
	Thread.sleep(7000)
}


// //Total Accidents
// // Var vs PY for Total Accidents
sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-307_ptcsgrid-259").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(1) > ptcs-label").shadowRoot.querySelector("#label")'

Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)

println('Total Accidents >> Var vs PY(%)')
println(Total_Accidents.getText())
int text9=Integer.parseInt(Total_Accidents.getText())



//
//// YTD 2021-22 for Total Accidents
sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-307_ptcsgrid-259").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(2) > ptcs-label").shadowRoot.querySelector("#label")'

Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)

println('Total Accidents >> YTD 2021-22')

println(Total_Accidents.getText())
text10P=(Total_Accidents.getText()).replaceAll(",","");

////YD 2022-23 for Total Accidents
sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-307_ptcsgrid-259").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(3) > ptcs-label").shadowRoot.querySelector("#label")'

Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)

println('Total Accidents >> YTD 2022-23')

println(Total_Accidents.getText())
text11C=(Total_Accidents.getText()).replaceAll(",","");





//Total Incidents
WebElement Total_Incidents

String sdom_js5

//Var vs PY for Total Incidents
sdom_js5 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-307_ptcsgrid-265").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(1) > ptcs-label").shadowRoot.querySelector("#label")'

Total_Incidents = WebUI.executeJavaScript(sdom_js5, null)

println('Total Incidents >>  Var vs PY(%)')

println(Total_Incidents.getText())
text12=Integer.parseInt(Total_Incidents.getText())

// YTD 2021-22 for Total Incidents
sdom_js5 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-307_ptcsgrid-265").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(2) > ptcs-label").shadowRoot.querySelector("#label")'

Total_Incidents = WebUI.executeJavaScript(sdom_js5, null)

println('Total Incidents >> YTD 2021-22')

println(Total_Incidents.getText())
text13P=(Total_Incidents.getText()).replaceAll(",","");

// YTD 2021-23 for Total Incidents
sdom_js5 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-307_ptcsgrid-265").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(3) > ptcs-label").shadowRoot.querySelector("#label")'

Total_Incidents = WebUI.executeJavaScript(sdom_js5, null)

println('Total Incidents >> YTD 2022-23')

println(Total_Incidents.getText())
text14C=(Total_Incidents.getText()).replaceAll(",","");

//// Near Miss


//Var vs PY for Near Miss
sdom_js6 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-307_ptcsgrid-271").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(1) > ptcs-label").shadowRoot.querySelector("#label")'

Near_miss = WebUI.executeJavaScript(sdom_js6, null)

println('Near Miss >>  Var vs PY(%)')

println(Near_miss.getText())
text15=Integer.parseInt(Near_miss.getText())

//YTD 2021-22 for Near Miss
sdom_js6 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-307_ptcsgrid-271").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(2) > ptcs-label").shadowRoot.querySelector("#label")'

Near_miss = WebUI.executeJavaScript(sdom_js6, null)

println('Near Miss >> YTD 2021-22')

println(Near_miss.getText())
text16P=(Near_miss.getText()).replaceAll(",","");

//YTD 2022-23 for Near Miss
sdom_js6 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-307_ptcsgrid-271").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(3) > ptcs-label").shadowRoot.querySelector("#label")'

Near_miss = WebUI.executeJavaScript(sdom_js6, null)

println('Near Miss >> YTD 2022-23')

println(Near_miss.getText())
text17C=(Near_miss.getText()).replaceAll(",","");


////Training Hours Var vs PY
sdom_js6 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-307_ptcsgrid-277").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(1) > ptcs-label").shadowRoot.querySelector("#label")'

Near_miss = WebUI.executeJavaScript(sdom_js6, null)

println('Training Hours >>  Var vs PY(%)')

println(Near_miss.getText())
text18=Integer.parseInt(Near_miss.getText())

//Training Hours YTD 2021-22
sdom_js6 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-307_ptcsgrid-277").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(2) > ptcs-label").shadowRoot.querySelector("#label")'

Near_miss = WebUI.executeJavaScript(sdom_js6, null)

println('Training Hours >> YTD 2021-22')

println(Near_miss.getText())
text19P=(Near_miss.getText()).replaceAll(",","");

//Training Hours YTD 2022-23
sdom_js6 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-307_ptcsgrid-277").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(3) > ptcs-label").shadowRoot.querySelector("#label")'

Near_miss = WebUI.executeJavaScript(sdom_js6, null)

println('Training Hours >> YTD 2022-23')

println(Near_miss.getText())
text20C=(Near_miss.getText()).replaceAll(",","");


////Comparison----------------------------------------------------------------------------------------------------------------------
////Site == GOA

	//Accidents 
	if(Color_coding_Accident_AC==text9)
		println("For GOA Site -(Function >>EHS Tab>>Safety Data) and (Site Tab >>EHS>>Safety Data) VAR VS PY(%) Calculation is Correct !!")
	else
		println("Data is Incorrect For Accident VAR vs PY!!")
	if (text1== text10P)
		println("Previous Year Data for Both the Tab is Correct !!!")
	else
		println("Data is Incorrect For Accident Previous Year Data!!")
	 if(text2==text11C)
	
		println("Current Year Data for Both the Tab is Correct !!!")
	
	else 
		println("Data is Incorrect For Accident Current Year Data!!")
//		
////   //Incidents
		if(Color_coding_Incident_GOA==text12)
			println("For GOA Site -(Function >>EHS Tab>>Safety Data) and (Site Tab >>EHS>>Safety Data) VAR VS PY(%) Calculation is Correct !!")
		else
			println("Data is Incorrect For Incident  VAR vs PY!!")
			
		if (text3== text13P)
			println("Previous Year Data for Both the Tab is Correct !!!")
		else
			println("Data is Incorrect For Incident Previous Year Data!!")
		 if(text4==text14C)
		
			println("Current Year Data for Both the Tab is Correct !!!")
		
		else
			println("Data is Incorrect For Incidents Current Year Data!!")
			
		
 // Near Misses
	
	if(Color_coding_NearMiss == text15)
		println("For GOA Site -(Function >>EHS Tab>>Safety Data) and (Site Tab >>EHS>>Safety Data) VAR VS PY(%) Calculation is Correct !!")
	else
		println("Data is Incorrect For Near Misses  VAR vs PY!!")
	if (text5== text16P)
		println("Previous Year Data for Both the Tab is Correct !!!")
	else
		println("Data is Incorrect For Near Misses Previous Year Data!!")
	 if(text6==text17C)
	
		println("Current Year Data for Both the Tab is Correct !!!")
	
	else
		println("Data is Incorrect For Near Misses Current Year Data!!")
		

 // Training Hours And Man Hours Worked
		
		if(Color_coding_TH==text18)
			println("For GOA Site -(Function >>EHS Tab>>Safety Data) and (Site Tab >>EHS>>Safety Data) VAR VS PY(%) Calculation is Correct !!")
		else
			println("Data is Incorrect For Training Hours & Man Hours Worked  VAR vs PY!!")
		if (text7== text19P)
			println("Previous Year Data for Both the Tab is Correct !!!")
		else
			println("Data is Incorrect For Training Hours & Man Hours Worked Previous Year Data!!")
		 if(text8==text20C)
		
			println("Current Year Data for Both the Tab is Correct !!!")
		
		else
			println("Data is Incorrect For Training Hours & Man Hours Worked Current Year Data!!")
		
WebUI.closeBrowser()
			
			
		
	
		
			
			
	
	
	






