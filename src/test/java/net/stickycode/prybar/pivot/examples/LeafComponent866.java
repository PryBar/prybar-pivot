package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent866
    implements PrybarComponent {

  private RootComponent866 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent866.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent866.class, "root"));
  }

  public RootComponent866 getRoot() {
    return root;
  }

}
