import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

String date = System.currentTimeMillis()

WebUI.navigateToUrl('http://leidos1-baas-initial-ui.s3-website-us-east-1.amazonaws.com/')

assert WebUI.getWindowTitle() == 'React App'

WebUI.verifyElementPresent(findTestObject('Page_React App/h2_Welcome to BaaS'), 0)

WebUI.click(findTestObject('Object Repository/Page_React App/h2_Welcome to Baas'))

WebUI.click(findTestObject('Object Repository/Page_React App/span_Requests'))

WebUI.click(findTestObject('Object Repository/Page_React App/span_Users'))

WebUI.click(findTestObject('Object Repository/Page_React App/div_'))

WebUI.click(findTestObject('Object Repository/Page_React App/li_United States'))

WebUI.click(findTestObject('Object Repository/Page_React App/li_Great Britain'))

WebUI.click(findTestObject('Object Repository/Page_React App/span_Requests'))

WebUI.click(findTestObject('Object Repository/Page_React App/span_Create Request'))

WebUI.dismissAlert()

assert WebUI.getWindowTitle() == 'React App'

WebUI.comment('Hello')

WebUI.click(findTestObject('Object Repository/Page_React App/span_Users'))

WebUI.setText(findTestObject('Object Repository/Page_React App/input__firstname'), 'Nick')

WebUI.setText(findTestObject('Object Repository/Page_React App/input__username'), 'nickmoore')

WebUI.setText(findTestObject('Object Repository/Page_React App/input__lastname'), 'Moore')

WebUI.verifyElementNotChecked(findTestObject('Object Repository/Page_React App/input__jss106'), 0)

WebUI.check(findTestObject('Object Repository/Page_React App/input__jss106'))

WebUI.verifyElementChecked(findTestObject('Object Repository/Page_React App/input__jss106'), 0)

WebUI.uncheck(findTestObject('Object Repository/Page_React App/input__jss106'))

WebUI.verifyElementNotChecked(findTestObject('Object Repository/Page_React App/input__jss106'), 0)

WebUI.closeBrowser()

