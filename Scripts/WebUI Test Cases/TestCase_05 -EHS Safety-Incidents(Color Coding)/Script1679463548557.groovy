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

 // Incidents
 sdom_js6 = 'document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-308_ptcstabset-103").shadowRoot.querySelector("#tabs-header > ptcs-tab:nth-child(3) > ptcs-label").shadowRoot.querySelector("#label").click()'
 
 Near_miss = WebUI.executeJavaScript(sdom_js6, null)
 
 Thread.sleep(7000)
 
 
 
 
 
 WebElement Total_Accidents
 
 String sdom_js4
 //String Site
 
 
 //EHS >> Incidents--------------------------------------------------------------------------------------------------------
  //ANK Data
 
 //Site == ANK
 //Previous Year Data
 sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-308_mashupcontainer-118_ptcschartbar-140").shadowRoot.querySelector("#chart").shadowRoot.querySelector("#bars > div:nth-child(2) > ptcs-div:nth-child(1)")'
 
 Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)
 
 println('ANK >> Previous Year Data')
 
 println(Total_Accidents.getText())
 text1=Total_Accidents.getText()
 
 //typecasting
 int ANK_PY=Integer.parseInt(text1);
 
 
 ////Current Year Data
 sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-308_mashupcontainer-118_ptcschartbar-140").shadowRoot.querySelector("#chart").shadowRoot.querySelector("#bars > div:nth-child(2) > ptcs-div:nth-child(2)")'
 
 Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)
 
 println('ANK >> Current Year Data')
 
 println(Total_Accidents.getText())
 text2=Total_Accidents.getText()
 //type casting
 
 int ANK_CY=Integer.parseInt(text2);
 
 
 if(ANK_PY==0 && ANK_CY==0)
 {
	 println("ANK is not applicable for Incidents")
 } 
 else
 {
	 float Color_coding=((ANK_CY - ANK_PY)/ANK_PY)*100
	 println(Color_coding)
	
		 if(Color_coding < -20)
			 println("Green")
		else if(ANK_CY > ANK_PY)
			println("Red")
		else
			println("Amber")
 }		
 
 //Site == AUR
		
		//Previous Year Data
		sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-308_mashupcontainer-118_ptcschartbar-140").shadowRoot.querySelector("#chart").shadowRoot.querySelector("#bars > div:nth-child(3) > ptcs-div:nth-child(1) > div > div")'
		
		Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)
		
		println('AUR>> Previous Year Data')
		
		println(Total_Accidents.getText())
		text1=Total_Accidents.getText()
		
		//typecasting
		int AUR_PY=Integer.parseInt(text1);
		
		
		////Current Year Data
		sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-308_mashupcontainer-118_ptcschartbar-140").shadowRoot.querySelector("#chart").shadowRoot.querySelector("#bars > div:nth-child(3) > ptcs-div:nth-child(2) > div > div")'
		
		Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)
		
		println('AUR >> Current Year Data')
		
		println(Total_Accidents.getText())
		text2=Total_Accidents.getText()
		//type casting
		
		int AUR_CY=Integer.parseInt(text2);
		
		
		if(AUR_PY== 0 && AUR_CY == 0)
		{
			println("AUR Site is not applicable for Incidents")
		}
		else
		{
			float Color_coding_AUR=((AUR_CY - AUR_PY)/AUR_PY)*100
			println(Color_coding_AUR)
		   
				if(Color_coding_AUR < -20)
					println("Green")
			   else if(AUR_CY > AUR_PY)
				   println("Red")
			   else
				   println("Amber")
		}	   

					 
