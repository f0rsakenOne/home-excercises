package io.codelex.advancedTest.reverser;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Reverser {

  private static final File file = new File("C:\\Users\\Home\\Desktop\\ReverserTest\\test.txt");

  public static void main(String[] args) throws IOException {
    FileReader fileReader = new FileReader(file);
    BufferedReader bufferedReader = new BufferedReader(fileReader);

    String line = null;
    StringBuilder originalText = new StringBuilder();
    while ((line = bufferedReader.readLine()) != null) {
      originalText.append(line);
    }
    bufferedReader.close();
    StringBuilder reversedString = originalText.reverse();
    StringBuilder fileName = new StringBuilder(file.getName());
    String reversedName = fileName.reverse().toString().split("\\.")[1];
    BufferedWriter bufferedWriter = new BufferedWriter(
        new FileWriter("C:\\Users\\Home\\Desktop\\ReverserTest\\" + reversedName + ".txt"));
    bufferedWriter.write(reversedString.toString());
    bufferedWriter.close();
    System.out.println(file.getName());
  }
}
