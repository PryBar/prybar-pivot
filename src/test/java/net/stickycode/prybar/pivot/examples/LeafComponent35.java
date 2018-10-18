package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent35
    implements PrybarComponent {

  private RootComponent35 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent35.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent35.class, "root"));
  }

  public RootComponent35 getRoot() {
    return root;
  }

}
