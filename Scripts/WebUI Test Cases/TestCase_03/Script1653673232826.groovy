import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

import javax.xml.ws.wsaddressing.W3CEndpointReference.Elements

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Sign in with the credentials associated to the Resources Server'
WebUI.callTestCase(findTestCase('Common Test Cases/UserLogin_Projects'), [:], FailureHandling.STOP_ON_FAILURE)


WebDriver driver = DriverFactory.getWebDriver()

'add comments'
List<Elements> RD_RS_Project = driver.findElements(By.xpath('//a[contains(text(),\'RD.RS\')]'))

KeywordUtil.logInfo(RD_RS_Project.size().toString())

'add comments'
for (WebElement item : RD_RS_Project) {
	KeywordUtil.logInfo(item.getText())
}

WebUI.closeBrowser()
