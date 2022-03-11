class Sample

{

    // Instance Variable --- Object

    public int x;


    // static Variable ------ 
    public static int y;

}


public class StaticAndInstances
{

    public static void main(String [] args)

    {

        Sample s1 = new Sample();

        Sample s2 = new Sample();

        Sample s3 = new Sample();
        s1.x = 56;

        s2.x = 23;

        s3.x = 43;


        s1.y = 100;


        System.out.println("S1 X : " + s1.x + " Y : " + s1.y);

        System.out.println("S2 X : " + s2.x + " Y : " + s2.y);

        System.out.println("S3 X : " + s3.x + " Y : " + s3.y);
	
	s2.y = 5000;

	System.out.println("S1 X : " + s1.x + " Y : " + s1.y);

        System.out.println("S2 X : " + s2.x + " Y : " + s2.y);

        System.out.println("S3 X : " + s3.x + " Y : " + s3.y);
   }

}