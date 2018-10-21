package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent865
    implements PrybarComponent {

  private RootComponent865 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent865.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent865.class, "root"));
  }

  public RootComponent865 getRoot() {
    return root;
  }

}
