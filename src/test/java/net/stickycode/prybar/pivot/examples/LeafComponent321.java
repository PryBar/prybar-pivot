package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent321
    implements PrybarComponent {

  private RootComponent321 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent321.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent321.class, "root"));
  }

  public RootComponent321 getRoot() {
    return root;
  }

}
