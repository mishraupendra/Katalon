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

WebElement Total_Accidents

String sdom_js4

// //Total Accidents
// // Var vs PY for Total Accidents
sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-3_ptcsgrid-245").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(1) > ptcs-label").shadowRoot.querySelector("#label")'

Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)

println('Total Accidents >> Var vs PY(%)')
println(Total_Accidents.getText())
text1=Total_Accidents.getText()

//
//// YTD 2021-22 for Total Accidents
sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-3_ptcsgrid-245").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(2) > ptcs-label").shadowRoot.querySelector("#label")'

Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)

println('Total Accidents >> YTD 2021-22')

println(Total_Accidents.getText())
text3=Total_Accidents.getText()

////YD 2022-23 for Total Accidents
sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-3_ptcsgrid-245").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(3) > ptcs-label").shadowRoot.querySelector("#label")'

Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)

println('Total Accidents >> YTD 2022-23')

println(Total_Accidents.getText())
text5=Total_Accidents.getText()

//Total Incidents
WebElement Total_Incidents

String sdom_js5

//Var vs PY for Total Incidents  
sdom_js5 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-3_ptcsgrid-247").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(1) > ptcs-label").shadowRoot.querySelector("#label")'

Total_Incidents = WebUI.executeJavaScript(sdom_js5, null)

println('Total Incidents >>  Var vs PY(%)')

println(Total_Incidents.getText())
text7=Total_Incidents.getText()

// YTD 2021-22 for Total Incidents
sdom_js5 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-3_ptcsgrid-247").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(2) > ptcs-label").shadowRoot.querySelector("#label")'

Total_Incidents = WebUI.executeJavaScript(sdom_js5, null)

println('Total Incidents >> YTD 2021-22')

println(Total_Incidents.getText())
text9=Total_Incidents.getText()

// YTD 2021-23 for Total Incidents
sdom_js5 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-3_ptcsgrid-247").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(3) > ptcs-label").shadowRoot.querySelector("#label")'

Total_Incidents = WebUI.executeJavaScript(sdom_js5, null)

println('Total Incidents >> YTD 2022-23')

println(Total_Incidents.getText())
text11=Total_Incidents.getText()

// Near Miss
WebElement Near_miss

String sdom_js6

//Var vs PY for Near Miss
sdom_js6 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-3_ptcsgrid-248").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(1) > ptcs-label").shadowRoot.querySelector("#label")'

Near_miss = WebUI.executeJavaScript(sdom_js6, null)

println('Near Miss >>  Var vs PY(%)')

println(Near_miss.getText())
text13=Near_miss.getText()

//YTD 2021-22 for Near Miss
sdom_js6 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-3_ptcsgrid-248").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(2) > ptcs-label").shadowRoot.querySelector("#label")'

Near_miss = WebUI.executeJavaScript(sdom_js6, null)

println('Near Miss >> YTD 2021-22')

println(Near_miss.getText())
text15=Near_miss.getText()

//YTD 2022-23 for Near Miss
sdom_js6 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-3_ptcsgrid-248").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(3) > ptcs-label").shadowRoot.querySelector("#label")'

Near_miss = WebUI.executeJavaScript(sdom_js6, null)

println('Near Miss >> YTD 2022-23')

println(Near_miss.getText())
text17=Near_miss.getText()

//Training Hours Var vs PY
sdom_js6 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-3_ptcsgrid-249").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(1) > ptcs-label").shadowRoot.querySelector("#label")'

Near_miss = WebUI.executeJavaScript(sdom_js6, null)

println('Training Hours >>  Var vs PY(%)')

println(Near_miss.getText())
text19=Near_miss.getText()

//Training Hours YTD 2021-22
sdom_js6 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-3_ptcsgrid-249").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(2) > ptcs-label").shadowRoot.querySelector("#label")'

Near_miss = WebUI.executeJavaScript(sdom_js6, null)

println('Training Hours >> YTD 2021-22')

