import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class AccountElements {

    SelenideElement image = $(By.cssSelector("#user-info__avatar"));
    SelenideElement currentLogin = $(By.xpath("/html[1]/body[1]/app-root[1]/app-user[1]/div[1]/div[1]/div[1]/div[1]/h1[1]/span[1]"));
    SelenideElement currentEmail = $(By.xpath("/html[1]/body[1]/app-root[1]/app-user[1]/div[1]/div[1]/div[1]/div[1]/h1[2]/span[1]"));
    SelenideElement changeData = $(By.cssSelector("#change-info-btn"));
        SelenideElement changeDataHeader = $(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/mat-dialog-container[1]/app-edit-user[1]/h1[1]"));
        SelenideElement changeLoginInput = $(By.cssSelector("#mat-form-field-login__input"));
        SelenideElement changeDataButton = $(By.cssSelector("#actions__edit"));
    SelenideElement addNews = $(By.cssSelector("#add-post-btn"));
        SelenideElement addNewPostHeader = $(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/mat-dialog-container[1]/app-add-news[1]/form[1]/h1[1]"));
        SelenideElement newPostName = $(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/mat-dialog-container[1]/app-add-news[1]/form[1]/div[1]/mat-form-field[1]/div[1]/div[1]/div[3]/input[1]"));
        SelenideElement newPostDescription = $(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/mat-dialog-container[1]/app-add-news[1]/form[1]/div[1]/mat-form-field[2]/div[1]/div[1]/div[3]/textarea[1]"));
        SelenideElement newPostTags = $(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/mat-dialog-container[1]/app-add-news[1]/form[1]/div[1]/mat-form-field[3]/div[1]/div[1]/div[3]/input[1]"));
        SelenideElement newPostImg = $(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/mat-dialog-container[1]/app-add-news[1]/form[1]/input[1]"));
        SelenideElement newPostSubmitButton = $(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/mat-dialog-container[1]/app-add-news[1]/form[1]/div[2]/button[1]"));
    SelenideElement deleteUser = $(By.cssSelector("#remove-user-btn"));
}
