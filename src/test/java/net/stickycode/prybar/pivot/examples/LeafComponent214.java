package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent214
    implements PrybarComponent {

  private RootComponent214 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent214.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent214.class, "root"));
  }

  public RootComponent214 getRoot() {
    return root;
  }

}
