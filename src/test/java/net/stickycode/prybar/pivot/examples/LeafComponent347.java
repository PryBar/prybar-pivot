package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent347
    implements PrybarComponent {

  private RootComponent347 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent347.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent347.class, "root"));
  }

  public RootComponent347 getRoot() {
    return root;
  }

}
