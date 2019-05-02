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

import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

WebUI.openBrowser('')

WebUI.navigateToUrl('http://leidos1-baas-initial-ui.s3-website-us-east-1.amazonaws.com/')

WebUI.click(findTestObject('Object Repository/Page_React App/span_Users'))

WebDriver driver = DriverFactory.getWebDriver()

WebElement  Table = driver.findElement(By.xpath("//table/tbody"))

List<WebElement> rows_table = Table.findElements(By.tagName('tr'))

List<WebElement> columns_row = rows_table.get(rows_table.size() - 1).findElements(By.tagName('td'))

WebUI.verifyEqual(columns_row.get(0).getText(), "Larry")
WebUI.verifyEqual(columns_row.get(1).getText(), "Johnson")
WebUI.verifyEqual(columns_row.get(2).getText(), "larry")

WebUI.closeBrowser()

