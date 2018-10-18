package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent180
    implements PrybarComponent {

  private RootComponent180 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent180.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent180.class, "root"));
  }

  public RootComponent180 getRoot() {
    return root;
  }

}
