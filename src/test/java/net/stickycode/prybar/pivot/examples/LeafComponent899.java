package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent899
    implements PrybarComponent {

  private RootComponent899 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent899.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent899.class, "root"));
  }

  public RootComponent899 getRoot() {
    return root;
  }

}
