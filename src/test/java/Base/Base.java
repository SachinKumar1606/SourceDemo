package Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.io.FileInputStream;
import java.io.IOException;


public class Base {
    public static WebDriver driver;

     public void loginPass() throws IOException {
         WebDriverManager.chromedriver().setup();
        String path = System.getProperty("user.dir") + "/TestData/Login.xlsx";
        System.out.println(path);
        //Reading the Excel file
        FileInputStream file = new FileInputStream(path);
        //Reading the workBook
        XSSFWorkbook bk = new XSSFWorkbook(file);
        //Reading the sheet
        XSSFSheet sh = bk.getSheetAt(0);
        int i = sh.getLastRowNum();
         System.out.println(i);
        for (int a = 1; a <= i; a++ ) {
            String name = sh.getRow(a).getCell(0).getStringCellValue();
            String pass = sh.getRow(a).getCell(1).getStringCellValue();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.navigate().to("https://www.saucedemo.com/");
            driver.findElement(By.id("user-name")).sendKeys(name);
            driver.findElement(By.id("password")).sendKeys(pass);
            driver.findElement(By.id("login-button")).click();
            String act = driver.getCurrentUrl();
            driver.close();
            String ect = "https://www.saucedemo.com/inventory.html";
            Assert.assertEquals(act,ect);
        }
     }

    public void loginFail() throws IOException {
        WebDriverManager.chromedriver().setup();
        String path = System.getProperty("user.dir") + "/TestData/Login.xlsx";
        System.out.println(path);
        //Reading the Excel file
        FileInputStream file = new FileInputStream(path);
        //Reading the workBook
        XSSFWorkbook bk = new XSSFWorkbook(file);
        //Reading the sheet
        XSSFSheet sh = bk.getSheetAt(1);
        int i = sh.getLastRowNum();
        System.out.println(i);
        for (int a = 1; a <= i; a++) {
            String name = sh.getRow(a).getCell(0).getStringCellValue();
            String pass = sh.getRow(a).getCell(1).getStringCellValue();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.navigate().to("https://www.saucedemo.com/");
            driver.findElement(By.id("user-name")).sendKeys(name);
            driver.findElement(By.id("password")).sendKeys(pass);
            driver.findElement(By.id("login-button")).click();
            String act = driver.getCurrentUrl();
            driver.close();
            String ect = "https://www.saucedemo.com/";
            Assert.assertEquals(act, ect);
        }
    }
}
