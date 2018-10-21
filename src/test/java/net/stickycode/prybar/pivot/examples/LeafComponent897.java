package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent897
    implements PrybarComponent {

  private RootComponent897 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent897.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent897.class, "root"));
  }

  public RootComponent897 getRoot() {
    return root;
  }

}
