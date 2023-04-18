import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
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


//'Sign in with the credentials associated to the Things Server'
//WebUI.callTestCase(findTestCase('Common Test Cases/Test Case For EHS Safety Accidents Color Coding'), [:], FailureHandling.STOP_ON_FAILURE)

'Sign in with the credentials associated to the Things Server'
WebUI.callTestCase(findTestCase('Common Test Cases/Login as/CXO'), [:], FailureHandling.STOP_ON_FAILURE)

Thread.sleep(2000)


WebElement Near_miss
String sdom_js6

WebElement Total_Accidents
String sdom_js4
String Site

String Compare_val

'Accident Tab'
WebUI.callTestCase(findTestCase('Common Test Cases/Navigation/Functions-EHS-Safety/EHS_Safety_Accidents'), [:], FailureHandling.STOP_ON_FAILURE)

  //EHS >> Accidents--------------------------------------------------------------------------------------------------------
  //ANK Data
  
 
 sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-308_mashupcontainer-117_ptcschartbar-140").shadowRoot.querySelector("#xaxis").shadowRoot.querySelector("#ticks > ptcs-label:nth-child(2)").shadowRoot.querySelector("#label")'

 Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)

 println('Site')

 println(Total_Accidents.getText())
 Site= Total_Accidents.getText()


 //Site == ANK
 //Previous Year Data
 sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-308_mashupcontainer-117_ptcschartbar-140").shadowRoot.querySelector("#chart").shadowRoot.querySelector("#bars > div:nth-child(2) > ptcs-div:nth-child(1)")'
 
 Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)
 
 println('ANK >> Previous Year Data')
 
 println(Total_Accidents.getText())
 text1=Total_Accidents.getText()
 
 //typecasting
 int ANK_PY=Integer.parseInt(text1);
 
 
 ////Current Year Data
 sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-308_mashupcontainer-117_ptcschartbar-140").shadowRoot.querySelector("#chart").shadowRoot.querySelector("#bars > div:nth-child(2) > ptcs-div:nth-child(2)")'
 
 Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)
 
 println('ANK >> Current Year Data')
 
 println(Total_Accidents.getText())
 text2=Total_Accidents.getText()
 //type casting
 
 int ANK_CY=Integer.parseInt(text2);
 
 
 if(ANK_CY==0 && ANK_PY == 0 )
		   println("ANK Site is not applicable for Accidents")

 else if(ANK_PY==0)
	 {
		 Color_coding_Accident_AC= Math.round((ANK_CY * 100))
		 println(Color_coding_Accident_AC)
	 }
	 
 else
	 {
		 Color_coding_Accident_AC=Math.round(((ANK_CY - ANK_PY)/ANK_PY)*100)
		 //Math.round(Color_coding_Accident_AC)
		 println(Color_coding_Accident_AC)
	 }
 
 
// //Incidents Tab -----------------------------------------------------------------------------------------------------------------
//
'Incidents Tab'
WebUI.callTestCase(findTestCase('Common Test Cases/Navigation/Functions-EHS-Safety/EHS_Safety_Incidents'), [:], FailureHandling.STOP_ON_FAILURE)
  
 //EHS >> Incidents--------------------------------------------------------------------------------------------------------
 //Site == ANK
 //Previous Year Data
 sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-308_mashupcontainer-118_ptcschartbar-140").shadowRoot.querySelector("#chart").shadowRoot.querySelector("#bars > div:nth-child(2) > ptcs-div:nth-child(1)")'
 
 Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)
 
 println('ANK >> Previous Year Data')
 
 println(Total_Accidents.getText())
 text3=Total_Accidents.getText()
 
 //typecasting
 int ANK_PY_Incidents=Integer.parseInt(text3);
 
 
// ////Current Year Data
 sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-308_mashupcontainer-118_ptcschartbar-140").shadowRoot.querySelector("#chart").shadowRoot.querySelector("#bars > div:nth-child(2) > ptcs-div:nth-child(2)")'
 
 Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)
 
 println('ANK >> Current Year Data')
 
 println(Total_Accidents.getText())
 text4=Total_Accidents.getText()
 //type casting
 
 int ANK_CY_Incidents=Integer.parseInt(text4);
 
 
 if(ANK_PY_Incidents==0 && ANK_CY_Incidents==0)
	 {
		 println("ANK is not applicable for Incidents")
	 }
 else if(ANK_PY_Incidents==0)
	 {
		 Color_coding_Incident_ANK = Math.round((ANK_CY_Incidents * 100))
		 println(Color_coding_Incident_ANK)
		 
	 }
	 else
	 {
		 Color_coding_Incident_ANK=Math.round(((ANK_CY_Incidents - ANK_PY_Incidents)/ANK_PY_Incidents)*100)
		 println(Color_coding_Incident_ANK)
	 }
	 
