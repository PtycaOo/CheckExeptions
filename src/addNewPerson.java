import CheckPhoneNumber.CheckNumber;
import CheckPhoneNumber.CheckPhoneNumber;
import DateValidator.DateValidatorUsingDateFormat;
import LengthValidator.LengthValidatorUse;

import java.util.Scanner;

public class addNewPerson {

    static public String[] Treatment() {
        Scanner sc = new Scanner(System.in);
        DateValidatorUsingDateFormat dateFormat = new DateValidatorUsingDateFormat("dd.MM.yyyy");
        LengthValidatorUse length = new LengthValidatorUse();
        CheckPhoneNumber checkPhoneNumber = new CheckPhoneNumber();
        System.out.println("Введите данные в формате: Иванов Иван Иванович 03.07.1991 89990000000 M");
        String[] input = sc.nextLine().split(" ");
        if (length.lengthValidator(input) && dateFormat.isValid(input[3]) && checkPhoneNumber.isValid(input[4])) {
            return input;
        } else {
            return null;
        }
    }


}
