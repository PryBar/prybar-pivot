package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent984
    implements PrybarComponent {

  private RootComponent984 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent984.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent984.class, "root"));
  }

  public RootComponent984 getRoot() {
    return root;
  }

}
