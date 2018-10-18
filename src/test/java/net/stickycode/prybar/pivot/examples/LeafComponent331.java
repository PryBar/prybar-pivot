package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent331
    implements PrybarComponent {

  private RootComponent331 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent331.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent331.class, "root"));
  }

  public RootComponent331 getRoot() {
    return root;
  }

}
