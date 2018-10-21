package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent935
    implements PrybarComponent {

  private RootComponent935 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent935.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent935.class, "root"));
  }

  public RootComponent935 getRoot() {
    return root;
  }

}
