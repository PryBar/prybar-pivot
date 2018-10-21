package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent629
    implements PrybarComponent {

  private RootComponent629 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent629.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent629.class, "root"));
  }

  public RootComponent629 getRoot() {
    return root;
  }

}
