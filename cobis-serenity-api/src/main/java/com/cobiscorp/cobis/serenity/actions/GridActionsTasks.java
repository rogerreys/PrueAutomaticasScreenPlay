package com.cobiscorp.cobis.serenity.actions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Step;
import java.util.List;
import org.openqa.selenium.By;
import com.cobiscorp.cobis.utils.controls.IGrid;

class GridActionsTasks extends BaseActionsTasks {

	public static class SelectGridPagerGoBack implements Task {

		private IGrid grid;

		@Override
		@Step("{0} #grid - goPreviousPage")
		public <T extends Actor> void performAs(T actor) {
			List<WebElementFacade> elementosPaging = BrowseTheWeb.as(actor).$$(By.xpath("//div[@id='"+ grid.getId() +"']//div[@class='k-pager-numbers-wrap']//li"));
			FormActions.waitUntilCharge();
			elementosPaging.get(1).click();;
		}

		public SelectGridPagerGoBack(IGrid grid) {
			this.grid = grid;
		}

		public static Performable page(IGrid grid) {
			return Instrumented.instanceOf(SelectGridPagerGoBack.class).withProperties(grid);

		}
	}
	
	public static class SelectGridPagerGoNext implements Task {

		private IGrid grid;

		@Override
		@Step("{0} #grid - goNextPage")
		public <T extends Actor> void performAs(T actor) {
			List<WebElementFacade> elementosPaging = BrowseTheWeb.as(actor).$$(By.xpath("//div[@id='"+ grid.getId() +"']//div[@class='k-pager-numbers-wrap']//li"));
			FormActions.waitUntilCharge();
			elementosPaging.get(elementosPaging.size() - 2).click();
		}

		public SelectGridPagerGoNext(IGrid grid) {
			this.grid = grid;
		}

		public static Performable page(IGrid grid) {
			return Instrumented.instanceOf(SelectGridPagerGoNext.class).withProperties(grid);

		}
	}
}
