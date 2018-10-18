package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent63
    implements PrybarComponent {

  private RootComponent63 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent63.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent63.class, "root"));
  }

  public RootComponent63 getRoot() {
    return root;
  }

}
