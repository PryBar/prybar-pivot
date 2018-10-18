package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent962
    implements PrybarComponent {

  private RootComponent962 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent962.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent962.class, "root"));
  }

  public RootComponent962 getRoot() {
    return root;
  }

}
