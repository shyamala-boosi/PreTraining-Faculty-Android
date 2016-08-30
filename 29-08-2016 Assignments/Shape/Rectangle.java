public class Rectangle extends Shape
{
	protected double width,length;
	public Rectangle()
	{
		System.out.println("Default constructor of Rectangle class");
	}
	public Rectangle(double width,double length)
	{
		this.width=width;
		this.length=length;
	}
	public Rectangle(double width,double length,String color,boolean filled)
	{
		super(color,filled);
		this.width=width;
		this.length=length;
	}

	public double getWidth()
	{
		return width;
	}
	public double getLength()
	{
		return length;
	}
	public void setWidth(double width)
	{
		this.width=width;
	}
	public void setLength(double length)
	{
		this.length=length;
	}
	public double getArea()
	{	
		return length*width;
	}
	public double getPerimeter()
	{
		return 2*(length+width);
	}
	public String toString()
	{
		return "Area of the Reactangle:"+getArea()+"\n Perimeter of the Rectangle:"+getPerimeter();
	}
}