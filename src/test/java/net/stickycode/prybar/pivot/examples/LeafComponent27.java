package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent27
    implements PrybarComponent {

  private RootComponent27 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent27.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent27.class, "root"));
  }

  public RootComponent27 getRoot() {
    return root;
  }

}
