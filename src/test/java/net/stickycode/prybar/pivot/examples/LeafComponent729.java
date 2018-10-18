package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent729
    implements PrybarComponent {

  private RootComponent729 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent729.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent729.class, "root"));
  }

  public RootComponent729 getRoot() {
    return root;
  }

}
