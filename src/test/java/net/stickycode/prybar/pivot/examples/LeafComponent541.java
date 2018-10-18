package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent541
    implements PrybarComponent {

  private RootComponent541 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent541.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent541.class, "root"));
  }

  public RootComponent541 getRoot() {
    return root;
  }

}
