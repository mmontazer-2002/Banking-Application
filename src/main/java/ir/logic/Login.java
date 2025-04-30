package ir.logic;

public class Login {

    public void enter(String userName, String password) throws CustomLoginException {
        if (userName.equals("user1") && password.equals("1234")){
            return;
        }
        else throw new CustomLoginException();
    }
}
