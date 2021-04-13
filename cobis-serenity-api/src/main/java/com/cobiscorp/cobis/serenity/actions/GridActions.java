package com.cobiscorp.cobis.serenity.actions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import com.cobiscorp.cobis.utils.controls.IGrid;
import com.cobiscorp.cobis.utils.events.IClickable;

public class GridActions {

	/**
	 * Selecciona una fila dado un indice.
	 *
	 * @param grid  Elemento a seleccionar.
	 * @param rowIndex indice a seleccionar.
	 */
	public static void selectRecord(IGrid grid, int rowIndex) {
		BaseActions.waitUntilCharge();
		Target rowByIndex = Target.the("Grid" + grid.getId() + "- Row by index" + rowIndex)
				.located(By.xpath("//div[@id='" + grid.getId() + "']//table/tbody/tr[" + rowIndex + "]"));
		ContainerActions.clickOn(rowByIndex);
	}

	/**
	 * Hace click en el boton de nuevo registro.
	 *
	 * @param grid Elemento a seleccionar.
	 */
	public static void clickNewRecord(IGrid grid) {
		try{
			BaseActions.waitUntilCharge();
			WebElementFacade iGridButton = BrowseTheWeb.as(theActorInTheSpotlight()).$(By.id(grid.getId())).find(By.xpath(".//button[contains(@class,'k-grid-add')]"));
			ContainerActions.clickOn(iGridButton, grid);
		}catch(NoSuchElementException ex) {
			Target newRecordByIndex = Target.the("Grid" + grid.getId() + "- newRecordByIndex")
					.located(By.id(grid.getId() + "_CUSTOM_CREATE"));
			ContainerActions.clickOn(newRecordByIndex);
		}
	}
	
	/**
	 * Selecciona un elemento dentro del grid por id.
	 *
	 * @param grid Elemento a seleccionar.
	 * @param command identificador del elemento a seleccionar dentro del grid.
	 */
	public static void clickCommand(IGrid grid, IClickable command) {
		BaseActions.waitUntilCharge();
		Target exportExcel = Target.the("Grid" + grid.getId() + " - " + command.getId()).located(By.xpath("//div[@id='"
				+ grid.getId() + "']//button[@id='"+command.getId()+"']"));
		ContainerActions.clickOn(exportExcel);
	}

	/**
	 * Click en el boton para exportar en Excel
	 * Advertencia, por el momento este metodo funciona unicamente si el navegador no levanta
	 * un cuadro de dialogo para confirmar una descarga.
	 *
	 * @param grid Elemento a seleccionar.
	 */
	public static void clickExportExcel(IGrid grid) {
		//las siguientes instrucciones funcionan si el navegador no levanta un cuadro de dialogo para confirmar una descarga.
		BaseActions.waitUntilCharge();
		Target exportExcel = Target.the("Grid" + grid.getId() + "- exportExcel").located(By.xpath("//div[@id='"
				+ grid.getId() + "']//button[contains(@ng-click,'saveAsExcel')]"));
		ContainerActions.clickOn(exportExcel);
	}
	
	/**
	 * Click en el boton para exportar en PDF
	 * Advertencia, por el momento este metodo funciona unicamente si el navegador no levanta
	 * un cuadro de dialogo para confirmar una descarga.
	 *
	 * @param grid Elemento a seleccionar.
	 */
	public static void clickExportPDF(IGrid grid) {
		//las siguientes instrucciones funcionan si el navegador no levanta un cuadro de dialogo para confirmar una descarga.
		BaseActions.waitUntilCharge();
		Target exportPDF = Target.the("Grid" + grid.getId() + "- exportPDF").located(By.xpath("//div[@id='"
				+ grid.getId() + "']//button[contains(@ng-click,'exportGridToPdf')]"));
		ContainerActions.clickOn(exportPDF);
	}
	
