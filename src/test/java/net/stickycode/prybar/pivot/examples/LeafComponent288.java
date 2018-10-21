package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent288
    implements PrybarComponent {

  private RootComponent288 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent288.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent288.class, "root"));
  }

  public RootComponent288 getRoot() {
    return root;
  }

}
