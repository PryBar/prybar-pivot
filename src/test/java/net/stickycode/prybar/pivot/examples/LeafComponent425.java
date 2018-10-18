package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent425
    implements PrybarComponent {

  private RootComponent425 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent425.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent425.class, "root"));
  }

  public RootComponent425 getRoot() {
    return root;
  }

}
