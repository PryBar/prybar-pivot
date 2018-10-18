package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent162
    implements PrybarComponent {

  private RootComponent162 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent162.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent162.class, "root"));
  }

  public RootComponent162 getRoot() {
    return root;
  }

}
