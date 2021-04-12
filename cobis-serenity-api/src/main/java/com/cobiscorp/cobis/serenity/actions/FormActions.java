package com.cobiscorp.cobis.serenity.actions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.ScrollToTarget;
import net.serenitybdd.screenplay.targets.Target;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import java.util.List;
import org.openqa.selenium.By;
import com.cobiscorp.cobis.utils.controls.IAccordion;
import com.cobiscorp.cobis.utils.controls.IComboBox;
import com.cobiscorp.cobis.utils.controls.IControl;
import com.cobiscorp.cobis.utils.controls.IDatePicker;
import com.cobiscorp.cobis.utils.controls.IDateTimePicker;
import com.cobiscorp.cobis.utils.controls.IDropDownList;
import com.cobiscorp.cobis.utils.controls.ILayout;
import com.cobiscorp.cobis.utils.controls.IMultiSelect;
import com.cobiscorp.cobis.utils.controls.IRadioButtonList;
import com.cobiscorp.cobis.utils.controls.ISelectBased;
import com.cobiscorp.cobis.utils.controls.ISingleSelectBased;
import com.cobiscorp.cobis.utils.controls.ITab;
import com.cobiscorp.cobis.utils.controls.ITimePicker;
import com.cobiscorp.cobis.utils.controls.IVerticalTab;
import com.cobiscorp.cobis.utils.events.IDigitable;

public class FormActions extends BaseActions{

	/**
	 * Setea el valor de un combobox por id.
	 *
	 * @param iSelectBased elemento a interactuar
	 * @param value valor a colocar
	 */
	public static void selectById(ISelectBased iSelectBased, String value) {
		ContainerActions.waitUntilCharge();
		String script = "";
		if (iSelectBased instanceof IComboBox) {
			script = "var comboBox = $('#" + iSelectBased.getId() + "').data('kendoExtComboBox') || $('#"
					+ iSelectBased.getId() + "').data('kendoComboBox'); comboBox.value('" + value
					+ "'); comboBox.trigger('change');";
		} else if (iSelectBased instanceof IDropDownList) {
			script = "var selectElement = $('#" + iSelectBased.getId()
					+ "').data('kendoExtDropDownList'); selectElement.value('" + value
					+ "'); selectElement.trigger('change');";
		} else if (iSelectBased instanceof IMultiSelect) {
			String[] valuesArray = value != null ? value.split(",") : new String[] {};
			String values = "'" + String.join("','", valuesArray) + "'";
			script = "var element = $('#" + iSelectBased.getId()
					+ "').data('kendoExtComboMultiSelect'); element.value([" + values + "]);";
		}
		ContainerActions.evaluateJavascriptWithTarget(iSelectBased, script, "coloca el valor: " + value  );
	}

	/**
	 * Setea el texto del select por texto.
	 *
	 * @param iSelectBased elemento a interactuar
	 * @param text texto a colocar.
	 */
	public static void selectByText(ISingleSelectBased iSingleSelectBased, String text) {
		ContainerActions.waitUntilCharge();
		String script = "";
		 if (iSingleSelectBased instanceof IComboBox) {
				Target target = Target.the("Text Button - " + iSingleSelectBased.getId()).located(By.xpath("//span[@aria-controls='"+ iSingleSelectBased.getId() +"_listbox']"));
				Target target2 = Target.the("Text Button - " + iSingleSelectBased.getId()).located(By.xpath("//ul[@id='"+ iSingleSelectBased.getId() +"_listbox']//li[contains(.,'" + text+ "')]"));
				ContainerActions.waitUntilCharge();
				BaseActions.clickOn(target);
				ContainerActions.waitUntilCharge();
				BaseActions.clickOn(target2);
				ContainerActions.waitUntilCharge();
				}else if(iSingleSelectBased instanceof IDropDownList){
				 script ="var selectElement = $('#" + iSingleSelectBased.getId() + "').data('kendoExtDropDownList'); selectElement.text('" + text
						+ "'); selectElement.trigger('change');";
		 }
		 ContainerActions.evaluateJavascriptWithTarget(iSingleSelectBased, script, "Coloca el valor: "+ text );
	}
	
