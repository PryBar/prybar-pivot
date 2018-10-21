package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent93
    implements PrybarComponent {

  private RootComponent93 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent93.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent93.class, "root"));
  }

  public RootComponent93 getRoot() {
    return root;
  }

}
