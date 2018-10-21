package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent736
    implements PrybarComponent {

  private RootComponent736 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent736.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent736.class, "root"));
  }

  public RootComponent736 getRoot() {
    return root;
  }

}
