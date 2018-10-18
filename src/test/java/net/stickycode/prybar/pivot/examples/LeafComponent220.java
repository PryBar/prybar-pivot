package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent220
    implements PrybarComponent {

  private RootComponent220 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent220.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent220.class, "root"));
  }

  public RootComponent220 getRoot() {
    return root;
  }

}
