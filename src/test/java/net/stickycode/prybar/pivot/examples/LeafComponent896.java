package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent896
    implements PrybarComponent {

  private RootComponent896 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent896.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent896.class, "root"));
  }

  public RootComponent896 getRoot() {
    return root;
  }

}
