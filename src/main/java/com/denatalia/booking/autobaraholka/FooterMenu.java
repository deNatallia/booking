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

public class FooterMenu extends AbstractUIObject
{
	@FindBy(xpath = "//footer//a[contains(@href,'blog.onliner.by/about')]")
	private ExtendedWebElement aboutLink;

	@FindBy(xpath = "//footer//a[contains(@href,'b2breg.onliner.by/advertising')]") 
	private ExtendedWebElement adLink;
	
	@FindBy(xpath = "//footer//a[contains(@href,'b2breg.onliner.by/reg')]") 
	private ExtendedWebElement regLink;

	public FooterMenu(WebDriver driver, SearchContext searchContext)
	{
		super(driver, searchContext);
	}

	public void openAboutPage()
	{
		aboutLink.click();
	}

}
