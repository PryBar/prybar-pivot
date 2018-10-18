package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent33
    implements PrybarComponent {

  private RootComponent33 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent33.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent33.class, "root"));
  }

  public RootComponent33 getRoot() {
    return root;
  }

}
