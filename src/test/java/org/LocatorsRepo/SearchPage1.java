package org.LocatorsRepo;



import java.util.List;

import org.Meth.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage1 extends Base {
	public SearchPage1() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//input[@ng-change='changeSearch(1)']")
	private List<WebElement> srcD;

	@FindBy(xpath = "(//span[text()='Romania'])[1]")
	private List<WebElement> rom;

	@FindBy(xpath = "(//span[text()='Finland'])[2]")
	private List<WebElement> fr;

	@FindBy(xpath = "(//span[text()='Bucharest (OTP)'])[1]")
	private List<WebElement> buc;

	@FindBy(xpath = "(//span[text()='Helsinki-Vantaa  (HEL) '])")
	private List<WebElement> zuc;

	@FindBy(xpath = "//label[@for='cb1']")
	private List<WebElement> one;

	@FindBy(xpath = "//input[@ng-model='departureDate']")
	private List<WebElement> dd;

	@FindBy(xpath = "//td[@data-day='31']")
	private List<WebElement> date;

	@FindBy(xpath = "(//i[@class='font-ico-plus'])[1]")
	private List<WebElement> ad;

	@FindBy(xpath = "(//i[@class='font-ico-plus'])[2]")
	private List<WebElement> yo;
	
	@FindBy(xpath = "(//i[@class='font-ico-plus'])[4]")
	private List<WebElement> ch;
	
	@FindBy(xpath = "(//i[@class='font-ico-plus'])[5]")
	private List<WebElement> in;
	
	@FindBy(xpath = "(//button[@class='btn btn-primary'])")
	private List<WebElement> app;

	@FindBy(xpath = "(//button[@type='submit'])[4]")
	private List<WebElement> bbb;
	
	@FindBy(xpath="(//span[@class='selected-icon'])[2]")
	private List<WebElement> srcda;
	
	@FindBy(xpath="(//span[@role='button'])[3]")
	private List<WebElement> pasenger;
	
	@FindBy(id="returnDate")
	private List<WebElement> rdate;
	
	public List<WebElement> getRdate(){
		return rdate;
	}

	public List<WebElement> getPasenpger() {
		return pasenger;
	}

	public List<WebElement> getSrcda() {
		return srcda;
	}

	public List<WebElement> getSrcD() {
		return srcD;
	}

	public List<WebElement> getRom() {
		return rom;
	}

	public List<WebElement> getFr() {
		return fr;
	}

	public List<WebElement> getBuc() {
		return buc;
	}

	public List<WebElement> getZuc() {
		return zuc;
	}

	public List<WebElement> getOne() {
		return one;
	}

	public List<WebElement> getDd() {
		return dd;
	}

	public List<WebElement> getDate() {
		return date;
	}

	public List<WebElement> getAd() {
		return ad;
	}

	public List<WebElement> getYo() {
		return yo;
	}

	public List<WebElement> getCh() {
		return ch;
	}

	public List<WebElement> getIn() {
		return in;
	}

	public List<WebElement> getApp() {
		return app;
	}

	public List<WebElement> getBbb() {
		return bbb;
	}
	

}
