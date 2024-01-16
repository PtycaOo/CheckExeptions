package LengthValidator;

public class LengthValidatorUse implements LengthValidator{
    @Override
    public boolean lengthValidator(String[] string) {
        if (string.length < 6) {
            System.out.println("Введены не все данные");
            return false;
        } else if (string.length > 6) {
            System.out.println("ВВедены лишние данные");
            return false;
        }
        return true;
    }
}
