package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent178
    implements PrybarComponent {

  private RootComponent178 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent178.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent178.class, "root"));
  }

  public RootComponent178 getRoot() {
    return root;
  }

}
