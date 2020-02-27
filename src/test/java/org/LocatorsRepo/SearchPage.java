package org.LocatorsRepo;

import java.util.List;

import org.Meth.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends Base {

	public SearchPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[@class='mfp-close']")
	private List<WebElement> pri;
	@FindBy(id="login-btn")
	private List<WebElement> lg;
	@FindBy(id = "username-header")
	private List<WebElement> username;
	@FindBy(xpath = "(//button[@type='button'])[3]")
	private List<WebElement> cook;
	@FindBy(id = "password-header")
	private List<WebElement> pass;
	@FindBy(xpath = "(//button[@class='btn btn-primary btn-blue full-width'])[1]")
	private List<WebElement> login;
	@FindBy(xpath = "(//span[text()='Romania'])[1]")
	private List<WebElement> dep;
	@FindBy(xpath = "//label[@for='cb1']")
	private List<WebElement> one;

	public List<WebElement> getOne() {
		return one;
	}

	public List<WebElement> getPri() {
		return pri;
	}

	public List<WebElement> getLg() {
		return lg;
	}

	public List<WebElement> getUsername() {
		return username;
	}

	public List<WebElement> getPass() {
		return pass;
	}

	public List<WebElement> getLogin() {
		return login;
	}

	public List<WebElement> getDep() {
		return dep;
	}

	public List<WebElement> getCook() {
		return cook;
	}

}
