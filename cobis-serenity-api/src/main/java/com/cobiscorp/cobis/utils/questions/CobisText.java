package com.cobiscorp.cobis.utils.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.questions.Value;
import net.serenitybdd.screenplay.targets.Target;

public class CobisText {
	
	public static Question<String> text(Target target) {
		return actor -> Text.of(target)
	            .viewedBy(actor).asString();
	}
	
	public static Question<String> value(Target target) {
		return actor -> Value.of(target)
	            .viewedBy(actor).asString();
	}

}
