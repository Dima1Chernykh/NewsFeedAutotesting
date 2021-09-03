import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HeaderElements {
    SelenideElement enterButton = $(By.cssSelector("#tool-bar__login"));
    SelenideElement homeButton = $(By.cssSelector("#home-icon__default"));
    SelenideElement accountCircleButton = $(By.cssSelector("#profile-icon__avatar"));
    SelenideElement quitButton = $(By.cssSelector("#tool-bar__logout"));

    SelenideElement helloHeader = $(By.cssSelector("#tool-bar__greeting"));

}