'Near Misses Tab'
WebUI.callTestCase(findTestCase('Common Test Cases/Navigation/Functions-EHS-Safety/EHS_Safety_Near Misses'), [:], FailureHandling.STOP_ON_FAILURE)
	 
	 
	 //EHS >> Safety >> Near Misses --------------------------------------------------------------------------------------------------------
	  //ANK Data
	 
	 //Site == ANK
	 //Previous Year Data
	 sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-308_mashupcontainer-119_ptcschartbar-140").shadowRoot.querySelector("#chart").shadowRoot.querySelector("#bars > div:nth-child(2) > ptcs-div:nth-child(1) > div > div")'
	 
	 Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)
	 
	 println('ANK >> Previous Year Data')
	 
	 println(Total_Accidents.getText())
	 text5=Total_Accidents.getText()
	 
	 //typecasting
	 int ANK_PY_NearMiss=Integer.parseInt(text5);
	 
	 
	 ////Current Year Data
	 sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-308_mashupcontainer-119_ptcschartbar-140").shadowRoot.querySelector("#chart").shadowRoot.querySelector("#bars > div:nth-child(2) > ptcs-div:nth-child(2) > div > div")'
	 
	 Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)
	 
	 println('ANK >> Current Year Data')
	 
	 println(Total_Accidents.getText())
	 text6=Total_Accidents.getText()
	 //type casting
	 
	 int ANK_CY_NearMiss=Integer.parseInt(text6);
	 
	 
	 if(ANK_PY_NearMiss==0 && ANK_CY_NearMiss==0)
	 {
		 println("ANK is not applicable for Near Misses")
	 }
	 else if(ANK_PY_NearMiss==0)
		 {
			 Color_coding_NearMiss = Math.round((ANK_CY_NearMiss * 100))
			 println(Color_coding_NearMiss)
			 
		 }
	 else
		 {
			 Color_coding_NearMiss=Math.round(((ANK_CY_NearMiss - ANK_PY_NearMiss)/ANK_PY_NearMiss)*100)
			 println(Color_coding_NearMiss)
		 }
'Training Hours and Man Hours Worked Tab'
WebUI.callTestCase(findTestCase('Common Test Cases/Navigation/Functions-EHS-Safety/EHS_Safety_Training Hours And Man Hours Worked'), [:], FailureHandling.STOP_ON_FAILURE)
	 
	 //Site == ANK
	 //Previous Year Data
	 sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-308_mashupcontainer-120_ptcschartbar-140").shadowRoot.querySelector("#chart").shadowRoot.querySelector("#bars > div:nth-child(2) > ptcs-div:nth-child(1) > div > div")'
	 
	 Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)
	 
	 println('ANK >> Previous Year Data')
	 
	 println(Total_Accidents.getText())
	 text7=Total_Accidents.getText()
	 
	 //typecasting
	 int ANK_PY_TH=Integer.parseInt(text7);
	 
	 
	 ////Current Year Data
	 sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-308_mashupcontainer-120_ptcschartbar-140").shadowRoot.querySelector("#chart").shadowRoot.querySelector("#bars > div:nth-child(2) > ptcs-div:nth-child(2) > div > div")'
	 
	 Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)
	 
	 println('ANK >> Current Year Data')
	 
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
			 Color_coding_TH = Math.round((ANK_CY_TH * 100))
			 println(Color_coding_TH)
			 
		 }
	 else
		 {
			 Color_coding_TH=Math.round(((ANK_CY_TH - ANK_PY_TH)/ANK_PY_TH)*100)
			 
			 println(Color_coding_TH)
		
		 }
			  

// Plant Safety Inspection

