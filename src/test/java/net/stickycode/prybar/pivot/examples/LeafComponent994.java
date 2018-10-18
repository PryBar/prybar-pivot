package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent994
    implements PrybarComponent {

  private RootComponent994 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent994.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent994.class, "root"));
  }

  public RootComponent994 getRoot() {
    return root;
  }

}
