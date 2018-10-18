package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent622
    implements PrybarComponent {

  private RootComponent622 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent622.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent622.class, "root"));
  }

  public RootComponent622 getRoot() {
    return root;
  }

}
