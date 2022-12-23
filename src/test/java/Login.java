import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;


public class Login {
WebDriver wd ;

 @BeforeMethod
 public void  preCondition(){
     //open browser
  wd = new ChromeDriver();
     // open site
  wd.get("https://telranedu.web.app/");
 }
 @Test
 public void findElementsOnPage(){
  // by tagName
  WebElement element = wd.findElement(By.tagName("div")); // поиск 1 элемента по  таг имени  возращает только 1
 List<WebElement> divs = wd.findElements(By.tagName("div"));// возращает все div на странице - калецию дивов


  //By id
  WebElement el1 = wd.findElement(By.id("root"));

  // By class
  WebElement  el2 = wd.findElement(By.className("container"));

  //By namt
  WebElement name = wd.findElement(By.name("name"));

  //By Link text -лучше не пользоватся
wd.findElement(By.linkText("HOME"));
wd.findElement(By.linkText("ABOUT"));
wd.findElement(By.partialLinkText("HO"));
 }






 @Test
 public  void  loginSuccess(){
     //open form
     // wd find item +click
  WebElement itemLogin = wd.findElement(By.linkText("LOGIN"));
  itemLogin.click();
  //fill form

  // wd find email + click +clear+ type
  WebElement email = wd.findElement(By.name("email"));
  email.click();
  email.clear();
  email.sendKeys("reshef1986@gmail.com");// писывает текст в кавычках
  // wd find password + click + clear + type
  WebElement password = wd.findElement(By.name("password"));
  password.click();
  password.clear();
  password.sendKeys("Rr6146858!");

  //submit form

  // wd find button login + click
 List<WebElement> buttons = wd.findElements(By.tagName("button"));
 WebElement buttonLogin =buttons.get(0);
 buttonLogin.click();
     Assert.assertEquals("" ,"");
 }



 @Test
 public void registrationSuccess (){
  WebElement elLogin = wd.findElement(By.linkText("LOGIN"));
elLogin.click();
  WebElement email =wd.findElement(By.name("email"));
  email.click();
  email.clear();
  email.sendKeys("reshef1986@gmail.com");
  WebElement password = wd.findElement(By.name("password"));
  password.click();
  password.clear();
  password.sendKeys("Rr6146858!");
  WebElement registration = wd.findElement(By.name("registration"));
 registration.click();

 }

public  void  ccslocatrstest (){

}

 @AfterMethod
 public void postCondition(){

  //wd.quit();
 }

}
