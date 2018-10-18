package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent582
    implements PrybarComponent {

  private RootComponent582 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent582.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent582.class, "root"));
  }

  public RootComponent582 getRoot() {
    return root;
  }

}
