package seleniumimplemention;


class BrowserDemo{
	public static void main(String[] args) {
		
//		ChromeBrowser brower = new ChromeBrowser();
//		brower.openChrome();
//		brower.chromeclick();
//		
//		FirefoxBrowser browser1 = new FirefoxBrowser();
//		browser1.openFirefox();
//		browser1.firefoxclick();
		
		Browser browser = new FirefoxBrowser();
		browser.open();
		browser.click();
		
		// Exam -> exam paper , 5 question
		
	}
}

public class Browser {
	public void open() {
		
	}
	public void click() {
		
	}
}


class ChromeBrowser extends Browser{
	public void open() {
		System.out.println("chrome-open");
	}
	public void click() {
		System.out.println("chrome-click");
	}
}

class FirefoxBrowser extends Browser{
	public void open() {
		System.out.println("firefox-open");
	}
	public void click() {
		System.out.println("firefox-click");
	}
}