// SITE == BIO
					 
		 //Previous Year Data
		 sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-308_mashupcontainer-118_ptcschartbar-140").shadowRoot.querySelector("#chart").shadowRoot.querySelector("#bars > div:nth-child(4) > ptcs-div:nth-child(1) > div > div")'
		 
		 Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)
		 
		 println('BIO >> Previous Year Data')
		 
		 println(Total_Accidents.getText())
		 text1=Total_Accidents.getText()
		 
		 //typecasting
		 int BIO_PY=Integer.parseInt(text1);
		 
		 
		 ////Current Year Data
		 sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-308_mashupcontainer-118_ptcschartbar-140").shadowRoot.querySelector("#chart").shadowRoot.querySelector("#bars > div:nth-child(4) > ptcs-div:nth-child(2) > div > div")'
		 
		 Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)
		 
		 println('BIO >> Current Year Data')
		 
		 println(Total_Accidents.getText())
		 text2=Total_Accidents.getText()
		 //type casting
		 
		 int BIO_CY=Integer.parseInt(text2);
		 
		 
		 if(BIO_PY==0 && BIO_CY==0)
		 {
			 println("BIO Site is not applicable for Incident")
		 }
		 else
		 {
			 float Color_coding_BIO=((BIO_CY - BIO_PY)/BIO_PY)*100
			 println(Color_coding_BIO)
			
				 if(Color_coding_BIO < -20)
					 println("Green")
				else if(BIO_CY > BIO_PY)
					println("Red")
				else
					println("Amber")
		 }
				
		 		
//SITE == DBH
	
		//Previous Year Data
		sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-308_mashupcontainer-118_ptcschartbar-140").shadowRoot.querySelector("#chart").shadowRoot.querySelector("#bars > div:nth-child(5) > ptcs-div:nth-child(1)")'
		
		Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)
		
		println('DBH >> Previous Year Data')
		
		println(Total_Accidents.getText())
		text1=Total_Accidents.getText()
		
		//typecasting
		int DBH_PY=Integer.parseInt(text1);
		
		
		////Current Year Data
		sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-308_mashupcontainer-118_ptcschartbar-140").shadowRoot.querySelector("#chart").shadowRoot.querySelector("#bars > div:nth-child(5) > ptcs-div:nth-child(2)")'
		
		Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)
		
		println('DBH >> Current Year Data')
		
		println(Total_Accidents.getText())
		text2=Total_Accidents.getText()
		//type casting
		
		int DBH_CY=Integer.parseInt(text2);
		
		
		 if(DBH_PY==0 && DBH_CY==0)
		 {
			 println("DBH is not applicable for Incidents")
		 }
		 else
		 {
			float Color_coding_DBH=((DBH_CY - DBH_PY)/DBH_PY)*100
			println(Color_coding_DBH)
		   
				if(Color_coding_DBH < -20)
					println("Green")
			   else if(DBH_CY > DBH_PY)
				   println("Red")
			   else
				   println("Amber")
		 }

 
// Site == GOA
			   
	   //Previous Year Data
	   sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-308_mashupcontainer-118_ptcschartbar-140").shadowRoot.querySelector("#chart").shadowRoot.querySelector("#bars > div:nth-child(6) > ptcs-div:nth-child(1) > div > div")'
	   
	   Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)
	   
	   println('GOA >> Previous Year Data')
	   
	   println(Total_Accidents.getText())
	   text1=Total_Accidents.getText()
	   
	   //typecasting
	   int GOA_PY=Integer.parseInt(text1);
	   
	   
	   ////Current Year Data
	   sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-308_mashupcontainer-118_ptcschartbar-140").shadowRoot.querySelector("#chart").shadowRoot.querySelector("#bars > div:nth-child(6) > ptcs-div:nth-child(2) > div > div")'
	   
	   Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)
	   
	   println('GOA >> Current Year Data')
	   
	   println(Total_Accidents.getText())
	   text2=Total_Accidents.getText()
	   //type casting
	   
	   int GOA_CY=Integer.parseInt(text2);
	   
	   
	   if(GOA_PY==0 && GOA_CY==0)
	   {
		   println("GOA Site is not applicable for Incidents ")
	   }
	   else
	   {
		 
		  
			   
			   if(GOA_CY > GOA_PY)
				  println("Red")
			   else
			   {
				   float Color_coding_GOA=((GOA_CY - GOA_PY)/GOA_PY)*100
				   println(Color_coding_GOA)
				   
				   if(Color_coding_GOA < -20)
					   println("Green")
			       else
					   println("Amber")
			   }
			
	   }
			  