WebUI.callTestCase(findTestCase('Common Test Cases/Navigation/Functions-EHS-Safety/EHS_Safety_Plant Safety Inspection'), [:], FailureHandling.STOP_ON_FAILURE)

		 //Actual Data
		 //Previous Year Data
		 sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-308_mashupcontainer-122_ptcschartbar-197").shadowRoot.querySelector("#chart").shadowRoot.querySelector("#bars > div.group-bar > ptcs-div:nth-child(1) > div > div")'
		 
		 Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)
		 
		 println('ANK >> Previous Year Actual Data')
		 
		 println(Total_Accidents.getText())
		 
		 text20 = Total_Accidents.getText()
		 
		 ////Current Year Data
		 sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-308_mashupcontainer-122_ptcschartbar-197").shadowRoot.querySelector("#chart").shadowRoot.querySelector("#bars > div.group-bar > ptcs-div:nth-child(2) > div > div")'
		 
		 Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)
		 
		 println('ANK >> Current Year Actual Data')
		 
		 println(Total_Accidents.getText())
		 
		 text21 = Total_Accidents.getText()
	
		 //Percentage  Data
		 //Previous Year Data
		 sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-308_mashupcontainer-122_ptcschartbar-200").shadowRoot.querySelector("#chart").shadowRoot.querySelector("#bars > div.group-bar > ptcs-div:nth-child(1) > div > div")'
		 
		 Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)
		 
		 println('ANK >> Previous Year Percentage Data')
		 
		 println(Total_Accidents.getText())
		 
		 text22 = Total_Accidents.getText()
		 
		 ////Current Year Data
		 sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-308_mashupcontainer-122_ptcschartbar-200").shadowRoot.querySelector("#chart").shadowRoot.querySelector("#bars > div.group-bar > ptcs-div:nth-child(2) > div > div")'
		 
		 Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)
		 
		 println('ANK >> Current Year Percentage Data')
		 
		 println(Total_Accidents.getText())
		 
		 text23 = Total_Accidents.getText()
		 
////Process Safety Management
WebUI.callTestCase(findTestCase('Common Test Cases/Navigation/Functions-EHS-Safety/EHS_Safety_Process Safety Management'), [:], FailureHandling.STOP_ON_FAILURE)
	
   //Previous Year Data
	 sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-308_mashupcontainer-123_ptcschartbar-140").shadowRoot.querySelector("#chart").shadowRoot.querySelector("#bars > div.group-bar > ptcs-div:nth-child(1) > div > div")'
	 
	 Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)
	 
	 println('ANK >> Previous Year Actual Data')
	 
	 println(Total_Accidents.getText())
	 
	 text24 = Total_Accidents.getText()
	 
	 ////Current Year Data
	 sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-308_mashupcontainer-123_ptcschartbar-140").shadowRoot.querySelector("#chart").shadowRoot.querySelector("#bars > div.group-bar > ptcs-div:nth-child(2) > div > div")'
	 
	 Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)
	 
	 println('ANK >> Current Year Actual Data')
	 
	 println(Total_Accidents.getText())
	 
	 text25 = Total_Accidents.getText()
	 
	
////Mock Drill
WebUI.callTestCase(findTestCase('Common Test Cases/Navigation/Functions-EHS-Safety/EHS_Safety_Mock Drill'), [:], FailureHandling.STOP_ON_FAILURE)
		
	 //Q1
	 //Previous Year Data
	 sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-308_mashupcontainer-125_ptcschartbar-140").shadowRoot.querySelector("#chart").shadowRoot.querySelector("#bars > div:nth-child(2) > ptcs-div:nth-child(1) > div > div")'
	 
	 Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)
	 
	 println('ANK >> Q1 >> Previous Year Data')
	 
	 println(Total_Accidents.getText())
	 
	 text30 = Total_Accidents.getText()
	 
	 ////Current Year Data
	 sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-308_mashupcontainer-125_ptcschartbar-140").shadowRoot.querySelector("#chart").shadowRoot.querySelector("#bars > div:nth-child(2) > ptcs-div:nth-child(2) > div > div")'
	 
	 Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)
	 
	 println('ANK >>Q1>> Current Year Data')
	 
	 println(Total_Accidents.getText())
	 
	 text31 = Total_Accidents.getText()
	 
	 //Q2
	 //Previous Year Data
	 sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-308_mashupcontainer-125_ptcschartbar-140").shadowRoot.querySelector("#chart").shadowRoot.querySelector("#bars > div:nth-child(3) > ptcs-div:nth-child(1) > div > div")'
	 
	 Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)
	 
	 println('ANK >> Q2 >> Previous Year Data')
	 
	 println(Total_Accidents.getText())
	 
	 text32 = Total_Accidents.getText()
	 
	 ////Current Year Data
	 sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-308_mashupcontainer-125_ptcschartbar-140").shadowRoot.querySelector("#chart").shadowRoot.querySelector("#bars > div:nth-child(3) > ptcs-div:nth-child(2) > div > div")'
	 
	 Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)
	 
	 println('ANK >>Q2 >> Current Year Data')
	 
	 println(Total_Accidents.getText())
	 
	 text33 = Total_Accidents.getText()
	 
	 //Q3
	 //Previous Year Data
	 sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-308_mashupcontainer-125_ptcschartbar-140").shadowRoot.querySelector("#chart").shadowRoot.querySelector("#bars > div:nth-child(4) > ptcs-div:nth-child(1) > div > div")'
	 
	 Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)
	 
	 println('ANK >> Q3 >> Previous Year Data')
	 
	 println(Total_Accidents.getText())
	 
	 text34 = Total_Accidents.getText()
	 
	 ////Current Year Data
	 sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-308_mashupcontainer-125_ptcschartbar-140").shadowRoot.querySelector("#chart").shadowRoot.querySelector("#bars > div:nth-child(4) > ptcs-div:nth-child(2) > div > div")'
	 
	 Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)
	 
	 println('ANK >>Q3 >> Current Year Data')
	 
	 println(Total_Accidents.getText())
	 
	 text35 = Total_Accidents.getText()
	 
	 //Q4
	 //Previous Year Data
	 sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-308_mashupcontainer-125_ptcschartbar-140").shadowRoot.querySelector("#chart").shadowRoot.querySelector("#bars > div:nth-child(5) > ptcs-div:nth-child(1) > div > div")'
	 
	 Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)
	 
	 println('ANK >> Q4 >> Previous Year Data')
	 
	 println(Total_Accidents.getText())
	 
	 text36 = Total_Accidents.getText()
	 
	 ////Current Year Data
	 sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-308_mashupcontainer-125_ptcschartbar-140").shadowRoot.querySelector("#chart").shadowRoot.querySelector("#bars > div:nth-child(5) > ptcs-div:nth-child(2) > div > div")'
	 
	 Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)
	 
	 println('ANK >>Q4 >> Current Year Data')
	 
	 println(Total_Accidents.getText())
	 
	 text37 = Total_Accidents.getText()
	 
