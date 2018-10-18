package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent747
    implements PrybarComponent {

  private RootComponent747 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent747.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent747.class, "root"));
  }

  public RootComponent747 getRoot() {
    return root;
  }

}
