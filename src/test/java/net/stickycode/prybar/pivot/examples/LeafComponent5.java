package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent5
    implements PrybarComponent {

  private RootComponent5 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent5.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent5.class, "root"));
  }

  public RootComponent5 getRoot() {
    return root;
  }

}
