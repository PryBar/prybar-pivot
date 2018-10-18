package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent708
    implements PrybarComponent {

  private RootComponent708 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent708.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent708.class, "root"));
  }

  public RootComponent708 getRoot() {
    return root;
  }

}
