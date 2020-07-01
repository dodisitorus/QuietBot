// Generated code from Butter Knife. Do not modify!
package com.dodi.disasteralert;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.ebanx.swipebtn.SwipeButton;
import com.skyfishjy.library.RippleBackground;
import java.lang.IllegalStateException;
import java.lang.Override;

public class StartActivity_ViewBinding implements Unbinder {
  private BotActivity target;

  @UiThread
  public StartActivity_ViewBinding(BotActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public StartActivity_ViewBinding(BotActivity target, View source) {
    this.target = target;

    target.constraintLayout = Utils.findRequiredViewAsType(source, R.id.parent, "field 'constraintLayout'", ConstraintLayout.class);
    target.container_call = Utils.findRequiredViewAsType(source, R.id.container_call, "field 'container_call'", ConstraintLayout.class);
    target.container_chat = Utils.findRequiredViewAsType(source, R.id.container_chat, "field 'container_chat'", ConstraintLayout.class);
    target.rippleBackground = Utils.findRequiredViewAsType(source, R.id.start_btn, "field 'rippleBackground'", RippleBackground.class);
    target.card_connection = Utils.findRequiredViewAsType(source, R.id.card_connection, "field 'card_connection'", CardView.class);
    target.swipeButton = Utils.findRequiredViewAsType(source, R.id.swipe_btn, "field 'swipeButton'", SwipeButton.class);
    target.card_chat = Utils.findRequiredViewAsType(source, R.id.card_chat, "field 'card_chat'", CardView.class);
    target.card_wait = Utils.findRequiredViewAsType(source, R.id.card_wait, "field 'card_wait'", CardView.class);
    target.image_wait = Utils.findRequiredViewAsType(source, R.id.image_wait, "field 'image_wait'", ImageView.class);
    target.guide_wait_text = Utils.findRequiredViewAsType(source, R.id.guide_wait, "field 'guide_wait_text'", TextView.class);
    target.text_connection = Utils.findRequiredViewAsType(source, R.id.text_connection, "field 'text_connection'", TextView.class);
    target.toolbar = Utils.findRequiredViewAsType(source, R.id.toolbar, "field 'toolbar'", Toolbar.class);
    target.inputMessage = Utils.findRequiredViewAsType(source, R.id.messageInput, "field 'inputMessage'", EditText.class);
    target.btnSend = Utils.findRequiredViewAsType(source, R.id.btn_send, "field 'btnSend'", Button.class);
    target.btnFile = Utils.findRequiredViewAsType(source, R.id.btn_file, "field 'btnFile'", ImageView.class);
    target.recyclerView = Utils.findRequiredViewAsType(source, R.id.recycler_view, "field 'recyclerView'", RecyclerView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    BotActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.constraintLayout = null;
    target.container_call = null;
    target.container_chat = null;
    target.rippleBackground = null;
    target.card_connection = null;
    target.swipeButton = null;
    target.card_chat = null;
    target.card_wait = null;
    target.image_wait = null;
    target.guide_wait_text = null;
    target.text_connection = null;
    target.toolbar = null;
    target.inputMessage = null;
    target.btnSend = null;
    target.btnFile = null;
    target.recyclerView = null;
  }
}
