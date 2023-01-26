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

WebUI.click(findTestObject('Object Repository/HomePage/a_Sign Up'))

WebUI.setText(findTestObject('SignUp/Component/txtFirstname'), RandomStringUtils.randomAlphabetic(7))

WebUI.setText(findTestObject('SignUp/Component/txtSurname'), RandomStringUtils.randomAlphabetic(7))

WebUI.setText(findTestObject('Object Repository/SignUp/Component/txtEpost'), RandomStringUtils.randomNumeric(
        5))

WebUI.setText(findTestObject('Object Repository/SignUp/Component/txtMobile'), RandomStringUtils.randomNumeric(
        12))

WebUI.setText(findTestObject('SignUp/Component/txtUsername'), RandomStringUtils.randomAlphabetic(7))

WebUI.setEncryptedText(findTestObject('SignUp/Component/txtConfirmPassword'), '8SQVv/p9jVTHLrggi8kCzw==')

WebUI.click(findTestObject('SignUp/Component/btnSubmit'))

WebUI.verifyElementText(findTestObject('SignUp/Label/span_Confirm password and Password do not match'), '\'Confirm password\' and \'Password\' do not match.')

WebUI.closeBrowser()