	/**
	 * Hace click en el boton de modificar registro por indice.
	 *
	 * @param grid Elemento a seleccionar.
	 * @param rowIndex indice en el que se requiere hacer click en el boton.
	 */
	public static void clickEditRecord(IGrid grid, int rowIndex) {
		BaseActions.waitUntilCharge();
		try {
			WebElementFacade iGridButton = BrowseTheWeb.as(theActorInTheSpotlight()).$(By.id(grid.getId()))
					.find(By.xpath("/tr[" + rowIndex + "]//a[contains(@data-ng-click,'customEdit')]"));
		ContainerActions.clickOn(iGridButton, grid);
		} catch (NoSuchElementException ex) {
			Target modifyRecordByIndex = Target.the("ModifyRecordByIndex" + grid.getId() + " - " + rowIndex)
					.located(By.xpath("//div[@id='" + grid.getId() + "']//table/tbody/tr[" + rowIndex
							+ "]//a[contains(@data-ng-click,'customEdit')]"));
			ContainerActions.clickOn(modifyRecordByIndex);
		}
	}

	/**
	 * Seleccionar el boton de aceptar en el grid.
	 *
	 * @param grid Elemento a seleccionar.
	 * @param rowIndex indice en el que se requiere hacer click en el boton.
	 */
	public static void clickAcceptRecord(IGrid grid, int rowIndex) {
		Target acceptNewRecord = Target.the("Grid" + grid.getId() + "- acceptNewRecord").located(By.xpath("//div[@id='"
				+ grid.getId() + "']//table/tbody/tr[" + rowIndex + "]//a[contains(@class,'k-grid-update')]"));
		ContainerActions.clickOn(acceptNewRecord);
	}

	/**
	 * Seleccionar el boton de cancelar en el grid.
	 *
	 * @param grid Elemento a seleccionar.
	 * @param rowIndex indice en el que se requiere hacer click en el boton.
	 */
	public static void clickCancelRecord(IGrid grid, int rowIndex) {
		Target cancelRecord = Target.the("Grid" + grid.getId() + "- cancelRecord").located(By.xpath("//div[@id='"
				+ grid.getId() + "']//table/tbody/tr[" + rowIndex + "]//a[contains(@class,'k-grid-cancel')]"));
		ContainerActions.clickOn(cancelRecord);
	}

	/**
	 * Hace click en botón de eliminado de fila en la grilla.
	 *
	 * @param grid Elemento a seleccionar.
	 * @param index el número de la fila de la grilla. Empieza desde uno.
	 */
	public static void clickDeleteRecord(IGrid grid, int rowIndex) {
		Target deleteRow = Target.the("Grid" + grid.getId() + "- deleteRow")
				.located(By.xpath("//div[@id='" + grid.getId() + "']//table/tbody/tr[" + rowIndex
						+ "]/td[contains(@class,'btn-toolbar')]/a[@title='Eliminar' or @title='Delete']"));
		ContainerActions.clickOn(deleteRow);
	}

	/**
	 * Selecciona el boton de confirmar o cancelar de eliminar registro.
	 *
	 * @param accept si es true, se confirma la eliminacion.
	 * @throws InterruptedException si no se encuentra ningun elemento a seleccionar.
	 */
	public static void clickConfirmDelete(boolean accept) throws InterruptedException {
		String xpath;

		if (accept) {
			xpath = "//*[contains(@class,'messages-prompt-close') and contains(@class,'btn-primary')]";
		} else {
			xpath = "//*[contains(@class,'messages-prompt-close') and contains(@class,'btn-default')]";
		}
		
		Target expandDetailRow = Target.the("Confirm Delete").located(By.xpath(xpath));
		ContainerActions.clickOn(expandDetailRow);
	}
	
	/**
	 * Desplazar a la izquierda.
	 *
	 * @param gridId identificador del elemento.
	 */
	public static void scrollToLeft(String gridId) {
		WebElementFacade element = BrowseTheWeb.as(theActorInTheSpotlight()).$(By.id(gridId)).find(By.className("k-grid-content"));
		BrowseTheWeb.as(theActorInTheSpotlight()).evaluateJavascript("arguments[0].scrollLeft = 0", new Object[] { element });
	}

	/**
	 * Desplazar a la derecha.
	 *
	 * @param gridId identificador del elemento.
	 */
	public static void scrollToRight(String gridId) {
		WebElementFacade element = BrowseTheWeb.as(theActorInTheSpotlight()).$(By.id(gridId)).find(By.className("k-grid-content"));
		BrowseTheWeb.as(theActorInTheSpotlight()).evaluateJavascript("arguments[0].scrollLeft = arguments[0].offsetWidth", new Object[] { element });
	}
	
