package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent632
    implements PrybarComponent {

  private RootComponent632 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent632.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent632.class, "root"));
  }

  public RootComponent632 getRoot() {
    return root;
  }

}
