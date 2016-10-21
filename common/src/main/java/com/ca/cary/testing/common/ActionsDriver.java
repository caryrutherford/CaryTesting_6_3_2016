package com.ca.cary.testing.common;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

/**
 * Created by caryTesting on 3/7/2016.
 */
public class ActionsDriver {
    protected WebDriver driver;
    private final long MAX_TIME = 120;
    public ActionsDriver(WebDriver driver){

        this.driver = driver;
    }

    public WebElement get_element(By locator){
        WebElement check = driver.findElement(locator);
        return check;
    }

    public boolean chk_if_selected(By locator){
        boolean answer = driver.findElement(locator).isSelected();
        return answer;
    }

    public boolean waitForTitle(String title){
        Wait<WebDriver> wait = new WebDriverWait(driver, MAX_TIME, 200);
        Boolean element = wait.until(ExpectedConditions.titleContains(title));
        return element;
    }

    public int listSearchResults(By locator){
        List<WebElement> allResults = driver.findElements(locator);
        int count = 0;
        for(WebElement element: allResults){
            System.out.println("List of elements on the page: " + element.getText());
            count++;
        }
        System.out.println("Count: " + count);
        return count;
    }

    public String get_text(By locator){
        try {
            String output_text = driver.findElement(locator).getText();
            return output_text;
        } catch (NoSuchElementException e) {
            // TODO Auto-generated catch block
            //  Assert.fail("Failed to return the expected text");
            System.out.println("Failed to return the expected text");
            return "ERROR";
        }
    }


    public void click(By locator, String infoText){
        try {
            //Wait until element is clickable
            WebElement clickElement = waitUntilClickable(locator);
            //Click the element
            clickElement.click();
        } catch (TimeoutException e) {
            System.out.println("Timed out waiting for : " + infoText);
            // Assert.fail();
        }
    }

    public void clickWithoutWait(By locator, String infoText){
        try {
            driver.findElement(locator).click();
        } catch (TimeoutException e) {
            System.out.println("Timed out waiting for : " + infoText);
            // Assert.fail();
        }
    }

    public void type(By locator, String data, String infoText){
        //Clear the textbox first, then type the text
        try {
            WebElement typeElement = driver.findElement(locator);
            typeElement.clear();
            typeElement.sendKeys(data);
        } catch (NoSuchElementException e) {
            System.out.println("No such element : " + infoText);
        }
    }
    public void type2(By locator, String data, String infoText){
        try {
            WebElement typeElement = driver.findElement(locator);
            //typeElement.clear();
            typeElement.sendKeys(data);
        } catch (NoSuchElementException e) {
            System.out.println("No such element : " + infoText);
        }
    }

    public WebElement waitUntilClickable(By locator) throws TimeoutException{
        WebDriverWait wait = new WebDriverWait(driver, MAX_TIME, 200);
        WebElement element = null;

        element = wait.until(ExpectedConditions.elementToBeClickable(locator));
        return element;
    }

    public boolean waitUntilVisible(By locator, int i){
        Wait<WebDriver> wait = new WebDriverWait(driver, i, 200);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
/*if(element==null)
        Assert.fail("Timeout ! Element: "+locator + " not present on the page !");*/
        if(element!=null){
            System.out.println("Expected element located");
            return true;
        }
        else{
            // Assert.fail("Timeout ! Element: "+ locator + " not present on the page !");
            return false;
        }
    }

    public boolean waitUntilInvisible(By locator){
        Wait<WebDriver> wait = new WebDriverWait(driver, MAX_TIME, 200);
        Boolean element = wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
        if(element == true){
            System.out.println("Expected element is invisible");
            return true;
        }
        else{
            System.out.println("Expected element not invisible YET!");
            // Assert.fail("Expected element not invisible YET!");
            return false;
        }
    }

    public boolean waitUntilTextinLocator(By locator, String infoText){
        try {
            Wait<WebDriver> wait = new WebDriverWait(driver, MAX_TIME, 200);
            Boolean element = wait.until(ExpectedConditions.textToBePresentInElementLocated(locator, infoText));
            //Boolean element = wait.until(ExpectedConditions.textToBePresentInElement(locator, infoText));
            return element;
        } catch (NoSuchElementException e) {
            // TODO Auto-generated catch block
            System.out.println("Timeout: Failed to find expected text in given locator: " + locator);
            return false;
        }
    }

    public String get_value(By locator){
        String value = driver.findElement(locator).getText();
        System.out.println("Value: " + value);
        return value;

    }

    public String get_attribute(By locator, String attribute){
        String value = driver.findElement(locator).getAttribute(attribute);
        return value;
    }

    public boolean check_if_present(By locator){
        if(driver.findElements(locator).size() > 0){
            System.out.println("Found the expected element " + locator);
            return true;
        }
        else{
            System.out.println("Expected element not found");
            return false;
        }
    }

    public boolean check_reqd_fields(By locator){
        String class_value = driver.findElement(locator).getAttribute("class");
        if(class_value.equals("requiredField")){
            return true;
        }
        else{
            return false;
        }
    }

    public void verify_checkbox(){

    }

/*public void wait_for_element_visibility(By locator, long timeOut){
Wait<WebDriver> wait = new WebDriverWait(driver, timeOut, 200);
WebElement element =  wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
if(element == null){
    System.out.println("ERROR: Element not found");
}
else{
    System.out.println("Element located!");
}
}*/

    public boolean waitUntilElementPresentInDom(By locator, long timeOutInSeconds)
    {
        boolean flag = false;
        WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        if(element==null){
            //Assert.fail("Timeout ! Element: "+locator + " not present in DOM !");
            System.out.println("Element not found in DOM as yet!");
            flag = true;
        }
        else{
            System.out.println("Element found in DOM");
            flag = false;
        }
        return flag;
    }

    public void findTableElement(By table_locator, By row_locators, By probenamelocator, By probedropdownarrowlocator){
        WebElement table = driver.findElement(table_locator);
        List<WebElement> rows = (List<WebElement>) table.findElement(row_locators);
        for (WebElement row: rows){
            if(row.findElement(probenamelocator).getText().equals("xenserver")){
                row.findElement(probedropdownarrowlocator).click();
            }
        }
    }

    public void hoverOver(By locator) throws InterruptedException{
        Actions action = new Actions(driver);
        WebElement elem = driver.findElement(locator);
        action.moveToElement(elem);
        action.perform();
        Thread.sleep(2000);
    }

    public void selectDropdownValue(By locator, String text){
        Select size = new Select(driver.findElement(locator));
        size.selectByVisibleText(text);
    }

    public int getCountOfElements(By locator){
        int count = driver.findElements(locator).size();
        return count;
    }
    // Used to pause the program.
    // time is in milliseconds
    public static void sleep(int time){
        try{
            Thread.sleep(time);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}   // END public class ActionsDriver {


