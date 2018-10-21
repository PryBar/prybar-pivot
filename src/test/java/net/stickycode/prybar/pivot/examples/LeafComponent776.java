package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent776
    implements PrybarComponent {

  private RootComponent776 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent776.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent776.class, "root"));
  }

  public RootComponent776 getRoot() {
    return root;
  }

}
