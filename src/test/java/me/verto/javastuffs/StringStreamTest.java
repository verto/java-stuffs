package me.verto.javastuffs;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class StringStreamTest {

  @Test(expected=IllegalArgumentException.class)
  public void shouldThrowExceptionIfInputIsNull() {
    new StringStream(null);
  }

  @Test(expected=IllegalArgumentException.class)
  public void shouldThrowExceptionIfInputIsEmpty() {
    new StringStream("");
  }

  @Test
  public void shouldReturnNextCaracterIfExists() {
    assertThat(new StringStream("abc").getNext(), is('a'));
  }

  @Test(expected=IllegalStateException.class)
  public void shouldThrowExceptionIfDoesntExistsNextCharacter() {
    Stream stream = new StringStream("a");
    stream.getNext();
    stream.getNext();
  }

  @Test
  public void shouldReturnTrueIfHasNextCharacter() {
    assertThat(new StringStream("abc").hasNext(), is(true));
  }

  @Test
  public void shouldReturnFalseIfDontHaveNextCaracter() {
    Stream stream = new StringStream("a");
    stream.getNext();
    assertThat(stream.hasNext(), is(false));
  }
}
