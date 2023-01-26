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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://itera-qa.azurewebsites.net/')

WebUI.click(findTestObject('Object Repository/HomePage/a_Login'))

WebUI.setText(findTestObject('PageLogin/txtUsername'), 'verginardian')

WebUI.setEncryptedText(findTestObject('PageLogin/txtPassword'), 'Uq7bN5AjeDsbX1dGBtIf4A==')

WebUI.click(findTestObject('PageLogin/btnLogin'))

WebUI.verifyElementText(findTestObject('Dashboard/h1_Dashboard'), 'Dashboard')

WebUI.verifyElementText(findTestObject('Dashboard/h2_Customer Details'), 'Customer Details')

WebUI.verifyElementPresent(findTestObject('Dashboard/btnSearch'), 1)

WebUI.verifyElementPresent(findTestObject('Dashboard/btnCreateNew'), 1)

WebUI.verifyElementPresent(findTestObject('Dashboard/Table Field/th_Name'), 1)

WebUI.verifyElementPresent(findTestObject('Dashboard/Table Field/th_Company'), 1)

WebUI.verifyElementPresent(findTestObject('Dashboard/Table Field/th_Phone'), 1)

WebUI.verifyElementPresent(findTestObject('Dashboard/Table Field/th_Address'), 1)

WebUI.verifyElementPresent(findTestObject('Dashboard/Table Field/th_Email'), 1)

WebUI.verifyElementPresent(findTestObject('Dashboard/Table Field/th_City'), 1)

WebUI.closeBrowser()

