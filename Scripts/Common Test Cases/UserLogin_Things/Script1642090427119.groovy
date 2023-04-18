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
 WebElement HomePageCheck

 String sdom_js1
 
 //Alert Button 
 sdom_js1 ='document.querySelector("#root_ptcsbutton-35").shadowRoot.querySelector("div > ptcs-icon").shadowRoot.querySelector("iron-icon").click()'
 HomePageCheck = WebUI.executeJavaScript(sdom_js1, null)
 Thread.sleep(7000)
 WebUI.executeJavaScript('document.querySelector("#root_navigationfunction-39-popup > div.popup-title > span.mashup-close-popup").click()', null)
 
 //Comment button
 sdom_js1 ='document.querySelector("#root_ptcsbutton-43").shadowRoot.querySelector("div > ptcs-icon").shadowRoot.querySelector("div > img").click()'
 HomePageCheck = WebUI.executeJavaScript(sdom_js1, null)
 Thread.sleep(7000)
 WebUI.executeJavaScript('document.querySelector("#root_navigationfunction-42-popup > div.popup-title.ui-draggable-handle > span.mashup-close-popup").click()', null)
 
 // Home button
 sdom_js1 ='document.querySelector("#root_ptcsbutton-16").shadowRoot.querySelector("div > ptcs-icon").shadowRoot.querySelector("iron-icon").click()'
 HomePageCheck = WebUI.executeJavaScript(sdom_js1, null)
 Thread.sleep(7000)
 
 //CXO Tab
 sdom_js1 ='document.querySelector("#root_ptcsmenubar-64").shadowRoot.querySelector("#flyout").shadowRoot.querySelector("#primaryitems > ptcs-menu-item:nth-child(1)").shadowRoot.querySelector("ptcs-icon:nth-child(2)").shadowRoot.querySelector("div > img").click()'
 HomePageCheck = WebUI.executeJavaScript(sdom_js1, null)
 Thread.sleep(7000)
 //WebUI.executeJavaScript('document.querySelector("#root_navigationfunction-42-popup > div.popup-title.ui-draggable-handle > span.mashup-close-popup").click()', null)
 //Function Tab
 sdom_js1 ='document.querySelector("#root_ptcsmenubar-64").shadowRoot.querySelector("#flyout").shadowRoot.querySelector("#primaryitems > ptcs-menu-item:nth-child(2)").shadowRoot.querySelector("ptcs-icon:nth-child(2)").shadowRoot.querySelector("div > img").click()'
 HomePageCheck = WebUI.executeJavaScript(sdom_js1, null)
 Thread.sleep(7000)
 WebUI.executeJavaScript('document.querySelector("#root_pagemashupcontainer-2_flexcontainer-33").click()', null)
 //Site Tab
 sdom_js1 ='document.querySelector("#root_ptcsmenubar-64").shadowRoot.querySelector("#flyout").shadowRoot.querySelector("#primaryitems > ptcs-menu-item:nth-child(3)").shadowRoot.querySelector("ptcs-icon:nth-child(2)").shadowRoot.querySelector("div > img").click()'
 HomePageCheck = WebUI.executeJavaScript(sdom_js1, null)
 Thread.sleep(7000)
 WebUI.executeJavaScript('document.querySelector("#root_pagemashupcontainer-2_flexcontainer-33").click()', null)
 Thread.sleep(7000)

WebUI.click(findTestObject('Lupin/Page_Lupin DPM/Button_Logout'))