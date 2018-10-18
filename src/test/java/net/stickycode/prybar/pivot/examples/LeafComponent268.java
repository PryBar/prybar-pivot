package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent268
    implements PrybarComponent {

  private RootComponent268 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent268.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent268.class, "root"));
  }

  public RootComponent268 getRoot() {
    return root;
  }

}
