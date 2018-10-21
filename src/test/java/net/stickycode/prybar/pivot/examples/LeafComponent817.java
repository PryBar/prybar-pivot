package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent817
    implements PrybarComponent {

  private RootComponent817 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent817.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent817.class, "root"));
  }

  public RootComponent817 getRoot() {
    return root;
  }

}
