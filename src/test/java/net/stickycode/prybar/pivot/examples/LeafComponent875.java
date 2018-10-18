package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent875
    implements PrybarComponent {

  private RootComponent875 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent875.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent875.class, "root"));
  }

  public RootComponent875 getRoot() {
    return root;
  }

}
