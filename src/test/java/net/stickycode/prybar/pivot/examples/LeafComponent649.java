package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent649
    implements PrybarComponent {

  private RootComponent649 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent649.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent649.class, "root"));
  }

  public RootComponent649 getRoot() {
    return root;
  }

}
