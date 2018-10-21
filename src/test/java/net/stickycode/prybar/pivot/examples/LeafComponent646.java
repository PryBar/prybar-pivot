package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent646
    implements PrybarComponent {

  private RootComponent646 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent646.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent646.class, "root"));
  }

  public RootComponent646 getRoot() {
    return root;
  }

}
