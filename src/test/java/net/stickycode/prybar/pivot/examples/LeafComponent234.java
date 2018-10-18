package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent234
    implements PrybarComponent {

  private RootComponent234 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent234.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent234.class, "root"));
  }

  public RootComponent234 getRoot() {
    return root;
  }

}
