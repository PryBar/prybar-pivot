package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent982
    implements PrybarComponent {

  private RootComponent982 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent982.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent982.class, "root"));
  }

  public RootComponent982 getRoot() {
    return root;
  }

}
