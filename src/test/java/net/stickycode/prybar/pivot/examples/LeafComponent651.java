package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent651
    implements PrybarComponent {

  private RootComponent651 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent651.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent651.class, "root"));
  }

  public RootComponent651 getRoot() {
    return root;
  }

}
