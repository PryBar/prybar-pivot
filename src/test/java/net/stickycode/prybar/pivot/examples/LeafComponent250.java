package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent250
    implements PrybarComponent {

  private RootComponent250 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent250.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent250.class, "root"));
  }

  public RootComponent250 getRoot() {
    return root;
  }

}
