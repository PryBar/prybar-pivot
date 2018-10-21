package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent906
    implements PrybarComponent {

  private RootComponent906 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent906.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent906.class, "root"));
  }

  public RootComponent906 getRoot() {
    return root;
  }

}
