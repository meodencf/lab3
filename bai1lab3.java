package bai1lab3;

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
public class Point2D {
  //thuoc tinh
  private float x=0.0f;
  private float y=0.0f;
  //ham khoi tao khong tham so
  public Point2D(){
      this.x=0;
      this.y=0;
  }
  //ham khoi tao co tham so
  public Point2D(float x,float y){
      this.x=x;
      this.y=y;
  }
  //ham set,get
  public void getx(float x){
      this.x=x;
  }
  public void sety(float y){
      this.y=y;
  }
}
public class Triangle {
  //thuoc tinh
  private float width=0.0f;
  private float height=0.0f;
  //phuong thuc khoi tao khong tham so
  public Triangle(){
      this.width=0;
      this.height=0;
  }
  //phuong thuc khoi tao co tham so
  public Triangle(float width,float height){
      this.width=width;
      this.height=height;
  }
  //phuong thuc get
  public float getwidth(float width){
      this.width=width;
      return this.width;
  }
  public float getheight(float height){
      this.height=height;
      return this.height;
  }
  //phuong thuc set
  public void setwigth(float width){
      this.width=width;
  }
  public void setheight(float height){
      this.height=height;
  }
  //phuong thuc hien thi
  @Override 
  public String toString(){
      return "("+this.width +";"+ this.height +")";
  }
}

