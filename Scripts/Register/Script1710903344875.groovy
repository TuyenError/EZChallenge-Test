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

Mobile.startApplication('C:\\Users\\admin\\Downloads\\app-release.apk', true)

Mobile.tap(findTestObject('Object Repository/android.view.View'), 0)

Mobile.tap(findTestObject('Object Repository/android.view.View'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Register'), 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Enter your email'), 'caotuyenks1605@gmail.com', 
    0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Enter your user name'), 'Timmy', 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Enter your password'), '123456789', 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Enter your password (1)'), '123456789', 0)

Mobile.tap(findTestObject('Object Repository/android.view.View (1)'), 0)

Mobile.tap(findTestObject('Object Repository/android.view.View (1)'), 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText'), '5', 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText (1)'), '3', 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText (2)'), '6', 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText (3)'), '1', 0)

Mobile.tap(findTestObject('Object Repository/android.view.View (2)'), 0)

Mobile.closeApplication()