println(Near_miss.getText())
text21=Near_miss.getText()

//Training Hours YTD 2022-23
sdom_js6 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-3_ptcsgrid-249").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(3) > ptcs-label").shadowRoot.querySelector("#label")'

Near_miss = WebUI.executeJavaScript(sdom_js6, null)

println('Training Hours >> YTD 2022-23')

println(Near_miss.getText())
text23=Near_miss.getText()

// Training on Potent-Toxic Compounds Var VS PY
sdom_js6 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-3_ptcsgrid-254").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(1) > ptcs-label").shadowRoot.querySelector("#label")'

Near_miss = WebUI.executeJavaScript(sdom_js6, null)

println('Training on Potent-Toxic Compounds >>  Var vs PY(%)')

println(Near_miss.getText())
text25=Near_miss.getText()

//Training on Potent-Toxic Compounds YTD 2021-22
sdom_js6 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-3_ptcsgrid-254").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(2)")'

Near_miss = WebUI.executeJavaScript(sdom_js6, null)

println('Training on Potent-Toxic Compounds >> YTD 2021-22')

println(Near_miss.getText())
text27=Near_miss.getText()

//Training on Potent-Toxic Compounds YTD 2022-23
sdom_js6 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-3_ptcsgrid-254").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(3) > ptcs-label").shadowRoot.querySelector("#label")'

Near_miss = WebUI.executeJavaScript(sdom_js6, null)

println('Training on Potent-Toxic Compounds >> YTD 2022-23')

println(Near_miss.getText())
text29=Near_miss.getText()

//Counselling Sessions Var vs PY
sdom_js6 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-3_ptcsgrid-255").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(1) > ptcs-label").shadowRoot.querySelector("#label")'

Near_miss = WebUI.executeJavaScript(sdom_js6, null)

println('Counselling Sessions >>  Var vs PY(%)')

println(Near_miss.getText())
text31=Near_miss.getText()

//Counselling Sessions YTD 2021-22
sdom_js6 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-3_ptcsgrid-255").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(2)")'

Near_miss = WebUI.executeJavaScript(sdom_js6, null)

println('Counselling Sessions >> YTD 2021-22')

println(Near_miss.getText())
text33=Near_miss.getText()

//Counselling Sessions YTD 2022-23
sdom_js6 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-3_ptcsgrid-255").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(3) > ptcs-label").shadowRoot.querySelector("#label")'

Near_miss = WebUI.executeJavaScript(sdom_js6, null)

println('Counselling Sessions >> YTD 2022-23')

println(Near_miss.getText())
text35=Near_miss.getText()

//ETP Total Effluent Var vs PY
sdom_js6 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-3_ptcsgrid-274").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(1) > ptcs-label").shadowRoot.querySelector("#label")'

Near_miss = WebUI.executeJavaScript(sdom_js6, null)

println('ETP Total Effluent >>  Var vs PY(%)')

println(Near_miss.getText())
text37=Near_miss.getText()

//ETP Total Effluent YTD 2021-22
sdom_js6 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-3_ptcsgrid-274").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(2) > ptcs-label").shadowRoot.querySelector("#label")'

Near_miss = WebUI.executeJavaScript(sdom_js6, null)

println('ETP Total Effluent >> YTD 2021-22')

println(Near_miss.getText())
text39=Near_miss.getText()

//ETP Total Effluent YTD 2022-23
sdom_js6 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-3_ptcsgrid-274").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(3) > ptcs-label").shadowRoot.querySelector("#label")'

Near_miss = WebUI.executeJavaScript(sdom_js6, null)

println('ETP Total Effluent >> YTD 2022-23')

println(Near_miss.getText())
text41=Near_miss.getText()

//ETP Total Cost Var vs PY
sdom_js6 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-3_ptcsgrid-275").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(1) > ptcs-label").shadowRoot.querySelector("#label")'

Near_miss = WebUI.executeJavaScript(sdom_js6, null)

