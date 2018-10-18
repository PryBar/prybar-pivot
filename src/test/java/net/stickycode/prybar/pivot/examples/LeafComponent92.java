package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent92
    implements PrybarComponent {

  private RootComponent92 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent92.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent92.class, "root"));
  }

  public RootComponent92 getRoot() {
    return root;
  }

}
