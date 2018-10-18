package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarPivot;

public class LeafComponent884
    implements PrybarComponent {

  private RootComponent884 root;

  @Override
  public void wire(PrybarPivot r) {
    this.root = r.find(RootComponent884.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent884.class, "root"));
  }

  public RootComponent884 getRoot() {
    return root;
  }

}
