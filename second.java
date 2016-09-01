abstract class Shape
{
   public String color;
   public boolean filled;
   public Shape()
   {
    System.out.println("Shape is constructed");
   }
   Shape(String c,boolean f)
   {
     color=c;
     filled=f;
   }
   public String getColor()
   {
     return color;
   }
  public void setColor(String c)
  {
     color=c;
  }
  public boolean isFilled()
  {
   return filled;
  }
  public void setFilled(boolean f)
  {
   filled=f;
  }
  public abstract double getArea();
  public abstract double getPerimeter();
  public abstract String toString();
}
 class Circle extends Shape
{
  public double radius;
  public Circle()
  {
    System.out.println("Circle is constructed");
  }
  public Circle(double r)
  {
   radius=r;
  }
 public Circle(double r,String s,boolean f)
 {
   super(s,f);
   radius=r;
 }
 public double getRadius()
 {
   return radius;
 }
 public void setRadius(double r)
 {
   radius=r;
 }
 public double getArea()
 {
   return 3.14*radius*radius;
 }
 public double getPerimeter()
 {
   return 2*3.14*radius;
 }
 public String toString()
 {
   String n= "Circle\t"+this.getColor()+"\t"+this.isFilled()+"\t"+this.getRadius()+"\t"+this.getArea()+"\t"+this.getPerimeter();
   return n;
 }
}

class Rectangle extends Shape
{
  public double width;
  public double length;
  public Rectangle()  
  { 
     System.out.println("Rectangle constructor");
  } 
  public Rectangle(double w,double l)
  {
    width=w;
    length=l;
  }
 public Rectangle(double w,double l,String c,boolean f)
 {
   super(c,f);
   width=w;
   length=l;
 }
 public double getWidth()
{
  return width;
}
public double getLength()
{
   return length;
}
public void setLength(double s)
 {
   length=s;
 }
public void setWidth(double s)
 {
   width=s;
 }

public double getArea()
 {
   return width*length;
 }
 public double getPerimeter()
 {
   return 2*(length+width);
 }
 public String toString()
 {
   String n= "rectangle\t"+this.getColor()+"\t"+this.isFilled()+"\t"+this.getWidth()+"\t"+this.getLength()+"\t"+this.getArea()+"\t"+this.getPerimeter();
   return n;
 }
}
class Square extends Rectangle
{
  double side;
  String name;
  boolean filled;
  Square()
  {
     System.out.println("Square Constructor");
  }
  Square(double s)
  {
    side=s;
  }
  Square(double s, String c, boolean f)
  {
    
    name=c;
    filled=f;
    side=s;
  }
  public double getSide()
 {  
   return side;
 }


}
       public class Second
      {
	public static void main(String args[])
	{
          Circle c=new Circle(5,"Green",true);
          Rectangle r=new Rectangle(6,5,"Red",false);
	  Square s = new Square();
	  s.setLength(5);
 	  s.setWidth(5);
          System.out.println(c.toString());
	  System.out.println(r.toString());
	  System.out.println("square\t"+ s.getArea()+"\t"+s.getPerimeter());
        
        }
      }    