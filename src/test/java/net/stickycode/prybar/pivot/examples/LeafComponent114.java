package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent114
    implements PrybarComponent {

  private RootComponent114 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent114.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent114.class, "root"));
  }

  public RootComponent114 getRoot() {
    return root;
  }

}
