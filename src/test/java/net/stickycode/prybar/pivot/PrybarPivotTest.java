package net.stickycode.prybar.pivot;

import org.junit.Test;

public class PrybarPivotTest {

  @Test
  public void pivot() {
    new LeafComponent();
    new RootComponent();
    Prybar.pivot();
  }

}
