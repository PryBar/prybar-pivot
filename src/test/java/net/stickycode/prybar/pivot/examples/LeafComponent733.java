package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent733
    implements PrybarComponent {

  private RootComponent733 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent733.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent733.class, "root"));
  }

  public RootComponent733 getRoot() {
    return root;
  }

}
