package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent950
    implements PrybarComponent {

  private RootComponent950 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent950.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent950.class, "root"));
  }

  public RootComponent950 getRoot() {
    return root;
  }

}
