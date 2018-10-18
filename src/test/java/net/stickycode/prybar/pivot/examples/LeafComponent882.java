package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent882
    implements PrybarComponent {

  private RootComponent882 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent882.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent882.class, "root"));
  }

  public RootComponent882 getRoot() {
    return root;
  }

}
