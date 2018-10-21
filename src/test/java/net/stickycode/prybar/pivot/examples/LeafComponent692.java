package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent692
    implements PrybarComponent {

  private RootComponent692 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent692.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent692.class, "root"));
  }

  public RootComponent692 getRoot() {
    return root;
  }

}
