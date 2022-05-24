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

WebUI.click(findTestObject('Object Repository/Huesped/Usuario/ActualizarInfoPersonal/Page_Gastiganto/span_Mi perfil'))

WebUI.click(findTestObject('Object Repository/Huesped/Usuario/ActualizarInfoPersonal/Page_Gastiganto/span_Informacin personal'))

WebUI.click(findTestObject('Object Repository/Huesped/Usuario/ActualizarInfoPersonal/Page_Gastiganto/input_Nombre_form-control form-control-lg f_bbcb9f'))

WebUI.click(findTestObject('Object Repository/Huesped/Usuario/ActualizarInfoPersonal/Page_Gastiganto/div_Nombre'))

WebUI.setText(findTestObject('Huesped/Usuario/ActualizarInfoPersonal/Page_Gastiganto/input_Nombre_form-control form-control-lg form-control-solid ng-untouched ng-pristine ng-valid'), 
    'AstolfoXd')

WebUI.delay(1)

WebUI.setText(findTestObject('Huesped/Usuario/ActualizarInfoPersonal/Page_Gastiganto/input_Apellido paterno_form-control form-control-lg form-control-solid ng-untouched ng-pristine ng-valid'), 
    'Rod')

WebUI.delay(1)

WebUI.setText(findTestObject('Huesped/Usuario/ActualizarInfoPersonal/Page_Gastiganto/input_Apellido materno_form-control form-control-lg form-control-solid ng-untouched ng-pristine ng-valid'), 
    'Val')

WebUI.delay(1)

WebUI.setText(findTestObject('Huesped/Usuario/ActualizarInfoPersonal/Page_Gastiganto/input_Telfono_form-control form-control-lg form-control-solid ng-untouched ng-pristine ng-valid'), 
    '6679123321')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Huesped/Usuario/ActualizarInfoPersonal/Page_Gastiganto/button_Guardar cambios'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Huesped/Usuario/ActualizarInfoPersonal/Page_Gastiganto/span_Mi perfil'))

WebUI.click(findTestObject('Object Repository/Huesped/Usuario/ActualizarInfoPersonal/Page_Gastiganto/span_Informacin adicional'))

WebUI.click(findTestObject('Object Repository/Huesped/Usuario/ActualizarInfoPersonal/Page_Gastiganto/div_Clave de elector'))

WebUI.setText(findTestObject('Object Repository/Huesped/Usuario/ActualizarInfoPersonal/Page_Gastiganto/input_Clave de elector_form-control form-co_e28aba'), 
    '111222333123321000')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Huesped/Usuario/ActualizarInfoPersonal/Page_Gastiganto/button_Guardar cambios'))

WebUI.delay(5)

