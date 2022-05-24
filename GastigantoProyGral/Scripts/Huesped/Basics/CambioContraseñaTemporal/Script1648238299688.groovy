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

WebUI.navigateToUrl(GlobalVariable.URL_Huesped)

WebUI.setText(findTestObject('Object Repository/Huesped/Basics/CambioContraseñaTemporal/Page_Gastiganto/input_Correo_email'), 
    'ie.practicantes4@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Huesped/Basics/CambioContraseñaTemporal/Page_Gastiganto/input_Contrasea_password'), 
    '352asWpIgy4=')

WebUI.click(findTestObject('Object Repository/Huesped/Basics/CambioContraseñaTemporal/Page_Gastiganto/button_Iniciar sesin'))

WebUI.delay(5)

WebUI.setEncryptedText(findTestObject('Object Repository/Huesped/Basics/CambioContraseñaTemporal/Page_Gastiganto/input_Contrasea temporal_pTemporal'), 
    '352asWpIgy4=')

WebUI.click(findTestObject('Object Repository/Huesped/Basics/CambioContraseñaTemporal/Page_Gastiganto/span_visibility'))

WebUI.delay(1)

WebUI.setEncryptedText(findTestObject('Object Repository/Huesped/Basics/CambioContraseñaTemporal/Page_Gastiganto/input_Nueva contrasea_password'), 
    '373N5QL8KVQ=')

WebUI.delay(1)

WebUI.setEncryptedText(findTestObject('Object Repository/Huesped/Basics/CambioContraseñaTemporal/Page_Gastiganto/input_Confirmar contrasea_cPassword'), 
    '373N5QL8KVQ=')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Huesped/Basics/CambioContraseñaTemporal/Page_Gastiganto/span_visibility'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Huesped/Basics/CambioContraseñaTemporal/Page_Gastiganto/span_visibility'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Huesped/Basics/CambioContraseñaTemporal/Page_Gastiganto/span_Guardar'))

WebUI.delay(10)