	/**
	 * Desplazar hacia arriba
	 *
	 * @param gridId identificador del elemento.
	 */
	public static void scrollToInit(String gridId) {
		WebElementFacade element = BrowseTheWeb.as(theActorInTheSpotlight()).$(By.id(gridId)).find(By.className("k-grid-content"));
		BrowseTheWeb.as(theActorInTheSpotlight()).evaluateJavascript("arguments[0].scrollTop  = 0", new Object[] { element });
	}
	
	/**
	 * Desplazar hacia abajo
	 *
	 * @param gridId identificador del elemento.
	 */
	public static void scrollToEnd(String gridId) {
		WebElementFacade element = BrowseTheWeb.as(theActorInTheSpotlight()).$(By.id(gridId)).find(By.className("k-grid-content"));
		BrowseTheWeb.as(theActorInTheSpotlight()).evaluateJavascript("arguments[0].scrollTop  = arguments[0].offsetHeight", new Object[] { element });
	}


	/**
	 * Selecciona el boton de ver detalle.
	 *
	 * @param grid Elemento a seleccionar.
	 * @param rowIndex fila en la que se encuentra el boton.
	 */
	public static void clickDetailRecord(IGrid grid, int rowIndex) {
		Target expandDetailRow = Target.the("Grid" + grid.getId() + "- expandDetailRow").located(By.xpath("//div[@id='"
				+ grid.getId() + "']//table/tbody/tr[" + rowIndex + "]//a[contains(@class,'k-i-expand')]"));
		ContainerActions.clickOn(expandDetailRow);
	}

	/**
	 * Selecciona el boton de cerrar detalle.
	 *
	 * @param grid Elemento a seleccionar.
	 * @param rowIndex fila en la que se encuentra el boton.
	 */
	public static void clickCloseDetailRecord(IGrid grid, int rowIndex) {
		Target collapseDetailRow = Target.the("Grid" + grid.getId() + "- collapseDetailRow")
				.located(By.xpath("//div[@id='" + grid.getId() + "']//table/tbody/tr[" + rowIndex
						+ "]//a[contains(@class,'k-i-collapse')]"));
		ContainerActions.clickOn(collapseDetailRow);
	}

	/**
	 * Otiene el texto dentro del grid dado una fila y columna.
	 *
	 * @param grid identificador del elemento.
	 * @param row numero de fila.
	 * @param column numero de columna.
	 * @return target elemento a validar
	 */
	public static Target getTargetByRowAndColumn(IGrid grid, int rowIndex, int column) {
	Target target = Target.the("Grid: " + grid.getId() + "- target de texto por fila y columna").located(By.xpath("//div[@id='"
				+ grid.getId() + "']//table/tbody/tr[" + rowIndex + "]//td[" + column + "]"));
		return target;
	}

	/**
	 * Selecciona un boton en la cabecera dado el texto.
	 *
	 * @param grid Elemento a seleccionar.
	 * @param text texto correspondiente al boton a seleccionar.
	 */
	public static void clickButtonHeaderByText(IGrid grid, String text) {
		BaseActions.waitUntilCharge();
		List<WebElementFacade> buttons = BrowseTheWeb.as(theActorInTheSpotlight())
				.$$(By.xpath("//div[@id='" + grid.getId() + "']//div[contains(@class,'k-header')]//button"));
		for (WebElementFacade button : buttons) {
			if (button.getText().contains(text))
				ContainerActions.clickOn(button, grid);
		}
	}

	/**
	 * Selecciona un link dado la fila y texto.
	 *
	 * @param grid Elemento a seleccionar.
	 * @param row fila que contiene el link.
	 * @param text texto correspondiente al link a seleccionar.
	 */
	public static void clickLinkOnIndexByText(IGrid grid, int row, String text) {
		BaseActions.waitUntilCharge();
		List<WebElementFacade> links = BrowseTheWeb.as(theActorInTheSpotlight())
		.$$(By.xpath("//div[@id='" + grid.getId() + "']//tbody//tr["+ row +"]//a"));
		
		for (WebElementFacade link : links) {
			if (link.getText().contains(text))
				ContainerActions.clickOn(link, grid);
		}
	}

