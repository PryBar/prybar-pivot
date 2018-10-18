package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent296
    implements PrybarComponent {

  private RootComponent296 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent296.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent296.class, "root"));
  }

  public RootComponent296 getRoot() {
    return root;
  }

}
