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

WebUI.mouseOver(findTestObject('Object Repository/Admin/Gestor/CrearNuevoGestor/Page_Gastiganto Admin/span_Catlogos'))

WebUI.click(findTestObject('Object Repository/Admin/Gestor/CrearNuevoGestor/Page_Gastiganto Admin/span_Usuarios'))

WebUI.click(findTestObject('Object Repository/Admin/Gestor/CrearNuevoGestor/Page_Gastiganto Admin/button_Nuevo Usuario'))

WebUI.click(findTestObject('Object Repository/Admin/Gestor/CrearNuevoGestor/Page_Gastiganto Admin/div_Roles_mat-select-arrow'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Admin/Gestor/CrearNuevoGestor/Page_Gastiganto Admin/span_Gestor'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Admin/Gestor/CrearNuevoGestor/Page_Gastiganto Admin/input_Informacin bsica_mat-input-5'), 
    'Gestor')

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Admin/Gestor/CrearNuevoGestor/Page_Gastiganto Admin/input_Nombre_mat-input-6'), 
    'Prueba')

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Admin/Gestor/CrearNuevoGestor/Page_Gastiganto Admin/input_Apellido Paterno_mat-input-7'), 
    'Eliminar')

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Admin/Gestor/CrearNuevoGestor/Page_Gastiganto Admin/input_Apellido Materno_mat-input-8'), 
    'gestorprueba2@mail.com')

WebUI.delay(1)

WebUI.setEncryptedText(findTestObject('Object Repository/Admin/Gestor/CrearNuevoGestor/Page_Gastiganto Admin/input_Correo_password'), 
    '373N5QL8KVQ=')

WebUI.delay(1)

WebUI.setEncryptedText(findTestObject('Object Repository/Admin/Gestor/CrearNuevoGestor/Page_Gastiganto Admin/input_Contrasea_confirm'), 
    '373N5QL8KVQ=')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Admin/Gestor/CrearNuevoGestor/Page_Gastiganto Admin/mat-icon_visibility_off'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Admin/Gestor/CrearNuevoGestor/Page_Gastiganto Admin/mat-icon_visibility'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Admin/Gestor/CrearNuevoGestor/Page_Gastiganto Admin/input_Confirmar contrasea_mat-input-11'), 
    '6677019283')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Admin/Gestor/CrearNuevoGestor/Page_Gastiganto Admin/div_Plaza_mat-select-arrow'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Admin/Gestor/CrearNuevoGestor/Page_Gastiganto Admin/span_Mazatln'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Admin/Gestor/CrearNuevoGestor/Page_Gastiganto Admin/span_Altata'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Admin/Gestor/CrearNuevoGestor/Page_Gastiganto Admin/span_Guardar'))

WebUI.delay(8)

