package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent44
    implements PrybarComponent {

  private RootComponent44 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent44.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent44.class, "root"));
  }

  public RootComponent44 getRoot() {
    return root;
  }

}
