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

WebUI.mouseOver(findTestObject('Object Repository/Admin/Plazas/Page_Gastiganto Admin/span_Catlogos'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Admin/Plazas/Page_Gastiganto Admin/span_Plazas'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Admin/Plazas/Page_Gastiganto Admin/input_Plazas_search'), 'Maza')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Admin/Plazas/Page_Gastiganto Admin/div_Elementos por pgina_mat-select-arrow-wrapper'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Admin/Plazas/Page_Gastiganto Admin/span_50'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Admin/Plazas/Page_Gastiganto Admin/div_Elementos por pgina_mat-select-arrow'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Admin/Plazas/Page_Gastiganto Admin/span_100'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Admin/Plazas/Page_Gastiganto Admin/div_PlazasBuscar.Buscar en todos los campos_bcec29'))

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/Admin/Plazas/Page_Gastiganto Admin/input_Plazas_search'), 'altata')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Admin/Plazas/Page_Gastiganto Admin/div_Elementos por pgina_mat-select-arrow'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Admin/Plazas/Page_Gastiganto Admin/span_10'))

WebUI.delay(6)

