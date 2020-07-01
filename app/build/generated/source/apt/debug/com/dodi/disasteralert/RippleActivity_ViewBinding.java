// Generated code from Butter Knife. Do not modify!
package com.dodi.disasteralert;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.skyfishjy.library.RippleBackground;
import java.lang.IllegalStateException;
import java.lang.Override;

public class RippleActivity_ViewBinding implements Unbinder {
  private RippleActivity target;

  @UiThread
  public RippleActivity_ViewBinding(RippleActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public RippleActivity_ViewBinding(RippleActivity target, View source) {
    this.target = target;

    target.rippleBackground = Utils.findRequiredViewAsType(source, R.id.start_btn, "field 'rippleBackground'", RippleBackground.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    RippleActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.rippleBackground = null;
  }
}
