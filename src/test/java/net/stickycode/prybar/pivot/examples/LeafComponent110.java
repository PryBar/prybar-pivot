package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent110
    implements PrybarComponent {

  private RootComponent110 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent110.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent110.class, "root"));
  }

  public RootComponent110 getRoot() {
    return root;
  }

}
