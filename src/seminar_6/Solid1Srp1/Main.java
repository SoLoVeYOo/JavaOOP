package seminar_6.Solid1Srp1;

import seminar_6.Solid1Srp1.srp.FigureManager;
import seminar_6.Solid1Srp1.srp.Point;
import seminar_6.Solid1Srp1.srp.Square;

public class Main {
    public static void main(String[] args) {
        FigureManager figureManager = new FigureManager(2);
        Square square = new Square(new Point(1,1), 5);
        System.out.printf("Площадь фигуры: %d \n", square.getArea());
        figureManager.draw(square);
    }
}
