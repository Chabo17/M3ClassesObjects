package AddressBook.App;

import AddressBook.Controller.Controller;
import AddressBook.Dao.AddressBookDao;
import AddressBook.Dao.AddressBookFileImpl;
import AddressBook.Ui.AddressBookView;
import AddressBook.Ui.UserIO;
import AddressBook.Ui.UserIOConsoleImpl;


public class App {

    public static void main(String[] args) {
        UserIO myIo = new UserIOConsoleImpl();
        AddressBookView myView = new AddressBookView(myIo);
        AddressBookDao myDao = new AddressBookFileImpl();
        Controller controller =
        new Controller(myDao, myView);
        controller.run();
    }  
}