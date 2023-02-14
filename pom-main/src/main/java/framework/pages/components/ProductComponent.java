package framework.pages.components;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

@Getter
public class ProductComponent {

    private WebElement image;
    private WebElement nameWe;
    private String name;
    private String priceNew;
    private String priceOld;
    private String priceTax;

    public ProductComponent(WebElement container) {
        this.image = container.findElement(By.xpath(".//div[@class='image'] "));
        this.nameWe = container.findElement(By.xpath(".//a[contains(text(),'product_id=43')]"));
        this.name = nameWe.getText();
        try {
            this.priceOld = container.findElement(By.xpath(".//span[@class='price-old']")).getText();
        } catch (NoSuchElementException e) {
            this.reviews = null;
        }
    }
}