//Site == IDR
			  
	  //Previous Year Data
	  sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-308_mashupcontainer-118_ptcschartbar-140").shadowRoot.querySelector("#chart").shadowRoot.querySelector("#bars > div:nth-child(7) > ptcs-div:nth-child(1)")'
	  
	  Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)
	  
	  println('IDR >> Previous Year Data')
	  
	  println(Total_Accidents.getText())
	  text1=Total_Accidents.getText()
	  
	  //typecasting
	  int IDR_PY=Integer.parseInt(text1);
	  
	  
	  ////Current Year Data
	  sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-308_mashupcontainer-118_ptcschartbar-140").shadowRoot.querySelector("#chart").shadowRoot.querySelector("#bars > div:nth-child(7) > ptcs-div:nth-child(2) > div > div")'
	  
	  Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)
	  
	  println('IDR >> Current Year Data')
	  
	  println(Total_Accidents.getText())
	  text2=Total_Accidents.getText()
	  //type casting
	  
	  int IDR_CY=Integer.parseInt(text2);
	  
	  
	  if(IDR_PY==0 && IDR_CY==0)
	  {
		  println("IDR Site is not applicable for Incidents")
	  }
	  else
	  {
		  float Color_coding_IDR=((IDR_CY - IDR_PY)/IDR_PY)*100
		  println(Color_coding_IDR)
		 
			  if(Color_coding_IDR < -20)
				  println("Green")
			 else if(IDR_CY > IDR_PY)
				 println("Red")
			 else
				 println("Amber")
	  }
			  
// SITE == JMU
	
	 //Previous Year Data
	 sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-308_mashupcontainer-118_ptcschartbar-140").shadowRoot.querySelector("#chart").shadowRoot.querySelector("#bars > div:nth-child(8) > ptcs-div:nth-child(1) > div > div")'
	 
	 Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)
	 
	 println('JMU >> Previous Year Data')
	 
	 println(Total_Accidents.getText())
	 text1=Total_Accidents.getText()
	 
	 //typecasting
	 int JMU_PY=Integer.parseInt(text1);
	 
	 
	 ////Current Year Data
	 sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-308_mashupcontainer-118_ptcschartbar-140").shadowRoot.querySelector("#chart").shadowRoot.querySelector("#bars > div:nth-child(8) > ptcs-div:nth-child(2) > div > div")'
	 
	 Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)
	 
	 println('JMU >> Current Year Data')
	 
	 println(Total_Accidents.getText())
	 text2=Total_Accidents.getText()
	 //type casting
	 
	 int JMU_CY=Integer.parseInt(text2);
	 
	 
	  if(JMU_PY==0 && JMU_CY == 0)
	  {
		  println("JMU is not applicable for Incidents")
	  }
	  else
	  {
		 float Color_coding_JMU=((JMU_CY - JMU_PY)/JMU_PY)*100
		 println(Color_coding_JMU)
		
			 if(Color_coding_JMU < -20)
				 println("Green")
			else if(JMU_CY > JMU_PY)
				println("Red")
			else
				println("Amber")
	  }
// SITE == LRP
			 
	 //Previous Year Data
	 sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-308_mashupcontainer-118_ptcschartbar-140").shadowRoot.querySelector("#chart").shadowRoot.querySelector("#bars > div:nth-child(9) > ptcs-div:nth-child(1) > div > div")'
	 
	 Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)
	 
	 println('LRP >> Previous Year Data')
	 
	 println(Total_Accidents.getText())
	 text1=Total_Accidents.getText()
	 
	 //typecasting
	 int LRP_PY=Integer.parseInt(text1);
	 
	 
	 ////Current Year Data
	 sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-308_mashupcontainer-118_ptcschartbar-140").shadowRoot.querySelector("#chart").shadowRoot.querySelector("#bars > div:nth-child(9) > ptcs-div:nth-child(2) > div > div")'
	 
	 Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)
	 
	 println('LRP >> Current Year Data')
	 
	 println(Total_Accidents.getText())
	 text2=Total_Accidents.getText()
	 //type casting
	 
	 int LRP_CY=Integer.parseInt(text2);
	 
	 if(LRP_CY ==0 && LRP_PY ==0)
	 {
		 println("LRP Site is not applicable for Incidents")
	 }
	 
	 
	  else
	  {
		 float Color_coding_LRP=((LRP_CY - LRP_PY)/LRP_PY)*100
		 println(Color_coding_LRP)
		
			 if(Color_coding_LRP < -20)
				 println("Green")
			else if(LRP_CY > LRP_PY)
				println("Red")
			else
				println("Amber")
	  }		
			
