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

public class CarPage extends AbstractPage
{
	@FindBy(xpath = "//div[contains(@class,'autoba-msglongcont')]//p")
	private List<ExtendedWebElement> paragrafsCarInfo;
	
	@FindBy(css = "header")
	private HeaderMenu headerMenu;
	
	@FindBy(css = "footer")
	private FooterMenu footerMenu;	

	public CarPage(WebDriver driver)
	{
		super(driver);
	}
	
	public HeaderMenu getHeaderMenu(){
		return headerMenu;
	}
	
	public FooterMenu getFooterMenu(){
		return footerMenu;
	}
	
	public void getCarInfo(){
		paragrafsCarInfo.stream().forEach((p)->System.out.println(p.getText()));
	}
	
}