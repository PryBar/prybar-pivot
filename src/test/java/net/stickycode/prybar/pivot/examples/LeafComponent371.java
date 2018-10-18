package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent371
    implements PrybarComponent {

  private RootComponent371 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent371.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent371.class, "root"));
  }

  public RootComponent371 getRoot() {
    return root;
  }

}