println('ETP Total Cost >>  Var vs PY(%)')

println(Near_miss.getText())
text43=Near_miss.getText()

//ETP Total Cost YTD 2021-22
sdom_js6 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-3_ptcsgrid-275").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(2) > ptcs-label").shadowRoot.querySelector("#label")'

Near_miss = WebUI.executeJavaScript(sdom_js6, null)

println('ETP Total Cost >> YTD 2021-22')

println(Near_miss.getText())
text45=Near_miss.getText()

//ETP Total Cost YTD 2022-23
sdom_js6 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-3_ptcsgrid-275").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(3) > ptcs-label").shadowRoot.querySelector("#label")'

Near_miss = WebUI.executeJavaScript(sdom_js6, null)

println('ETP Total Cost >> YTD 2022-23')

println(Near_miss.getText())
text47=Near_miss.getText()

//ETP Total Power Cost Var vs PY
sdom_js6 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-3_ptcsgrid-276").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(1) > ptcs-label").shadowRoot.querySelector("#label")'

Near_miss = WebUI.executeJavaScript(sdom_js6, null)

println('ETP Total Power >>  Var vs PY(%)')

println(Near_miss.getText())
text49=Near_miss.getText()

//ETP Total Power Cost YTD 2021-22
sdom_js6 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-3_ptcsgrid-276").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(2) > ptcs-label").shadowRoot.querySelector("#label")'

Near_miss = WebUI.executeJavaScript(sdom_js6, null)

println('ETP Total Power >> YTD 2021-22')

println(Near_miss.getText())
text51=Near_miss.getText()

//ETP Total Power Cost YTD 2022-23
sdom_js6 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-3_ptcsgrid-276").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(3) > ptcs-label").shadowRoot.querySelector("#label")'

Near_miss = WebUI.executeJavaScript(sdom_js6, null)

println('ETP Total Power >> YTD 2022-23')

println(Near_miss.getText())
text53=Near_miss.getText()

// ZLD Total Cost Var vs PY
sdom_js6 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-3_ptcsgrid-277").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(1) > ptcs-label").shadowRoot.querySelector("#label")'

Near_miss = WebUI.executeJavaScript(sdom_js6, null)

println('ZLD Total Cost >>  Var vs PY(%)')

println(Near_miss.getText())
text55=Near_miss.getText()

//ZLD Total Cost YTD 2021-22
sdom_js6 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-3_ptcsgrid-277").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(2) > ptcs-label").shadowRoot.querySelector("#label")'

Near_miss = WebUI.executeJavaScript(sdom_js6, null)

println('ZLD Total Cost >> YTD 2021-22')

println(Near_miss.getText())
text57=Near_miss.getText()

//ZLD Total Cost YTD 2022-23
sdom_js6 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-3_ptcsgrid-277").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(3) > ptcs-label").shadowRoot.querySelector("#label")'

Near_miss = WebUI.executeJavaScript(sdom_js6, null)

println('ZLD Total Cost >> YTD 2022-23')

println(Near_miss.getText())
text59=Near_miss.getText()


//Function Tab ------------------------------------------------------------------------------------------------------------------

sdom_js6 = 'document.querySelector("#root_ptcsmenubar-64").shadowRoot.querySelector("#flyout").shadowRoot.querySelector("#primaryitems > ptcs-menu-item:nth-child(2)").shadowRoot.querySelector("ptcs-icon:nth-child(2)").shadowRoot.querySelector("div > img").click()'

Near_miss = WebUI.executeJavaScript(sdom_js6, null)

Thread.sleep(7000)

//WebUI.mouseOver(findTestObject('MouseOverTest/Page_Lupin DPM/ptcs-menu-submenu'))
//WebUI.mouseOverOffset(findTestObject('MouseOverTest/Page_Lupin DPM/ptcs-menu-submenu'),10,-100)
WebUI.clickOffset(findTestObject('MouseOverTest/Page_Lupin DPM/ptcs-menu-submenu'), 10,-100)

