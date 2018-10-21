package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent957
    implements PrybarComponent {

  private RootComponent957 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent957.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent957.class, "root"));
  }

  public RootComponent957 getRoot() {
    return root;
  }

}
