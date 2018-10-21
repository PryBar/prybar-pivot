package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent105
    implements PrybarComponent {

  private RootComponent105 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent105.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent105.class, "root"));
  }

  public RootComponent105 getRoot() {
    return root;
  }

}
