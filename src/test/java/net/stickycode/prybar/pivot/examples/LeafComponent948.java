package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent948
    implements PrybarComponent {

  private RootComponent948 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent948.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent948.class, "root"));
  }

  public RootComponent948 getRoot() {
    return root;
  }

}
