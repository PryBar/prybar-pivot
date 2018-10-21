package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent620
    implements PrybarComponent {

  private RootComponent620 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent620.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent620.class, "root"));
  }

  public RootComponent620 getRoot() {
    return root;
  }

}
