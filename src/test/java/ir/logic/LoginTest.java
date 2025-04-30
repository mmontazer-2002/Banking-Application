package ir.logic;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoginTest {
    @Test
    public void ifUserLogsInSuccessfully(){
        Login logIn = new Login();
        assertDoesNotThrow(()-> logIn.enter("user1", "1234"));
    }

    @Test
    public void ifUserFailsToLogIn() {
        Login logIn = new Login();
        assertThrows(CustomLoginException.class, () -> logIn.enter("wrongUserName","wrongPassWord"));
    }

}
