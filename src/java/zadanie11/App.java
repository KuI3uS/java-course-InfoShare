package zadanie11;

import java.io.IOException;
import java.text.MessageFormat;

public class App {
    public static void main(String []args) {
        System.out.println ( "podaj login" );
        String username = Util.readUserInput ();
        System.out.println ( "podaj hasło" );
        String password = Util.readUserInput ();

        User user = new User ( username );

        System.out.println (
                "New user with\nusername :" +
                        user.getUsername () + "\npassword :" +
                        user.getUsername ()
        );

    }
    public static void something(ParameterObject arg) {

    }
        private class ParameterObject {
            String arg1;
            int arg2;
            boolean arg3;

            public ParameterObject(String arg1, int arg2, boolean arg3) {
                this.arg1 = arg1;
                this.arg2 = arg2;
                this.arg3 = arg3;
            }
        }

    }
