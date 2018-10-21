package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent95
    implements PrybarComponent {

  private RootComponent95 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent95.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent95.class, "root"));
  }

  public RootComponent95 getRoot() {
    return root;
  }

}