	/**
	 * Selecciona un elemento por indice.
	 *
	 * @param iSelectBased elemento a interactuar
	 * @param index indice a seleccionar
	 */
	public static void selectByIndex(IDropDownList idropDownList, int index) {
		ContainerActions.waitUntilCharge();
		String script = "var selectElement = $('#" + idropDownList.getId()
					+ "').data('kendoExtDropDownList'); selectElement.select('" + index
					+ "'); selectElement.trigger('change');";
		ContainerActions.evaluateJavascriptWithTarget(idropDownList, script, "Selecciona elemento por index: "+ index);
	}
	
	/**
	 * Presiona el boton contenido en el textobox.
	 *
	 * @param id identificador del elemento.
	 */
	public static void clickTextButton(IDigitable control) {
		Target target = Target.the("Text Button - " + control.getId()).located(By.xpath("//input[@id='" + control.getId() + "']//parent::div//*[@type='button']"));
		ContainerActions.clickOn(target);
	}
	
	/**
	 * Coloca una fecha dado el id.
	 *
	 * @param iDatePicker identificador del elemento.
	 * @param day dia a colocar.
	 * @param month mes a colocar.
	 * @param year año a colocar.
	 */
	public static void setDateById(IDatePicker iDatePicker, String day, String month, String year) {
		ContainerActions.enterText(iDatePicker, day + "/" + month + "/" + year);
	}
	
	/**
	 * Ingreso de fecha y hora por texto, formato DD/MM/YYYY HH:MM.
	 *
	 * @param dateTimePicker elemento a interactuar
	 * @param day dia a ingresar
	 * @param month mes a ingresar
	 * @param year año a ingresar
	 * @param hour hora a ingresar
	 * @param minute minuto a ingresar
	 */
	public static void setDateTimeByText(IDateTimePicker dateTimePicker, String day, String month, String year, String hour, String minute) {
		ContainerActions.enterText(dateTimePicker, day + "/" + month + "/" + year +" "+ hour + ":" + minute);
	}
	
	/**
	 * Ingreso de hora por texto, formato HH:MM.
	 *
	 * @param iTimePicker elemento a interactuar
	 * @param hour hora a ingresar
	 * @param minute minuto a ingresar
	 */
	public static void setTimeByText(ITimePicker iTimePicker, String hour, String minute) {
		ContainerActions.enterText(iTimePicker, hour + ":" + minute);
	}
	
	/**
	 * Hace click en el tab especificado.
	 *
	 * @param ITab Identificador del tab
	 */

	public static void clickLayout(ILayout iLayout) {
		if (iLayout instanceof ITab || iLayout instanceof IVerticalTab) {
			scrollToBeginingOfThePage();
			Target tabTarget = Target.the("Tab - " + iLayout.getId())
					.located(By.xpath("//li[@id='" + iLayout.getId() + "_tab']"));
			ContainerActions.clickOn(tabTarget);
		} else if (iLayout instanceof IAccordion || iLayout instanceof IAccordion  ) {
			scrollToBeginingOfThePage();
			String xpath = "//li[@id='" + iLayout.getId()
					+ "']//span[contains(@class,'k-panelbar-expand') or contains(@class,'k-panelbar-collapse')]";
			Target target = Target.the("IAccordion - " + iLayout.getId()).located(By.xpath(xpath));
			ContainerActions.clickOn(target);
		}
	}
	
	/**
	 * Obtiene el valor del checkbox
	 * 
	 * @param id del elemento
	 * @return true si esta seleccionado y false si no esta seleccionado	
	 */
	public static boolean getValue(String id) {
		String clases = BrowseTheWeb.as(theActorInTheSpotlight()).$(By.id(id)).getAttribute("class");
		if (clases.contains("k-valid"))
			return true;
		return false;
	}
	
	/**
	 * Hace un scroll hacia el inicio de la pagina
	 *
	 */
	public static void scrollToBeginingOfThePage() {
		String script ="window.scrollTo({ top: 0});";
		ContainerActions.evaluateJavascript("Pagina actual", script, "Scroll al inicio de la pagina");
	}

	/**
	 * Hace un scroll hacia el final de la pagina
	 *
	 */
	public static void scrollTotheEndOfThePage() {
		String script ="window.scrollTo(0,document.body.scrollHeight);";
		ContainerActions.evaluateJavascript("Pagina actual", script, "Scroll al final de la pagina");
	}

