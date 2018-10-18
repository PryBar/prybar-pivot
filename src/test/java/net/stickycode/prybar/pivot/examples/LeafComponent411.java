package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent411
    implements PrybarComponent {

  private RootComponent411 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent411.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent411.class, "root"));
  }

  public RootComponent411 getRoot() {
    return root;
  }

}
