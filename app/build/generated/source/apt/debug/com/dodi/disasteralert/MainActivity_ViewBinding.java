// Generated code from Butter Knife. Do not modify!
package com.dodi.disasteralert;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MainActivity_ViewBinding implements Unbinder {
  private MainActivity target;

  @UiThread
  public MainActivity_ViewBinding(MainActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MainActivity_ViewBinding(MainActivity target, View source) {
    this.target = target;

    target.input = Utils.findRequiredViewAsType(source, R.id.input, "field 'input'", EditText.class);
    target.translate = Utils.findRequiredViewAsType(source, R.id.translate, "field 'translate'", Button.class);
    target.translatedText = Utils.findRequiredViewAsType(source, R.id.translated_text, "field 'translatedText'", TextView.class);
    target.loadedImage = Utils.findRequiredViewAsType(source, R.id.loaded_image, "field 'loadedImage'", ImageView.class);
    target.targetLanguage = Utils.findRequiredViewAsType(source, R.id.target_language, "field 'targetLanguage'", RadioGroup.class);
    target.mic = Utils.findRequiredViewAsType(source, R.id.mic, "field 'mic'", ImageButton.class);
    target.gallery = Utils.findRequiredViewAsType(source, R.id.gallery_button, "field 'gallery'", Button.class);
    target.play = Utils.findRequiredViewAsType(source, R.id.play, "field 'play'", ImageButton.class);
    target.camera = Utils.findRequiredViewAsType(source, R.id.camera_button, "field 'camera'", Button.class);
    target.process_image = Utils.findRequiredViewAsType(source, R.id.process_image, "field 'process_image'", Button.class);
    target.personality = Utils.findRequiredViewAsType(source, R.id.personality, "field 'personality'", Button.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MainActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.input = null;
    target.translate = null;
    target.translatedText = null;
    target.loadedImage = null;
    target.targetLanguage = null;
    target.mic = null;
    target.gallery = null;
    target.play = null;
    target.camera = null;
    target.process_image = null;
    target.personality = null;
  }
}