////EHS Improvement Projects
WebUI.callTestCase(findTestCase('Common Test Cases/Navigation/Functions-EHS-Safety/EHS_Safety_EHS Improvement Projects'), [:], FailureHandling.STOP_ON_FAILURE)
	 
 //Previous Year Data
 sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-308_mashupcontainer-126_ptcschartbar-140").shadowRoot.querySelector("#chart").shadowRoot.querySelector("#bars > div.group-bar > ptcs-div:nth-child(1) > div > div")'
 
 Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)
 
 println('ANK >> Previous Year Data')
 
 println(Total_Accidents.getText())
 
 text40 = Total_Accidents.getText()
 
 ////Current Year Data
 sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-308_mashupcontainer-126_ptcschartbar-140").shadowRoot.querySelector("#chart").shadowRoot.querySelector("#bars > div.group-bar > ptcs-div:nth-child(2) > div > div")'
 
 Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)
 
 println('ANK >> Current Year Data')
 
 println(Total_Accidents.getText())
 
 text41 = Total_Accidents.getText()
		 
		 
//'Site-EHS Tab -------------------------------------------------------------------------------------------------------------------'
WebUI.callTestCase(findTestCase('Common Test Cases/Navigation/Site Tab-EHS-Safety/Site-EHS-Tab'), [:], FailureHandling.STOP_ON_FAILURE)


// //Total Accidents
// // Var vs PY for Total Accidents
sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-307_ptcsgrid-259").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(1) > ptcs-label").shadowRoot.querySelector("#label")'

Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)

println('Total Accidents >> Var vs PY(%)')
println(Total_Accidents.getText())

text9=Integer.parseInt(Total_Accidents.getText())

Compare_val=(Color_coding_Accident_AC == text9)? "For ANK Site -(Function >>EHS Tab>>Safety Data) and (Site Tab >>EHS>>Safety Data) VAR VS PY(%) Calculation is Correct !!" : "For ANK Site -(Function >>EHS Tab>>Safety Data) and (Site Tab >>EHS>>Safety Data) VAR VS PY(%) Calculation is Wrong !!"

println(Compare_val)
//
//// YTD 2021-22 for Total Accidents
sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-307_ptcsgrid-259").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(2) > ptcs-label").shadowRoot.querySelector("#label")'

Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)

println('Total Accidents >> YTD 2021-22')

println(Total_Accidents.getText())
text10P=(Total_Accidents.getText()).replaceAll(",","");

Compare_val=(text1== text10P) ? "Accident Previous Year Data is Correct For both Function And EHS Tab " : "Accident Previous Year Data is Wrong For both Function And EHS Tab!!"

println(Compare_val)

////YD 2022-23 for Total Accidents
sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-307_ptcsgrid-259").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(3) > ptcs-label").shadowRoot.querySelector("#label")'

Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)

println('Total Accidents >> YTD 2022-23')

println(Total_Accidents.getText())
text11C=(Total_Accidents.getText()).replaceAll(",","");

Compare_val=(text2== text11C) ? "Accident Current Year Data is Correct For both Function And EHS Tab " : "Accident Current Year Data is Wrong For both Function And EHS Tab!!"

