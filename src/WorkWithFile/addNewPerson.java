package WorkWithFile;

import Validator.NameValidator.NameValidator;
import Validator.PhoneValidator.CheckPhoneNumber;
import Validator.DateValidator.DateValidatorUsingDateFormat;
import Validator.GenderValidator.CheckGender;
import Validator.LengthValidator.LengthValidatorUse;

import java.util.Scanner;

public class addNewPerson {

    static public String[] Treatment() {
        Scanner sc = new Scanner(System.in);
        DateValidatorUsingDateFormat dateFormat = new DateValidatorUsingDateFormat("dd.MM.yyyy");
        LengthValidatorUse length = new LengthValidatorUse();
        CheckPhoneNumber checkPhoneNumber = new CheckPhoneNumber();
        CheckGender checkGender = new CheckGender();
        NameValidator nameValidator = new NameValidator();
        System.out.println("Введите данные в формате: Иванов Иван Иванович 03.07.1991 89990000000 M/Ж");
        String[] input = sc.nextLine().split(" ");
        if (length.lengthValidator(input) && nameValidator.isValid(input[0])
        && nameValidator.isValid(input[1]) && nameValidator.isValid(input[2])
        && dateFormat.isValid(input[3]) && checkPhoneNumber.isValid(input[4])
        && checkGender.isValid(input[5])) {
            System.out.println("Запись успешно добавлена");
            return input;
        } else {
            return null;
        }
    }


}
