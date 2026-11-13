/**
 * A rectangle.
 */
public class Rectangle {
  private double width;
  private double height;

  /**
   * Initializes a Rectangle object.
   *
   * @param w width.
   *
   * @param h height.
   */
  public Rectangle(double w, double h) {
    this.width = w;
    this.height = h;
  }

  /**
   * Returns area of the rectangle.
   *
   * @return area of the rectangle.
   */
  public double area() {
    return width * height;
  }

  /**
   * Scales the rectangle.
   *
   * @param factor the factor by which rectangle is scaled.
   */
  public void scale(double factor) {
    width = width * factor;
    height = height * factor;
  }

  /**
   * Returns whether rectangle is larger than {@code other}.
   *
   * @param other the other rectangle.
   * @return whether rectangle is larger than other.
   */
  public boolean isLargerThan(Rectangle other) {
    if (area() > other.area()) {
      return true;
    } else {
      return false;
    }
  }
}
