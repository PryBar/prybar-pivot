package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent369
    implements PrybarComponent {

  private RootComponent369 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent369.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent369.class, "root"));
  }

  public RootComponent369 getRoot() {
    return root;
  }

}
