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

WebUI.mouseOver(findTestObject('Object Repository/Admin/Propiedad/EditarPropiedad/Page_Gastiganto Admin/span_Catlogos'))

WebUI.click(findTestObject('Object Repository/Admin/Propiedad/EditarPropiedad/Page_Gastiganto Admin/span_Propiedades'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Admin/Propiedad/EditarPropiedad/Page_Gastiganto Admin/input_Nueva propiedad_mat-input-4'), 
    'portico prueba')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Admin/Propiedad/EditarPropiedad/Page_Gastiganto Admin/mat-icon_create'))

WebUI.setText(findTestObject('Object Repository/Admin/Propiedad/EditarPropiedad/Page_Gastiganto Admin/input_Archivos_mat-input-5'), 
    'Portico Prueba Editado')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Admin/Propiedad/EditarPropiedad/Page_Gastiganto Admin/div_Mazatln_mat-select-arrow-wrapper'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Admin/Propiedad/EditarPropiedad/Page_Gastiganto Admin/span_Altata'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Admin/Propiedad/EditarPropiedad/Page_Gastiganto Admin/input_Seleccione un propietario_mat-input-6'), 
    '6677098756')

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Admin/Propiedad/EditarPropiedad/Page_Gastiganto Admin/input_Seleccione una cerradura_mat-input-7'), 
    'Calle1 Editado')

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Admin/Propiedad/EditarPropiedad/Page_Gastiganto Admin/input_Calle_mat-input-8'), 
    'Colonia1 Editado')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Admin/Propiedad/EditarPropiedad/Page_Gastiganto Admin/div_Calle Colonia Nmero exterior Nmero inte_4b8337'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Admin/Propiedad/EditarPropiedad/Page_Gastiganto Admin/input_Colonia_mat-input-9'), 
    '2121')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Admin/Propiedad/EditarPropiedad/Page_Gastiganto Admin/div_Calle Colonia Nmero exterior Nmero inte_4b8337'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Admin/Propiedad/EditarPropiedad/Page_Gastiganto Admin/input_Nmero exterior_mat-input-10'), 
    '21')

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Admin/Propiedad/EditarPropiedad/Page_Gastiganto Admin/input_Nmero interior_mat-input-11'), 
    '80444')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Admin/Propiedad/EditarPropiedad/Page_Gastiganto Admin/div_Editar propiedad RegresarActualizar Inf_68ef14'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Admin/Propiedad/EditarPropiedad/Page_Gastiganto Admin/input_Cdigo postal_mat-input-12'), 
    '5678')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Admin/Propiedad/EditarPropiedad/Page_Gastiganto Admin/div_Latitud Longitud  Tarifa mnima Cantidad_dc389b'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Admin/Propiedad/EditarPropiedad/Page_Gastiganto Admin/div_Latitud Longitud  Tarifa mnima Cantidad_dc389b'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Admin/Propiedad/EditarPropiedad/Page_Gastiganto Admin/input_Latitud_mat-input-13'), 
    '8765')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Admin/Propiedad/EditarPropiedad/Page_Gastiganto Admin/div_Latitud Longitud  Tarifa mnima Cantidad_dc389b'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Admin/Propiedad/EditarPropiedad/Page_Gastiganto Admin/input__mat-input-14'), 
    '3000')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Admin/Propiedad/EditarPropiedad/Page_Gastiganto Admin/div_Cantidad de adultos'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Admin/Propiedad/EditarPropiedad/Page_Gastiganto Admin/input_Tarifa mnima_mat-input-15'), 
    '6')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Admin/Propiedad/EditarPropiedad/Page_Gastiganto Admin/div_Cantidad de nios'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Admin/Propiedad/EditarPropiedad/Page_Gastiganto Admin/input_Cantidad de adultos_mat-input-16'), 
    '2')

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Admin/Propiedad/EditarPropiedad/Page_Gastiganto Admin/textarea_Formato 24 hrs_mat-input-17'), 
    'Terminos y condiciones 1 Editado')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Admin/Propiedad/EditarPropiedad/Page_Gastiganto Admin/i_Imagenes_mat-tab-label-icon fas fa-images_aff498'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Admin/Propiedad/EditarPropiedad/Page_Gastiganto Admin/div_Amenidades'))

WebUI.click(findTestObject('Object Repository/Admin/Propiedad/EditarPropiedad/Page_Gastiganto Admin/span_Bao_mat-expansion-indicator ng-tns-c30_53cae2'))

WebUI.click(findTestObject('Object Repository/Admin/Propiedad/EditarPropiedad/Page_Gastiganto Admin/div_Secador de pelo_mat-checkbox-inner-cont_42d176'))

WebUI.click(findTestObject('Object Repository/Admin/Propiedad/EditarPropiedad/Page_Gastiganto Admin/mat-panel-title_Habitacin y lavandera'))

WebUI.click(findTestObject('Object Repository/Admin/Propiedad/EditarPropiedad/Page_Gastiganto Admin/div_Plancha_mat-checkbox-inner-container ma_aabc91'))

WebUI.click(findTestObject('Object Repository/Admin/Propiedad/EditarPropiedad/Page_Gastiganto Admin/mat-expansion-panel-header_Entretenimiento'))

