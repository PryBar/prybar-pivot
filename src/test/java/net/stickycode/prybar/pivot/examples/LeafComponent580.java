package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent580
    implements PrybarComponent {

  private RootComponent580 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent580.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent580.class, "root"));
  }

  public RootComponent580 getRoot() {
    return root;
  }

}
