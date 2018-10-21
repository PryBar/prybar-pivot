package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent616
    implements PrybarComponent {

  private RootComponent616 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent616.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent616.class, "root"));
  }

  public RootComponent616 getRoot() {
    return root;
  }

}
