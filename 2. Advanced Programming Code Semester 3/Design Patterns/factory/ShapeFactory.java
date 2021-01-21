package factory;

public class ShapeFactory {

  public static Shape getShape(String shapeType) {

    if (shapeType == null) {
      return null;//just put in the plans - Commercial Plan etc
    } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
      return new Rectangle();
    } else if (shapeType.equalsIgnoreCase("SQUARE")) {
      return new Square();
    } else if (shapeType.equalsIgnoreCase("CIRCLE")) {
      return new Circle();
    }

    return null;
  }
}
