package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent873
    implements PrybarComponent {

  private RootComponent873 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent873.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent873.class, "root"));
  }

  public RootComponent873 getRoot() {
    return root;
  }

}
