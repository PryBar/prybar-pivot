package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent170
    implements PrybarComponent {

  private RootComponent170 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent170.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent170.class, "root"));
  }

  public RootComponent170 getRoot() {
    return root;
  }

}
