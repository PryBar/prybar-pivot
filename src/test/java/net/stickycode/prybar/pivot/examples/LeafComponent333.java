package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent333
    implements PrybarComponent {

  private RootComponent333 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent333.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent333.class, "root"));
  }

  public RootComponent333 getRoot() {
    return root;
  }

}
