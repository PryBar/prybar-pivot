package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent448
    implements PrybarComponent {

  private RootComponent448 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent448.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent448.class, "root"));
  }

  public RootComponent448 getRoot() {
    return root;
  }

}
