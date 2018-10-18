package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent68
    implements PrybarComponent {

  private RootComponent68 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent68.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent68.class, "root"));
  }

  public RootComponent68 getRoot() {
    return root;
  }

}
