/*
 * Copyright 2013-2016 QAPROSOFT (http://qaprosoft.com/).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.denatalia.booking.autobaraholka;

import java.util.List;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;

public class CarFilter extends AbstractUIObject
{
	@FindBy(xpath = "//select[contains(@name,'country')]")
	private ExtendedWebElement selectCountry;
	
	@FindBy(xpath = "//select[contains(@name,'region')]")
	private ExtendedWebElement selectRegion;
	
	@FindBy(xpath = "//select[contains(@name,'city')]")
	private ExtendedWebElement selectCity;
	
	@FindBy(xpath = "//select[contains(@name,'models_manufactures_id[]')]") 
	private ExtendedWebElement selectManufacture;
	
	@FindBy(xpath = "//select[contains(@name,'min-year')]") 
	private ExtendedWebElement minYear;
	
	@FindBy(xpath = "//select[contains(@name,'max-year')]") 
	private ExtendedWebElement maxYear;
	
	@FindBy(xpath = "//input[contains(@name,'transmission[]')]") 
	private List<ExtendedWebElement> transmission;
	
	public CarFilter(WebDriver driver, SearchContext searchContext)
	{
		super(driver, searchContext);
	}
	
	public void setCountry(int countryValue){
		select(selectCountry, countryValue);
	}
	
	public void setRegion(int regionValue){
		select(selectRegion,regionValue);
	}
	
	public void setCity(int cityValue){
		select(selectCity, cityValue);
	}
	
	public void setManufacture(int manufValue){
		select(selectManufacture, manufValue);
	}
	
	public void setMinYear(String minyearValue){
		select(minYear, minyearValue);
	}
	
	public void setMaxYear(String maxyearValue){
		select(maxYear, maxyearValue);
	}
	
	public void setTransmission(int transmValue){
		click(transmission.get(transmValue));
	}

}
