import java.util.ArrayList;

public class Phonebook
{
    private ArrayList<Contact> contacts = new ArrayList<Contact>();
    
    public void addContact(Contact contact)
    {
        contacts.add(contact);
        sort();
    }
    
    public void sort()
    {
        for(int i = 0; i < contacts.size(); i++)
        {
            for(int j = i + 1; j < contacts.size(); j++)
            {
                Contact person1 = contacts.get(i);
                Contact person2 = contacts.get(j);

                if (person1.getName().compareTo(person2.getName()) > 0) {
                    
                    Contact temp = contacts.get(i);
                    contacts.set(i, contacts.get(j));
                    contacts.set(j, temp);
                }
            }
        }
    }
    
    public void printPhonebook() 
    {
        for(Contact person : contacts)
        {
            System.out.println(person.getName());
        }
    }
}