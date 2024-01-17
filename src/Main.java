import WorkWithFile.WriteFile;
import WorkWithFile.addNewPerson;

public class Main {
    public static void main(String[] args) {
        String[] s = addNewPerson.Treatment();
        try {
            WriteFile.writeFile(s);
        } catch (NullPointerException e){
            System.out.println("Добавить запись не удалось");
        }



    }





}