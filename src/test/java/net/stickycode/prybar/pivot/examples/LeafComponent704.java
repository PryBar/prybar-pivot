package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent704
    implements PrybarComponent {

  private RootComponent704 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent704.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent704.class, "root"));
  }

  public RootComponent704 getRoot() {
    return root;
  }

}
