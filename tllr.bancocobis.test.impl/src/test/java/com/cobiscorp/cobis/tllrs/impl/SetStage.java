package com.cobiscorp.cobis.tllrs.impl;

import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class SetStage {
	
	@Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

}
