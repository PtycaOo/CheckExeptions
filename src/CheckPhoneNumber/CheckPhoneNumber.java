package CheckPhoneNumber;

public class CheckPhoneNumber implements CheckNumber{

    @Override
    public boolean isValid(String phone) {
        if(phone.length() != 11 && Integer.parseInt(phone.substring(0,1))!=7 || Integer.parseInt(phone.substring(0,1)) !=8){
            return false;
        }
        return true;
    }
}
