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
    // pen for outputting
    PrintWriter pen = new PrintWriter(System.out, true);

    // pen for error
    PrintWriter err = new PrintWriter(System.err, true);

    // check arguments length
    if (args.length != 2) {
      err.println("Incorrect number of parameters");
    } // if

    // get command
    String command = args[0].toLowerCase();

    // check command validity
    if (!command.equals("encode") && !command.equals("decode")) {
      err.println("Error: Invalid option:" + "\"" + command
          + "\". Valid options are \"encode\" or \"decode\".");
      System.exit(1);
    } // if invalid command then print error message

    // get string to encode/decode
    String str = args[1];

    // check if string contains characters other than lowercase letters
    for (int i = 0; i < str.length(); i++) {
      char c = str.charAt(i);
      if (!Character.isLowerCase(c)) {
        err.println("Error: String contains characters other than lowercase letters.");
        System.exit(1);
      } // if
    } // for

    // print encoded/decoded string for each lowercase letter
    for (char ch = 'a'; ch <= 'z'; ch++) {
      // check if command is encode or decode to use the appropriate method
      if (command.equals("encode")) {
        pen.printf("n = %c: %s\n", ch, CipherUtils.caesarEncrypt(str, ch));
      } else if (command.equals("decode")) {
        pen.printf("n = %c: %s\n", ch, CipherUtils.caesarDecrypt(str, ch));
      } // if
    } // for

    // close pen
    pen.close();
  } // main(String[])
} // class AllCaesar
