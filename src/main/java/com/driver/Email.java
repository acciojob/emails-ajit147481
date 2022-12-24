package com.driver;

public class Email {

    private String emailId;
    private String password;

    public Email(String emailId){
        this.emailId = emailId;
        this.password = "Accio@123";
    }

    public Email() {

    }

    public String getEmailId() {
        return emailId;
    }

    public String getPassword() {
        return password;
    }

    public void changePassword(String oldPassword, String newPassword){
        //Change password only if the oldPassword is equal to current password and the new password meets all of the following:
        // 1. It contains at least 8 characters
        // 2. It contains at least one uppercase letter
        // 3. It contains at least one lowercase letter
        // 4. It contains at least one digit
        // 5. It contains at least one special character. Any character apart from alphabets and digits is a special character
        boolean lower=false;
        boolean upper=false;
        boolean digit=false;
        boolean s_char=false;
        for(int i=0;i<oldPassword.length();i++){
            if(Character.isDigit(oldPassword.charAt(i))==true){
                digit=true;
            }
            else
            if(Character.isLowerCase(oldPassword.charAt(i))==true){
                lower=true;
            } else if (Character.isUpperCase(oldPassword.charAt(i))==true) {
                upper=true;
            }else{
                s_char=true;
            }
        }
        if(oldPassword==this.password && oldPassword.length()>=8 && digit && lower && upper && s_char){
            this.password=newPassword;
        }
    }
}
