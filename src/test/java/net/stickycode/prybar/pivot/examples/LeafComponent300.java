package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent300
    implements PrybarComponent {

  private RootComponent300 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent300.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent300.class, "root"));
  }

  public RootComponent300 getRoot() {
    return root;
  }

}
