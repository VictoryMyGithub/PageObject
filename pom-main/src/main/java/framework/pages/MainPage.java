package framework.pages;

import framework.pages.components.ProductComponent;

import java.util.ArrayList;
import java.util.List;

import lombok.SneakyThrows;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MainPage extends BasePage {

    private final By productContainerLocator = By.xpath("//div[@class='product-thumb']");
    private final By brandsButton = By.xpath("//a[text()='Brands']");
    private By loginButton = By.xpath("//ul/li/a[text()='Login']");
    private By myAccountButton = By.xpath("//div/a//span[text()='My Account']");
    private By registerButton = By.xpath("//ul/li/a[text()='Register']");

    public MainPage openMyAccount() {
        find(myAccountButton).click();
        return this;
    }

    public RegisterAccountPage selectRegisterOption() {
        find(registerButton).click();
        return new RegisterAccountPage();
    }

    public MainPage selectDesktops() {
        find(desktopButton).click();
        return this;
    }

    public DesktopPage selectAllDesktop() {
        find(desktopShowAllDesktopButton).click();
        return new DesktopPage();
    }
//button in the footer

    public ManufacturerPage productContainerLocator() {
        find(brandsButton).click();
        return new ManufacturerPage();
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
