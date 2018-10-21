package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent718
    implements PrybarComponent {

  private RootComponent718 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent718.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent718.class, "root"));
  }

  public RootComponent718 getRoot() {
    return root;
  }

}