	/**
	 * Selecciona un link dado la fila y href
	 *
	 * @param grid identificador del elemento
	 * @param row fila que contiene el link
	 * @param href href perteneciente al link que se quiere seleccionar.
	 */
	public static void clickLinkOnIndexByHref(IGrid grid, int row, String href) {
		BaseActions.waitUntilCharge();
		Target collapseDetailRow = Target.the("Grid" + grid.getId() + "- collapseDetailRow")
				.located(By.xpath("//div[@id='" + grid.getId() + "']//tbody//tr["+ row+"].//a[href='" + href + "']"));
		ContainerActions.clickOn(collapseDetailRow);
	}
	
	/**
	 * Cambiar el tamaño de la columna.
	 *
	 * @param IGrid elemento a identificar.
	 * @param columnIndex identificador de la columna.
	 * @param pixelSize tamaño en pixeles a cambiar.
	 */
	public static void resizeColumnByIndex(IGrid IGrid, int columnIndex, int pixelSize) {
		BaseActions.waitUntilCharge();
		WebElementFacade column = BrowseTheWeb.as(theActorInTheSpotlight()).$(By.id(IGrid.getId())).thenFindAll(By.className("th")).get(columnIndex);
		BrowseTheWeb.as(theActorInTheSpotlight()).withAction().moveToElement(column);
		WebElementFacade resize = BrowseTheWeb.as(theActorInTheSpotlight()).$(By.id(IGrid.getId())).find(By.className("k-resize-handle-inner"));
		BrowseTheWeb.as(theActorInTheSpotlight()).withAction().moveToElement(resize);
		BrowseTheWeb.as(theActorInTheSpotlight()).withAction().clickAndHold(resize);
		BrowseTheWeb.as(theActorInTheSpotlight()).withAction().moveByOffset(pixelSize, 0);
		BrowseTheWeb.as(theActorInTheSpotlight()).withAction().release();
	}
	
	
	/**
 * Selecciona un elemento del grid dado una columna y texto por id.
 *
 * @param iGrid identificador del elemento.
 * @param column columna a seleccionar.
 * @param text texto que contiene el elemento a seleccionar.
 */
public static void selectRecordByColumnAndText(IGrid iGrid, int column, String text) {
	final int originalColumn = column;
	column++;
	List<WebElementFacade> rows =  BrowseTheWeb.as(theActorInTheSpotlight()).$(By.id(iGrid.getId())).thenFindAll(By.cssSelector("tbody > tr"));

	if (!rows.isEmpty()) {
		WebElementFacade row = null;
		for (WebElementFacade rowAux : rows) {
			if (text.equals(rowAux.findElement(By.cssSelector("td:nth-of-type(" + column + ")")).getText())) {
				row = rowAux;
				break;
			}
		}
		if (row != null) {
			ContainerActions.clickOn(row, iGrid);
		}
	}
}

/**
 * Hace click en el boton de modificar registro por columna y texto.
 *
 * @param grid identificador del elemento.
 * @param column columna que contiene el boton a seleccionar.
 * @param text texto perteneciente al elemento donde se quiere seleccionar el boton.
 */
public static void clickEditRecordByColumnAndText(IGrid grid, final int column, String text) {
	int columnT = column;
	columnT++;
	List<WebElementFacade> rows = BrowseTheWeb.as(theActorInTheSpotlight()).$(By.id(grid.getId())).thenFindAll(By.cssSelector("tbody > tr"));
	if (!rows.isEmpty()) {
		WebElementFacade row = null;
		for (WebElementFacade rowAux : rows) {
			if (text.equals(rowAux.find(By.cssSelector("td:nth-of-type(" + columnT + ")")).getText())) {
				row = rowAux;
				break;
			}
		}
		if (row != null) {
			ContainerActions.clickOn(row.find(By.xpath(".//a[@title='Edit' or @title='Editar']")), grid);
		}
	}
}

/**
 * Seleccionar un elemento del grid dado un indice.
 *
 * @param grid identificador del elemento
 * @param indexRow indice del grid en el que esta el elemento a seleccionar
 * @param commandId identificador del elemento a seleccionar.
 */
public static void clickRowCommandByIndex(IGrid grid, int indexRow, String commandId) {
	List<WebElementFacade> rows = BrowseTheWeb.as(theActorInTheSpotlight()).$(By.id(grid.getId())).find(By.tagName("tbody"))
			.thenFindAll(By.tagName("tr"));
	WebElementFacade rowButton = rows.get(indexRow)
			.find(By.xpath(".//a[contains(@data-ng-click,'" + commandId + "')]"));
	if (rowButton != null) {
		ContainerActions.clickOn(rowButton, grid);
	}
}

/**
 * Selecciona el boton de eliminar por columna y texto.
 *
 * @param grid identificador del elemento.
 * @param column columna que contiene el elemento con el boton.
 * @param text texto que es contenido por el elemento con el boton.
 */
public static void clickDeleteRowByColumnAndText(IGrid grid, int column, String text) {
	column++;
	List<WebElementFacade> rows = BrowseTheWeb.as(theActorInTheSpotlight()).$(By.id(grid.getId()))
			.thenFindAll(By.cssSelector("tbody > tr"));
	if (!rows.isEmpty()) {
		WebElementFacade row = null;
		for (WebElementFacade rowAux : rows) {
			if (text.equals(rowAux.find(By.cssSelector("td:nth-of-type(" + column + ")")).getText())) {
				row = rowAux;
				break;
			}
		}
		if (row != null) {
			ContainerActions.clickOn(BrowseTheWeb.as(theActorInTheSpotlight())
					.$(By.xpath(".//a[@title='Eliminar' or @title='Delete']")), grid);
		}
	}
}

	
	public static class Pager{
		/**
		 * Ir a pagina.
		 *
		 * @param grid Elemento a seleccionar.
		 * @param page   pagina a seleccionar.
		 */
		public static void goToPage(IGrid grid, int page) {
			BaseActions.waitUntilCharge();
			List<WebElementFacade> elementosPaging = BrowseTheWeb.as(theActorInTheSpotlight()).$$(By.xpath("//div[@id='"+ grid.getId() +"']//div[@class='k-pager-numbers-wrap']//li"));
			page--;
			ContainerActions.clickOn(elementosPaging.get(page), grid);
		}

