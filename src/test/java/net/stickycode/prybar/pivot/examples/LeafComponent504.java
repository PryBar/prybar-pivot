package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent504
    implements PrybarComponent {

  private RootComponent504 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent504.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent504.class, "root"));
  }

  public RootComponent504 getRoot() {
    return root;
  }

}
