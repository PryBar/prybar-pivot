package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent768
    implements PrybarComponent {

  private RootComponent768 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent768.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent768.class, "root"));
  }

  public RootComponent768 getRoot() {
    return root;
  }

}
