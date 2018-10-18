package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent538
    implements PrybarComponent {

  private RootComponent538 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent538.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent538.class, "root"));
  }

  public RootComponent538 getRoot() {
    return root;
  }

}
