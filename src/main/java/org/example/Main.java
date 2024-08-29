package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {

                System.out.println("Hello world!");
                System.setProperty("web driver.chrome.driver", "D:\\New Selinum Projects\\chromedriver-win64\\chromedriver.exe");
                WebDriver driver = new ChromeDriver();
                driver.get("https://www.saucedemo.com/");

                WebElement username  =driver.findElement(By.id("user-name"));
                username.sendKeys("standard_user");

               WebElement password  =driver.findElement(By.id("password"));
                password.sendKeys("secret_sauce");

                WebElement button = driver.findElement(By.xpath("//input[@id='login-button']"));
               button.click();

        WebElement dropPrice   = driver.findElement(By.xpath("//select[@class='product_sort_container']"));
        dropPrice.click();
       Select newdropdown = new Select(dropPrice);

        newdropdown.selectByIndex(3);

        WebElement Button_cart = driver.findElement(By.id("add-to-cart-sauce-labs-onesie"));
        Button_cart.click();

        WebElement Second_product = driver.findElement(By.id("add-to-cart-sauce-labs-bike-light"));
        Second_product.click();

        WebElement Third_product = driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)"));
        Third_product.click();

        WebElement click_cart = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
        click_cart.click();

        WebElement Remove_button = driver.findElement(By.id("remove-sauce-labs-onesie"));
        Remove_button.click();

        WebElement checkout = driver.findElement(By.id("checkout"));
        checkout.click();


        WebElement First_name = driver.findElement(By.id("first-name"));
        First_name.sendKeys("Pirashanthy");

        WebElement Last_name = driver.findElement(By.id("last-name"));
        Last_name.sendKeys("Balakrishnan");

        WebElement postal_code = driver.findElement(By.id("postal-code"));
        postal_code.sendKeys("40000");

        WebElement Continue = driver.findElement(By.id("continue"));
        Continue.click();

        WebElement Finish_button = driver.findElement(By.id("finish"));
        Finish_button.click();









    }
}