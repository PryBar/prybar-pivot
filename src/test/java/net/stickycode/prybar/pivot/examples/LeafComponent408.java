package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent408
    implements PrybarComponent {

  private RootComponent408 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent408.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent408.class, "root"));
  }

  public RootComponent408 getRoot() {
    return root;
  }

}
