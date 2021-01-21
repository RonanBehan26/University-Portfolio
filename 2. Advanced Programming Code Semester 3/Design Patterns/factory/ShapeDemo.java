package factory;

public class ShapeDemo {

  public static void main(String[] args) { //the main, so just change the names in the brackets to get up the ones you want

    // Get an object of Rectangle and call its draw method.
    Shape rectangle = ShapeFactory.getShape("RECTANGLE");
    rectangle.draw();

    // Get an object of Circle and call its draw method.
    Shape circle = ShapeFactory.getShape("CIRCLE");
    circle.draw();
  }
}
