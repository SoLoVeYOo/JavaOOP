package hw_seminar_6.Note;

import hw_seminar_6.Note.controller.NoteController;
import hw_seminar_6.Note.models.FileOperation;
import hw_seminar_6.Note.models.FileOperationImpl;
import hw_seminar_6.Note.models.NoteManager;
import hw_seminar_6.Note.models.NoteManagerImpl;
import hw_seminar_6.Note.views.NoteAdder;
import hw_seminar_6.Note.views.ViewNote;

public class Main {
    public static void main(String[] args) {
        
        FileOperation fileOperation = new FileOperationImpl("src/hw_seminar_6/Note/notes.txt");
        NoteManager noteManagerImpl = new NoteManagerImpl(fileOperation);
        NoteController noteController = new NoteController(noteManagerImpl);
        NoteAdder noteAdder = new NoteAdder();
        ViewNote view = new ViewNote(noteController, noteAdder );
        view.run();
    }
}
