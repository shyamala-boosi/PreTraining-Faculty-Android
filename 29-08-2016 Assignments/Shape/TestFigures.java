public class TestFigures 
{
   public static void main(String args[])
   {
      Circle c1=new Circle();
      Circle c2=new Circle(11);
      System.out.println("First Circle....\n"+c1);
      System.out.println("Second Circle...\n"+c2);

      Rectangle r1=new Rectangle();
      Rectangle r2=new Rectangle(6,7);
      Rectangle r3=new Rectangle(8,9,"Red",true);
      System.out.println("First Rectangle....\n"+r1);
      System.out.println("Second Rectangle...\n"+r2);
      System.out.println("Third Rectangle...\n"+r3);
     
     
      Square s1=new Square();
      Square s2=new Square(11);
      System.out.println("First Square....\n"+s1);
      System.out.println("Second Square...\n"+s2);
   }
  
}