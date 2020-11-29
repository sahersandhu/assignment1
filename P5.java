 class abc{
	double height;
	double width;
	double area()
                      {
			return width*height;
			}
	         }

public class P5
{
	public static void main(String args[]){
		abc obj=new abc();
		obj.width=50;
		obj.height=20;
		double are=obj.area();
		System.out.println("Area="+are);
	
	}

}

