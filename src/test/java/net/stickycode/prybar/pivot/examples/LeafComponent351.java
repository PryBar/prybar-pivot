package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent351
    implements PrybarComponent {

  private RootComponent351 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent351.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent351.class, "root"));
  }

  public RootComponent351 getRoot() {
    return root;
  }

}
