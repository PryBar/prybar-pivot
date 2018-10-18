package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent248
    implements PrybarComponent {

  private RootComponent248 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent248.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent248.class, "root"));
  }

  public RootComponent248 getRoot() {
    return root;
  }

}
