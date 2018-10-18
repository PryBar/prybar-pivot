package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent269
    implements PrybarComponent {

  private RootComponent269 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent269.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent269.class, "root"));
  }

  public RootComponent269 getRoot() {
    return root;
  }

}
