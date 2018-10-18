package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent386
    implements PrybarComponent {

  private RootComponent386 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent386.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent386.class, "root"));
  }

  public RootComponent386 getRoot() {
    return root;
  }

}
