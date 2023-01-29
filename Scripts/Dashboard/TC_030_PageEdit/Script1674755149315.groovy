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

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.click(findTestObject('Object Repository/HomePage/a_Login'))

WebUI.setText(findTestObject('PageLogin/txtUsername'), GlobalVariable.username)

WebUI.setText(findTestObject('PageLogin/txtPassword'), GlobalVariable.password)

WebUI.click(findTestObject('PageLogin/btnLogin'))

WebUI.setText(findTestObject('Dashboard/input_Create New_searching'), 'Vergi Nardian Lufyandi')

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Dashboard/btnSearch'))

WebUI.click(findTestObject('Dashboard/Table Data/a_Edit'))

WebUI.verifyElementText(findTestObject('Dashboard/PageEdit/h2_Edit'), 'Edit')

name = WebUI.getAttribute(findTestObject('Dashboard/PageEdit/txtName'), 'value')

WebUI.verifyEqual(name, 'Vergi Nardian Lufyandi')

company = WebUI.getAttribute(findTestObject('Dashboard/PageEdit/txtCompany'), 'value')

WebUI.verifyEqual(company, 'PT GOOGLE INDONESIA')

email = WebUI.getAttribute(findTestObject('Dashboard/PageEdit/txtEmail'), 'value')

WebUI.verifyEqual(email, 'verginl74@gmail.com')

phone = WebUI.getAttribute(findTestObject('Dashboard/PageEdit/txtPhone'), 'value')

WebUI.verifyEqual(phone, '081380008744')

city = WebUI.getAttribute(findTestObject('Dashboard/PageEdit/txtCity'), 'value')

WebUI.verifyEqual(city, 'Kab Bogor')

address = WebUI.getAttribute(findTestObject('Dashboard/PageEdit/txtAddress'), 'value')

WebUI.verifyEqual(address, 'JL Cikereteg Bogor')

WebUI.closeBrowser()

