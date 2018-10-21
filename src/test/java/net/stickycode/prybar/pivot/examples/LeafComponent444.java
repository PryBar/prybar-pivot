package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent444
    implements PrybarComponent {

  private RootComponent444 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent444.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent444.class, "root"));
  }

  public RootComponent444 getRoot() {
    return root;
  }

}
