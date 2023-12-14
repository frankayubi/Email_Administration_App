package emailapp;
import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailboxCapacity;
    private String alternateEmail;
    private int defaultPasswordLength = 10;
    private String companySuffix = "mycompany.com";

    //Constructor to recieve the first name and last name
    public Email (){
        nameRequest();
        //System.out.println("Email Created: " + this.firstName + " " + this.lastName);

        //Call a method asking for department - return the department
        this.department = setDepartment();
        //System.out.println("Department: " + this.department);

        //Call a method that returns a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your Password is: " + this.password);

        //Combine elements to generate email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
        //System.out.println("Your email is :" + this.email);
    }

    private void nameRequest(){
        System.out.print("Enter your first name : ");
        Scanner scan = new Scanner(System.in);
        this.firstName = scan.nextLine();

        System.out.print("Enter your last name : ");
        this.lastName = scan.nextLine();
     

        

    }

    //Ask for the department
    private String setDepartment(){
        System.out.print("New worker: " + firstName + "\nDEPARTMENT CODES:\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code:");
        Scanner scan = new Scanner(System.in);
        int depChoice = scan.nextInt();
        scan.close();

        if (depChoice == 1) {return "sales"; }
        else if (depChoice == 2) {return "dev";}
        else if (depChoice == 3) {return "acct";}
        else {return "";}
       

    }

    //Generate a random password
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890@#$%";
        char[] password = new char[length];
        for (int i =0; i<length; i++){
            int rand = (int)(Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);

        }
        return new String(password);


    }

    //Set the mailbox capacity
    public void setMailBoxCapacity(int capacity){
        this.mailboxCapacity = capacity;

    }



    // Set the alternate email
    public void setAlternateEmail(String altEmail){
        this.alternateEmail = altEmail;
    }

    // Change the password
    public void changePassword(String password){
        this.password = password;
    }

    public int getMailboxCapacity() { return mailboxCapacity;}
    public String getAlternateEmail() {return alternateEmail;}
    public String getPassword() {return password;}

    public String showInfo() {
        return "DISPLAY NAME: " + firstName + " " + lastName +
                "\nCOMPANY EMAIL: " + email +
                "\nMAILBOX CAPACITY: " + mailboxCapacity + "mb";
    }


}
