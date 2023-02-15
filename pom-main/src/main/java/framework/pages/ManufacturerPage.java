package framework.pages;

public class ManufacturerPage extends BasePage  {
    //Check that following brands exists on page [Apple,Canon,Hewlett-Packard,HTC,Palm,Sony]
    private final By brandApple = By.xpath ("//a[text()='Apple']");
    private final By brandCanon = By.xpath ("//a[text()='Canon']");
    private final By brandHewlettPackard = By.xpath ("//a[text()='Hewlett-Packard']");
    private final By brandHTC = By.xpath ("//a[text()='HTC']");
    private final By brandPalm = By.xpath ("//a[text()='Palm']");
    private final By brandSony = By.xpath ("//a[text()='Sony']");

    @Override
    public WebElement find(By brandApple) {
        return super.find(brandApple);
    }
}
