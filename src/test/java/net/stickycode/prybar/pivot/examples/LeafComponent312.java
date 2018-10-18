package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent312
    implements PrybarComponent {

  private RootComponent312 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent312.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent312.class, "root"));
  }

  public RootComponent312 getRoot() {
    return root;
  }

}
