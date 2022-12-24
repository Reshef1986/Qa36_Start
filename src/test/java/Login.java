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

    @Test
    public void ccslocatrstest() {

        // нужно перейти на страницу логина, так как на главной странице мало элементов для поиска и тренировки
        // переход на страницу логина тут:
        wd.findElement(By.linkText("LOGIN")).click();

        // теперь мы на странице логина и тут будем тренироваться


        // На странице логин найти несколько элементов по их  tagname
        wd.findElement(By.tagName("div"));
        wd.findElement(By.cssSelector(" [name='login' ]"));
        wd.findElement( By.cssSelector("[name = 'registration']"));

        // ON Login PAGE find some elements by class
wd.findElement(By.cssSelector(".active"));
        // На странице логин найти несколько элементов по их  attribute
        wd.findElement(By.cssSelector("[aria-current='page']"));
wd.findElement(By.cssSelector("[placeholder ='Email']"));
wd.findElement(By.cssSelector("[placeholder ='Password']"));
/* Можно еще найти первую кнопку Login по wd.findElement(By.cssSelector("[type='submit']"));
Так как вы говорили что идет сверху вниз а  таких элементов 2 и этот первый
 */

        //На странице логин найти  элемент с  атрибутом placeholder, значение которого начинается на "Pass"
      wd.findElement(By.cssSelector("[placeholder ^='Pass']"));

        //На странице логин найти  элемент с  атрибутом placeholder, значение которого  начинается на  "ass"
        wd.findElement(By.cssSelector("[placeholder *='ass']"));
        //На странице логин найти  элемент с  атрибутом placeholder, значение которого заканчивается на "ord"
        wd.findElement(By.cssSelector("[placeholder $='ord']"));
        // Объединение !!
        //найти элемент div, у которого есть id со значением "root"  и класс со значением container
        wd.findElement(By.cssSelector(" div#root.container "));


        // найти элемент а, у которого есть атрибут href со значением /login
        wd.findElement(By.cssSelector("a[href ='/login'"));
        // найти элемент input, у которого есть атрибут name cо значением email
        wd.findElement(By.cssSelector("input[name='email']"));
        // найти элемент button, у которого есть атрибут name cо значением login
        wd.findElement(By.cssSelector("button[name='login']"));

        // Поиск по дочерним элементам (* задание со звездоской)
        // Найти кнопку регистрации, как последнего ребенка элемента form

wd.findElement(By.cssSelector("form *:last-child"));
/*
Form- форма
* -Говорит что дай мне весь список и ужен внутри найти мне команда ниже
last -child - последнего из списка
nth-child() - можно указать какой именно например  nth-child(2)
form *:first-child - первый
 */


}
    @AfterMethod
    public void postCondition(){
        // close browser
        // wd.quit();
    }
}
