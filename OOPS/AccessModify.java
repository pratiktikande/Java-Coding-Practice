package OOPS;

public class AccessModify {
    public static void main(String[] args) {

        BankAccount myac = new BankAccount();
        // Access Username due to its Public
        myac.username = "Pratik";
        // You Cant set Password because its Private
        // myac.Password="jgcdis";

        myac.setpassword("jsdif126@hcd");

        System.out.println(myac.username);
    }

}

class BankAccount {
    public String username;
    private String Password;
    String pwd=Password;

    // To set Password we have to create function inside the class
    public void setpassword(String Pwd) {
        Password = Pwd;
    }

}