		/**
		 * Ir a la siguiente pagina.
		 *
		 * @param grid Elemento a seleccionar.
		 */
		public static void goNextPage(IGrid grid) {
			BaseActions.waitUntilCharge();
			GridActionsTasks.SelectGridPagerGoNext.page(grid);
		}

		/**
		 * Ir a la pagina anterior.
		 *
		 * @param grid Elemento a seleccionar.
		 */
		public static void goPreviousPage(IGrid grid) {
			BaseActions.waitUntilCharge();
			GridActionsTasks.SelectGridPagerGoBack.page(grid);
		}

		/**
		 * Ir a la ultima pagina.
		 *
		 * @param grid Elemento a seleccionar.
		 */
		public static void goLastPage(IGrid grid) {
			Target goLastPage = Target.the("Grid" + grid.getId() + "- goLastPage")
					.located(By.xpath("//div[@id='" + grid.getId() + "']//a[contains(@class,'k-pager-last')]"));
			ContainerActions.clickOn(goLastPage);
		}

		/**
		 * Ir a la primera pagina.
		 *
		 * @param grid Elemento a seleccionar.
		 */
		public static void goFirstPage(IGrid grid) {
			Target goFirstPage = Target.the("Grid" + grid.getId() + "- goFirstPage")
					.located(By.xpath("//div[@id='" + grid.getId() + "']//a[contains(@class,'k-pager-first')]"));
			ContainerActions.clickOn(goFirstPage);
		}

		/**
		 * Presionar boton de ver mas paginas.
		 *
		 * @param grid Elemento a seleccionar.
		 */
		public static void morePages(IGrid grid) {
			BaseActions.waitUntilCharge();
			List<WebElementFacade> elements = BrowseTheWeb.as(theActorInTheSpotlight())
					.$$(By.xpath("//div[@id='" + grid.getId() + "']//div[contains(@class,'k-pager-wrap')]//a"));
			if (elements.get(elements.size() - 3).getText().equals("...")) {
				ContainerActions.clickOn(elements.get(elements.size() - 3), grid);
			}
		}

		/**
		 * Presionar boton de ver menos paginas
		 *
		 * @param grid Elemento a seleccionar.
		 */
		public static void lessPages(IGrid grid) {
			BaseActions.waitUntilCharge();
			List<WebElementFacade> elements = BrowseTheWeb.as(theActorInTheSpotlight())
					.$$(By.xpath("//div[@id='" + grid.getId() + "']//div[contains(@class,'k-pager-wrap')]//a"));
			if (elements.get(2).getText().equals("...")) {
				ContainerActions.clickOn(elements.get(2), grid);
			}
		}
	}
	
}