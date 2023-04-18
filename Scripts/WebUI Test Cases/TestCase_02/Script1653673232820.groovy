import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

'Sign in with the credentials associated to the Resources Server'
WebUI.callTestCase(findTestCase('Common Test Cases/UserLogin_Resources'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('TWX/Resources/Page_Resource Listing/a_SearchFunctions'), 2)

text1a = WebUI.click(findTestObject('TWX/Resources/Page_Resource Listing/a_SearchFunctions'))

text1b = WebUI.getText(findTestObject('TWX/Resources/Page_Resource Listing/Page_Resource  SearchFunctions/td_SearchFunctions'))

if (text1b == text1a) {
    println(text1a)
}

text2 = WebUI.getText(findTestObject('TWX/Resources/Page_Resource Listing/Page_Resource  SearchFunctions/td_Search function library'))

println((('Name: ' + text1a) + ' Description: ') + text2)

WebUI.click(findTestObject('TWX/Resources/Page_Resource Listing/Page_Resource  SearchFunctions/a_Service Definitions'))

text3a = WebUI.getText(findTestObject('TWX/Resources/Page_Resource Listing/Page_Effective Service Definition Listing For SearchFunctions/a_AddConfigurationTableDefinition'))


text4a = WebUI.getText(findTestObject('TWX/Resources/Page_Resource Listing/Page_Effective Service Definition Listing For SearchFunctions/a_AddDesignTimePermission'))

text4b = WebUI.getText(findTestObject('TWX/Resources/Page_Resource Listing/Page_Effective Service Definition Listing For SearchFunctions/td_Add a design time permission'))


println(((('Name: ' + text4a) + '-') + ' Description: ') + text4b)

WebUI.closeBrowser()

