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
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://itera-qa.azurewebsites.net/')

WebUI.click(findTestObject('Object Repository/HomePage/a_Login'))

WebUI.setText(findTestObject('PageLogin/txtUsername'), 'verginardian')

WebUI.setEncryptedText(findTestObject('PageLogin/txtPassword'), 'Uq7bN5AjeDsbX1dGBtIf4A==')

WebUI.click(findTestObject('PageLogin/btnLogin'))

WebUI.click(findTestObject('Dashboard/btnCreateNew'))

def randName = RandomStringUtils.randomAlphabetic(3)

WebUI.setText(findTestObject('Dashboard/PageCreate/txtName'), 'Udin Random' + randName)

WebUI.setText(findTestObject('Dashboard/PageCreate/txtCompany'), 'PT Jaya '+RandomStringUtils.randomAlphabetic(5))

WebUI.setText(findTestObject('Dashboard/PageCreate/txtAddress'), 'Jalan Raya '+RandomStringUtils.randomAlphabetic(15))

WebUI.setText(findTestObject('Dashboard/PageCreate/txtPhone'), '62' + RandomStringUtils.randomNumeric(11))

WebUI.setText(findTestObject('Dashboard/PageCreate/txtEmail'), ('udinrandom' + randName) + '@gmail.com')

WebUI.click(findTestObject('Dashboard/PageCreate/btnCreate'))

WebUI.setText(findTestObject('Dashboard/input_Create New_searching'), 'Udin Random' + randName)

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Dashboard/btnSearch'))

WebUI.verifyElementText(findTestObject('Dashboard/Table Data/td_Name'), 'Udin Random' + randName)
WebUI.verifyElementText(findTestObject('Dashboard/Table Data/td_City'), '')

WebUI.closeBrowser()

