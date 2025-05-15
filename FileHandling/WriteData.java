import java.io.*;

public class WriteData {
    public static void main(String[] args){
        try{
        String data=" My age is 19 Years Old.";
        FileOutputStream fos= new FileOutputStream("File.txt", true);
        byte[] b = data.getBytes();
        fos.write(b);
        }
        catch(IOException e){
            System.out.print(e);
        }
        //finally{
        //     try{
        //     fos.close();
        //     }
        //     catch(IOException e){
        //         System.out.print(e);
        //     }
        // }

    }
}
