
public class TestShapes{
  /** Main method */
  public static void main(String[] args) {
    // Declare and initialize two geometric objects
	  Shape shape1 = new Circle(5);
	  Shape shape2 = new Rectangle(5, 3);
 // Shape shape3 = new Shape(5, 3);

    System.out.println("The two objects have the same area? " +
      equalArea(shape1, shape2));

    // Display circle
    displayShape(shape1);

    // Display rectangle
    displayShape(shape2);
  }

  /** A method for comparing the areas of two geometric objects */
  public static boolean equalArea(Shape shape1,
      Shape shape2) {
    return shape1.getArea() == shape2.getArea();
  }

  /** A method for displaying a geometric object */
  public static void displayShape(Shape object) {
    System.out.println();
    System.out.println("The area is " + object.getArea());
    System.out.println("The perimeter is " + object.getPerimeter());
  }
}