Thread.sleep(7000)

// //Total Accidents
// // Var vs PY for Total Accidents

sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-304_ptcsgrid-259").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(1) > ptcs-label").shadowRoot.querySelector("#label")'

Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)

println('Total Accidents >> Var vs PY(%)')

println(Total_Accidents.getText())
text2=Total_Accidents.getText()




//// YTD 2021-22 for Total Accidents
sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-304_ptcsgrid-259").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(2) > ptcs-label").shadowRoot.querySelector("#label")'

Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)

println('Total Accidents >> YTD 2021-22')

println(Total_Accidents.getText())
text4=Total_Accidents.getText()

////YD 2022-23 for Total Accidents
sdom_js4 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-304_ptcsgrid-259").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(3) > ptcs-label").shadowRoot.querySelector("#label")'

Total_Accidents = WebUI.executeJavaScript(sdom_js4, null)

println('Total Accidents >> YTD 2022-23')

println(Total_Accidents.getText())
text6=Total_Accidents.getText()

//Total Incidents

//Var vs PY for Total Incidents
sdom_js5 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-304_ptcsgrid-265").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(1) > ptcs-label").shadowRoot.querySelector("#label")'

Total_Incidents = WebUI.executeJavaScript(sdom_js5, null)

println('Total Incidents >>  Var vs PY(%)')

println(Total_Incidents.getText())
text8=Total_Incidents.getText()

// YTD 2021-22 for Total Incidents
sdom_js5 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-304_ptcsgrid-265").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(2) > ptcs-label").shadowRoot.querySelector("#label")'

Total_Incidents = WebUI.executeJavaScript(sdom_js5, null)

println('Total Incidents >> YTD 2021-22')

println(Total_Incidents.getText())
text10=Total_Incidents.getText()

// YTD 2022-23 for Total Incidents
sdom_js5 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-304_ptcsgrid-265").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(3) > ptcs-label").shadowRoot.querySelector("#label")'

Total_Incidents = WebUI.executeJavaScript(sdom_js5, null)

println('Total Incidents >> YTD 2022-23')

println(Total_Incidents.getText())
text12=Total_Incidents.getText()

// Near Miss
//Var vs PY for Near Miss
sdom_js6 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-304_ptcsgrid-271").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(1) > ptcs-label").shadowRoot.querySelector("#label")'

Near_miss = WebUI.executeJavaScript(sdom_js6, null)

println('Near Miss >>  Var vs PY(%)')

println(Near_miss.getText())
text14=Near_miss.getText()

//YTD 2021-22 for Near Miss
sdom_js6 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-304_ptcsgrid-271").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(2) > ptcs-label").shadowRoot.querySelector("#label")'

Near_miss = WebUI.executeJavaScript(sdom_js6, null)

println('Near Miss >> YTD 2021-22')

println(Near_miss.getText())
text16=Near_miss.getText()

//YTD 2022-23 for Near Miss
sdom_js6 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-304_ptcsgrid-271").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(3) > ptcs-label").shadowRoot.querySelector("#label")'

Near_miss = WebUI.executeJavaScript(sdom_js6, null)

println('Near Miss >> YTD 2022-23')

println(Near_miss.getText())
text18=Near_miss.getText()

//Training Hours Var vs PY
sdom_js6 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-304_ptcsgrid-277").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(1) > ptcs-label").shadowRoot.querySelector("#label")'

Near_miss = WebUI.executeJavaScript(sdom_js6, null)

println('Training Hours >>  Var vs PY(%)')

println(Near_miss.getText())
text20=Near_miss.getText()
//Training Hours YTD 2021-22
sdom_js6 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-304_ptcsgrid-277").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(2) > ptcs-label").shadowRoot.querySelector("#label")'

Near_miss = WebUI.executeJavaScript(sdom_js6, null)

println('Training Hours >> YTD 2021-22')

println(Near_miss.getText())
text22=Near_miss.getText()

