import java.util.TreeMap;

//Input(Object of Name and Phone Number)

//Process (object of Name and phone number is inserted into the phonebook)

//Output(phonebook)

public class Main{
    @SuppressWarnings("rawtypes")
    public static void main(String[] args) {
        phoneBook myPhoneBook = new phoneBook();
        //create 4 people
        myPhoneBook.addDetails("john", 319);
        myPhoneBook.addDetails("john", 303);
        myPhoneBook.addDetails("jack", 320);
        myPhoneBook.addDetails("jack", 319);
        myPhoneBook.addDetails("galo", 200);

        //get numbers
        System.out.println(myPhoneBook.getNumbersAsc("john"));
        System.out.println(myPhoneBook.getNumbersAsc("jack"));
        System.out.println(myPhoneBook.getNumbersAsc("galo"));
        System.out.println(myPhoneBook.getNamesAsc(200));
        System.out.println(myPhoneBook.getNamesAsc(303));
        System.out.println(myPhoneBook.getNamesAsc(319));
        System.out.println(myPhoneBook.getNamesAsc(320));
        
        System.out.println(myPhoneBook.getNumbersDesc("john"));
        System.out.println(myPhoneBook.getNumbersDesc("jack"));
        System.out.println(myPhoneBook.getNumbersDesc("galo"));
        System.out.println(myPhoneBook.getNamesDesc(200));
        System.out.println(myPhoneBook.getNamesDesc(303));
        System.out.println(myPhoneBook.getNamesDesc(319));
        System.out.println(myPhoneBook.getNamesDesc(320));
        //System.out.println(myPhoneBook);
    }
}