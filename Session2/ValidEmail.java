package test;

public class ValidEmail {
    public static void validEmail(String email) {
        boolean valid = false;
        // Step 1: only one "@"
        if (email.indexOf("@") == email.lastIndexOf("@")) {
//            int atPos = email.indexOf("@");

            // Step 2: @ not first and not last
            if (email.indexOf("@") > 0 && email.indexOf("@") < email.length() -1){
//                int dot = email.indexOf(".", atPos);

                // Step 3: check for "." after "@"
                if(email.indexOf(".", email.indexOf("@")) > email.indexOf("@") &&
                        email.indexOf(".", email.indexOf("@")) < email.length() -1){
                    valid  = true;
                }
            }
        }
        System.out.println(valid);
    }

    public static void main(String[] args) {
        String email = " sddf234@gmail.com";
        String email1 = "dgd@com";
        validEmail(email);
        validEmail(email1);
    }
}