//Training Hours YTD 2022-23
sdom_js6 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-304_ptcsgrid-277").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(3) > ptcs-label").shadowRoot.querySelector("#label")'

Near_miss = WebUI.executeJavaScript(sdom_js6, null)

println('Training Hours >> YTD 2022-23')

println(Near_miss.getText())
text24=Near_miss.getText()

// Training on Potent-Toxic Compounds Var VS PY
sdom_js6 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-304_ptcsgrid-303").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(1) > ptcs-label").shadowRoot.querySelector("#label")'

Near_miss = WebUI.executeJavaScript(sdom_js6, null)

println('Training on Potent-Toxic Compounds >>  Var vs PY(%)')

println(Near_miss.getText())
text26=Near_miss.getText()

//Training on Potent-Toxic Compounds YTD 2021-22
sdom_js6 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-304_ptcsgrid-303").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(2)")'

Near_miss = WebUI.executeJavaScript(sdom_js6, null)

println('Training on Potent-Toxic Compounds >> YTD 2021-22')

println(Near_miss.getText())
text28=Near_miss.getText()

//Training on Potent-Toxic Compounds YTD 2022-23
sdom_js6 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-304_ptcsgrid-303").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(3) > ptcs-label").shadowRoot.querySelector("#label")'

Near_miss = WebUI.executeJavaScript(sdom_js6, null)

println('Training on Potent-Toxic Compounds >> YTD 2022-23')

println(Near_miss.getText())
text30=Near_miss.getText()

//Counselling Sessions Var vs PY
sdom_js6 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-304_ptcsgrid-292").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(1) > ptcs-label").shadowRoot.querySelector("#label")'

Near_miss = WebUI.executeJavaScript(sdom_js6, null)

println('Counselling Sessions >>  Var vs PY(%)')

println(Near_miss.getText())
text32=Near_miss.getText()

//Counselling Sessions YTD 2021-22
sdom_js6 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-304_ptcsgrid-292").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(2)")'

Near_miss = WebUI.executeJavaScript(sdom_js6, null)

println('Counselling Sessions >> YTD 2021-22')

println(Near_miss.getText())
text34=Near_miss.getText()

//Counselling Sessions YTD 2022-23
sdom_js6 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-304_ptcsgrid-292").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(3) > ptcs-label").shadowRoot.querySelector("#label")'

Near_miss = WebUI.executeJavaScript(sdom_js6, null)

println('Counselling Sessions >> YTD 2022-23')

println(Near_miss.getText())
text36=Near_miss.getText()

//ETP Total Effluent Var vs PY
sdom_js6 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-304_ptcsgrid-311").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(1) > ptcs-label").shadowRoot.querySelector("#label")'

Near_miss = WebUI.executeJavaScript(sdom_js6, null)

println('ETP Total Effluent >>  Var vs PY(%)')

println(Near_miss.getText())
text38=Near_miss.getText()

//ETP Total Effluent YTD 2021-22
sdom_js6 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-304_ptcsgrid-311").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(2) > ptcs-label").shadowRoot.querySelector("#label")'

Near_miss = WebUI.executeJavaScript(sdom_js6, null)

println('ETP Total Effluent >> YTD 2021-22')

println(Near_miss.getText())
text40=Near_miss.getText()

//ETP Total Effluent YTD 2022-23
sdom_js6 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-304_ptcsgrid-311").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(3) > ptcs-label").shadowRoot.querySelector("#label")'

Near_miss = WebUI.executeJavaScript(sdom_js6, null)

println('ETP Total Effluent >> YTD 2022-23')

println(Near_miss.getText())
text42=Near_miss.getText()

//ETP Total Cost Var vs PY
sdom_js6 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-304_ptcsgrid-317").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(1) > ptcs-label").shadowRoot.querySelector("#label")'

Near_miss = WebUI.executeJavaScript(sdom_js6, null)

println('ETP Total Cost >>  Var vs PY(%)')

