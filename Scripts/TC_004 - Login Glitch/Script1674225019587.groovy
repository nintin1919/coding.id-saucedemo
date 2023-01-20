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

WebUI.navigateToUrl('https://www.saucedemo.com/')

WebUI.setText(findTestObject('Object Repository/Page_Swag Labs/input_concat(Epic sadface You can only acce_8f3e31'), 'performance_glitch_user')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Swag Labs/input_concat(Epic sadface You can only acce_a82549'), 
    'qcu24s4901FyWDTwXGr6XA==')

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/input_concat(Epic sadface You can only acce_eeff57'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/button_Add to cart'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/button_Add to cart_1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Swag Labs/select_Name (A to Z)Name (Z to A)Price (low_f7e90a'), 
    'lohi', true)

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/a_2'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/button_Checkout'))

WebUI.setText(findTestObject('Object Repository/Page_Swag Labs/input_Checkout Your Information_firstName'), 'nintin')

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/div_Checkout Your Information_checkout_info'))

WebUI.setText(findTestObject('Object Repository/Page_Swag Labs/input_Checkout Your Information_lastName'), 'nintin')

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/div_Checkout Your Information_error-message_5f83c5'))

WebUI.setText(findTestObject('Object Repository/Page_Swag Labs/input_Checkout Your Information_postalCode'), '1919')

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/div_Checkout Your Information_error-message_5f83c5'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/div_Checkout Your Information_checkout_info'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/input_Cancel_continue'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/button_Finish'))

WebUI.closeBrowser()

