package org.LocatorsRepo;

import java.util.List;

import org.Meth.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightSelection extends Base {
	public FlightSelection() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath="(//div[@class='price-wrapper'])[3]")
	private List<WebElement> fs;
	
	@FindBy(xpath="(//button[@class='btn btn-primary'])")
	private List<WebElement> cont;
	
	@FindBy(xpath="(//div[@class='flight-number'])")
	private List<WebElement> num;
	
	@FindBy(xpath="(//button[@class='price-item'])[3]")
	private List<WebElement> select;

	public List<WebElement> getSelect() {
		return select;
	}

	public List<WebElement> getNum() {
		return num;
	}

	public List<WebElement> getFs() {
		return fs;
	}

	public List<WebElement> getCont() {
		return cont;
	}
	
	
}