println(Near_miss.getText())
text44=Near_miss.getText()
//ETP Total Cost YTD 2021-22
sdom_js6 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-304_ptcsgrid-317").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(2) > ptcs-label").shadowRoot.querySelector("#label")'

Near_miss = WebUI.executeJavaScript(sdom_js6, null)

println('ETP Total Cost >> YTD 2021-22')

println(Near_miss.getText())
text46=Near_miss.getText()

//ETP Total Cost YTD 2022-23
sdom_js6 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-304_ptcsgrid-317").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(3) > ptcs-label").shadowRoot.querySelector("#label")'

Near_miss = WebUI.executeJavaScript(sdom_js6, null)

println('ETP Total Cost >> YTD 2022-23')

println(Near_miss.getText())
text48=Near_miss.getText()

//ETP Total Power  Var vs PY
sdom_js6 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-304_ptcsgrid-323").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(1) > ptcs-label").shadowRoot.querySelector("#label")'

Near_miss = WebUI.executeJavaScript(sdom_js6, null)

println('ETP Total Power >>  Var vs PY(%)')

println(Near_miss.getText())
text50=Near_miss.getText()
//ETP Total Power Cost YTD 2021-22
sdom_js6 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-304_ptcsgrid-323").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(2) > ptcs-label").shadowRoot.querySelector("#label")'

Near_miss = WebUI.executeJavaScript(sdom_js6, null)

println('ETP Total Power >> YTD 2021-22')

println(Near_miss.getText())
text52=Near_miss.getText()

//ETP Total Power Cost YTD 2022-23
sdom_js6 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-304_ptcsgrid-323").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(3) > ptcs-label").shadowRoot.querySelector("#label")'

Near_miss = WebUI.executeJavaScript(sdom_js6, null)

println('ETP Total Power >> YTD 2022-23')

println(Near_miss.getText())
text54=Near_miss.getText()

// ZLD Total Cost Var vs PY
sdom_js6 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-304_ptcsgrid-329").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(1) > ptcs-label").shadowRoot.querySelector("#label")'

Near_miss = WebUI.executeJavaScript(sdom_js6, null)

println('ZLD Total Cost >>  Var vs PY(%)')

println(Near_miss.getText())
text56=Near_miss.getText()

//ZLD Total Cost YTD 2021-22
sdom_js6 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-304_ptcsgrid-329").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(2) > ptcs-label").shadowRoot.querySelector("#label")'

Near_miss = WebUI.executeJavaScript(sdom_js6, null)

println('ZLD Total Cost >> YTD 2021-22')

println(Near_miss.getText())
text58=Near_miss.getText()

//ZLD Total Cost YTD 2022-23
sdom_js6 = 'return document.querySelector("#root_pagemashupcontainer-2_mashupcontainer-304_ptcsgrid-329").shadowRoot.querySelector("#grid").shadowRoot.querySelector("#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(3) > ptcs-label").shadowRoot.querySelector("#label")'

Near_miss = WebUI.executeJavaScript(sdom_js6, null)

println('ZLD Total Cost >> YTD 2022-23')

println(Near_miss.getText())
text60=Near_miss.getText()



//Compare the data ------------------------------------------------------------------------------------------------
println("YTD Total Accidents >> Var vs PY")
if (text1==text2) {
	println("For both Home and Functions >> EHS : Text is matching!!")
  }
  else
  {
	  println("For both Home and Functions >> EHS : Text is not matching!! !!")
  }
  
println("YTD Total Accidents >> YTD 2021-22")
  if (text3==text4) {
	  println("For both Home and Functions >> EHS : Text is matching!!")
	}
	else
	{
		println("For both Home and Functions >> EHS : Text is not matching!! !!")
	}
println("YTD Total Accidents >>YTD 2022-23")
	if (text5==text6) {
		println("For both Home and Functions >> EHS : Text is matching!!")
	  }
	  else
	  {
		  println("For both Home and Functions >> EHS : Text is not matching!! !!")
	  }

