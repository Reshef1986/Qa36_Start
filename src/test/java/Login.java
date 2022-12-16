import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

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
 public  void  loginSuccess(){
     //open form
     // wd find button +click
     //fill form
  // wd find email + click + type
  // wd find password + click + type
     //submit form
  // wd find button login + click

     Assert.assertEquals("" ,"");
 }
 @AfterMethod
 public void postCondition(){
  wd.quit();
 }

}
