package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent328
    implements PrybarComponent {

  private RootComponent328 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent328.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent328.class, "root"));
  }

  public RootComponent328 getRoot() {
    return root;
  }

}
