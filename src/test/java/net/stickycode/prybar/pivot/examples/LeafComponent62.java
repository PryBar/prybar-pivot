package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent62
    implements PrybarComponent {

  private RootComponent62 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent62.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent62.class, "root"));
  }

  public RootComponent62 getRoot() {
    return root;
  }

}
