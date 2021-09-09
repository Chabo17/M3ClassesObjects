package AddressBook.Controller;



import AddressBook.Ui.UserIO;
import AddressBook.Ui.UserIOConsoleImpl;
import AddressBook.Ui.AddressBookView;

import AddressBook.Dao.AddressBookDao;
import AddressBook.Dao.AddressBookDaoException;
import AddressBook.Dto.Address;

import java.util.List;

public class Controller {

    private AddressBookView view;// = new AddressBookView();
    private AddressBookDao dao;// = new AddressBookDaoFileImpl();
    private UserIO io = new UserIOConsoleImpl();
    

    public Controller(){}

    public Controller(AddressBookDao dao, AddressBookView view) {
        this.dao = dao;
        this.view = view;
    }

    public void run() {
        boolean keepGoing = true;
        int menuSelection = 0;
        try {
            while (keepGoing) {
    
                menuSelection = getMenuSelection();
    
                switch (menuSelection) {
                    case 1:
                        listStudents();
                        break;
                    case 2:
                        createStudent();
                        break;
                    case 3:
                        viewStudent();
                        break;
                    case 4:
                        removeStudent();
                        break;
                    case 5:
                        keepGoing = false;
                        break;
                    default:
                        unknownCommand();
                }
    
            }
            exitMessage();
        } catch (AddressBookDaoException e) {
            view.displayErrorMessage(e.getMessage());
        }
    }

    private int getMenuSelection() {
        return view.printMenuAndGetSelection();
    }

    private void createStudent() throws AddressBookDaoException {
        view.displayCreateStudentBanner();
        Address newStudent = view.getNewStudentInfo();
        dao.addStudent(newStudent.getStudentId(), newStudent);
        view.displayCreateSuccessBanner();
    }

    public void displayStudentList(List<Address> studentList) {
        for (Address currentStudent : studentList) {
            String studentInfo = String.format("#%s : %s %s",
                  currentStudent.getStudentId(),
                  currentStudent.getFirstName(),
                  currentStudent.getLastName());
            io.print(studentInfo);
        }
        io.readString("Please hit enter to continue.");
    }
    private void listStudents() throws AddressBookDaoException {
        view.displayDisplayAllBanner();
        List<Address> studentList = dao.getAllStudents();
        view.displayStudentList(studentList);
    }

    private void viewStudent() throws AddressBookDaoException {
        view.displayDisplayStudentBanner();
        String studentId = view.getStudentIdChoice();
        Address Address = dao.getStudent(studentId);
        view.displayStudent(Address);
    }

    private void removeStudent() throws AddressBookDaoException {
        view.displayRemoveStudentBanner();
        String studentId = view.getStudentIdChoice();
        Address removedStudent = dao.removeStudent(studentId);
        view.displayRemoveResult(removedStudent);
    }

    private void unknownCommand() {
        view.displayUnknownCommandBanner();
    }
    
    private void exitMessage() {
        view.displayExitBanner();
    }

}