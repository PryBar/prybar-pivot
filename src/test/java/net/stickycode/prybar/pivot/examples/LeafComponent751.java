package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent751
    implements PrybarComponent {

  private RootComponent751 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent751.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent751.class, "root"));
  }

  public RootComponent751 getRoot() {
    return root;
  }

}
