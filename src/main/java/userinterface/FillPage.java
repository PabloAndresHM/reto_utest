package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FillPage {
    public static final Target NAME= Target.the("Where we write the name").located(By.id("firstName"));
    public static final Target LAST_NAME= Target.the("Where we write the name").located(By.id("lastName"));
    public static final Target EMAIL= Target.the("Where we write the lastname").located(By.id("email"));
    public static final Target BIRTH_DAY= Target.the("Where we select the day of birth").located(By.xpath("//*[@id=\"birthDay\"]/option[18]"));
    public static final Target BIRTH_MONTH= Target.the("Where we select the month of birth").located(By.xpath("//*[@id=\"birthMonth\"]/option[6]"));
    public static final Target BIRTH_YEAR= Target.the("Where we select the year of birth").located(By.xpath("//*[@id=\"birthYear\"]/option[13]"));
    public static final Target CITY= Target.the("Where we write the city").located(By.id("city"));
    public static final Target ZIP_CODE= Target.the("Where we write the zip code").located(By.id("zip"));
    public static final Target PASSWORD= Target.the("Where we write the password").located(By.id("password"));
    public static final Target RE_PASSWORD= Target.the("Where we write the password confirmation").located(By.id("confirmPassword"));
    public static final Target STAY_INFORMED= Target.the("Select the check 1 ").located(By.className("signup-consent__text--highlight"));
    public static final Target TERMS_USE= Target.the("Select the check 2").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target PRIVACY_POLITICS= Target.the("Select the check 3").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static final Target BUTTON_NEXT_LOCATION= Target.the("button next").located(By.className("btn-blue"));
    public static final Target BUTTON_NEXT_DIVICE= Target.the("button next").located(By.className("btn-blue"));
    public static final Target TEXT_TO_VERIFY= Target.the("TEXT TO VERIFY").located(By.className("sub-title"));

}
