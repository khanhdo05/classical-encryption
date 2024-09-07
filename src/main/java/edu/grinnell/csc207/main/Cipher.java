package edu.grinnell.csc207.main;

import java.io.PrintWriter;

/**
 * Cipher: Contains ...
 */
public class Cipher {
  /**
   * The main method is the entry point of the application.
   *
   * @param args the command-line arguments passed to the program
   */
  public static void main(String[] args) {
    PrintWriter pen = new PrintWriter(System.out, true);
    for (int i = 0; i < args.length; i++) {
      pen.printf("args[%d] = \"%s\"\n", i, args[i]);
    } // for loop that print out each element in the array
    pen.close();
    System.err.println("Error: Invalid parameters");
  } // main(String[])
} // class Cipher
