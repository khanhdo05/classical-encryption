package edu.grinnell.csc207.main;

import java.io.PrintWriter;

import edu.grinnell.csc207.util.CipherUtils;

/**
 * AllCaesar: Contains ...
 */
public class AllCaesar {
  /**
   * The main method is the entry point of the application.
   *
   * @param args the command-line arguments passed to the program
   */
  public static void main(String[] args) {
    PrintWriter pen = new PrintWriter(System.out, true);
    String str = "helloworld";
    for (char ch = 'a'; ch <= 'z'; ch++) {
      pen.printf("n = %c: %s\n", ch, CipherUtils.caesarEncrypt(str, ch));
    } // for loop that print caesar encrypt of each character
    pen.close();
  } // main(String[])
} // class AllCaesar
