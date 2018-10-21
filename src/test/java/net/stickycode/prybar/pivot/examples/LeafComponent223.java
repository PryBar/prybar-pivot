package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent223
    implements PrybarComponent {

  private RootComponent223 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent223.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent223.class, "root"));
  }

  public RootComponent223 getRoot() {
    return root;
  }

}
