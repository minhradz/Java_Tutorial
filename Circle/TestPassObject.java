package Circle;

public class TestPassObject {
    public static void main(String[] args){
      Circle myCircle = new Circle(5.0);
      printCircle(myCircle);
    }

    public static void printCircle(Circle c){
        System.out.println("The area of the circle of radius " + c.getRadius() + " is " + c.getArea());
    }
}
