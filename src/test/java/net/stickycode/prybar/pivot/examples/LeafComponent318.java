package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent318
    implements PrybarComponent {

  private RootComponent318 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent318.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent318.class, "root"));
  }

  public RootComponent318 getRoot() {
    return root;
  }

}
