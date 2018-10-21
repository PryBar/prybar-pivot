package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent301
    implements PrybarComponent {

  private RootComponent301 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent301.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent301.class, "root"));
  }

  public RootComponent301 getRoot() {
    return root;
  }

}
