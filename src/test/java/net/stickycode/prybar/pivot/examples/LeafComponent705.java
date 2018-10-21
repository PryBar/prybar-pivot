package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent705
    implements PrybarComponent {

  private RootComponent705 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent705.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent705.class, "root"));
  }

  public RootComponent705 getRoot() {
    return root;
  }

}