println(Compare_val)




//Total Incidents
WebElement Total_Incidents

String sdom_js5

//Var vs PY for Total Incidents
sdom_js5 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-307_ptcsgrid-265").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(1) > ptcs-label").shadowRoot.querySelector("#label")'

Total_Incidents = WebUI.executeJavaScript(sdom_js5, null)

println('Total Incidents >>  Var vs PY(%)')

println(Total_Incidents.getText())
text12=Integer.parseInt(Total_Incidents.getText())
Compare_val=(text12== Color_coding_Incident_ANK) ? "For ANK Site -(Function >>EHS Tab>>Safety Data) and (Site Tab >>EHS>>Safety Data) VAR VS PY(%) Calculation is Correct !!" : "For ANK Site -(Function >>EHS Tab>>Safety Data) and (Site Tab >>EHS>>Safety Data) VAR VS PY(%) Calculation is Wrong !!"

println(Compare_val)

// YTD 2021-22 for Total Incidents
sdom_js5 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-307_ptcsgrid-265").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(2) > ptcs-label").shadowRoot.querySelector("#label")'

Total_Incidents = WebUI.executeJavaScript(sdom_js5, null)

println('Total Incidents >> YTD 2021-22')

println(Total_Incidents.getText())
text13P=(Total_Incidents.getText()).replaceAll(",","");
Compare_val=(text3== text13P) ? "Incident Current Year Data is Correct For both Function And EHS Tab " : "Incident Current Year Data is Wrong For both Function And EHS Tab!!"

println(Compare_val)

// YTD 2021-23 for Total Incidents
sdom_js5 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-307_ptcsgrid-265").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(3) > ptcs-label").shadowRoot.querySelector("#label")'

Total_Incidents = WebUI.executeJavaScript(sdom_js5, null)

println('Total Incidents >> YTD 2022-23')

println(Total_Incidents.getText())
text14C=(Total_Incidents.getText()).replaceAll(",","");
Compare_val=(text4== text14C) ? "Incident Current Year Data is Correct For both Function And EHS Tab " : "Incident Current Year Data is Wrong For both Function And EHS Tab!!"

println(Compare_val)

//// Near Miss


//Var vs PY for Near Miss
sdom_js6 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-307_ptcsgrid-271").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(1) > ptcs-label").shadowRoot.querySelector("#label")'

Near_miss = WebUI.executeJavaScript(sdom_js6, null)

println('Near Miss >>  Var vs PY(%)')

println(Near_miss.getText())
text15=Integer.parseInt(Near_miss.getText())
Compare_val=(text15== Color_coding_NearMiss) ? "For ANK Site -(Function >>EHS Tab>>Safety Data) and (Site Tab >>EHS>>Safety Data) VAR VS PY(%) Calculation is Correct !!" : "For ANK Site -(Function >>EHS Tab>>Safety Data) and (Site Tab >>EHS>>Safety Data) VAR VS PY(%) Calculation is Wrong !!"

println(Compare_val)

//YTD 2021-22 for Near Miss
sdom_js6 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-307_ptcsgrid-271").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(2) > ptcs-label").shadowRoot.querySelector("#label")'

Near_miss = WebUI.executeJavaScript(sdom_js6, null)

println('Near Miss >> YTD 2021-22')

println(Near_miss.getText())
text16P=(Near_miss.getText()).replaceAll(",","");
Compare_val=(text5== text16P) ? "Near Misses Previous Year Data is Correct For both Function And EHS Tab " : "Near Misses Previous Year Data is Wrong For both Function And EHS Tab!!"

println(Compare_val)

//YTD 2022-23 for Near Miss
sdom_js6 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-307_ptcsgrid-271").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(3) > ptcs-label").shadowRoot.querySelector("#label")'

Near_miss = WebUI.executeJavaScript(sdom_js6, null)

println('Near Miss >> YTD 2022-23')

println(Near_miss.getText())
text17C=(Near_miss.getText()).replaceAll(",","");
Compare_val=(text6== text17C) ? "Near Misses Current Year Data is Correct For both Function And EHS Tab " : "Near Misses Current Year Data is Wrong For both Function And EHS Tab!!"

println(Compare_val)


////Training Hours Var vs PY
sdom_js6 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-307_ptcsgrid-277").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(1) > ptcs-label").shadowRoot.querySelector("#label")'

Near_miss = WebUI.executeJavaScript(sdom_js6, null)

println('Training Hours >>  Var vs PY(%)')

