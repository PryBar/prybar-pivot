package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent238
    implements PrybarComponent {

  private RootComponent238 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent238.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent238.class, "root"));
  }

  public RootComponent238 getRoot() {
    return root;
  }

}
