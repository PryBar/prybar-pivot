package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent489
    implements PrybarComponent {

  private RootComponent489 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent489.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent489.class, "root"));
  }

  public RootComponent489 getRoot() {
    return root;
  }

}
