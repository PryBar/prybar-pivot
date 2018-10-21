package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent825
    implements PrybarComponent {

  private RootComponent825 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent825.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent825.class, "root"));
  }

  public RootComponent825 getRoot() {
    return root;
  }

}
