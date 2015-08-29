package flash.geom;


public class Rectangle
    implements java.io.Serializable {
  public int x;
  public int y;
  public int width;
  public int height;
  public Rectangle() {
  }
  public Rectangle(int x, int y, int width, int height) {
    this.x = x;
    this.y = y;
    this.width = width;
    this.height = height;
  }

  public int getX() {
    return this.x;
  }
  public void setX(int x) {
    this.x = x;
  }
  public int getY() {
    return this.y;
  }
  public void setY(int y) {
    this.y = y;
  }
  public int getWidth() {
    return this.width;
  }
  public void setWidth(int width) {
    this.width = width;
  }
  public int getHeight() {
    return this.height;
  }
  public void setHeight(int height) {
    this.height = height;
  }
}
