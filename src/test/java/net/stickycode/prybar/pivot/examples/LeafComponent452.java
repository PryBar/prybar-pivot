package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent452
    implements PrybarComponent {

  private RootComponent452 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent452.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent452.class, "root"));
  }

  public RootComponent452 getRoot() {
    return root;
  }

}
