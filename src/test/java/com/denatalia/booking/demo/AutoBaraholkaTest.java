package com.denatalia.booking.demo;

import org.testng.annotations.Test;

import com.denatalia.booking.autobaraholka.AutoBaraholkaPage;
import com.denatalia.booking.autobaraholka.CarPage;
import com.denatalia.booking.autobaraholka.HomePage;
import com.denatalia.booking.autobaraholka.LoginPage;
import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.core.foundation.dataprovider.annotations.XlsDataSourceParameters;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;

import org.testng.Assert;

public class AutoBaraholkaTest extends AbstractTest{
	@Test(dataProvider = "SingleDataProvider", description = "JIRA#AUTO-10010")
	@MethodOwner(owner = "markova")
	@XlsDataSourceParameters(path = "xls/demo.xlsx", sheet = "Onliner", dsUid = "TUID", dsArgs = "user, pass")
	public void loginOnliner(String user, String pass){
		HomePage homepage = new HomePage(getDriver());
		homepage.open();
		Assert.assertTrue(homepage.isPageOpened(), "onliner home page is not opened");
		homepage.signIn();
		
		LoginPage loginPage = new LoginPage(getDriver());
		loginPage.logIn(user,pass);
	}

	
	@Test(dataProvider = "SingleDataProvider", description = "JIRA#AUTO-10011")
	@MethodOwner(owner = "markova")
	@XlsDataSourceParameters(path = "xls/demo.xlsx", sheet = "ABaraholka", dsUid = "TUID", dsArgs = "country, region, city, minYear, maxYear, manufact, transm, carIndex")
	public void filterCars(String country, String region, String city, String minYear, String maxYear, String manufact, String transm, String carIndex){
		HomePage homepage = new HomePage(getDriver());
		homepage.open();
		Assert.assertTrue(homepage.isPageOpened(), "onliner home page is not opened");
		AutoBaraholkaPage abpage = homepage.getHeaderMenu().openAutoBaraholkaPage();
		abpage.getCarFilter().setCountry(convertToInt(country));
		abpage.getCarFilter().setRegion(convertToInt(region));
		abpage.getCarFilter().setCity(convertToInt(city));
		abpage.getCarFilter().setManufacture(convertToInt(manufact));
		abpage.getCarFilter().setMinYear(minYear);
		abpage.getCarFilter().setMaxYear(maxYear);
		abpage.getCarFilter().setTransmission(convertToInt(transm));
		CarPage carpage = abpage.openCarPage(convertToInt(carIndex));
		carpage.getCarInfo();
	}
	
	public int convertToInt(String s){
		return Integer.parseInt(s);
	}
}
