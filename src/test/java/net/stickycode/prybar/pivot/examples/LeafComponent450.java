package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent450
    implements PrybarComponent {

  private RootComponent450 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent450.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent450.class, "root"));
  }

  public RootComponent450 getRoot() {
    return root;
  }

}
