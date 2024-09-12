package edu.grinnell.csc207.main;

import java.io.PrintWriter;

import edu.grinnell.csc207.util.CipherUtils;

/**
 * The Cipher class provides a command-line utility for encoding and decoding strings using either
 * the Caesar or Vigenère cipher. The program takes four command-line arguments in almost any order.
 */
public class Cipher {
  /**
   * The default number of command-line arguments.
   *
   * @value 4
   */
  private static final int DEFAULT_ARG_LENGTH = 4;

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
    if (args.length != DEFAULT_ARG_LENGTH) {
      err.println("Error: Incorrect number of parameters");
      return;
    } // if

    // Initialize variables to hold arguments later
    String action = "";
    String cipher = "";
    String text = "";
    String key = "";

    for (String arg : args) {
      // evaluate each argument
      if (arg.startsWith("-")) {
        // check action
        switch (arg) {
          case "-encode":
            action = "encode";
            break;
          case "-decode":
            action = "decode";
            break;
          case "-caesar":
            cipher = "caesar";
            break;
          case "-vigenere":
            cipher = "vigenere";
            break;
          default:
            err.println("Error: Invalid option");
            return;
        } // switch
      } else {
        if (text.equals("")) {
          text = arg;
        } else {
          key = arg;
        } // if
      } // if
    } // for

    // make sure all arguments are valid
    if (action.equals("") || cipher.equals("") || text.equals("") || key.equals("")) {
      System.err.println("Error: Missing required arguments.");
      return;
    } // if

    // make sure all arguments are lowercase
    if (!Cipher.isArgumentLowercaseAndNoSpaces(action)
        || !Cipher.isArgumentLowercaseAndNoSpaces(cipher)
        || !Cipher.isArgumentLowercaseAndNoSpaces(text)
        || !Cipher.isArgumentLowercaseAndNoSpaces(key)) {
      System.err.println("Error: Arguments are not lowercase or have spaces.");
      return;
    } // if

    // check if caesar has valid key
    if (cipher.equals("caesar") && key.length() != 1) {
      System.err.println("Error: Caesar cipher key must be a single letter.");
      return;
    } // if

    printByActionAndCipher(pen, action, cipher, text, key);
    pen.close();
  } // main(String[])

  /**
   * Prints result by action and cipher.
   *
   * @param pen
   * @param action
   * @param cipher
   * @param text
   * @param key
   */
  private static void printByActionAndCipher(PrintWriter pen, String action, String cipher,
      String text, String key) {
    if (cipher.equals("caesar")) {
      if (action.equals("encode")) {
        pen.println(CipherUtils.caesarEncrypt(text, key.charAt(0)));
      } else {
        pen.println(CipherUtils.caesarDecrypt(text, key.charAt(0)));
      } // if
    } else if (cipher.equals("vigenere")) {
      if (action.equals("encode")) {
        pen.println(CipherUtils.vigenereEncrypt(text, key));
      } else {
        pen.println(CipherUtils.vigenereDecrypt(text, key));
      } // if
    } // if
  } // printByActionAndCipher(PrintWriter, String, String, String, String)

  /**
   * Checks if an argument is lowercase and has no spaces.
   *
   * @param arg
   * @return a boolean
   */
  private static boolean isArgumentLowercaseAndNoSpaces(String arg) {
    return arg.equals(arg.toLowerCase().replaceAll("\\s+", ""));
  } // isArgumentLowercaseAndNoSpaces(String)
} // class Cipher
