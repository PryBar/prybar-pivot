package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent970
    implements PrybarComponent {

  private RootComponent970 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent970.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent970.class, "root"));
  }

  public RootComponent970 getRoot() {
    return root;
  }

}
