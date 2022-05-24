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

WebUI.mouseOver(findTestObject('Object Repository/Admin/Tarifa/Page_Gastiganto Admin/span_Catlogos'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Admin/Tarifa/Page_Gastiganto Admin/span_Tarifas'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Admin/Tarifa/Page_Gastiganto Admin/input_Nueva tarifa_mat-input-4'), 'maza')

WebUI.delay(1)

WebUI.sendKeys(findTestObject('Object Repository/Admin/Tarifa/Page_Gastiganto Admin/input_Nueva tarifa_mat-input-4'), Keys.chord(
        Keys.ENTER))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Admin/Tarifa/Page_Gastiganto Admin/div_Elementos por pgina_mat-select-arrow-wrapper'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Admin/Tarifa/Page_Gastiganto Admin/span_50'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Admin/Tarifa/Page_Gastiganto Admin/span_Nueva tarifa'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Admin/Tarifa/Page_Gastiganto Admin/input_Informacin bsica_mat-input-5'), 
    'tarifa 1')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Admin/Tarifa/Page_Gastiganto Admin/svg_Fecha de inicio_mat-datepicker-toggle-d_7da320'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Admin/Tarifa/Page_Gastiganto Admin/div_4'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Admin/Tarifa/Page_Gastiganto Admin/svg_Fecha de fin_mat-datepicker-toggle-defa_c9da5c'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Admin/Tarifa/Page_Gastiganto Admin/div_30'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Admin/Tarifa/Page_Gastiganto Admin/div_Seleccione una plaza_mat-select-arrow'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Admin/Tarifa/Page_Gastiganto Admin/span_Altata'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Admin/Tarifa/Page_Gastiganto Admin/div_Seleccione una plaza_mat-checkbox-inner_e2a3bb'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Admin/Tarifa/Page_Gastiganto Admin/button_Limpiar campos'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Admin/Tarifa/Page_Gastiganto Admin/input_Informacin bsica_mat-input-5'), 
    'tarifa 1')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Admin/Tarifa/Page_Gastiganto Admin/svg_Fecha de inicio_mat-datepicker-toggle-d_7da320'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Admin/Tarifa/Page_Gastiganto Admin/div_4'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Admin/Tarifa/Page_Gastiganto Admin/svg_Fecha de fin_mat-datepicker-toggle-defa_c9da5c'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Admin/Tarifa/Page_Gastiganto Admin/div_30'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Admin/Tarifa/Page_Gastiganto Admin/div_Seleccione una plaza_mat-select-arrow'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Admin/Tarifa/Page_Gastiganto Admin/span_Mazatln'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Admin/Tarifa/Page_Gastiganto Admin/div_Mazatln_mat-select-arrow-wrapper'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Admin/Tarifa/Page_Gastiganto Admin/span_Mazatln'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Admin/Tarifa/Page_Gastiganto Admin/div_Seleccione una plaza_mat-checkbox-inner_e2a3bb'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Admin/Tarifa/Page_Gastiganto Admin/button_Guardar'))

WebUI.delay(6)

