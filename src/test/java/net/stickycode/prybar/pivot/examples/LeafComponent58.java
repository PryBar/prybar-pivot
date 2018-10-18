package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent58
    implements PrybarComponent {

  private RootComponent58 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent58.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent58.class, "root"));
  }

  public RootComponent58 getRoot() {
    return root;
  }

}
