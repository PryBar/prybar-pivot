package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent927
    implements PrybarComponent {

  private RootComponent927 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent927.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent927.class, "root"));
  }

  public RootComponent927 getRoot() {
    return root;
  }

}
