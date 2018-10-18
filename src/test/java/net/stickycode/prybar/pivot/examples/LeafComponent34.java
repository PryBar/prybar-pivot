package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent34
    implements PrybarComponent {

  private RootComponent34 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent34.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent34.class, "root"));
  }

  public RootComponent34 getRoot() {
    return root;
  }

}
