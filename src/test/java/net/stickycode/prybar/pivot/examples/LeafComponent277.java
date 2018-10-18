package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent277
    implements PrybarComponent {

  private RootComponent277 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent277.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent277.class, "root"));
  }

  public RootComponent277 getRoot() {
    return root;
  }

}
