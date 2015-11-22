package me.verto.javastuffs;

import static org.apache.commons.lang.StringUtils.*;

public class StringStream implements Stream {

  private char[] content;
  private int lastPosition;

  public StringStream(String input) {
    if (isBlank(input)) throw new IllegalArgumentException("input is blank");

    this.content = input.toCharArray();
    this.lastPosition = 0;
  }

  @Override
  public char getNext() {
    if (!hasNext()) throw new IllegalStateException("stream don't have next character");
    return content[lastPosition++];
  }

  @Override
  public boolean hasNext() {
    return lastPosition < content.length;
  }
}
