package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent327
    implements PrybarComponent {

  private RootComponent327 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent327.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent327.class, "root"));
  }

  public RootComponent327 getRoot() {
    return root;
  }

}
