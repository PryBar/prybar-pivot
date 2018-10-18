package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent438
    implements PrybarComponent {

  private RootComponent438 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent438.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent438.class, "root"));
  }

  public RootComponent438 getRoot() {
    return root;
  }

}
