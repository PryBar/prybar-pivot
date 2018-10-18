package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent435
    implements PrybarComponent {

  private RootComponent435 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent435.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent435.class, "root"));
  }

  public RootComponent435 getRoot() {
    return root;
  }

}
