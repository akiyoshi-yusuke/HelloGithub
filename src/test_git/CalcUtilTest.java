package test_git;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalcUtilTest {

  @Test
  public void testAdd() {
    int actual = CalcUtil.add(1, 2);
    assertEquals(3, actual);
  }

}