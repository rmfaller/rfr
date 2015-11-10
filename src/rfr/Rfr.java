/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rfr;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author rmfaller
 */
public class Rfr {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        RandomAccessFile raf = new RandomAccessFile("./results.txt", "r");
        long randomvalue = (long) (Math.random() * (long) raf.length());
        raf.seek(randomvalue);
        System.out.println(randomvalue + " : " + raf.readLine());
        System.out.println(raf.length() + " : " + raf.readLine());
    }

}
