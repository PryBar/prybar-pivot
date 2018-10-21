package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent773
    implements PrybarComponent {

  private RootComponent773 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent773.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent773.class, "root"));
  }

  public RootComponent773 getRoot() {
    return root;
  }

}
