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

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;

public class LoginPage extends AbstractPage
{
	@FindBy(xpath = "//div[contains(@class,'auth-box__line')]/input[contains(@type,'text')]")
	private ExtendedWebElement userNameTextField;
	
	@FindBy(xpath = "//div[contains(@class,'auth-box__line')]/input[contains(@type,'password')]")
	private ExtendedWebElement passwordTextField;
	
	@FindBy(xpath = "//button[contains(@class,'auth-box__auth-submit')]")
	private ExtendedWebElement logInButton;
	

	public LoginPage(WebDriver driver)
	{
		super(driver);
//		setPageAbsoluteURL("https://vk.com/");
	}

	public void logIn(String email, String password)
	{
		userNameTextField.type(email);
		passwordTextField.type(password);
		logInButton.click();
	}
	
}