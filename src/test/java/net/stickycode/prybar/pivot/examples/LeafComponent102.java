package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent102
    implements PrybarComponent {

  private RootComponent102 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent102.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent102.class, "root"));
  }

  public RootComponent102 getRoot() {
    return root;
  }

}
