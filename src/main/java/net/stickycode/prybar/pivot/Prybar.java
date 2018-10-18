package net.stickycode.prybar.pivot;

import java.util.ArrayList;
import java.util.List;

public class Prybar {

  private List<ComponentScope> scopes = new ArrayList<>();

  public void addScope(SingletonScope singletonScope) {
    this.scopes.add(singletonScope);
  }

  public PrybarPivot pivot() {
    PrybarPivot prybarPivot = new PrybarPivot();
    for (ComponentScope componentScope : scopes) {
      componentScope.initialise(prybarPivot);
    }

    prybarPivot.wire();
    return prybarPivot;
  }

}
