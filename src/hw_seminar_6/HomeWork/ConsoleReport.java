package hw_seminar_6.HomeWork;

public class ConsoleReport {
    private User user;
    
    public ConsoleReport(User user) {
        this.user = user;
    }

    public void report(){
        System.out.println("Report for user: " + user.getName());
    }
}