println("YTD Total Incidents >> VAR VS PY")
	  if (text7==text8) {
		  println("For both Home and Functions >> EHS : Text is matching!!")
		}
		else
		{
			println("For both Home and Functions >> EHS : Text is not matching!! !!")
		}

println("YTD Total Incidents >> YTD 2021-22")
		if (text9==text10) {
			println("For both Home and Functions >> EHS : Text is matching!!")
		  }
		  else
		  {
			  println("For both Home and Functions >> EHS : Text is not matching!! !!")
		  }
		  
		  
println("YTD Total Incidents >> YTD 2022-23")
		  if (text11==text12) {
			  println("For both Home and Functions >> EHS : Text is matching!!")
			}
			else
			{
				println("For both Home and Functions >> EHS : Text is not matching!! !!")
			}
			
println("YTD Near Misses >> Var VS PY")
			if (text13==text14) {
				println("For both Home and Functions >> EHS : Text is matching!!")
			  }
			  else
			  {
				  println("For both Home and Functions >> EHS : Text is not matching!! !!")
			  }
			  
println("YTD Near Misses >> YTD 2021-22")
			  if (text15==text16) {
				  println("For both Home and Functions >> EHS : Text is matching!!")
				}
				else
				{
					println("For both Home and Functions >> EHS : Text is not matching!! !!")
				}
println("YTD Near Misses >> YTD 2022-23")
			   if (text17==text18) {
					println("For both Home and Functions >> EHS : Text is matching!!")
				  }
				  else
				  {
					  println("For both Home and Functions >> EHS : Text is not matching!! !!")
				  }
				  
//Training Hours 
println("YTD Training Hours  >> Var vs PY")
				  if (text19==text20) {
					   println("For both Home and Functions >> EHS : Text is matching!!")
					 }
				  else
					 {
						 println("For both Home and Functions >> EHS : Text is not matching!! !!")
					 }
println("YTD Training Hours  >> YTD 2021-22")
					 if (text21==text22) {
						  println("For both Home and Functions >> EHS : Text is matching!!")
						}
					 else
						{
							println("For both Home and Functions >> EHS : Text is not matching!! !!")
						}
println("YTD Training Hours  >> YTD 2022-23")
						if (text23==text24) {
							 println("For both Home and Functions >> EHS : Text is matching!!")
						   }
						else
						   {
							   println("For both Home and Functions >> EHS : Text is not matching!! !!")
						   }
						   
// Training on Potent-Toxic Compounds 
						   
 println("YTD Training on Potent-Toxic Compounds  >> Var vs PY")
						   if (text25==text26) {
								println("For both Home and Functions >> EHS : Text is matching!!")
							  }
						   else
							  {
								  println("For both Home and Functions >> EHS : Text is not matching!! !!")
							  }
 println("YTD Training on Potent-Toxic Compounds  >> YTD 2021-22")
							  if (text27==text28) {
								   println("For both Home and Functions >> EHS : Text is matching!!")
								 }
							  else
								 {
									 println("For both Home and Functions >> EHS : Text is not matching!! !!")
								 }
 println("YTD Training on Potent-Toxic Compounds >> YTD 2022-23")
								 if (text29==text30) {
									  println("For both Home and Functions >> EHS : Text is matching!!")
									}
								 else
									{
										println("For both Home and Functions >> EHS : Text is not matching!! !!")
									}
