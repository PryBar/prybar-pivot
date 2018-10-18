package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent480
    implements PrybarComponent {

  private RootComponent480 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent480.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent480.class, "root"));
  }

  public RootComponent480 getRoot() {
    return root;
  }

}
