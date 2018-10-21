package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent939
    implements PrybarComponent {

  private RootComponent939 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent939.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent939.class, "root"));
  }

  public RootComponent939 getRoot() {
    return root;
  }

}
