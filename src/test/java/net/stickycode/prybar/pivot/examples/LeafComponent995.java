package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent995
    implements PrybarComponent {

  private RootComponent995 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent995.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent995.class, "root"));
  }

  public RootComponent995 getRoot() {
    return root;
  }

}
