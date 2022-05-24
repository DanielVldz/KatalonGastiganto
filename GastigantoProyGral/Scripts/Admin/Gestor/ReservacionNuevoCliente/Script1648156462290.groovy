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

WebUI.click(findTestObject('Admin/Gestor/ReservacionNuevoClienteGestor/Page_Gastiganto Admin/span_Nueva reservacin'))

WebUI.delay(1)

WebUI.click(findTestObject('Admin/Gestor/ReservacionNuevoClienteGestor/Page_Gastiganto Admin/div_Plaza_mat-select-arrow'))

WebUI.delay(2)

WebUI.click(findTestObject('Admin/Gestor/ReservacionNuevoClienteGestor/Page_Gastiganto Admin/span_Mazatln'))

WebUI.delay(1)

WebUI.click(findTestObject('Admin/Gestor/ReservacionNuevoClienteGestor/Page_Gastiganto Admin/svg_Fecha inicial_mat-datepicker-toggle-def_8eb5ef'))

WebUI.delay(1)

WebUI.click(findTestObject('Admin/Gestor/ReservacionNuevoClienteGestor/Page_Gastiganto Admin/div_25'))

WebUI.delay(1)

WebUI.click(findTestObject('Admin/Gestor/ReservacionNuevoClienteGestor/Page_Gastiganto Admin/svg_Fecha final_mat-datepicker-toggle-defau_e82c5a'))

WebUI.delay(1)

WebUI.click(findTestObject('Admin/Gestor/ReservacionNuevoClienteGestor/Page_Gastiganto Admin/div_27'))

WebUI.delay(1)

WebUI.click(findTestObject('Admin/Gestor/ReservacionNuevoClienteGestor/Page_Gastiganto Admin/a_Cantos huspedes'))

WebUI.delay(1)

WebUI.click(findTestObject('Admin/Gestor/ReservacionNuevoClienteGestor/Page_Gastiganto Admin/mat-icon_add_adultos'))

WebUI.delay(1)

WebUI.click(findTestObject('Admin/Gestor/ReservacionNuevoClienteGestor/Page_Gastiganto Admin/mat-icon_add_adultos'))

WebUI.delay(1)

WebUI.click(findTestObject('Admin/Gestor/ReservacionNuevoClienteGestor/Page_Gastiganto Admin/mat-icon_add_adultos'))

WebUI.delay(1)

WebUI.click(findTestObject('Admin/Gestor/ReservacionNuevoClienteGestor/Page_Gastiganto Admin/mat-icon_add_adultos'))

WebUI.delay(1)

WebUI.click(findTestObject('Admin/Gestor/ReservacionNuevoClienteGestor/Page_Gastiganto Admin/span_Consultar disponibilidad'))

WebUI.delay(1)

WebUI.click(findTestObject('Admin/Gestor/ReservacionNuevoClienteGestor/Page_Gastiganto Admin/div_Hospedaje_mat-select-arrow'))

WebUI.delay(5)

WebUI.delay(1)

WebUI.click(findTestObject('Admin/Gestor/ReservacionNuevoClienteGestor/Page_Gastiganto Admin/div_Estatus_mat-select-arrow'))

WebUI.delay(3)

WebUI.click(findTestObject('Admin/Gestor/ReservacionNuevoClienteGestor/Page_Gastiganto Admin/span_Prereservado'))

WebUI.delay(1)

WebUI.click(findTestObject('Admin/Gestor/ReservacionNuevoClienteGestor/Page_Gastiganto Admin/div_Cliente_mat-checkbox-inner-container'))

WebUI.delay(1)

WebUI.setText(findTestObject('Admin/Gestor/ReservacionNuevoClienteGestor/Page_Gastiganto Admin/input_Nuevo cliente_mat-input-6'), 
    'Ricardo')

WebUI.delay(1)

WebUI.setText(findTestObject('Admin/Gestor/ReservacionNuevoClienteGestor/Page_Gastiganto Admin/input_Nombre_mat-input-7'), 
    'Quintero')

WebUI.delay(1)

WebUI.setText(findTestObject('Admin/Gestor/ReservacionNuevoClienteGestor/Page_Gastiganto Admin/input_Apellido paterno_mat-input-8'), 
    'Meza')

WebUI.delay(1)

WebUI.setText(findTestObject('Admin/Gestor/ReservacionNuevoClienteGestor/Page_Gastiganto Admin/input_Apellido materno_mat-input-9'), 
    'ie.practicantes4@gmail.com')

WebUI.delay(1)

WebUI.setText(findTestObject('Admin/Gestor/ReservacionNuevoClienteGestor/Page_Gastiganto Admin/input_Correo electrnico_mat-input-10'), 
    '6677112233')

WebUI.delay(1)

WebUI.setText(findTestObject('Admin/Gestor/ReservacionNuevoClienteGestor/Page_Gastiganto Admin/input_Telfono_mat-input-11'), 
    '000111321123321123')

WebUI.delay(1)

WebUI.click(findTestObject('Admin/Gestor/ReservacionNuevoClienteGestor/Page_Gastiganto Admin/img_Imagen de la INE (Lado frontal)_image-profile'))

WebUI.delay(10)

WebUI.click(findTestObject('Admin/Gestor/ReservacionNuevoClienteGestor/Page_Gastiganto Admin/img_Imagen de la INE (Lado frontal)_image-profile'))

