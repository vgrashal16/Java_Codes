import java.io.*;
import java.util.*;
//Java program to demonstrate OutputStream
class iostream
{
	public static void main(String args[])
	{
        try{

            OutputStream os = new FileOutputStream("file.txt");
            BufferedOutputStream bs = new BufferedOutputStream(os, 10);

            byte b[] = {94, 65, 66, 67, 68, 69, 70};
            
            bs.write(b);
            bs.flush();
            os.flush();

            for (int i = 71; i <75 ; i++)
		{
            bs.write(i);
		}
		
		os.flush();
		
		//close the stream5
        bs.close();
		os.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
        // try{
        //     FileInputStream fin = new FileInputStream("file.txt");
        //     int i =0;
        //     String str="";
        //     while((i=fin.read())!=-1){
        //         str +=(char)i;
        //     }
        //     String arr[] = str.split(",");
            

        // }
        // catch(Exception e){System.out.println(e);}
	}
}
