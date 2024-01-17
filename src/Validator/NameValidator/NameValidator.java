package Validator.NameValidator;

public class NameValidator implements CheckName {
    @Override
    public boolean isValid(String name) {
        boolean hasDigits = true;
        for (int i = 0; i < name.length() && hasDigits; i++) {
            if (Character.isDigit(name.charAt(i))) {
                System.out.println("В фамилии имени и отчестве не может быть цифр");
                hasDigits = false;
            }
        }
        return hasDigits;
    }
}
