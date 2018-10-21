package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent986
    implements PrybarComponent {

  private RootComponent986 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent986.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent986.class, "root"));
  }

  public RootComponent986 getRoot() {
    return root;
  }

}
