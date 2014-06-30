package main;


import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import com.nitido.utils.toaster.Toaster;

public class JToasterTest {
    
    public static void main(String[] args) throws IOException, InterruptedException {
        Toaster jToast = new Toaster();
        ImageIcon icon = new ImageIcon("/Users/rmania/Pictures/");
        File imagefile = new File("/Users/rmania/Pictures/slavka.png.jpg");
        BufferedImage backgroundImage = ImageIO.read(imagefile);
        
        jToast.setToasterWidth(1000);
        jToast.setToasterHeight(1000);
        jToast.setBackgroundImage(backgroundImage);
        jToast.setStep(50);
        jToast.setDisplayTime(2);
        int a = 0;
        while (a != 10) {
            jToast.showToaster(icon, "WAAAAA");
            Thread.sleep(5000);
            a++;
        }
    }
}
