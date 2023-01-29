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

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.click(findTestObject('Object Repository/HomePage/a_Login'))

WebUI.setText(findTestObject('PageLogin/txtUsername'), GlobalVariable.username)

WebUI.setText(findTestObject('PageLogin/txtPassword'), GlobalVariable.password)

WebUI.click(findTestObject('PageLogin/btnLogin'))

WebUI.setText(findTestObject('Dashboard/input_Create New_searching'), 'Udin Salim')

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Dashboard/btnSearch'))

def randName = RandomStringUtils.randomAlphabetic(3)

WebUI.click(findTestObject('Dashboard/Table Data/a_Edit'))

WebUI.setText(findTestObject('Dashboard/PageEdit/txtName'), 'Udin Salim '+ randName)

WebUI.setText(findTestObject('Dashboard/PageEdit/txtCompany'), 'PT Telkomsel Indonesia ' + randName)

WebUI.setText(findTestObject('Dashboard/PageEdit/txtAddress'), 'JL Mampang Raya '+ randName)

WebUI.setText(findTestObject('Dashboard/PageEdit/txtCity'), 'Jakarta Barat '+ randName)

WebUI.setText(findTestObject('Dashboard/PageEdit/txtPhone'), '08131111222333')

WebUI.setText(findTestObject('Dashboard/PageEdit/txtEmail'), 'udinsalim'+randName+'@gmail.com')

WebUI.click(findTestObject('Dashboard/PageEdit/btnSave'))

WebUI.waitForPageLoad(5)

WebUI.setText(findTestObject('Dashboard/input_Create New_searching'), 'Udin Salim '+ randName)

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Dashboard/btnSearch'))

WebUI.verifyElementText(findTestObject('Dashboard/Table Data/td_Name'), 'Udin Salim '+ randName)

WebUI.verifyElementText(findTestObject('Dashboard/Table Data/td_Company'), 'PT Telkomsel Indonesia '+ randName)

WebUI.verifyElementText(findTestObject('Dashboard/Table Data/td_Address'), 'JL Mampang Raya '+randName)

WebUI.verifyElementText(findTestObject('Dashboard/Table Data/td_City'), 'Jakarta Barat '+ randName)

WebUI.verifyElementText(findTestObject('Dashboard/Table Data/td_Phone'), '08131111222333')

WebUI.verifyElementText(findTestObject('Dashboard/Table Data/td_Email'), 'udinsalim'+randName+'@gmail.com')

WebUI.closeBrowser()

