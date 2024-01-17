package GenderCheck;

public class CheckGender implements GenderCheck{

    @Override
    public boolean isValid(String gender) {
        if(gender.equals("М") || gender.equals("Ж")){
            return true;
        } else {
            System.out.println("Пол указан не верно, доступен ввод только М и Ж");
            return false;
        }

    }
}
