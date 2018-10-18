package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent778
    implements PrybarComponent {

  private RootComponent778 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent778.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent778.class, "root"));
  }

  public RootComponent778 getRoot() {
    return root;
  }

}
