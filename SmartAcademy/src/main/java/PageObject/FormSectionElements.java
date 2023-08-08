package PageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class FormSectionElements {
    public SelenideElement
            legalTab = $(byCssSelector("li.tab.iur_tab > a#pis")),
            individualTab = $(byCssSelector("li.tab > a#iur")),
            legalTabSend = $(byId("btn2")),
            nameField = $(byName("name")),
            identificationField = $(byName("personalId")),
            addressField = $(byName("address")),
            phoneField = $(byName("phone")),
            dateField = $(byName("date")),
            emailField = $(byName("email"));
}



