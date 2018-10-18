package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent416
    implements PrybarComponent {

  private RootComponent416 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent416.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent416.class, "root"));
  }

  public RootComponent416 getRoot() {
    return root;
  }

}
