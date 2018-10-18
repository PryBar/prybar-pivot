package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent136
    implements PrybarComponent {

  private RootComponent136 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent136.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent136.class, "root"));
  }

  public RootComponent136 getRoot() {
    return root;
  }

}
