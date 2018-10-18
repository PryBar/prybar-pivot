package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent210
    implements PrybarComponent {

  private RootComponent210 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent210.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent210.class, "root"));
  }

  public RootComponent210 getRoot() {
    return root;
  }

}
