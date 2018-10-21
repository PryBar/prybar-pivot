package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent861
    implements PrybarComponent {

  private RootComponent861 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent861.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent861.class, "root"));
  }

  public RootComponent861 getRoot() {
    return root;
  }

}
