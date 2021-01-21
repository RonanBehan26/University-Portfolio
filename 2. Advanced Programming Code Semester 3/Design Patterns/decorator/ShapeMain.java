package decorator;

public class ShapeMain {//1.37 vid 15

  public static void main(String[] args) {

    Shape rect = new Rectangle(); //Prints - Rectangle class - does this method
    //draw this without the colour, he did this in the vid, not sure if rect is real
    rect.draw();

    Shape rectangle = new RedShapeDecorator(new Rectangle());
    //create rectangle, pass through redshapedecorator to paint, then draw
    rectangle.draw();
    //Prints - Rectangle class - does this method
    //Then prints "Filling Red" - fillshap method in RedShapeDecorator

    Shape circ = new Circle());
    circ.draw();
    //Prints - Circle class - does this method
    //Then prints "Filling Red" - fillshap method in RedShapeDecorator

    Shape circle = new RedShapeDecorator(new Circle());
    circle.draw();
  }
}
