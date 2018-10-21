package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent874
    implements PrybarComponent {

  private RootComponent874 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent874.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent874.class, "root"));
  }

  public RootComponent874 getRoot() {
    return root;
  }

}
