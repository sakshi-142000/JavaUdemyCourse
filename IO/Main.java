import java.io.IOException;
import java.io.ByteArrayInputStream;

public class Main{
    public static void main(String[] args) {
        byte[] data= {72, 101, 108, 108, 111}; // ascii value for characters in world Hello 

        // imaging this data byte array is coming from a input file

        ByteArrayInputStream byteInputStream= null; //initially

        try{
            byteInputStream = new ByteArrayInputStream(data);
            int byteData;

            while((byteData=byteInputStream.read())!=-1){
                System.out.println((char)(byteData));
            }

        }
        catch(Exception e){

            //one note here is that you cannot directly catch IOException here 
            // because ByteArrayInputStream doesnot throw IOException

            /*
             * ByteArrayInputStream reads from memory (RAM), not from external I/O sources. 
             * Since the data is already loaded in memory as a byte array, 
             * there's no I/O operation that can fail.
            */
            System.out.println("Something went wrong with byteInputStream class initiation and handling");
        }
    }


}