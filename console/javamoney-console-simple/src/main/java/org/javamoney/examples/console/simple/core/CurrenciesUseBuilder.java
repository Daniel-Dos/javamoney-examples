/*
 * JavaMoney Examples
 * Copyright 2012-2019, Werner Keil
 * and individual contributors by the @author tags.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,  
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.javamoney.examples.console.simple.core;

import org.javamoney.examples.console.simple.util.ConsoleUtils;
import org.javamoney.moneta.CurrencyUnitBuilder;

import javax.money.CurrencyQueryBuilder;
import javax.money.Monetary;

/**
 * Programmatically builds and registers a CurrencyUnit into the shared registry.
 */
public class CurrenciesUseBuilder {


	public static void main(String[] args) {
        ConsoleUtils.printDetails(
                CurrencyUnitBuilder.of("GeeCoin", "BuildingCurrenciesExample").setCurrencyCode("GCC").setDefaultFractionDigits(2).build());
        Monetary.getCurrencies(CurrencyQueryBuilder.of().setProviderNames("ConfigurableCurrencyUnitProvider").build()).forEach(
                ConsoleUtils::printDetails
        );
        ConsoleUtils.printDetails(
                CurrencyUnitBuilder.of("GeeCoin", "BuildingCurrenciesExample").setCurrencyCode("GCC").setDefaultFractionDigits(2).build(true));
    }


}
