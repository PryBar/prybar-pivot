package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent146
    implements PrybarComponent {

  private RootComponent146 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent146.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent146.class, "root"));
  }

  public RootComponent146 getRoot() {
    return root;
  }

}
