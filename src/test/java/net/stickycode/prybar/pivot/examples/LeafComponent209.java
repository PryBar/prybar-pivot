package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent209
    implements PrybarComponent {

  private RootComponent209 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent209.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent209.class, "root"));
  }

  public RootComponent209 getRoot() {
    return root;
  }

}
