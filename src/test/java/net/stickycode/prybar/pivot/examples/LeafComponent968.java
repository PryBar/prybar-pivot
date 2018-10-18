package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent968
    implements PrybarComponent {

  private RootComponent968 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent968.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent968.class, "root"));
  }

  public RootComponent968 getRoot() {
    return root;
  }

}
