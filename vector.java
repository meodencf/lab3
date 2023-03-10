public class Vector {

  private double x;
  private double y;
  private double z;

  public Vector(double x, double y, double z) {
    this.x = x;
    this.y = y;
    this.z = z;
  }

  public double getX() {
    return x;
  }

  public void setX(double x) {
    this.x = x;
  }

  public double getY() {
    return y;
  }

  public void setY(double y) {
    this.y = y;
  }

  public double getZ() {
    return z;
  }

  public void setZ(double z) {
    this.z = z;
  }

  public Vector add(Vector khac) {
    return new Vector(x + khac.x, y + khac.y, z + khac.z);
  }

  public Vector subtract(Vector khac) {
    return new Vector(x - khac.x, y - khac.y, z - khac.z);
  }

  public Vector multiply(double vohuong) {
    return new Vector(x * vohuong, y * vohuong, z * vohuong);
  }
}
