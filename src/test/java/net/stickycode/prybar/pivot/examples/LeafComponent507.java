package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent507
    implements PrybarComponent {

  private RootComponent507 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent507.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent507.class, "root"));
  }

  public RootComponent507 getRoot() {
    return root;
  }

}
