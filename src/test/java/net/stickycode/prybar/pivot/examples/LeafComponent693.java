package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent693
    implements PrybarComponent {

  private RootComponent693 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent693.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent693.class, "root"));
  }

  public RootComponent693 getRoot() {
    return root;
  }

}
