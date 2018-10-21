package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent781
    implements PrybarComponent {

  private RootComponent781 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent781.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent781.class, "root"));
  }

  public RootComponent781 getRoot() {
    return root;
  }

}
