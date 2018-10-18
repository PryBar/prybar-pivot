package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent100
    implements PrybarComponent {

  private RootComponent100 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent100.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent100.class, "root"));
  }

  public RootComponent100 getRoot() {
    return root;
  }

}
