public class FormFill
{
    private String fName;
    private String lName;
    private String email;
    private int birthMonth;
    private int birthYear;

    public FormFill(String firstName, String lastName){
        fName = firstName;
        lName = lastName;
    }
    
    public void setBirthday(int month, int year){
        birthMonth = month;
        birthYear = year;
    }

    public void setEmailAddress(String emailAddress){
        email = emailAddress;
    }
    
    public String fullName(){
        return lName + ", " + fName;
    }
    
    public String contactInformation(){
        return lName + "\nEmail: " + email;
    }

    public String birthday(){
        return birthMonth + "/" + birthYear;
    }
    
}