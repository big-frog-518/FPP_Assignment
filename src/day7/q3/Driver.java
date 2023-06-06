package day7.q3;

/**
 * @Author Jinxu Zheng
 * @Date 6/6/2023
 **/
public class Driver {
    public static void main(String[] args) {
        Figure[] figures = {new UpwardHat(), new UpwardHat(), new DownwardHat(), new FaceMaker(), new Vertical()};

        // Output without class names
        for (Figure figure : figures) {
            figure.getFigure();
        }
        System.out.println();

        for (Figure f : figures) {
            System.out.print(f.getClass().getSimpleName() + " : ");
            f.getFigure();
            System.out.println();
        }
    }
}
