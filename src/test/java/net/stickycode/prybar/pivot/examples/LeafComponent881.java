package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent881
    implements PrybarComponent {

  private RootComponent881 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent881.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent881.class, "root"));
  }

  public RootComponent881 getRoot() {
    return root;
  }

}
