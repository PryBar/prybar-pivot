package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent416
    implements PrybarComponent {

  private RootComponent416 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent416.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent416.class, "root"));
  }

  public RootComponent416 getRoot() {
    return root;
  }

}
