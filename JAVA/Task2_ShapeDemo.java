Task 2: Inheritance
===================
Create a Shape class with a method area() and extend it with Circle and Rectangle classes overriding the area() method appropriately.

     
     
    public abstract class Shape 
       {
         public abstract double area();
       }
    
    public class Circle extends Shape 
      {
        private double radius;

        public Circle(double radius) {
        this.radius = radius;
      }

    public double area() 
       {
        return Math.PI * radius * radius;
       }
      }
    public class Rectangle extends Shape 
      {
       private double width;
       private double height;
 
       public Rectangle(double width, double height) 
       {
          this.width = width;
          this.height = height;
       }
          public double area() 
         {
            return width * height;
        }
      }
   public class ShapeDemo
       {
        public static void main(String[] args) 
          {
            Shape circle = new Circle(5.0); 
            Shape rectangle = new Rectangle(4.0, 6.0);  
            System.out.println("Area of the circle: " + circle.area());
            System.out.println("Area of the rectangle: " + rectangle.area());
    }
}
