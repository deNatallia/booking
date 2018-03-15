/*
 * Copyright 2013-2017 QAPROSOFT (http://qaprosoft.com/).
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

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;

public class AutoBaraholkaPage extends AbstractPage
{
	@FindBy(xpath = "//form[contains(@class,'autoba-filters')]")
	private CarFilter carFilter;
	
	@FindBy(xpath = "//tr[contains(@class,'carRow')]//h2//a")
	private List<ExtendedWebElement> listCarLinks;
	
	@FindBy(css = "header")
	private HeaderMenu headerMenu;
	
	@FindBy(css = "footer")
	private FooterMenu footerMenu;	

	public AutoBaraholkaPage(WebDriver driver)
	{
		super(driver);
	}
	
	public CarPage openCarPage(int carIndex){
		listCarLinks.get(carIndex).click();	
		return new CarPage(driver);
	}
	
	public CarFilter getCarFilter(){
		return carFilter;
	}
	
	public HeaderMenu getHeaderMenu(){
		return headerMenu;
	}
	
	public FooterMenu getFooterMenu(){
		return footerMenu;
	}
	
}