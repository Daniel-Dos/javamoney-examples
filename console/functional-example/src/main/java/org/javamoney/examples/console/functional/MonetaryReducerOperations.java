package org.javamoney.examples.console.functional;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import javax.money.CurrencyUnit;
import javax.money.MonetaryAmount;
import javax.money.Monetary;

import org.javamoney.moneta.Money;
import org.javamoney.moneta.function.MonetaryFunctions;

public class MonetaryReducerOperations {

	public static void main(String[] args) {
		List<MonetaryAmount> moneys = aFistfulOfDollars();
		MonetaryAmount min = moneys.stream().reduce(MonetaryFunctions.min()).get();
		MonetaryAmount max = moneys.stream().reduce(MonetaryFunctions.max()).get();
		MonetaryAmount sum = moneys.stream().reduce(MonetaryFunctions.sum()).get();
		System.out.println(min);//USD 50
		System.out.println(max);//USD 120
		System.out.println(sum);//USD 460
	}
	
	private static List<MonetaryAmount> aFistfulOfDollars() {
		CurrencyUnit dollar = Monetary.getCurrency(Locale.US);
		List<MonetaryAmount> moneys = new ArrayList<>();
		moneys.add(Money.of(120, dollar));
		moneys.add(Money.of(50, dollar));
		moneys.add(Money.of(80, dollar));
		moneys.add(Money.of(90, dollar));
		moneys.add(Money.of(120, dollar));
		return moneys;
	}
}
