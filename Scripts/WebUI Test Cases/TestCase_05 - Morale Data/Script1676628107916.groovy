import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Sign in with the credentials associated to the Things Server'
WebUI.callTestCase(findTestCase('Common Test Cases/Test Case For Morale Data Testing'), [:], FailureHandling.STOP_ON_FAILURE)


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

//'Scrolling till element in web page'
//WebUI.scrollToElement(findTestObject('TWX/Things/Page_Thing Listing/a_RD.RS.AssetType.Eligibility.DT'), 2)
//
//Thread.sleep(3000)
//
//'Fetching text of element and saving in varible \'text1\''
//text1 = WebUI.getText(findTestObject('TWX/Things/Page_Thing Listing/a_RD.RS.AssetType.Eligibility.DT'))
//
//WebUI.click(findTestObject('TWX/Things/Page_Thing Listing/a_RD.RS.AssetType.Eligibility.DT'))
//
//Thread.sleep(3000)
//
//text2 = WebUI.getText(findTestObject('TWX/Things/Page_Thing Listing/Page_Thing  RD.RS.AssetType.Eligibility.DT/td_RD.RS.AssetType.Eligibility.DT'))
//
//text3 = WebUI.getText(findTestObject('TWX/Things/Page_Thing Listing/Page_Thing  RD.RS.AssetType.Eligibility.DT/td_Data Table with eligibility rules for asset types'))
//
//Thread.sleep(2000)
//
//'Comparing value and if holds true, prints on console'
//if (text1 == text2) {
//    System.out.println((('Name: ' + text1) + ' Description: ') + text3)
//
//    FailureHandling.STOP_ON_FAILURE
//}

WebUI.closeBrowser()

