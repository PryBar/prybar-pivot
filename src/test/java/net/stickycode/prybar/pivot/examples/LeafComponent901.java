package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent901
    implements PrybarComponent {

  private RootComponent901 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent901.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent901.class, "root"));
  }

  public RootComponent901 getRoot() {
    return root;
  }

}
