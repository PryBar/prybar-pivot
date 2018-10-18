package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent22
    implements PrybarComponent {

  private RootComponent22 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent22.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent22.class, "root"));
  }

  public RootComponent22 getRoot() {
    return root;
  }

}
