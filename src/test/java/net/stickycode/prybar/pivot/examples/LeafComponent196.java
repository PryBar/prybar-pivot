package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent196
    implements PrybarComponent {

  private RootComponent196 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent196.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent196.class, "root"));
  }

  public RootComponent196 getRoot() {
    return root;
  }

}
