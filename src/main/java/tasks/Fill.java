package tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;
import userinterface.FillPage;

public class Fill implements Task {
    String name,  last_name,  email,  birth_day,  birth_month,
    birth_year,  city,  zip_code,  password;

    public Fill(String name, String last_name, String email, String birth_day, String birth_month, String birth_year,
                String city, String zip_code, String password) {
        this.name = name;
        this.last_name = last_name;
        this.email = email;
        this.birth_day = birth_day;
        this.birth_month = birth_month;
        this.birth_year = birth_year;
        this.city = city;
        this.zip_code = zip_code;
        this.password = password;
    }

    public static Performable the(String name, String last_name, String email, String birth_day, String birth_month,
                                  String birth_year, String city, String zip_code, String password) {
        return Tasks.instrumented(Fill.class, name,  last_name,  email,  birth_day,  birth_month,
                 birth_year,  city,  zip_code,  password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(name).into(FillPage.NAME),
                Enter.theValue(last_name).into(FillPage.LAST_NAME),
                Enter.theValue(email).into(FillPage.EMAIL),
                Click.on(FillPage.BIRTH_MONTH),
                Click.on(FillPage.BIRTH_DAY),
                Click.on(FillPage.BIRTH_YEAR),
                Click.on(FillPage.BUTTON_NEXT_LOCATION),
                Enter.theValue(city).into(FillPage.CITY),
                Hit.the(Keys.ARROW_DOWN).into(FillPage.CITY),
                Hit.the(Keys.ENTER).into(FillPage.CITY),
                Enter.theValue(zip_code).into(FillPage.ZIP_CODE),
                Click.on(FillPage.BUTTON_NEXT_DIVICE),
                Click.on(FillPage.BUTTON_NEXT_DIVICE),
                Enter.theValue(password).into(FillPage.PASSWORD),
                Enter.theValue(password).into(FillPage.RE_PASSWORD),
                Click.on(FillPage.STAY_INFORMED),
                Click.on(FillPage.TERMS_USE),
                Click.on(FillPage.PRIVACY_POLITICS)



        );


    }
}
