package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent569
    implements PrybarComponent {

  private RootComponent569 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent569.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent569.class, "root"));
  }

  public RootComponent569 getRoot() {
    return root;
  }

}
