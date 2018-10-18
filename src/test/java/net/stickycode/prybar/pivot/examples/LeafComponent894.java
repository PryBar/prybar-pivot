package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent894
    implements PrybarComponent {

  private RootComponent894 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent894.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent894.class, "root"));
  }

  public RootComponent894 getRoot() {
    return root;
  }

}
