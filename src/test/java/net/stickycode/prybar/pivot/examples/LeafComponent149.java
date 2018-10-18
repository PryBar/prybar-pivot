package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent149
    implements PrybarComponent {

  private RootComponent149 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent149.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent149.class, "root"));
  }

  public RootComponent149 getRoot() {
    return root;
  }

}
