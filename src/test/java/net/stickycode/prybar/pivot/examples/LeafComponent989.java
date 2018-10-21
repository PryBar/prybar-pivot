package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent989
    implements PrybarComponent {

  private RootComponent989 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent989.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent989.class, "root"));
  }

  public RootComponent989 getRoot() {
    return root;
  }

}
