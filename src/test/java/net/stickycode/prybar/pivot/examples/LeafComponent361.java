package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent361
    implements PrybarComponent {

  private RootComponent361 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent361.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent361.class, "root"));
  }

  public RootComponent361 getRoot() {
    return root;
  }

}
