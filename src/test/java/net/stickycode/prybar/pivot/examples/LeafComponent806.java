package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent806
    implements PrybarComponent {

  private RootComponent806 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent806.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent806.class, "root"));
  }

  public RootComponent806 getRoot() {
    return root;
  }

}
