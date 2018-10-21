package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent851
    implements PrybarComponent {

  private RootComponent851 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent851.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent851.class, "root"));
  }

  public RootComponent851 getRoot() {
    return root;
  }

}
