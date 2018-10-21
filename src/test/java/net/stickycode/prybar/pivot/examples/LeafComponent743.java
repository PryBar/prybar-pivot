package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent743
    implements PrybarComponent {

  private RootComponent743 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent743.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent743.class, "root"));
  }

  public RootComponent743 getRoot() {
    return root;
  }

}