	/**
	 * Ingreso de la direccion del archivo por texto
	 *
	 * @param id del elemento
	 * @param text texto a ingresar
	 */
	public static void setFileText(IControl control, String text) {
		ContainerActions.evaluateJavascriptWithTarget(control, "var element = $('#" + control.getId()
				+ "').data('kendoUpload'); element.upload();", "subir archivo en ");
	}
	
	
	/**
	 * Selecciona el valor deseado del elemento por id.
	 *
	 * @param id identificador del elemento.
	 * @param value valor a seleccionar.
	 */
	public static void clickByValue(IRadioButtonList iRadioButtonList, String value) {
		List<WebElementFacade> radioButtons = BrowseTheWeb.as(theActorInTheSpotlight()).$$(By.xpath("//input[@type='radio' and contains(@id,'" + iRadioButtonList.getId() + "')]"));
		for (WebElementFacade webElement : radioButtons) {
			if (value.equalsIgnoreCase(webElement.getAttribute("value"))) {
				BaseActions.clickOn(webElement, iRadioButtonList);
				break;
			}
		}
	}
	
	/**
	 * Permite validar si el control esta deshabilitado por id.
	 *
	 * @param id identificador del elemento.
	 * @return true, si el elemento tiene la propiedad disabled
	 */
	public static boolean checkRadioButtonIsDisabled(IRadioButtonList iRadioButtonList) {
		boolean result = false;
		List<WebElementFacade> radioButtons = 
				BrowseTheWeb.as(theActorInTheSpotlight()).$$(By.xpath("//input[@type='radio' and contains(@id,'" + iRadioButtonList.getId() + "')]"));
		for (WebElementFacade webElement : radioButtons) {
			String disabled = webElement.getAttribute("disabled");
			if (disabled != null && disabled.equals("true")) {
				result = true;
				break;
			}			
		}
		return result;
		
	}
	
	/**
	 * Permite validar si el control es válido por id.
	 *
	 * @param id identificador del elemento.
	 * @return true, si el elemento tiene la clase k-invalid
	 */
	public static boolean checkRadioButtonIsValid(String id) {
		boolean result = false;
		List<WebElementFacade> radioButtons = 
				BrowseTheWeb.as(theActorInTheSpotlight()).$$(By.xpath("//input[@type='radio' and contains(@id,'" + id + "')]"));
		for (WebElementFacade webElement : radioButtons) {
			String isValid = webElement.getAttribute("class");
			if (isValid != null && isValid.contains("k-invalid")) {
				result = true;
				break;
			}			
		}
		return result;
		
	}
	
	public static void searchDate(IDatePicker iDatePicker, String day, String month, String year) {
		String date = year + "/" + month + "/" + day;
		WebElementFacade datePicker =  BrowseTheWeb.as(theActorInTheSpotlight()).$(By.id(iDatePicker.getId()));
//		WebElementFacade spanDate = datePicker.findElement(By.xpath("//parent::span[@class='k-picker-wrap k-state-default']"));
//		spanDate.findElement(By.xpath(".//span[@role='button']")).click();
//		List<WebElement> sections=findElementUsingWait(By.id(id+"_dateview")).findElements(By.tagName("td"));
//		for (WebElement section : sections) {
//			if (section.findElement(By.tagName("a")).getAttribute("data-value").equals(date)) {
//				section.findElement(By.tagName("a")).click();
//				break;
//			}
//		}
	}
	
	private static class Header{
		/**
		 * Hace click en el boton de busqueda.
		 *
		 */
		public static void clickSearch() {
			Target target = Target.the("Search Button ").located(By.id("HVA_VABUTTON_SEARCH"));
			ContainerActions.clickOn(target);
		}
		
		/**
		 * Hace click en el icono de informacion adicional.
		 *
		 */
		public static void getAditionalInfo() {
			Target target = Target.the("Aditional Info Button").located(By.id("HVA_VABUTTON_MOREINFO"));
			ContainerActions.clickOn(target);
		}
		
