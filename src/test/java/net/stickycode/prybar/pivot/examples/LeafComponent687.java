package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent687
    implements PrybarComponent {

  private RootComponent687 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent687.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent687.class, "root"));
  }

  public RootComponent687 getRoot() {
    return root;
  }

}
