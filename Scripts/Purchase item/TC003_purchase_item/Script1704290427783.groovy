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

WebUI.navigateToUrl('https://www.demoblaze.com/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Product_store/Purchase_page/menu_login'))

WebUI.setText(findTestObject('Product_store/Purchase_page/field_username'), GlobalVariable.username)

WebUI.setText(findTestObject('Product_store/Purchase_page/field_password'), GlobalVariable.password)

WebUI.click(findTestObject('Product_store/Purchase_page/btn_login'))

WebUI.click(findTestObject('Product_store/Purchase_page/img_item'))

WebUI.click(findTestObject('Product_store/Purchase_page/btn_add to cart'))

WebUI.click(findTestObject('Product_store/Purchase_page/btn_cart'))

WebUI.click(findTestObject('Product_store/Purchase_page/btn_place order'))

WebUI.setText(findTestObject('Product_store/Purchase_page/field_name'), 'testdemoblaze')

WebUI.setText(findTestObject('Product_store/Purchase_page/field_country'), 'testdemoblaze')

WebUI.setText(findTestObject('Product_store/Purchase_page/field_city'), 'testdemoblaze')

WebUI.setText(findTestObject('Product_store/Purchase_page/field_card'), 'testdemoblaze')

WebUI.setText(findTestObject('Product_store/Purchase_page/field_month'), '12')

WebUI.setText(findTestObject('Product_store/Purchase_page/field_year'), '2023')

WebUI.click(findTestObject('Product_store/Purchase_page/btn_purchase'))

WebUI.verifyElementPresent(findTestObject('Product_store/Purchase_page/text_thank you for your purchase'), 0)

WebUI.click(findTestObject('Product_store/Purchase_page/btn_ok'))

WebUI.closeBrowser()

