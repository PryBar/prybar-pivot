package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent681
    implements PrybarComponent {

  private RootComponent681 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent681.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent681.class, "root"));
  }

  public RootComponent681 getRoot() {
    return root;
  }

}
