package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent831
    implements PrybarComponent {

  private RootComponent831 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent831.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent831.class, "root"));
  }

  public RootComponent831 getRoot() {
    return root;
  }

}
