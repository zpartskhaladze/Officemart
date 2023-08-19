package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class SearchElements {
    public SelenideElement
            searchBtnMinimized = $(byClassName("search")),
            searchField = $(byClassName("form_group")),
            searchInput = $(byName("search")),
            searchBtnExpanded = $(byClassName("search_button")),
            searchResult1 = $(".prod_title h4"),
            invalidSearch = $(byText("ვერაფერი მოიძებნა"));


}
