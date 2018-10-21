package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent152
    implements PrybarComponent {

  private RootComponent152 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent152.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent152.class, "root"));
  }

  public RootComponent152 getRoot() {
    return root;
  }

}
