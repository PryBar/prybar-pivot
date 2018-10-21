package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent98
    implements PrybarComponent {

  private RootComponent98 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent98.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent98.class, "root"));
  }

  public RootComponent98 getRoot() {
    return root;
  }

}
