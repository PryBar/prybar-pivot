package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent686
    implements PrybarComponent {

  private RootComponent686 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent686.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent686.class, "root"));
  }

  public RootComponent686 getRoot() {
    return root;
  }

}
