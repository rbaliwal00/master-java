package workingwithfiles;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 Demo program to understand loading, displaying, and saving images.
 Basically java converts an image to a 2D image.

 Sources Used ->
 Official Oracle Docs - https://docs.oracle.com/javase/tutorial/2d/images/index.html
 Youtube Video - https://www.youtube.com/watch?v=CBNyxH_NSDs

 @author Rajan Baliwal
 @username - rbaliwal00
 @version - 2021-08-25

 */
public class ImageHandling {
    public static void main(String args[]) throws IOException {
        int width = 963;
        int height = 640;

        BufferedImage image = null;

        image = readFromFile(width, height, image);

        writeToFile(image);
    }

    private static BufferedImage readFromFile(int width, int height, BufferedImage image){
        try{

            File sampleFile = new File("C:\\Users\\Rajan\\Desktop\\java.jpg");

            image = new BufferedImage(width,height, BufferedImage.TYPE_INT_ARGB);

            //Reading input file
            image = ImageIO.read(sampleFile);

            System.out.println("Reading Complete. " + image);
        }catch (IOException e){
            System.out.println("Error: " + e);
        }
        return image;
    }

    //writing that same image to some other directory
    private static void writeToFile(BufferedImage image) {
        try{
            File output = new File("E:\\javaout.jpg");

            ImageIO.write(image, "jpg", output);

            System.out.println("Writing complete.");
        }catch (IOException e){
            System.out.println("Error: " + e);
        }
    }

}
