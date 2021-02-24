package tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class DragAndDrop {
    @BeforeAll
    static void setup(){
        Configuration.startMaximized = true;
}
    // маленькая диагональ дисплея
    @Test
    void DragAndDropTest (){
    open("https://the-internet.herokuapp.com/drag_and_drop");
    $("#column-a").shouldHave(text("A"));
    $("#column-b").shouldHave(text("B"));
    sleep(1000);
    $("#column-a").dragAndDropTo("#column-b");
    $("#column-a").shouldHave(text("B"));
    $("#column-b").shouldHave(text("A"));
    sleep(1000);
    // sleep - для наглядности
    }
}
