package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent524
    implements PrybarComponent {

  private RootComponent524 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent524.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent524.class, "root"));
  }

  public RootComponent524 getRoot() {
    return root;
  }

}
