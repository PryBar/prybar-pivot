package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent417
    implements PrybarComponent {

  private RootComponent417 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent417.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent417.class, "root"));
  }

  public RootComponent417 getRoot() {
    return root;
  }

}
