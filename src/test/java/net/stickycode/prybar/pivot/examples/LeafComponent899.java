package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent899
    implements PrybarComponent {

  private RootComponent899 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent899.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent899.class, "root"));
  }

  public RootComponent899 getRoot() {
    return root;
  }

}