println(Near_miss.getText())
text18=Integer.parseInt(Near_miss.getText())
Compare_val=(text18== Color_coding_TH) ? "For ANK Site -(Function >>EHS Tab>>Safety Data) and (Site Tab >>EHS>>Safety Data) VAR VS PY(%) Calculation is Correct !!" : "For ANK Site -(Function >>EHS Tab>>Safety Data) and (Site Tab >>EHS>>Safety Data) VAR VS PY(%) Calculation is Wrong !!"

println(Compare_val)

//Training Hours YTD 2021-22
sdom_js6 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-307_ptcsgrid-277").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(2) > ptcs-label").shadowRoot.querySelector("#label")'

Near_miss = WebUI.executeJavaScript(sdom_js6, null)

println('Training Hours >> YTD 2021-22')

println(Near_miss.getText())
text19P=(Near_miss.getText()).replaceAll(",","");
Compare_val=(text7== text19P) ? "Training Hours And Man Hours Worked- Previous Year Data is Correct For both Function And EHS Tab " : "Training Hours And Man Hours Worked Previous Year Data is Wrong For both Function And EHS Tab!!"

println(Compare_val)

//Training Hours YTD 2022-23
sdom_js6 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-307_ptcsgrid-277").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(3) > ptcs-label").shadowRoot.querySelector("#label")'

Near_miss = WebUI.executeJavaScript(sdom_js6, null)

println('Training Hours >> YTD 2022-23')

println(Near_miss.getText())
text20C=(Near_miss.getText()).replaceAll(",","");

Compare_val=(text8== text20C) ? "Training Hours And Man Hours Worked- Current Year Data is Correct For both Function And EHS Tab " : "Training Hours And Man Hours Worked Current Year Data is Wrong For both Function And EHS Tab!!"

println(Compare_val)



//Safety Tab

WebUI.callTestCase(findTestCase('Common Test Cases/Navigation/Site Tab-EHS-Safety/EHS-Safety Tab'), [:], FailureHandling.STOP_ON_FAILURE)

////Plant Safety Inspection
WebUI.callTestCase(findTestCase('Common Test Cases/Navigation/Site Tab-EHS-Safety/EHS_Safety_Plant Safety Inspection'), [:], FailureHandling.STOP_ON_FAILURE)
	//Actual Data
	//Previous Year Data
	sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-309_mashupcontainer-122_ptcschartbar-197").shadowRoot.querySelector("#chart").shadowRoot.querySelector("#bars > div.group-bar > ptcs-div:nth-child(1) > div > div")'
	
	Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)
	
	println('ANK >> Previous Year Actual Data')
	
	println(Total_Accidents.getText())
	
	text20SP = Total_Accidents.getText()
	Compare_val=(text20== text20SP) ? "Plant Safety Inspection - Previous Year Actual Data is Correct For both Function And EHS Tab " : "Plant Safety Inspection - Previous Year Actual Data is Wrong For both Function And EHS Tab!!"
	
	println(Compare_val)
	
	////Current Year Data
	sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-309_mashupcontainer-122_ptcschartbar-197").shadowRoot.querySelector("#chart").shadowRoot.querySelector("#bars > div.group-bar > ptcs-div:nth-child(2) > div > div")'
	
	Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)
	
	println('ANK >> Current Year Actual Data')
	
	println(Total_Accidents.getText())
	
	text21SC = Total_Accidents.getText()
	Compare_val=(text21== text21SC) ? "Plant Safety Inspection - Current Year Actual Data is Correct For both Function And EHS Tab " : "Plant Safety Inspection - Current Year Actual Data is Wrong For both Function And EHS Tab!!"
	
	println(Compare_val)
	
	//type casting
	//int ANK_CY_Actual_PS=Integer.parseInt(text21);
	//Percentage  Data
	//Previous Year Data
	sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-309_mashupcontainer-122_ptcschartbar-200").shadowRoot.querySelector("#chart").shadowRoot.querySelector("#bars > div.group-bar > ptcs-div:nth-child(1) > div > div")'
	
	Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)
	
	println('ANK >> Previous Year Percentage Data')
	
	println(Total_Accidents.getText())
	
	text22SP = Total_Accidents.getText()
	Compare_val=(text22== text22SP) ? "Plant Safety Inspection - Previous Year Percentage Data is Correct For both Function And EHS Tab " : "Plant Safety Inspection - Current Year Actual Data is Wrong For both Function And EHS Tab!!"
	
	println(Compare_val)
	
	////Current Year Data
	sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-309_mashupcontainer-122_ptcschartbar-200").shadowRoot.querySelector("#chart").shadowRoot.querySelector("#bars > div.group-bar > ptcs-div:nth-child(2) > div > div")'
	
	Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)
	
	println('ANK >> Current Year Percentage Data')
	
	println(Total_Accidents.getText())
	
	text23SC = Total_Accidents.getText()
	
	Compare_val=(text23== text23SC) ? "Plant Safety Inspection - Current Year Percentage Data is Correct For both Function And EHS Tab " : "Plant Safety Inspection - Current Year Percentage Data is Wrong For both Function And EHS Tab!!"
	
	println(Compare_val)

