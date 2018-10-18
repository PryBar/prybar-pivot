package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent676
    implements PrybarComponent {

  private RootComponent676 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent676.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent676.class, "root"));
  }

  public RootComponent676 getRoot() {
    return root;
  }

}
