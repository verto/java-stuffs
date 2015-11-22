package me.verto.javastuffs;

public class CharacterNotFoundException extends RuntimeException {
  private static final long serialVersionUID = 8569386058918326767L;

  public CharacterNotFoundException(String message) {
    super(message);
  }
}
