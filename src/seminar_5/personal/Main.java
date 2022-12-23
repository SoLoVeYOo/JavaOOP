package seminar_5.personal;

import seminar_5.personal.controllers.UserController;
import seminar_5.personal.model.FileOperation;
import seminar_5.personal.model.FileOperationImpl;
import seminar_5.personal.model.Repository;
import seminar_5.personal.model.RepositoryFile;
import seminar_5.personal.views.ViewUser;

public class Main {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationImpl("users.txt");
        Repository repository = new RepositoryFile(fileOperation);
        UserController controller = new UserController(repository);
        ViewUser view = new ViewUser(controller);
        view.run();
    }
}
