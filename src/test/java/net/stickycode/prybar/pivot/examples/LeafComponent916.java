package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent916
    implements PrybarComponent {

  private RootComponent916 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent916.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent916.class, "root"));
  }

  public RootComponent916 getRoot() {
    return root;
  }

}