//Site == MDP
			
			
	//Previous Year Data
	sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-308_mashupcontainer-118_ptcschartbar-140").shadowRoot.querySelector("#chart").shadowRoot.querySelector("#bars > div:nth-child(10) > ptcs-div:nth-child(1) > div > div")'
	
	Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)
	
	println('MDP >> Previous Year Data')
	
	println(Total_Accidents.getText())
	text1=Total_Accidents.getText()
	
	//typecasting
	int MDP_PY=Integer.parseInt(text1);
	
	
	////Current Year Data
	sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-308_mashupcontainer-118_ptcschartbar-140").shadowRoot.querySelector("#chart").shadowRoot.querySelector("#bars > div:nth-child(10) > ptcs-div:nth-child(2) > div > div")'
	
	Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)
	
	println('MDP >> Current Year Data')
	
	println(Total_Accidents.getText())
	text2=Total_Accidents.getText()
	//type casting
	
	int MDP_CY=Integer.parseInt(text2);
	
	if(MDP_CY==0 && MDP_PY ==0)
	{
		println("MDP Site is not applicable for Incidents")
	}
	
	else
	{
	 
		float Color_coding_MDP=((MDP_CY - MDP_PY)/MDP_PY)*100
		println(Color_coding_MDP)
	   
			if(Color_coding_MDP < -20)
				println("Green")
		   else if(MDP_CY > MDP_PY)
			   println("Red")
		   else
			   println("Amber")
	}
				   
//Site == NGP
				   
				   
   //Previous Year Data
   sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-308_mashupcontainer-118_ptcschartbar-140").shadowRoot.querySelector("#chart").shadowRoot.querySelector("#bars > div:nth-child(11) > ptcs-div:nth-child(1) > div > div")'
   
   Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)
   
   println('NGP >> Previous Year Data')
   
   println(Total_Accidents.getText())
   text1=Total_Accidents.getText()
   
   //typecasting
   int NGP_PY=Integer.parseInt(text1);
   
   
   ////Current Year Data
   sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-308_mashupcontainer-118_ptcschartbar-140").shadowRoot.querySelector("#chart").shadowRoot.querySelector("#bars > div:nth-child(11) > ptcs-div:nth-child(2) > div > div")'
   
   Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)
   
   println('NGP >> Current Year Data')
   
   println(Total_Accidents.getText())
   text2=Total_Accidents.getText()
   //type casting
   
   int NGP_CY=Integer.parseInt(text2);
   
   
	if(NGP_PY==0 && NGP_CY ==0)
	{
		println("NGP Site is not applicable for Incidents")
	}
	else
	{
	   float Color_coding_NGP=((NGP_CY - NGP_PY)/NGP_PY)*100
	   println(Color_coding_NGP)
	  
		   if(Color_coding_NGP < -20)
			   println("Green")
		  else if(NGP_CY > NGP_PY)
			  println("Red")
		  else
			  println("Amber")
			  
	}
				  
			
