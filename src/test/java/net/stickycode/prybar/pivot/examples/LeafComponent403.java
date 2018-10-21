package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent403
    implements PrybarComponent {

  private RootComponent403 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent403.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent403.class, "root"));
  }

  public RootComponent403 getRoot() {
    return root;
  }

}
