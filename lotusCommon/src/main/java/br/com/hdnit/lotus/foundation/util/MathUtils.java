package br.com.hdnit.lotus.foundation.util;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class MathUtils {

	public static BigDecimal roundNumber(final BigDecimal number, final boolean isFloor) {
		return number.setScale(2, isFloor ? RoundingMode.FLOOR : RoundingMode.HALF_UP);
	}

}
