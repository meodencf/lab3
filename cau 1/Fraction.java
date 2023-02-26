package lab3;

import java.util.Scanner;

public class Fraction {

  //thuoc tinh
  private int numerator;
  private int denominator;

  //phuong thuc khoi tao khong tham so
  public Fraction() {
    this.numerator = 0;
    this.denominator = 1;
  }

  //phuong thuc khoi tao co tham so
  public Fraction(int num, int den) {
    if (denominator == 0) {
      System.out.print("error");
    } else {
      this.numerator = numerator;
      this.denominator = numerator;
    }
  }

  public void Fraction(Scanner sc) {
    int num;
    int den;
    do {
      System.out.println("nhap num");
      num = sc.nextInt();
      System.out.println("nhap den");
      den = sc.nextInt();
    } while (den == 0);
  }

  public Fraction add(Fraction f2) {
    int num = numerator * f2.denominator + f2.numerator * denominator;
    int den = denominator * f2.denominator;
    return new Fraction(num, den);
  }

  public Fraction sub(Fraction f2) {
    int num = numerator * f2.denominator - f2.numerator * denominator;
    int dem = denominator * f2.denominator;
    return new Fraction(num, dem);
  }

  public Fraction mul(Fraction f2) {
    int num = numerator * f2.numerator;
    int dem = denominator * f2.denominator;
    return new Fraction(num, dem);
  }

  public Fraction div(Fraction f2) {
    int num = numerator * f2.denominator;
    int dem = denominator * f2.numerator;
    return new Fraction(num, dem);
  }

  public void reduce() {
    int num = numerator;
    int dem = denominator;
    int r = num % dem;
    while (r != 0) {
      num = dem;
      dem = r;
      r = num % dem;
    }
    numerator /= dem;
    denominator /= dem;
  }

  @Override
  public String toString() {
    return "( " + this.numerator + ";" + this.denominator + ")";
  }
}