////Process Safety Management
WebUI.callTestCase(findTestCase('Common Test Cases/Navigation/Site Tab-EHS-Safety/EHS_Safety_Process Safety Management'), [:], FailureHandling.STOP_ON_FAILURE)
	//Previous Year Data
	sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-309_mashupcontainer-123_ptcschartbar-140").shadowRoot.querySelector("#chart").shadowRoot.querySelector("#bars > div.group-bar > ptcs-div:nth-child(1) > div > div")'
	
	Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)
	
	println('ANK >> Previous Year Actual Data')
	
	println(Total_Accidents.getText())
	
	text24SP = Total_Accidents.getText()
	Compare_val=(text24SP== text24) ? "Process Safety Management - Previous Year Data is Correct For both Function And EHS Tab " : "Process Safety Management - Previous Year Data is Wrong For both Function And EHS Tab!!"
	
	println(Compare_val)
	
	////Current Year Data
	sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-309_mashupcontainer-123_ptcschartbar-140").shadowRoot.querySelector("#chart").shadowRoot.querySelector("#bars > div.group-bar > ptcs-div:nth-child(2) > div > div")'
	
	Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)
	
	println('ANK >> Current Year Actual Data')
	
	println(Total_Accidents.getText())
	
	text25SC = Total_Accidents.getText()
	Compare_val=(text25== text25SC) ? "Process Safety Management- Current Year Data is Correct For both Function And EHS Tab " : "Process Safety Management - Previous Year Data is Wrong For both Function And EHS Tab!!"
	
	println(Compare_val)

