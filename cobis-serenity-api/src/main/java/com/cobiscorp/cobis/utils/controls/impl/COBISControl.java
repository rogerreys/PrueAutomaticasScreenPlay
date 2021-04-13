package com.cobiscorp.cobis.utils.controls.impl;

import org.openqa.selenium.*;
import com.cobiscorp.cobis.utils.controls.IControl;
import net.serenitybdd.screenplay.targets.Target;

public abstract class COBISControl implements IControl {
	private String id;
	private Target target;

	@Override
	public final String getId() {
		return id;
	}

	@Override
	public final Target getTarget() {
		return target;
	}

	protected void init(String id, String elementName) {
		this.id = id;
		this.target = Target.the(elementName).located(By.id(this.id));
	}
	
	protected void init(String id, String elementName, String xpath) {
		this.id = id;
		this.target = Target.the(elementName).located(By.xpath(xpath));
	}

}
