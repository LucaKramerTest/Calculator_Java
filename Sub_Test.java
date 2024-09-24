public class Sub_Test{
  public void testSubtractor() {
        Sub calculator = new Sub();
        assertEquals(5, calculator.subtractor(2, 3));
        assertEquals(-1, calculator.subtractor(-2, 1));
        assertEquals(0, calculator.subtractor(0, 0));
        assertEquals(-5, calculator.subtractor(-2, -3));
    }
}
