import models.Point;
import models.Shape;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        File file = new File("C:\\Users\\Adil\\IdeaProjects\\untitled1\\src\\source")
        Scanner sc = new Scanner(file);
        Shape shape = new Shape();
        while (sc.hasNextLine()) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            shape.addPoint(new Point(x,y));
        }
        System.out.println(shape.calculatePerimeter());
        System.out.println(shape.getLongest());
        System.out.println(shape.getAverageSide());
    }
}
