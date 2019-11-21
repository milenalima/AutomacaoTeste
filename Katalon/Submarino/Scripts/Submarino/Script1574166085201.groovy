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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser(null)

WebUI.navigateToUrl('https://www.submarino.com.br')

WebUI.click(findTestObject('txtSearchProduct'))

WebUI.setText(findTestObject('txtSearchProduct'), 'Samsung A50')

WebUI.click(findTestObject('btnSearch'))

WebUI.click(findTestObject('imgProduct'))

WebUI.verifyElementText(findTestObject('txtProductName'), 'Smartphone Samsung Galaxy A50 Android 9.0 Tela 6.4" Octa-Core 128GB 4G Câmera Tripla 25MP + 5MP + 8MP - Preto')

WebUI.click(findTestObject('btnBuyProduct'))

WebUI.click(findTestObject('btnContinue'))

WebUI.verifyElementText(findTestObject('txtMyBasquet'), "Meu carrinho")

WebUI.click(findTestObject('btnContinueToBuy'))

WebUI.click(findTestObject('imgHome'))

WebUI.click(findTestObject('imgBasquetQuantity'))

WebUI.verifyElementText(findTestObject('imgBasquetQuantity'), "1")

WebUI.click(findTestObject('btnMyBasquet'))

WebUI.verifyElementText(findTestObject('txtBasquetProductTitle'), 'Smartphone Samsung Galaxy A50 Android 9.0 Tela 6.4" Octa-Core 128GB 4G Câmera Tripla 25MP + 5MP + 8MP - Preto')

WebUI.closeBrowser()

