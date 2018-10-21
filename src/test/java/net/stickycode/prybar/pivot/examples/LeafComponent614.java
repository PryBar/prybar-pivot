package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent614
    implements PrybarComponent {

  private RootComponent614 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent614.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent614.class, "root"));
  }

  public RootComponent614 getRoot() {
    return root;
  }

}
