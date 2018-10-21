package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent841
    implements PrybarComponent {

  private RootComponent841 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent841.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent841.class, "root"));
  }

  public RootComponent841 getRoot() {
    return root;
  }

}
