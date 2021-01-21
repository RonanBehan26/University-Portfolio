package decorator;

public class RedShapeDecorator extends ShapeDecorator {

  public RedShapeDecorator(Shape shape) {
    super(shape);
  }

  @Override
  public void draw() {
    this.shape.draw();
    this.fillShape("red");
  }

  public void fillShape(String color) {
    System.out.println("Filling " + color);
  }
}
