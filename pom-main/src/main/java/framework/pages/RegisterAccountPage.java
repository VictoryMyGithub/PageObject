package framework.pages;

public class RegisterAccountPageextends BasePage {
    private By firstNameField = By.xpath("//div/input[@id='input-firstname']");
    private By lastNameField = By.xpath("//div/input[@id='input-lastname']");
    private By emailField = By.xpath("//div/input[@id='input-email']");
    private By passwordField = By.xpath("//div/input[@id='input-password']");
}
