package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent816
    implements PrybarComponent {

  private RootComponent816 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent816.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent816.class, "root"));
  }

  public RootComponent816 getRoot() {
    return root;
  }

}
