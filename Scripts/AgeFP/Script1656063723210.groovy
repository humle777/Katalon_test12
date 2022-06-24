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

WebUI.navigateToUrl('https://qa-age-friendly.herokuapp.com/')

WebUI.click(findTestObject('Object Repository/AgeFP/Page_AgeFriendly.org/a_Log in'))

WebUI.click(findTestObject('Object Repository/AgeFP/Page_AgeFriendly.org  Welcoming places for _8983bc/a_Forgot password'))

WebUI.setText(findTestObject('Object Repository/AgeFP/Page_AgeFriendly.org  Welcoming places for _8983bc/input_Email address_useremail'), 
    'qq@qq.qq')

WebUI.click(findTestObject('Object Repository/AgeFP/Page_AgeFriendly.org  Welcoming places for _8983bc/input_Back_commit'))

WebUI.verifyTextPresent('Check your email', false)

WebUI.click(findTestObject('Object Repository/AgeFP/Page_AgeFriendly.org  Welcoming places for _8983bc/p_We sent you the password reset link. Plea_a95c9a'))

WebUI.closeBrowser()

