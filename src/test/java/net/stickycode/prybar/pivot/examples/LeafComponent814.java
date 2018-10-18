package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent814
    implements PrybarComponent {

  private RootComponent814 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent814.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent814.class, "root"));
  }

  public RootComponent814 getRoot() {
    return root;
  }

}
