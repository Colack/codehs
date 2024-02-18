public class PhonebookTester
{
    public static void main(String[] args)
    {
        Phonebook test = new Phonebook();
        test.addContact(new Contact("Kevin", "phone", "12312312"));
        test.addContact(new Contact("Bob", "phone", "12312312"));
        test.printPhonebook();
    }
}