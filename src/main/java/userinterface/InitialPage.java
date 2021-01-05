package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.utest.com/")
public class InitialPage  extends PageObject {
    public static final Target JOIN_BUTTON= Target.the("Button to start thhe creation of a profile").located(
            By.className("unauthenticated-nav-bar__sign-up"));
}