// SITE == SKM
		  
	  //Previous Year Data
	  sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-308_mashupcontainer-118_ptcschartbar-140").shadowRoot.querySelector("#chart").shadowRoot.querySelector("#bars > div:nth-child(12) > ptcs-div:nth-child(1) > div > div")'
	  
	  Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)
	  
	  println('SKM >> Previous Year Data')
	  
	  println(Total_Accidents.getText())
	  text1=Total_Accidents.getText()
	  
	  //typecasting
	  int SKM_PY=Integer.parseInt(text1);
	  
	  
	  ////Current Year Data
	  sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-308_mashupcontainer-118_ptcschartbar-140").shadowRoot.querySelector("#chart").shadowRoot.querySelector("#bars > div:nth-child(12) > ptcs-div:nth-child(2) > div > div")'
	  
	  Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)
	  
	  println('SKM >> Current Year Data')
	  
	  println(Total_Accidents.getText())
	  text2=Total_Accidents.getText()
	  //type casting
	  
	  int SKM_CY=Integer.parseInt(text2);
	  
	  
	   if(SKM_CY==0 && SKM_PY==0)
	   {
		   println("SKM Site is not applicable for Incidents")
	   }
	   else
	   {
		  float Color_coding_SKM=((SKM_CY - SKM_PY)/SKM_PY)*100
		  println(Color_coding_SKM)
		 
			  if(Color_coding_SKM< -20)
				  println("Green")
			 else if(SKM_CY > SKM_PY)
				 println("Red")
			 else
				 println("Amber")
	   }	  
// SITE == TRP
			 
	 //Previous Year Data
	 sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-308_mashupcontainer-118_ptcschartbar-140").shadowRoot.querySelector("#chart").shadowRoot.querySelector("#bars > div:nth-child(13) > ptcs-div:nth-child(1) > div > div")'
	 
	 Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)
	 
	 println('TRP >> Previous Year Data')
	 
	 println(Total_Accidents.getText())
	 text1=Total_Accidents.getText()
	 
	 //typecasting
	 int TRP_PY=Integer.parseInt(text1);
	 
	 
	 ////Current Year Data
	 sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-308_mashupcontainer-118_ptcschartbar-140").shadowRoot.querySelector("#chart").shadowRoot.querySelector("#bars > div:nth-child(13) > ptcs-div:nth-child(2) > div > div")'
	 
	 Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)
	 
	 println('TRP >> Current Year Data')
	 
	 println(Total_Accidents.getText())
	 text2=Total_Accidents.getText()
	 //type casting
	 
	 int TRP_CY=Integer.parseInt(text2);
	 
	 
	  if(TRP_CY==0 && TRP_PY==0)
	  {
		  println("TRP Site is not applicable for Incidents")
	  }
	  else
	  {
		 float Color_coding_TRP=((TRP_CY - TRP_PY)/TRP_PY)*100
		 println(Color_coding_TRP)
		
			 if(Color_coding_TRP< -20)
				 println("Green")
			else if(TRP_CY > TRP_PY)
				println("Red")
			else
				println("Amber")
				
	  }
							 
// SITE == VZG
			
	//Previous Year Data
	sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-308_mashupcontainer-118_ptcschartbar-140").shadowRoot.querySelector("#chart").shadowRoot.querySelector("#bars > div:nth-child(14) > ptcs-div:nth-child(1) > div > div")'
	
	Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)
	
	println('VZG >> Previous Year Data')
	
	println(Total_Accidents.getText())
	text1=Total_Accidents.getText()
	
	//typecasting
	int VZG_PY=Integer.parseInt(text1);
	
	
	////Current Year Data
	sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-308_mashupcontainer-118_ptcschartbar-140").shadowRoot.querySelector("#chart").shadowRoot.querySelector("#bars > div:nth-child(14) > ptcs-div:nth-child(2) > div > div")'
	
	Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)
	
	println('VZG >> Current Year Data')
	
	println(Total_Accidents.getText())
	text2=Total_Accidents.getText()
	//type casting
	
	int VZG_CY=Integer.parseInt(text2);
	
	if(VZG_CY==0 && VZG_PY==0)
	{
		println("VZG Site is not applicable for Incidents")
	}
	else
	{
		float Color_coding_VZG=((VZG_CY - VZG_PY)/VZG_PY)*100
		println(Color_coding_VZG)
	   
			if(Color_coding_VZG< -20)
				println("Green")
		   else if(VZG_CY > VZG_PY)
			   println("Red")
		   else
			   println("Amber")
	}	   
		
 
 
 
