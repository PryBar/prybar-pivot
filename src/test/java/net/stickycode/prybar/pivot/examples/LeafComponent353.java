package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent353
    implements PrybarComponent {

  private RootComponent353 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent353.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent353.class, "root"));
  }

  public RootComponent353 getRoot() {
    return root;
  }

}
