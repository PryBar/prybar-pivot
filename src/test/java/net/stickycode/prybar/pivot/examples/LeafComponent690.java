package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent690
    implements PrybarComponent {

  private RootComponent690 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent690.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent690.class, "root"));
  }

  public RootComponent690 getRoot() {
    return root;
  }

}
