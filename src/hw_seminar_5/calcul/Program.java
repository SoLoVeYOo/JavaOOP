package hw_seminar_5.calcul;

import hw_seminar_5.calcul.Controllers.UserController;
import hw_seminar_5.calcul.Model.Calc;
import hw_seminar_5.calcul.Model.CalcImpl;
import hw_seminar_5.calcul.Model.LogManager;
import hw_seminar_5.calcul.Views.ViewCalc;

public class Program {
    public static void main(String[] args) {
        Calc calc = new CalcImpl();
        UserController userController = new UserController(calc);
        LogManager logManager = new LogManager("Homework5/Log.log");
        ViewCalc viewCalc = new ViewCalc(userController, logManager);
        viewCalc.run();
    }
}
