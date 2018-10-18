package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent771
    implements PrybarComponent {

  private RootComponent771 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent771.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent771.class, "root"));
  }

  public RootComponent771 getRoot() {
    return root;
  }

}
