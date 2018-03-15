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

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;

public class HeaderMenu extends AbstractUIObject
{
	
	@FindBy(xpath = "//nav//a[contains(@href,'catalog.onliner.by')]")
	private ExtendedWebElement catalogLink;

//	@FindBy(xpath = "//nav//a[contains(@href,'onliner.by')]") 
//	private ExtendedWebElement newsLink;
	
	@FindBy(xpath = "//nav//a[contains(@href,'ab.onliner.by')]") 
	private ExtendedWebElement autobaraholkaLink;
	
	@FindBy(xpath = "//nav//a[contains(@href,'r.onliner.by/pk')]") 
	private ExtendedWebElement realtLink;
	
	@FindBy(xpath = "//nav//a[contains(@href,'s.onliner.by')]") 
	private ExtendedWebElement offersLink;
	
	@FindBy(xpath = "//nav//a[contains(@href,'baraholka.onliner.by')]") 
	private ExtendedWebElement baraholkaLink;

	@FindBy(xpath = "//nav//a[contains(@href,'forum.onliner.by')]") 
	private ExtendedWebElement forumLink;
	
	public HeaderMenu(WebDriver driver, SearchContext searchContext)
	{
		super(driver, searchContext);
	}
	
	public AutoBaraholkaPage openAutoBaraholkaPage()
	{
		autobaraholkaLink.click();
		return new AutoBaraholkaPage(driver);
	}

}
