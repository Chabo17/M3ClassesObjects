package CodeAllongClassRoster.ClassRoster;


import CodeAllongClassRoster.Controller.ClassRosterController;
import CodeAllongClassRoster.Dao.ClassRosterDao;
import CodeAllongClassRoster.Dao.ClassRosterDaoFileImpl;
import CodeAllongClassRoster.ui.ClassRosterView;
import CodeAllongClassRoster.ui.UserIO;
import CodeAllongClassRoster.ui.UserIOConsoleImpl;


public class App {

    public static void main(String[] args) {
        UserIO myIo = new UserIOConsoleImpl();
        ClassRosterView myView = new ClassRosterView(myIo);
        ClassRosterDao myDao = new ClassRosterDaoFileImpl();
        ClassRosterController controller =
        new ClassRosterController(myDao, myView);
        controller.run();
    }  
}