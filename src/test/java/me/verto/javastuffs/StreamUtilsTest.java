package me.verto.javastuffs;

import org.junit.Test;

import me.verto.javastuffs.CharacterNotFoundException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class StreamUtilsTest {

  @Test
  public void shouldReturnFirstCharWithoutRepetation() {
    Stream stream = new StringStream("aAbBABac");
    assertThat(StreamUtils.firstChar(stream), is('b'));
  }

  @Test(expected=CharacterNotFoundException.class)
  public void shouldThrowExceptionIfDoesntExistsCharWithoutRepetation() {
    Stream stream = new StringStream("aAbBABacbc");
    StreamUtils.firstChar(stream);
  }

}
