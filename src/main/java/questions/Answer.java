package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.FillPage;

public class Answer implements Question<Boolean> {
    String question;

    public Answer(String question) {
        this.question = question;
    }

    public static Object toThe(String text_successful) {
    return new Answer(text_successful);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean result=Boolean.FALSE;
        String textToView= Text.of(FillPage.TEXT_TO_VERIFY).viewedBy(actor).asString();
        result= (textToView.contains(question))?Boolean.TRUE:Boolean.FALSE;
        return result;
    }

    @Override
    public String getSubject() {
        return null;
    }
}