WebUI.delay(10)

WebUI.click(findTestObject('Admin/Gestor/ReservacionNuevoClienteGestor/Page_Gastiganto Admin/div_Nueva reservacinRegresarLimpiar camposR_4ef3d4_1'))

WebUI.delay(1)

WebUI.click(findTestObject('Admin/Gestor/ReservacionNuevoClienteGestor/Page_Gastiganto Admin/span_Limpiar campos'))

WebUI.delay(1)

WebUI.click(findTestObject('Admin/Gestor/ReservacionNuevoClienteGestor/Page_Gastiganto Admin/div_Plaza_mat-select-arrow'))

WebUI.delay(3)

WebUI.click(findTestObject('Admin/Gestor/ReservacionNuevoClienteGestor/Page_Gastiganto Admin/span_Mazatln'))

WebUI.delay(1)

WebUI.click(findTestObject('Admin/Gestor/ReservacionNuevoClienteGestor/Page_Gastiganto Admin/svg_Fecha inicial_mat-datepicker-toggle-def_8eb5ef_1'))

WebUI.delay(1)

WebUI.click(findTestObject('Admin/Gestor/ReservacionNuevoClienteGestor/Page_Gastiganto Admin/div_25'))

WebUI.delay(1)

WebUI.click(findTestObject('Admin/Gestor/ReservacionNuevoClienteGestor/Page_Gastiganto Admin/svg_Fecha final_mat-datepicker-toggle-defau_e82c5a_1'))

WebUI.delay(1)

WebUI.click(findTestObject('Admin/Gestor/ReservacionNuevoClienteGestor/Page_Gastiganto Admin/div_27'))

WebUI.delay(1)

WebUI.click(findTestObject('Admin/Gestor/ReservacionNuevoClienteGestor/Page_Gastiganto Admin/a_Cantos huspedes'))

WebUI.delay(1)

WebUI.click(findTestObject('Admin/Gestor/ReservacionNuevoClienteGestor/Page_Gastiganto Admin/mat-icon_add_adultos'))

WebUI.delay(1)

WebUI.click(findTestObject('Admin/Gestor/ReservacionNuevoClienteGestor/Page_Gastiganto Admin/mat-icon_add_adultos'))

WebUI.delay(1)

WebUI.click(findTestObject('Admin/Gestor/ReservacionNuevoClienteGestor/Page_Gastiganto Admin/mat-icon_add_adultos'))

WebUI.delay(1)

WebUI.click(findTestObject('Admin/Gestor/ReservacionNuevoClienteGestor/Page_Gastiganto Admin/mat-icon_add_adultos'))

WebUI.delay(1)

WebUI.click(findTestObject('Admin/Gestor/ReservacionNuevoClienteGestor/Page_Gastiganto Admin/span_Consultar disponibilidad'))

WebUI.delay(1)

WebUI.click(findTestObject('Admin/Gestor/ReservacionNuevoClienteGestor/Page_Gastiganto Admin/div_Hospedaje_mat-select-arrow'))

WebUI.delay(5)

WebUI.delay(1)

WebUI.click(findTestObject('Admin/Gestor/ReservacionNuevoClienteGestor/Page_Gastiganto Admin/div_Estatus_mat-select-arrow'))

WebUI.delay(3)

WebUI.click(findTestObject('Admin/Gestor/ReservacionNuevoClienteGestor/Page_Gastiganto Admin/span_Prereservado'))

WebUI.delay(1)

WebUI.click(findTestObject('Admin/Gestor/ReservacionNuevoClienteGestor/Page_Gastiganto Admin/div_Cliente_mat-checkbox-inner-container'))

WebUI.delay(1)

WebUI.setText(findTestObject('Admin/Gestor/ReservacionNuevoClienteGestor/Page_Gastiganto Admin/input_Nuevo cliente_mat-input-12'), 
    'Ricardo')

WebUI.delay(1)

WebUI.setText(findTestObject('Admin/Gestor/ReservacionNuevoClienteGestor/Page_Gastiganto Admin/input_Nombre_mat-input-13'), 
    'Quintero')

WebUI.delay(1)

WebUI.setText(findTestObject('Admin/Gestor/ReservacionNuevoClienteGestor/Page_Gastiganto Admin/input_Apellido paterno_mat-input-14'), 
    'Meza')

WebUI.delay(1)

WebUI.setText(findTestObject('Admin/Gestor/ReservacionNuevoClienteGestor/Page_Gastiganto Admin/input_Apellido materno_mat-input-15'), 
    'ie.practicantes4@gmail.com')

WebUI.delay(1)

WebUI.setText(findTestObject('Admin/Gestor/ReservacionNuevoClienteGestor/Page_Gastiganto Admin/input_Correo electrnico_mat-input-16'), 
    '6677001122')

WebUI.delay(1)

WebUI.setText(findTestObject('Admin/Gestor/ReservacionNuevoClienteGestor/Page_Gastiganto Admin/input_Telfono_mat-input-17'), 
    '000111321123321123')

WebUI.delay(1)

WebUI.click(findTestObject('Admin/Gestor/ReservacionNuevoClienteGestor/Page_Gastiganto Admin/span_Reservar'))

WebUI.delay(5)

