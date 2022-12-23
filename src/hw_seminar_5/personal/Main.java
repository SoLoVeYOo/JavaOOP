package hw_seminar_5.personal;

import hw_seminar_5.personal.controllers.UserController;
import hw_seminar_5.personal.model.FileOperation;
import hw_seminar_5.personal.model.FileOperationImpl;
import hw_seminar_5.personal.model.Repository;
import hw_seminar_5.personal.model.RepositoryFile;
import hw_seminar_5.personal.model.RepositoryFileNew;
import hw_seminar_5.personal.views.ViewUser;

public class Main {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationImpl("src/hw_seminar_5/personal/users.txt");
        FileOperation fileOperationNew = new FileOperationImpl("src/hw_seminar_5/personal/usersNew.txt");
        Repository repository = new RepositoryFile(fileOperation);
        Repository repositoryAnother = new RepositoryFileNew(fileOperationNew);
        UserController controller = new UserController(repository);
        UserController controllerAnother = new UserController(repositoryAnother);
        ViewUser view = new ViewUser(controllerAnother);
        view.run();
    }
}
