package hw_seminar_6.Note.models;

import java.util.List;

public interface FileOperation {
    public List<String> readAllLines();

    public void saveAllLines(List<String> lines);
}
