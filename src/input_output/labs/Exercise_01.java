package input_output.labs;

/**
 * Input/Output Exercise 1: File input/output
 *
 *      Using the BufferedInputStream, read a file byte by byte and write each byte to a new file.
 *      Make sure you close the connections to both files.
 *
 *
 *


import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
// import java.io.*;


public class MyFirstRunnable {
    public static void main(String[] args) throws IOException {

        // declare Input and Output Streams
        BufferedInputStream in = null;
        BufferedOutputStream out = null;

        try {
            // initialize them within the Try in case the files do not exist or cannot be accessed
            in = new BufferedInputStream("ioDemo.txt");
            out = new BufferedOutputStream("ioDemoCopy.txt");
            int c;

            // while there is more data to read in the InputStream "in"
            while ((c = in.read()) != -1) {
                // write the data (byte by byte) to the OutputStream "out"
                out.write(c);
            }
        } finally {
            // close connections to files
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}
 **/


