package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent857
    implements PrybarComponent {

  private RootComponent857 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent857.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent857.class, "root"));
  }

  public RootComponent857 getRoot() {
    return root;
  }

}
