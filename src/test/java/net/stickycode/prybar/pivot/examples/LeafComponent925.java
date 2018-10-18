package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent925
    implements PrybarComponent {

  private RootComponent925 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent925.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent925.class, "root"));
  }

  public RootComponent925 getRoot() {
    return root;
  }

}
