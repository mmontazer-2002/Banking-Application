package ir.logic;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoginTest {
    @Test
    public void testLogin(){
        Login logIn = new Login();
        String message = logIn.enter("user1","1234");
        assertEquals("You have logged in successfully",message);
    }

}
