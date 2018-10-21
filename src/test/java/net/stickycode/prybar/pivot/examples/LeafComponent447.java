package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent447
    implements PrybarComponent {

  private RootComponent447 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent447.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent447.class, "root"));
  }

  public RootComponent447 getRoot() {
    return root;
  }

}
