package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent928
    implements PrybarComponent {

  private RootComponent928 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent928.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent928.class, "root"));
  }

  public RootComponent928 getRoot() {
    return root;
  }

}
