package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent305
    implements PrybarComponent {

  private RootComponent305 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent305.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent305.class, "root"));
  }

  public RootComponent305 getRoot() {
    return root;
  }

}
