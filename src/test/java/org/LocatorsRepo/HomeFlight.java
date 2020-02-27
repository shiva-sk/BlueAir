package org.LocatorsRepo;

import java.util.List;

import org.Meth.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeFlight extends  Base {
	public HomeFlight() {
PageFactory.initElements(driver, this);
	}	

	@FindBy(xpath = "//button[@class='btn btn-secondary btn-small cookies-action close-btn remove-ck']")
	private List<WebElement> cook;

	public List<WebElement> getCook() {
		return cook;
	}
}
