# Mini-Project 1: Classical Encryption

## Name

Khanh Do

## Description

**A project for CSC-207 2024Fa.**

This project implements classical encryption techniques, including the Caesar Cipher and the Vigenère Cipher. The project is designed to practice basic programming skills and understand classical cryptographic methods.

## Resources Used

- **Course Material:** Used course notes and lectures on classical encryption methods to implement the Caesar and Vigenère Ciphers.
- **Online Documentation:** Referenced Java documentation and StackOverflow for syntax and best practices in Java programming.
- **Maven:** Utilized Maven for project management and building the application.
- **VSCode:** Employed Visual Studio Code for editing and managing the project files.

## GitHub Repository

[GitHub Repository: ](https://github.com/khanhdo05/classical-encryption)https://github.com/khanhdo05/classical-encryption

## Files

- `edu/grinnell/csc207/util/CipherUtils.java`: Contains utility methods for encryption and decryption.
- `edu/grinnell/csc207/main/AllCaesar.java`: Main class for encoding and decoding using the Caesar Cipher.
- `edu/grinnell/csc207/main/Cipher.java`: Main class for handling various ciphers with command-line arguments.
- `classical-encryption-1.0.jar`: The end result of this Maven project.

## Running the Program

### Prerequisites

Before running the code, make sure you have the following installed:

1. **Java Development Kit (JDK) 8 or higher**

   - Download and install from [Oracle's JDK page](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) or [OpenJDK](https://openjdk.java.net/).
   - Verify installation by running `java -version` and `javac -version` in your terminal.

2. **Apache Maven**

   - Download and install Maven from [Maven's official website](https://maven.apache.org/download.cgi).
   - Set up environment variables `M2_HOME` and add Maven's `bin` directory to your `PATH`.
   - Verify installation by running `mvn -version` in your terminal.

3. **Text Editor or Integrated Development Environment (IDE)**

   - **Visual Studio Code** or any other text editor/IDE of your choice for editing and managing code files.

4. **Build Tools**
   - Maven will handle project dependencies and building. Ensure Maven is configured correctly as described above.

### To use `prettier` to format code

- In VSCode, `ctrl` + `shift` + `P`
- Choose `Format Document`
- Choose `Configure`
- Choose accordingly

### To run test

```bash
mvn test -q
```

### To check style

```bash
mvn checkstyle:check -q
```

### Run the AllCeasar program

1. Compile by running `mvn compile -q` in the root directory
2. Navigate to target/classes by running `target/classes`
3. Run in the terminal
   ```bash
   java edu.grinnell.csc207.main.AllCaesar encode helloworld
   ```
   to encode `helloworld`.
4. Run in the terminal
   ```bash
   java edu.grinnell.csc207.main.AllCaesar decode helloworld
   ```
   to decode `helloworld`.

### Run Cipher program

1. At the root directory, run

   ```bash
   java -jar target/classical-encryption-1.0.jar -encode -caesar hello x
   ```

   to encode caesar mode hello by key x

2. Change the above command to your need.

- "-encode" or "-decode"
- "-caesar" or "-vigenere"
- "stringtotransform"
- "key" (_for caesar mode, key has to be 1 character_)
