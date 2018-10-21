package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent325
    implements PrybarComponent {

  private RootComponent325 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent325.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent325.class, "root"));
  }

  public RootComponent325 getRoot() {
    return root;
  }

}
