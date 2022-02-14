package klearnow.utility;

import java.io.*;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//import com.kx.automation.getpageobjects.Locators;

public class PageObjects {

	public enum Locators {
		id, name, classname, css, xpath, linktext;
	}

	public WebDriver driver;

	public PageObjects(WebDriver driver) {
		this.driver = driver;
	}
	// WebDriverFactory.getDriver();
	// Java Program to illustrate Reading from FileReader
	// using BufferedReader Class

	// Importing input output classes

	// Main class

	// main driver method
	public static void main(String[] args) throws Exception {

		By email = getBy("emailId");
		System.out.println(email);

	}

	public static ArrayList<String> readfromfile() {
		ArrayList<String> elementLines = new ArrayList<String>();

		// File path is passed as parameter
		File file = new File("src/test/resources/klearnow/webelementdata/broker/BrokerWebElementData.txt");

		// Note: Double backquote is to avoid compiler
		// interpret words
		// like \test as \t (ie. as a escape sequence)

		// Creating an object of BufferedReader class
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Declaring a string variable
		String st;
		// Condition holds true till
		// there is character in a string
		try {
			while ((st = br.readLine()) != null) {

				elementLines.add(st.trim().replaceAll("[\\s]+", " "));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Print the string
		System.out.println(elementLines);

		return elementLines;
	}

	private static String[] getElement(String elementName) {
		ArrayList<String> elementLines = readfromfile();
		for (String elementLine : elementLines) {
			if (elementLine.startsWith(elementName)) {
				return elementLine.split(" ", 3);
			}
		}
		return null;

	}

	private static By getBy(String element) {
		String[] a = getElement(element);
		String locatorType = a[1];
		String locatorValue = a[2];

		switch (Locators.valueOf(locatorType)) {
		case id:
			return By.id(locatorValue);
		case xpath:
			return By.xpath(locatorValue);
		case css:
			return By.cssSelector(locatorValue);
		case name:
			return By.name(locatorValue);
		case classname:
			return By.className(locatorValue);
		case linktext:
			return By.linkText(locatorValue);
		default:
			return By.id(locatorValue);
		}
	}

	public WebElement element(String elementToken) {
		WebElement elem=null;
	try {
		elem = driver.findElement(getBy(elementToken));

	} catch (NoSuchElementException e) {
		System.out.println("Element is not found");
	}
		
		return elem;
	}
	
	

}
