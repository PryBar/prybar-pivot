package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent87
    implements PrybarComponent {

  private RootComponent87 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent87.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent87.class, "root"));
  }

  public RootComponent87 getRoot() {
    return root;
  }

}
