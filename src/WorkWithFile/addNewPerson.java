package WorkWithFile;

import CheckPhoneNumber.CheckPhoneNumber;
import DateValidator.DateValidatorUsingDateFormat;
import GenderCheck.CheckGender;
import LengthValidator.LengthValidatorUse;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class addNewPerson {

    static public String[] Treatment() {
        Scanner sc = new Scanner(System.in);
        DateValidatorUsingDateFormat dateFormat = new DateValidatorUsingDateFormat("dd.MM.yyyy");
        LengthValidatorUse length = new LengthValidatorUse();
        CheckPhoneNumber checkPhoneNumber = new CheckPhoneNumber();
        CheckGender checkGender = new CheckGender();
        System.out.println("Введите данные в формате: Иванов Иван Иванович 03.07.1991 89990000000 M/Ж");
        String[] input = sc.nextLine().split(" ");
        if (length.lengthValidator(input) && dateFormat.isValid(input[3]) && checkPhoneNumber.isValid(input[4]) && checkGender.isValid(input[5])) {
            System.out.println("Запись успешно добавлена");
            return input;
        } else {
            return null;
        }
    }


}
