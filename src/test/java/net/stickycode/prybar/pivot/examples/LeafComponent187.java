package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent187
    implements PrybarComponent {

  private RootComponent187 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent187.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent187.class, "root"));
  }

  public RootComponent187 getRoot() {
    return root;
  }

}
