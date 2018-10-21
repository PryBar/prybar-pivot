package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent65
    implements PrybarComponent {

  private RootComponent65 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent65.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent65.class, "root"));
  }

  public RootComponent65 getRoot() {
    return root;
  }

}
