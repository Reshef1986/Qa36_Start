import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Start {
    WebDriver wd;

   @Test
  public void myTest  () {
      //open browserhttps://telranedu.web.app/
       wd = new ChromeDriver();
       wd.get("");  // without history

     /*  wd.navigate().to("https://telranedu.web.app/"); // with history
       //только если есть история можно использовать следующие методы
       wd.navigate().back(); // назад
       wd.navigate().forward(); // вперед
       wd.navigate().refresh(); //обновить можно всегда
      */
     //  wd.close(); // закрывает только  1 таб на который селениум смотрит ( если открыта только 1 то бразузер)
       wd.quit(); // все страницы с браузером
  }
    @Test
  public void secondTest (){

  }


}
