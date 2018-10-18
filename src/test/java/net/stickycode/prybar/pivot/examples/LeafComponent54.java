package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent54
    implements PrybarComponent {

  private RootComponent54 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent54.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent54.class, "root"));
  }

  public RootComponent54 getRoot() {
    return root;
  }

}
