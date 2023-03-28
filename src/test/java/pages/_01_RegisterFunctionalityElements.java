package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BasicDriver;
import utilities.MyMethods;

import java.util.List;

public class _01_RegisterFunctionalityElements extends MyMethods {

    public _01_RegisterFunctionalityElements() {

        PageFactory.initElements(BasicDriver.getDriver(), this);

    }
    @FindBy(xpath = "//span[text()='My Account']")
    private WebElement myAccountButton;

    @FindBy(linkText = "Register")
    private WebElement registerButton;

    @FindBy(linkText = "Login")
    private WebElement loginButton;

    @FindBy(css = "#content>h1")
    private WebElement accountHeader;

    @FindBy(id = "input-firstname")
    private WebElement firstNameInput;

    @FindBy(id = "input-lastname")
    private WebElement lastNameInput;

    @FindBy(id = "input-email")
    private WebElement emailInput;

    @FindBy(id = "input-telephone")
    private WebElement telephoneInput;

    @FindBy(id = "input-password")
    private WebElement passwordInput;

    @FindBy(id = "input-confirm")
    private WebElement confirmPasswordInput;

    @FindBy(xpath = "(//label[@class='radio-inline'])[1]")
    private WebElement newsletterSubscribeYesButton;

    @FindBy(xpath = "(//label[@class='radio-inline'])[2]")
    private WebElement newsletterSubscribeNoButton;

    @FindBy(css = "input[type='checkbox']")
    private WebElement privacyPolicyCheckBox;

    @FindBy(css = "input.btn.btn-primary")
    private WebElement continueButton;

    @FindBy(css = "a.btn.btn-primary")
    private WebElement continueButtonAccountSuccess;

    @FindBy(css = "div[id='content']>h1")
    private WebElement accountSuccessPageHeader;

    @FindBy(xpath = "//h2[text()='My Account']")
    private WebElement myAccountPageHeader;

    @FindBy(xpath = "//div[text()='First Name must be between 1 and 32 characters!']")
    private WebElement errorMessageFirstName;

    @FindBy(xpath = "//div[text()='Last Name must be between 1 and 32 characters!']")
    private WebElement errorMessageLastName;

    @FindBy(xpath = "//div[text()='E-Mail Address does not appear to be valid!']")
    private WebElement errorMessageEmail;

    @FindBy(xpath = "//div[text()='Password must be between 4 and 20 characters!']")
    private WebElement errorMessagePassword;

    @FindBy(xpath = "//div[text()='Password confirmation does not match password!']")
    private WebElement errorMessageConfirmPassword;

    @FindBy(css = "div.alert.alert-danger.alert-dismissible")
    private WebElement errorMessagePrivacyPolicy;

    @FindBy(xpath = "//div[text()='Telephone must be between 3 and 32 characters!']")
    private WebElement errorMessageTelephone;

    @FindBy(xpath = "//div[@id='content']//p// a")
    private WebElement loginPageLink;

    @FindBy(css = ".list-group>a")
    private WebElement rightColumnOptions;

    @FindBy(xpath = "//footer//div[@class='container']//div[@class='col-sm-3']//ul//li")
    private WebElement footerLinks;

    @FindBy(xpath = "//h2[text()='New Customer']")
    private WebElement loginPageHeader;

    @FindBy(xpath = "//h1[text()='Account']")
    private WebElement registerPageHeader;

    @FindBy(xpath = "//legend[text()='Your E-Mail Address']")
    private WebElement forgottenPasswordPageHeader;

    @FindBy(css = "div[id='content']>h1,h2,h3")
    private WebElement rightColumnHeader;

    @FindBy(xpath = "//div[@class='list-group']//a[text()='Register']")
    private WebElement registerRightColumn;

    @FindBy(xpath = "//div[@class='list-group']//a[text()='Forgotten Password']")
    private WebElement forgottenPasswordRightColumn;

    @FindBy(css = "div[id='content']>h1,h2,h3")
    private WebElement footerHeader;

    @FindBy(css = "body > footer > div > div > div > ul > li > a")
    private List<WebElement> footerLink;

    @FindBy(css = "div[id='content']>h1,h2,h3")
    private WebElement menuHeader;

    @FindBy(xpath = "//a[text()='Cameras']")
    private WebElement camerasLink;

