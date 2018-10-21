package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent227
    implements PrybarComponent {

  private RootComponent227 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent227.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent227.class, "root"));
  }

  public RootComponent227 getRoot() {
    return root;
  }

}