WebUI.click(findTestObject('Object Repository/Admin/Propiedad/EditarPropiedad/Page_Gastiganto Admin/div_TV_mat-checkbox-inner-container mat-che_3bd11f'))

WebUI.click(findTestObject('Object Repository/Admin/Propiedad/EditarPropiedad/Page_Gastiganto Admin/mat-panel-title_Calefaccin y refrigeracin'))

WebUI.click(findTestObject('Object Repository/Admin/Propiedad/EditarPropiedad/Page_Gastiganto Admin/div_Aire acondicionado_mat-checkbox-inner-c_25a9ce'))

WebUI.click(findTestObject('Object Repository/Admin/Propiedad/EditarPropiedad/Page_Gastiganto Admin/mat-panel-title_Seguridad en el hogar'))

WebUI.click(findTestObject('Object Repository/Admin/Propiedad/EditarPropiedad/Page_Gastiganto Admin/div_Detector de humo_mat-checkbox-inner-con_c84995'))

WebUI.click(findTestObject('Object Repository/Admin/Propiedad/EditarPropiedad/Page_Gastiganto Admin/mat-panel-title_Internet y oficina'))

WebUI.click(findTestObject('Object Repository/Admin/Propiedad/EditarPropiedad/Page_Gastiganto Admin/div_rea para trabajar_mat-checkbox-inner-co_d083cb'))

WebUI.click(findTestObject('Object Repository/Admin/Propiedad/EditarPropiedad/Page_Gastiganto Admin/mat-panel-title_Cocina y comida'))

WebUI.click(findTestObject('Object Repository/Admin/Propiedad/EditarPropiedad/Page_Gastiganto Admin/div_Cocina_mat-checkbox-inner-container mat_5acabf'))

WebUI.click(findTestObject('Object Repository/Admin/Propiedad/EditarPropiedad/Page_Gastiganto Admin/mat-expansion-panel-header_Caractersticas d_800e81'))

WebUI.click(findTestObject('Object Repository/Admin/Propiedad/EditarPropiedad/Page_Gastiganto Admin/div_Entrada privada_mat-checkbox-inner-cont_d7ff30'))

WebUI.click(findTestObject('Object Repository/Admin/Propiedad/EditarPropiedad/Page_Gastiganto Admin/mat-panel-title_Estacionamiento e instalaciones'))

WebUI.click(findTestObject('Object Repository/Admin/Propiedad/EditarPropiedad/Page_Gastiganto Admin/div_Estacionamiento gratuito en las instala_41415d'))

WebUI.click(findTestObject('Object Repository/Admin/Propiedad/EditarPropiedad/Page_Gastiganto Admin/mat-panel-title_Servicios'))

WebUI.click(findTestObject('Object Repository/Admin/Propiedad/EditarPropiedad/Page_Gastiganto Admin/div_Llegada por cuenta propia_mat-checkbox-_7af4ce'))

WebUI.click(findTestObject('Object Repository/Admin/Propiedad/EditarPropiedad/Page_Gastiganto Admin/div_Se admiten mascotas_mat-checkbox-inner-_7f36d1'))

WebUI.click(findTestObject('Object Repository/Admin/Propiedad/EditarPropiedad/Page_Gastiganto Admin/mat-panel-title_No incluidos'))

WebUI.click(findTestObject('Object Repository/Admin/Propiedad/EditarPropiedad/Page_Gastiganto Admin/div_Lavadora_mat-checkbox-inner-container m_133ebc'))

WebUI.click(findTestObject('Object Repository/Admin/Propiedad/EditarPropiedad/Page_Gastiganto Admin/div_Archivos'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Admin/Propiedad/EditarPropiedad/Page_Gastiganto Admin/mat-icon_close'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Admin/Propiedad/EditarPropiedad/Page_Gastiganto Admin/label_CLICK PARA SELECCIONAR EL ARCHIVO'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Admin/Propiedad/EditarPropiedad/Page_Gastiganto Admin/label_CLICK PARA SELECCIONAR EL ARCHIVO'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Admin/Propiedad/EditarPropiedad/Page_Gastiganto Admin/label_CLICK PARA SELECCIONAR EL ARCHIVO'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Admin/Propiedad/EditarPropiedad/Page_Gastiganto Admin/div_Mostrar en_mat-select-arrow'))

WebUI.click(findTestObject('Object Repository/Admin/Propiedad/EditarPropiedad/Page_Gastiganto Admin/span_pre-reservado'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Admin/Propiedad/EditarPropiedad/Page_Gastiganto Admin/div_Mostrar en_mat-select-arrow_1'))

WebUI.click(findTestObject('Object Repository/Admin/Propiedad/EditarPropiedad/Page_Gastiganto Admin/span_reservado'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Admin/Propiedad/EditarPropiedad/Page_Gastiganto Admin/div_Mostrar en_mat-select-arrow_1_2'))

WebUI.click(findTestObject('Object Repository/Admin/Propiedad/EditarPropiedad/Page_Gastiganto Admin/span_cancelado'))

WebUI.delay(2)

WebUI.click(findTestObject('Admin/Propiedad/EditarPropiedad/Page_Gastiganto Admin/span_Actualizar'))

WebUI.delay(5)

