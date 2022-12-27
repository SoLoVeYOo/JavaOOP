package hw_seminar_6.HomeWork;

public class Main{
	public static void main(String[] args){
		User user = new User("Petr");
		Persister persister = new Persister(user);
		ConsoleReport consoleReport = new ConsoleReport(user);
		consoleReport.report();;
		persister.save();
	}
}