//Counselling Sessions 
									
									
println("YTD Counselling Sessions   >> Var vs PY")
		if (text31==text32) {
			 println("For both Home and Functions >> EHS : Text is matching!!")
		   }
		else
		   {
			   println("For both Home and Functions >> EHS : Text is not matching!! !!")
		   }
		   
		   
  println("YTD Counselling Sessions   >> YTD 2021-22")
		   if (text33==text34) {
				println("For both Home and Functions >> EHS : Text is matching!!")
			  }
		   else
			  {
				  println("For both Home and Functions >> EHS : Text is not matching!! !!")
			  }
			  
			  
  println("YTD Counselling Sessions  >> YTD 2022-23")
		  if (text35==text36) {
			   println("For both Home and Functions >> EHS : Text is matching!!")
			 }
		  else
			 {
				 println("For both Home and Functions >> EHS : Text is not matching!! !!")
			 }
 //ETP Total Effluent
			 
	   println("ETP Total Effluent  >> Var vs PY")
			 if (text37==text38) {
				  println("For both Home and Functions >> EHS : Text is matching!!")
				}
			 else
				{
					println("For both Home and Functions >> EHS : Text is not matching!! !!")
				}
				
				
	   println("ETP Total Effluent  >> YTD 2021-22")
				if (text39==text40) {
					 println("For both Home and Functions >> EHS : Text is matching!!")
				   }
				else
				   {
					   println("For both Home and Functions >> EHS : Text is not matching!! !!")
				   }
				   
				   
	   println("ETP Total Effluent  >> YTD 2022-23")
			   if (text41==text42) {
					println("For both Home and Functions >> EHS : Text is matching!!")
				  }
			   else
				  {
					  println("For both Home and Functions >> EHS : Text is not matching!! !!")
				  }
									
//ETP Total Cost
				  
		   println("ETP Total Cost  >> Var vs PY")
				  if (text43==text44) {
					   println("For both Home and Functions >> EHS : Text is matching!!")
					 }
				  else
					 {
						 println("For both Home and Functions >> EHS : Text is not matching!! !!")
					 }
					 
					 
			println("ETP Total Cost  >> YTD 2021-22")
					 if (text45==text46) {
						  println("For both Home and Functions >> EHS : Text is matching!!")
						}
					 else
						{
							println("For both Home and Functions >> EHS : Text is not matching!! !!")
						}
						
						
			println("ETP Total Cost  >> YTD 2022-23")
					if (text47==text48) {
						 println("For both Home and Functions >> EHS : Text is matching!!")
					   }
					else
					   {
						   println("For both Home and Functions >> EHS : Text is not matching!! !!")
					   }

//ETP Total Power
					   
				println("ETP Total Power  >> Var vs PY")
					   if (text49==text50) {
							println("For both Home and Functions >> EHS : Text is matching!!")
						  }
					   else
						  {
							  println("For both Home and Functions >> EHS : Text is not matching!! !!")
						  }
						  
						  
				 println("ETP Total Power  >> YTD 2021-22")
						  if (text51==text52) {
							   println("For both Home and Functions >> EHS : Text is matching!!")
							 }
						  else
							 {
								 println("For both Home and Functions >> EHS : Text is not matching!! !!")
							 }
							 
							 
				 println("ETP Total Power >> YTD 2022-23")
						 if (text53==text54) {
							  println("For both Home and Functions >> EHS : Text is matching!!")
							}
						 else
							{
								println("For both Home and Functions >> EHS : Text is not matching!! !!")
							}
							
//ZLD Total Cost
							
							
					println("ZLD Total Cost  >> Var vs PY")
							if (text55==text56) {
								 println("For both Home and Functions >> EHS : Text is matching!!")
							   }
							else
							   {
								   println("For both Home and Functions >> EHS : Text is not matching!! !!")
							   }
							   
							   
					  println("ZLD Total Cost  >> YTD 2021-22")
							   if (text57==text58) {
									println("For both Home and Functions >> EHS : Text is matching!!")
								  }
							   else
								  {
									  println("For both Home and Functions >> EHS : Text is not matching!! !!")
								  }
								  
								  
					  println("ZLD Total Cost >> YTD 2022-23")
							  if (text59==text60) {
								   println("For both Home and Functions >> EHS : Text is matching!!")
								 }
							  else
								 {
									 println("For both Home and Functions >> EHS : Text is not matching!! !!")
								 }
	
WebUI.closeBrowser()

