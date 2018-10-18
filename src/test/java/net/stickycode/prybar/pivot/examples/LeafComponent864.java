package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent864
    implements PrybarComponent {

  private RootComponent864 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent864.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent864.class, "root"));
  }

  public RootComponent864 getRoot() {
    return root;
  }

}
