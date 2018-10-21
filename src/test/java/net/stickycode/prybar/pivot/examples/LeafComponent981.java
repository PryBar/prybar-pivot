package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent981
    implements PrybarComponent {

  private RootComponent981 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent981.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent981.class, "root"));
  }

  public RootComponent981 getRoot() {
    return root;
  }

}
