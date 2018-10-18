package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent77
    implements PrybarComponent {

  private RootComponent77 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent77.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent77.class, "root"));
  }

  public RootComponent77 getRoot() {
    return root;
  }

}