    @FindBy(css = "span#cart-total")
    private WebElement cartTotalCurrency;

    @FindBy(css = "i.fa.fa-phone")
    private WebElement contactButton;

    @FindBy(xpath = "//a[text()='Newsletter']")
    private WebElement newsletterButton;

    @FindBy(xpath = "//input[@type='radio']")
    private WebElement yesButton;

    @FindBy(css = "a.btn.btn-primary")
    private WebElement continueButtonNewCustomer;

    @FindBy(xpath = "//div[text()=' Warning: E-Mail Address is already registered!']")
    private WebElement errorEmailRegistered;


    public WebElement getMyAccountButton() {
        return myAccountButton;
    }

    public WebElement getRegisterButton() {
        return registerButton;
    }

    public WebElement getLoginButton() {
        return loginButton;
    }

    public WebElement getAccountHeader() {
        return accountHeader;
    }

    public WebElement getFirstNameInput() {
        return firstNameInput;
    }

    public WebElement getLastNameInput() {
        return lastNameInput;
    }

    public WebElement getEmailInput() {
        return emailInput;
    }

    public WebElement getTelephoneInput() {
        return telephoneInput;
    }

    public WebElement getPasswordInput() {
        return passwordInput;
    }

    public WebElement getConfirmPasswordInput() {
        return confirmPasswordInput;
    }

    public WebElement getNewsletterSubscribeYesButton() {
        return newsletterSubscribeYesButton;
    }

    public WebElement getNewsletterSubscribeNoButton() {
        return newsletterSubscribeNoButton;
    }

    public WebElement getPrivacyPolicyCheckBox() {
        return privacyPolicyCheckBox;
    }

    public WebElement getContinueButton() {
        return continueButton;
    }

    public WebElement getContinueButtonAccountSuccess() {
        return continueButtonAccountSuccess;
    }

    public WebElement getAccountSuccessPageHeader() {
        return accountSuccessPageHeader;
    }

    public WebElement getMyAccountPageHeader() {
        return myAccountPageHeader;
    }

    public WebElement getErrorMessageFirstName() {
        return errorMessageFirstName;
    }

    public WebElement getErrorMessageLastName() {
        return errorMessageLastName;
    }

    public WebElement getErrorMessageEmail() {
        return errorMessageEmail;
    }

    public WebElement getErrorMessagePassword() {
        return errorMessagePassword;
    }

    public WebElement getErrorMessageConfirmPassword() {
        return errorMessageConfirmPassword;
    }

    public WebElement getErrorMessagePrivacyPolicy() {
        return errorMessagePrivacyPolicy;
    }

    public WebElement getErrorMessageTelephone() {
        return errorMessageTelephone;
    }

    public WebElement getLoginPageLink() {
        return loginPageLink;
    }

    public WebElement getFooterLinks() {
        return footerLinks;
    }

    public WebElement getLoginPageHeader() {
        return loginPageHeader;
    }

    public WebElement getRegisterPageHeader() {
        return registerPageHeader;
    }

    public WebElement getForgottenPasswordPageHeader() {
        return forgottenPasswordPageHeader;
    }

    public WebElement getRightColumnHeader() {
        return rightColumnHeader;
    }

    public WebElement getRightColumnOptions() {
        return rightColumnOptions;
    }

    public WebElement getRegisterRightColumn() {
        return registerRightColumn;
    }

    public WebElement getForgottenPasswordRightColumn() {
        return forgottenPasswordRightColumn;
    }

    public WebElement getFooterHeader() {
        return footerHeader;
    }

    public List<WebElement> getFooterLink() {
        return footerLink;
    }

    public WebElement getMenuHeader() {
        return menuHeader;
    }

    public WebElement getCamerasLink() {
        return camerasLink;
    }

    public WebElement getCartTotalCurrency() {
        return cartTotalCurrency;
    }

    public WebElement getContactButton() {
        return contactButton;
    }

    public WebElement getNewsletterButton() {
        return newsletterButton;
    }

    public WebElement getYesButton() {
        return yesButton;
    }

    public WebElement getContinueButtonNewCustomer() {
        return continueButtonNewCustomer;
    }

    public WebElement getErrorEmailRegistered() {
        return errorEmailRegistered;
    }
}


