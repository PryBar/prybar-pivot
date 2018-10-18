package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent721
    implements PrybarComponent {

  private RootComponent721 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent721.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent721.class, "root"));
  }

  public RootComponent721 getRoot() {
    return root;
  }

}
