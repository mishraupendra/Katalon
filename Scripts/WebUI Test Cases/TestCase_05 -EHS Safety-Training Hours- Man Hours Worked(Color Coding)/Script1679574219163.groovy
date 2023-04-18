import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Sign in with the credentials associated to the Things Server'
WebUI.callTestCase(findTestCase('Common Test Cases/Test Case For EHS Safety Training Hours-Man Hours Worked'), [:], FailureHandling.STOP_ON_FAILURE)


//WebUI.switchToFrame(findTestObject('null'), 10, FailureHandling.STOP_ON_FAILURE)
////https://www.lambdatest.com/blog/shadow-dom-in-selenium/
//https://docs.katalon.com/docs/legacy/katalon-studio-enterprise/test-design/web-test-design/web-test-objects/automation-testing-of-shadow-dom-elements-with-katalon-studio
WebElement overview_accidents_val
overview_accidents_val = WebUI.getText(findTestObject('Object Repository/Lupin/Overview/overview_accidents_child'))
String sdom_js
sdom_js = "return document.querySelector('#root_pagemashupcontainer-2_mashupcontainer-3_ptcsgrid-245').shadowRoot.querySelector('#grid').shadowRoot.querySelector('#chunker > div:nth-child(2) > div > ptcs-div > ptcs-div:nth-child(1) > ptcs-label').shadowRoot.querySelector('#label')"
overview_accidents_val_js = WebUI.executeJavaScript(sdom_js, null)
println("Marker1 >>> ")
println(overview_accidents_val)
println("Marker2 >>> ")
println(overview_accidents_val_js)

WebUI.closeBrowser()

