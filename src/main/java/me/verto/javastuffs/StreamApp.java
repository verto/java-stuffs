package me.verto.javastuffs;

public class StreamApp {

  public static void main(String[] args) {
    if (args.length == 0) {
      System.err.println("word is required");
    }

    System.out.println(firstChar(args[0]));
  }

  private static String firstChar(String word) {
    try {
      char value = StreamUtils.firstChar(new StringStream(word));
      return String.valueOf(value);
    } catch (CharacterNotFoundException ex) {
      return ex.getMessage();
    }
  }
}
