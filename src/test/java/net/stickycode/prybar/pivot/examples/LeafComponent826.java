package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent826
    implements PrybarComponent {

  private RootComponent826 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent826.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent826.class, "root"));
  }

  public RootComponent826 getRoot() {
    return root;
  }

}
