package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent167
    implements PrybarComponent {

  private RootComponent167 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent167.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent167.class, "root"));
  }

  public RootComponent167 getRoot() {
    return root;
  }

}
