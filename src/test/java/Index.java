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
        boolean res = str.contains("Mexico");
        Assert.assertTrue(res);
        Assert.assertTrue(str.contains("Mexico"));

    }

    @Test
    public void itemsTests() {
        // find Item1 & click() ===> assert that "div-alert" contains message  "Clicked by Item 1"
        WebElement item1 = wd.findElement(By.cssSelector("[href = '#item1']"));
        // wd.findElement(By.xpath("//*[@ href ='#item1']"));
        item1.click();
        WebElement squareRes = wd.findElement(By.cssSelector("#alert"));
        wd.findElement(By.xpath("//*[@id ='alert']"));
        System.out.println("Text in square after click Item 1 =  " + squareRes.getText());
        Assert.assertTrue(squareRes.getText().contains("Clicked by Item 1"));

        // find Item3 & click() ===> assert that "div-alert" contains message  "Clicked by Item 3"
        WebElement item3 = wd.findElement(By.cssSelector("[href = '#item3']"));
        //wd.findElement(By.xpath("//*[@href ='#item3' ]"));
        item3.click();
        System.out.println("Text in square after click Item 3 =  " + squareRes.getText());
        Assert.assertTrue(squareRes.getText().contains("Clicked by Item 3"));
    }

    @Test
    public void formTests()  {
        // fill name & fill surename & click send
        WebElement fildName = wd.findElement(By.cssSelector("[name = 'name']"));
       // wd.findElement(By.xpath("//*[@name = 'name']"));
        fildName.click();
        fildName.clear();
        fildName.sendKeys("Alex");
        WebElement fildSureName = wd.findElement(By.cssSelector("[name ='surename']"));
      //  wd.findElement(By.xpath("//*[@name='surename']"));
        fildSureName.click();
        fildSureName.clear();
        fildSureName.sendKeys("Zaxarov");

        WebElement sendButton = wd.findElement(By.cssSelector(".btn"));
        //wd.findElement(By.xpath("//*[@class='btn']"));
        sendButton.click();

       WebElement squareRes = wd.findElement(By.cssSelector("#alert"));
      // wd.findElement(By.xpath("//*[@id='alert']"));
        System.out.println("You entered a first and last name = " + squareRes.getText());
        // Assert that "div-alert" contains text with name + surename

        Assert.assertTrue(squareRes.getText().contains("Alex Zaxarov"));


    }

}