package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent943
    implements PrybarComponent {

  private RootComponent943 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent943.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent943.class, "root"));
  }

  public RootComponent943 getRoot() {
    return root;
  }

}
