package framework.pages;

import framework.pages.components.ProductComponent;

import java.util.ArrayList;
import java.util.List;

import lombok.SneakyThrows;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MainPage extends BasePage {

    private final By productContainerLocator = By.xpath("//div[@class='col']");

    public SignInPage clickOnSignInLink() {
        find(signLinkLocator).click();
        return new SignInPage();
    }


    @SneakyThrows
    public List<ProductComponent> getAllProductsFromMainPage() {
        List<ProductComponent> products = new ArrayList<>();
        List<WebElement> containers = findAll(productContainerLocator);
        for (WebElement container : containers) {
            ProductComponent productComponent = new ProductComponent(container);
            products.add(productComponent);
        }
        return products;
    }

}
