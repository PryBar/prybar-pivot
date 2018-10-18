package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent983
    implements PrybarComponent {

  private RootComponent983 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent983.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent983.class, "root"));
  }

  public RootComponent983 getRoot() {
    return root;
  }

}
