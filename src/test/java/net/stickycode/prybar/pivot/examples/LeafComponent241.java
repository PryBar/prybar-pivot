package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent241
    implements PrybarComponent {

  private RootComponent241 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent241.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent241.class, "root"));
  }

  public RootComponent241 getRoot() {
    return root;
  }

}
