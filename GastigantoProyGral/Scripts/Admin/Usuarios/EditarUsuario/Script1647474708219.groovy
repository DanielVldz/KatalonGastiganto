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

WebUI.mouseOver(findTestObject('Object Repository/Admin/Usuario/EditarUsuario/Page_Gastiganto Admin/span_Catlogos'))

WebUI.click(findTestObject('Object Repository/Admin/Usuario/EditarUsuario/Page_Gastiganto Admin/span_Usuarios'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Admin/Usuario/EditarUsuario/Page_Gastiganto Admin/input_Nuevo Usuario_search'), 
    'missael')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Admin/Usuario/EditarUsuario/Page_Gastiganto Admin/mat-icon_create'))

WebUI.click(findTestObject('Object Repository/Admin/Usuario/EditarUsuario/Page_Gastiganto Admin/html_Gastiganto Admin.cal-month-view_ngcont_4c1119'))

WebUI.setText(findTestObject('Object Repository/Admin/Usuario/EditarUsuario/Page_Gastiganto Admin/input_nombre'), 'Raul')

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Admin/Usuario/EditarUsuario/Page_Gastiganto Admin/input_apepaterno'), 'Lopez')

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Admin/Usuario/EditarUsuario/Page_Gastiganto Admin/input_apematerno'), 'Falcon')

WebUI.delay(1)

WebUI.setEncryptedText(findTestObject('Object Repository/Admin/Usuario/EditarUsuario/Page_Gastiganto Admin/input_contra'), 
    '2aF3Hjcldyw=')

WebUI.delay(1)

WebUI.setEncryptedText(findTestObject('Object Repository/Admin/Usuario/EditarUsuario/Page_Gastiganto Admin/input_confirmarcontra'), 
    '2aF3Hjcldyw=')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Admin/Usuario/EditarUsuario/Page_Gastiganto Admin/mat-icon_visibility_off'))

WebUI.click(findTestObject('Object Repository/Admin/Usuario/EditarUsuario/Page_Gastiganto Admin/mat-icon_visibility'))

WebUI.setText(findTestObject('Object Repository/Admin/Usuario/EditarUsuario/Page_Gastiganto Admin/input_telefono'), '5571001122')

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Admin/Usuario/EditarUsuario/Page_Gastiganto Admin/input_ine'), '456111000111000111')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Admin/Usuario/EditarUsuario/Page_Gastiganto Admin/span_Actualizar'))

WebUI.delay(5)

