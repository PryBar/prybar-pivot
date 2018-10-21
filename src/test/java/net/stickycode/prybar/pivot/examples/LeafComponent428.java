package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent428
    implements PrybarComponent {

  private RootComponent428 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent428.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent428.class, "root"));
  }

  public RootComponent428 getRoot() {
    return root;
  }

}