////Mock Drill
WebUI.callTestCase(findTestCase('Common Test Cases/Navigation/Site Tab-EHS-Safety/EHS_Safety_Mock Drill'), [:], FailureHandling.STOP_ON_FAILURE)
	//Q1
	//Previous Year Data
	sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-309_mashupcontainer-125_ptcschartbar-140").shadowRoot.querySelector("#chart").shadowRoot.querySelector("#bars > div:nth-child(2) > ptcs-div:nth-child(1) > div > div")'
	
	Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)
	
	println('ANK >> Q1 >> Previous Year Data')
	
	println(Total_Accidents.getText())
	
	text30SP = Total_Accidents.getText()
	Compare_val=(text30== text30SP) ? "Mock Drill -Q1 - Previous Year Data is Correct For both Function And EHS Tab " : "Mock Drill -Q1 - Previous Year Data is Wrong For both Function And EHS Tab!!"
	
	println(Compare_val)
	
	////Current Year Data
	sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-309_mashupcontainer-125_ptcschartbar-140").shadowRoot.querySelector("#chart").shadowRoot.querySelector("#bars > div:nth-child(2) > ptcs-div:nth-child(2) > div > div")'
	
	Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)
	
	println('ANK >>Q1>> Current Year Data')
	
	println(Total_Accidents.getText())
	
	text31SC = Total_Accidents.getText()
	Compare_val=(text31== text31SC) ? "Mock Drill -Q1 - Current Year Data is Correct For both Function And EHS Tab " : "Mock Drill -Q1 - Current Year Data is Wrong For both Function And EHS Tab!!"
	
	println(Compare_val)
	
	//Q2
	//Previous Year Data
	sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-309_mashupcontainer-125_ptcschartbar-140").shadowRoot.querySelector("#chart").shadowRoot.querySelector("#bars > div:nth-child(3) > ptcs-div:nth-child(1) > div > div")'
	
	Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)
	
	println('ANK >> Q2 >> Previous Year Data')
	
	println(Total_Accidents.getText())
	
	text32SP = Total_Accidents.getText()
	Compare_val=(text32== text32SP) ? "Mock Drill -Q2 - Previous Year Data is Correct For both Function And EHS Tab " : "Mock Drill -Q2 - Previous Year Data is Wrong For both Function And EHS Tab!!"
	
	println(Compare_val)
	
	////Current Year Data
	sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-309_mashupcontainer-125_ptcschartbar-140").shadowRoot.querySelector("#chart").shadowRoot.querySelector("#bars > div:nth-child(3) > ptcs-div:nth-child(2) > div > div")'
	
	Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)
	
	println('ANK >>Q2 >> Current Year Data')
	
	println(Total_Accidents.getText())
	
	text33SC = Total_Accidents.getText()
	Compare_val=(text33== text33SC) ? "Mock Drill -Q2 - Current Year Data is Correct For both Function And EHS Tab " : "Mock Drill -Q2 - Current Year Data is Wrong For both Function And EHS Tab!!"
	
	println(Compare_val)
	
	//Q3
	//Previous Year Data
	sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-309_mashupcontainer-125_ptcschartbar-140").shadowRoot.querySelector("#chart").shadowRoot.querySelector("#bars > div:nth-child(4) > ptcs-div:nth-child(1) > div > div")'
	
	Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)
	
	println('ANK >> Q3 >> Previous Year Data')
	
	println(Total_Accidents.getText())
	
	text34SP = Total_Accidents.getText()
	Compare_val=(text34== text34SP) ? "Mock Drill -Q3 - Previous Year Data is Correct For both Function And EHS Tab " : "Mock Drill -Q3 - Previous Year Data is Wrong For both Function And EHS Tab!!"
	
	println(Compare_val)
	
	////Current Year Data
	sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-309_mashupcontainer-125_ptcschartbar-140").shadowRoot.querySelector("#chart").shadowRoot.querySelector("#bars > div:nth-child(4) > ptcs-div:nth-child(2) > div > div")'
	
	Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)
	
	println('ANK >>Q3 >> Current Year Data')
	
	println(Total_Accidents.getText())
	
	text35SC = Total_Accidents.getText()
	Compare_val=(text35== text35SC) ? "Mock Drill -Q3 - current Year Data is Correct For both Function And EHS Tab " : "Mock Drill -Q3 - Current Year Data is Wrong For both Function And EHS Tab!!"
	
	println(Compare_val)
	
	//Q4
	//Previous Year Data
	sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-309_mashupcontainer-125_ptcschartbar-140").shadowRoot.querySelector("#chart").shadowRoot.querySelector("#bars > div:nth-child(5) > ptcs-div:nth-child(1) > div > div")'
	
	Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)
	
	println('ANK >> Q4 >> Previous Year Data')
	
	println(Total_Accidents.getText())
	
	text36SP = Total_Accidents.getText()
	Compare_val=(text36== text36SP) ? "Mock Drill -Q4 - Previous Year Data is Correct For both Function And EHS Tab " : "Mock Drill -Q4 - Previous Year Data is Wrong For both Function And EHS Tab!!"
	
	println(Compare_val)
	
	////Current Year Data
	sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-309_mashupcontainer-125_ptcschartbar-140").shadowRoot.querySelector("#chart").shadowRoot.querySelector("#bars > div:nth-child(5) > ptcs-div:nth-child(2) > div > div")'
	
	Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)
	
	println('ANK >>Q4 >> Current Year Data')
	
	println(Total_Accidents.getText())
	
	text37SC = Total_Accidents.getText()
	Compare_val=(text37== text37SC) ? "Mock Drill -Q4 - Current Year Data is Correct For both Function And EHS Tab " : "Mock Drill -Q4 -Current Year Data is Wrong For both Function And EHS Tab!!"
	
	println(Compare_val)

//EHS Improvement Projects
WebUI.callTestCase(findTestCase('Common Test Cases/Navigation/Site Tab-EHS-Safety/EHS_Safety_EHS Improvement Projects'), [:], FailureHandling.STOP_ON_FAILURE)
	//Previous Year Data
	sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-309_mashupcontainer-126_ptcschartbar-140").shadowRoot.querySelector("#chart").shadowRoot.querySelector("#bars > div.group-bar > ptcs-div:nth-child(1) > div > div")'
	
	Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)
	
	println('ANK >> Previous Year Data')
	
	println(Total_Accidents.getText())
	
	text40SP = Total_Accidents.getText()
	Compare_val=(text40== text40SP) ? "EHS Improvement Projects Previous Year Data is Correct For both Function And EHS Tab " : "EHS Improvement Projects Previous Year Data is Wrong For both Function And EHS Tab!!"
	
	println(Compare_val)
	
	////Current Year Data
	sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-309_mashupcontainer-126_ptcschartbar-140").shadowRoot.querySelector("#chart").shadowRoot.querySelector("#bars > div.group-bar > ptcs-div:nth-child(2) > div > div")'
	
	Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)
	
	println('ANK >> Current Year Data')
	
	println(Total_Accidents.getText())
	
	text41SC = Total_Accidents.getText()
	
	Compare_val=(text41== text41SC) ? "EHS Improvement Projects- Current Year Data is Correct For both Function And EHS Tab " : "EHS Improvement Projects- Current Year Data is Wrong For both Function And EHS Tab!!"
	
	println(Compare_val)


			
WebUI.closeBrowser()
			

