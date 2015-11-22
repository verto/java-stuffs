package me.verto.javastuffs;

import java.util.ArrayList;
import java.util.List;

public class StreamUtils {

  public static char firstChar(Stream stream) {
    List<Character> uniqueChrs = new ArrayList<>();
    List<Character> invalidChrs = new ArrayList<>();

    while(stream.hasNext()) {
      char next = stream.getNext();
      if (invalidChrs.contains(next)) continue;

      int index = uniqueChrs.indexOf(next);
      if (index == -1) {
        uniqueChrs.add(next);
      } else {
        invalidChrs.add(next);
        uniqueChrs.remove(index);
      }
    }

    if (uniqueChrs.isEmpty()) throw new CharacterNotFoundException("doesn't exists unique character");
    return uniqueChrs.get(0);
  }

}
