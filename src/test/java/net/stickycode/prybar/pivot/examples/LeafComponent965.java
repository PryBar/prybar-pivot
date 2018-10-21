package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent965
    implements PrybarComponent {

  private RootComponent965 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent965.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent965.class, "root"));
  }

  public RootComponent965 getRoot() {
    return root;
  }

}
