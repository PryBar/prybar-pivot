package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent192
    implements PrybarComponent {

  private RootComponent192 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent192.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent192.class, "root"));
  }

  public RootComponent192 getRoot() {
    return root;
  }

}
