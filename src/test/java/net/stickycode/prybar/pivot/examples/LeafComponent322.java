package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent322
    implements PrybarComponent {

  private RootComponent322 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent322.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent322.class, "root"));
  }

  public RootComponent322 getRoot() {
    return root;
  }

}
