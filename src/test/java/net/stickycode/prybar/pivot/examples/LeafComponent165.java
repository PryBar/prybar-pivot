package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent165
    implements PrybarComponent {

  private RootComponent165 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent165.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent165.class, "root"));
  }

  public RootComponent165 getRoot() {
    return root;
  }

}
