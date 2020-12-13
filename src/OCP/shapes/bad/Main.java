package OCP.shapes.bad;

public class Main {
    public static void main(String[] args) {
        var rect1 = new Rectangle(10, 20);
        var rect2 = new Rectangle(20, 30);

        var ac = new AreaCalculator();

        System.out.println(ac.areaCalc(rect1, rect2));


    }
}
