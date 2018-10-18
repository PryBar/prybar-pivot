package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent515
    implements PrybarComponent {

  private RootComponent515 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent515.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent515.class, "root"));
  }

  public RootComponent515 getRoot() {
    return root;
  }

}
