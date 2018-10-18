package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent531
    implements PrybarComponent {

  private RootComponent531 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent531.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent531.class, "root"));
  }

  public RootComponent531 getRoot() {
    return root;
  }

}
