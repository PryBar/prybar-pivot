package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent310
    implements PrybarComponent {

  private RootComponent310 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent310.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent310.class, "root"));
  }

  public RootComponent310 getRoot() {
    return root;
  }

}
