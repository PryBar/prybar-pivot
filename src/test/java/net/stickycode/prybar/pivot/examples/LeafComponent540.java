package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent540
    implements PrybarComponent {

  private RootComponent540 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent540.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent540.class, "root"));
  }

  public RootComponent540 getRoot() {
    return root;
  }

}
