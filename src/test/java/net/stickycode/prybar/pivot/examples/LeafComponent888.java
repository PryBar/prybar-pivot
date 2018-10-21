package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent888
    implements PrybarComponent {

  private RootComponent888 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent888.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent888.class, "root"));
  }

  public RootComponent888 getRoot() {
    return root;
  }

}
