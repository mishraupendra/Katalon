import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.awt.Robot as Robot
import java.awt.event.KeyEvent as KeyEvent
import org.openqa.selenium.By as By
import org.openqa.selenium.support.ui.ExpectedConditions as ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait as WebDriverWait
import com.kms.katalon.core.configuration.RunConfiguration as RC
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium as WebDriverBackedSelenium
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

def executionProfile = RC.getExecutionProfile()

String baseUrl = 'https://roche-ver93.cloud.thingworx.com/Thingworx/Projects'

def driver = DriverFactory.getWebDriver()

selenium = new WebDriverBackedSelenium(driver, baseUrl)

WebDriverWait wait = new WebDriverWait(driver, 5)

WebUI.navigateToUrl('https://roche-ver93.cloud.thingworx.com/Thingworx/Projects')

WebUI.setText(findTestObject('Common Elements/Login/Page_/input_Username_pf.username'), GlobalVariable.username)

WebUI.setEncryptedText(findTestObject('Common Elements/Login/Page_/input_Password_pf.pass'), GlobalVariable.password)

if (executionProfile == 'TWX_Dev') {
    WebUI.click(findTestObject('Object Repository/TWX/Common Elements/Page_/input'))
} else {
    wait.until(ExpectedConditions.elementToBeClickable(By.xpath('//*[@type = \'submit\']')))

    Robot robot = new Robot()

    robot.delay(3000)

    robot.keyPress(KeyEvent.VK_ENTER)

    robot.keyRelease(KeyEvent.VK_ENTER)

    robot.delay(7000)

    robot.keyPress(KeyEvent.VK_ENTER)

    robot.keyRelease(KeyEvent.VK_ENTER)
}

