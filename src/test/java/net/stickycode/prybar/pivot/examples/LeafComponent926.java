package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent926
    implements PrybarComponent {

  private RootComponent926 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent926.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent926.class, "root"));
  }

  public RootComponent926 getRoot() {
    return root;
  }

}
