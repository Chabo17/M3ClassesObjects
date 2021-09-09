package AddressBook.Ui;

import AddressBook.Dto.Address;
import java.util.List;


public class AddressBookView {

    private UserIO io;// = new UserIOConsoleImpl();

    public AddressBookView(UserIO io) {
        this.io = io;
    }

    public int printMenuAndGetSelection() {
        io.print("Main Menu");
        io.print("1. List Students");
        io.print("2. Create New Address");
        io.print("3. View a Address");
        io.print("4. Remove a Address");
        io.print("5. Exit");

        return io.readInt("Please select from the above choices.", 1, 5);
    }
    public Address getNewStudentInfo() {
        String studentId = io.readString("Please enter Address ID");
        String firstName = io.readString("Please enter First Name");
        String lastName = io.readString("Please enter Last Name");
        String cohort = io.readString("Please enter Cohort");
        Address currentStudent = new Address(studentId);
        currentStudent.setFirstName(firstName);
        currentStudent.setLastName(lastName);
        currentStudent.setCohort(cohort);
        return currentStudent;
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

    public void displayCreateStudentBanner() {
        io.print("=== Create Address ===");
    }

    public void displayCreateSuccessBanner() {
        io.readString(
                "Address successfully created.  Please hit enter to continue");
    }
    public void displayDisplayAllBanner() {
        io.print("=== Display All Students ===");
    }

    public void displayDisplayStudentBanner () {
        io.print("=== Display Address ===");
    }
    
    public String getStudentIdChoice() {
        return io.readString("Please enter the Address ID.");
    }
    
    public void displayStudent(Address Address) {
        if (Address != null) {
            io.print(Address.getStudentId());
            io.print(Address.getFirstName() + " " + Address.getLastName());
            io.print(Address.getCohort());
            io.print("");
        } else {
            io.print("No such Address.");
        }
        io.readString("Please hit enter to continue.");
    }

    public void displayRemoveStudentBanner () {
        io.print("=== Remove Address ===");
    }
    
    public void displayRemoveResult(Address studentRecord) {
        if(studentRecord != null){
          io.print("Address successfully removed.");
        }else{
          io.print("No such Address.");
        }
        io.readString("Please hit enter to continue.");
    }

    public void displayExitBanner() {
        io.print("Good Bye!!!");
    }
    
    public void displayUnknownCommandBanner() {
        io.print("Unknown Command!!!");
    }

    public void displayErrorMessage(String errorMsg) {
        io.print("=== ERROR ===");
        io.print(errorMsg);
    }

}