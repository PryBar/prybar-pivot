package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent631
    implements PrybarComponent {

  private RootComponent631 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent631.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent631.class, "root"));
  }

  public RootComponent631 getRoot() {
    return root;
  }

}
