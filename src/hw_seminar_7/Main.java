package hw_seminar_7;

public class Main {
    public static void main(String[] args) throws Exception {
        NoteOperation noteOperation = new NoteOperationImpl();
        NoteMapper noteMapper = new NoteMapper();
        FileOperation fileOperation = new FileOperationImpl(
                "src/hw_seminar_7/notes.txt", noteMapper);
        Operate operate = new Operate(fileOperation, noteOperation);
        NoteCreator noteCreator = new NoteCreator();
        View view = new View(noteCreator, operate);
        view.run();

    }
}
