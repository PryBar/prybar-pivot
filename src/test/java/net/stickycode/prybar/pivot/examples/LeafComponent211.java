package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent211
    implements PrybarComponent {

  private RootComponent211 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent211.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent211.class, "root"));
  }

  public RootComponent211 getRoot() {
    return root;
  }

}
