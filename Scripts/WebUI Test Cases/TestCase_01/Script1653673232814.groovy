import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Sign in with the credentials associated to the Things Server'
WebUI.callTestCase(findTestCase('Common Test Cases/Login as/CXO'), [:], FailureHandling.STOP_ON_FAILURE)
//WebUI.callTestCase(findTestCase('Common Test Cases/Test Case Highlighting Element'), [:], FailureHandling.STOP_ON_FAILURE)



WebUI.closeBrowser()

