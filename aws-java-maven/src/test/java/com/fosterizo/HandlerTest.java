package com.fosterizo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HandlerTest extends Handler {
  @Test
  public void happyDay() {
    assertEquals("Fosterizo Rules!", this.getCoolMessage());
  }
}