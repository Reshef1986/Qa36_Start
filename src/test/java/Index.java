import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class Index {
    WebDriver wd;

    @BeforeMethod
    public void start() {
        wd = new ChromeDriver();
        wd.get("file:///C:/Users/97252/Downloads/index.html");
        wd.manage().window().minimize(); // Открыть окно браузера на максимальный размер
        //wd драйвер вызвает возможность управления manage окна window которое вызывает метот открытия на максимальный размер
    }


    @Test
    public void tableTest() {
        //проверь правда ли в таблице 4 строки
        List<WebElement> rows = wd.findElements(By.cssSelector("tr"));
        Assert.assertEquals(rows.size(), 4);
        // правда ли что последния строка содержит строку Mexico
        WebElement lastRow = wd.findElement(By.cssSelector("tr:last-child"));
        String lastRowText = lastRow.getText();
        System.out.println("lastRow = " + lastRowText);
        //lastRow = Poland Chine Mexico
        Assert.assertTrue(lastRowText.contains("Mexico"));

        //правда ли что ячейка содержит строку Mexico
        WebElement lastCell = wd.findElement(By.cssSelector("tr:last-child td:last-child"));
        String str = lastCell.getText();
        boolean res =str.contains("Mexico");
        Assert.assertTrue(res);
        Assert.assertTrue(str.contains("Mexico"));



    }

 // правда ли что последния строка содержит Мехико

}