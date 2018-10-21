package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent522
    implements PrybarComponent {

  private RootComponent522 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent522.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent522.class, "root"));
  }

  public RootComponent522 getRoot() {
    return root;
  }

}
