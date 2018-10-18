package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent867
    implements PrybarComponent {

  private RootComponent867 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent867.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent867.class, "root"));
  }

  public RootComponent867 getRoot() {
    return root;
  }

}
