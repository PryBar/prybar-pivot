package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent573
    implements PrybarComponent {

  private RootComponent573 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent573.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent573.class, "root"));
  }

  public RootComponent573 getRoot() {
    return root;
  }

}