		/**
		 * Selecciona una opcion de la lista de acciones por texto.
		 *
		 * @param text texto del elemento que se quiere seleccionar.
		 */
		public static void clickActionByText(String text) {
			Target target = Target.the("Boton Accion").located(By.id("HVA_VABUTTON_ACTIONS"));
			ContainerActions.clickOn(target);
			List<WebElementFacade> list = BrowseTheWeb.as(theActorInTheSpotlight()).$$(By.xpath("//a[contains(@id,'HVA_ACTIONS')]"));
			for (WebElementFacade item : list) {
				if (item.getText().contains(text)) {
					ContainerActions.clickOn(item,"Acción " + text);
					break;
				}
			}
		}
		
		/**
		 * Selecciona una opcion de la lista de acciones por identificador.
		 *
		 * @param id identificador del elemento a seleccionar.
		 */
		public static void clickActionById(String id) {
			Target target = Target.the("Boton Accion").located(By.id("HVA_VABUTTON_ACTIONS"));
			Target target2 = Target.the("Boton Accion").located(By.id(id));
			ContainerActions.clickOn(target);
			ContainerActions.clickOn(target2);
			
		}
		
		protected static WebElementFacade getCurrentModal() {
			List<WebElementFacade> popups = BrowseTheWeb.as(theActorInTheSpotlight()).$$(By.xpath("//div[contains(@class,'k-widget k-window')]"));
			if(popups != null && !popups.isEmpty()) {
				return popups.get(popups.size()-1);
			}
			return null;
		}
		
		public static void clickButtonAccept() {
			WebElementFacade popupWin = getCurrentModal();
			if (popupWin != null) {
				ContainerActions.clickOn(popupWin.find(By.className("btn-primary")) ,"Boton Aceptar");
			}
		}

		public static void clickButtonCancel() {
			WebElementFacade popupWin = getCurrentModal();
			if (popupWin != null) {
				ContainerActions.clickOn(popupWin.find(By.className("btn-default")) ,"Boton Aceptar");
			}
		}
		
		/**
		 * Hace click en el boton de aceptar al aparecer un modal.
		 *
		 */
		public static void clickActionAccept() {
			ContainerActions.switchToActiveElement();
			clickButtonAccept();
		}
		
		/**
		 * Hace click en el boton de cancelar al aparecer un modal.
		 *
		 */
		public static void clickActionCancel() {
			ContainerActions.switchToActiveElement();
			clickButtonCancel();
		}
		
		/**
		 * Obtiene el texto de la seccion Secundario1.
		 * @return String, texto del elemento requerido.
		 */
		public static Target getSecundary1() {
			Target target = Target.the("Secundary1").located(By.id("HVA_SECUNDARYSECOND"));
			return target;
		}
		
		/**
		 * Obtiene el texto de la seccion Secundario2.
		 * @return String, texto del elemento requerido.
		 */
		public static Target getSecundary2() {
			Target target = Target.the("Secundary2").located(By.id("HVA_SECUNDARYSECOND"));
			return target;
		}
		
		/**
		 * Obtiene el texto de la seccion Primario1.
		 * @return Target, texto del elemento requerido.
		 */
		public static Target getPrimary1() {
			Target target = Target.the("Primary1").located(By.id("HVA_PRIMARYFIRST"));
			return target;
		}
		
		/**
		 * Obtiene el texto de la seccion Primario2.
		 * @return Target, texto del elemento requerido.
		 */
		public static Target getPrimary2() {
			Target target = Target.the("Primary2").located(By.id("HVA_PRIMARYSECOND"));
			return target;
		}
		
		/**
		 * Obtiene el texto correspondiente al Name de la seccion Info en orden acendente empezando desde 0.
		 *
		 * @param order indice del elemento del que se quiere obtener el texto empezando desde 0.
		 * @return String, texto del elemento requerido.
		 */
		public static Target getInfoName(int order) {
			Target target = Target.the("InfoName").located(By.id("HVA_INFOLABEL_"+order));
			return target;
		}
		
		/**
		 * Obtiene el texto correspondiente al Value de la seccion Info en orden acendente empezando desde 0.
		 *
		 * @param order indice del elemento del que se quiere obtener el texto empezando desde 0.
		 * @return String, texto del elemento requerido.
		 */
		public static Target getInfoValue(int order) {
			Target target = Target.the("InfoValue").located(By.id("HVA_INFOATTRIBUTE_"+order));
			return target;
		}
			
	}
	
}