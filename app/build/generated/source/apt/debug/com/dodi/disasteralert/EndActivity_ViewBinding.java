// Generated code from Butter Knife. Do not modify!
package com.dodi.disasteralert;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class EndActivity_ViewBinding implements Unbinder {
  private EndActivity target;

  @UiThread
  public EndActivity_ViewBinding(EndActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public EndActivity_ViewBinding(EndActivity target, View source) {
    this.target = target;

    target.recyclerView = Utils.findRequiredViewAsType(source, R.id.list_item, "field 'recyclerView'", RecyclerView.class);
    target.toolbar = Utils.findRequiredViewAsType(source, R.id.toolbar, "field 'toolbar'", Toolbar.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    EndActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.recyclerView = null;
    target.toolbar = null;
  }
}
