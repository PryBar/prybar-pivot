package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent359
    implements PrybarComponent {

  private RootComponent359 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent359.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent359.class, "root"));
  }

  public RootComponent359 getRoot() {
    return root;
  }

}
