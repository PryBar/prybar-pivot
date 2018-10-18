package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent512
    implements PrybarComponent {

  private RootComponent512 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent512.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent512.class, "root"));
  }

  public RootComponent512 getRoot() {
    return root;
  }

}
