package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent124
    implements PrybarComponent {

  private RootComponent124 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent124.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent124.class, "root"));
  }

  public RootComponent124 getRoot() {
    return root;
  }

}
