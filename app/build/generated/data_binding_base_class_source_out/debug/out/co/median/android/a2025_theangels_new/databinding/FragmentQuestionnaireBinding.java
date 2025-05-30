// Generated by view binder compiler. Do not edit!
package co.median.android.a2025_theangels_new.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import co.median.android.a2025_theangels_new.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentQuestionnaireBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final RadioButton rbBleedingNo;

  @NonNull
  public final RadioButton rbBleedingYes;

  @NonNull
  public final RadioButton rbBreathingNo;

  @NonNull
  public final RadioButton rbBreathingYes;

  @NonNull
  public final RadioButton rbPulseNo;

  @NonNull
  public final RadioButton rbPulseYes;

  @NonNull
  public final RadioButton rbSafetyNo;

  @NonNull
  public final RadioButton rbSafetyYes;

  @NonNull
  public final RadioGroup rgBleeding;

  @NonNull
  public final RadioGroup rgBreathing;

  @NonNull
  public final RadioGroup rgPulse;

  @NonNull
  public final RadioGroup rgSafety;

  private FragmentQuestionnaireBinding(@NonNull ScrollView rootView,
      @NonNull RadioButton rbBleedingNo, @NonNull RadioButton rbBleedingYes,
      @NonNull RadioButton rbBreathingNo, @NonNull RadioButton rbBreathingYes,
      @NonNull RadioButton rbPulseNo, @NonNull RadioButton rbPulseYes,
      @NonNull RadioButton rbSafetyNo, @NonNull RadioButton rbSafetyYes,
      @NonNull RadioGroup rgBleeding, @NonNull RadioGroup rgBreathing, @NonNull RadioGroup rgPulse,
      @NonNull RadioGroup rgSafety) {
    this.rootView = rootView;
    this.rbBleedingNo = rbBleedingNo;
    this.rbBleedingYes = rbBleedingYes;
    this.rbBreathingNo = rbBreathingNo;
    this.rbBreathingYes = rbBreathingYes;
    this.rbPulseNo = rbPulseNo;
    this.rbPulseYes = rbPulseYes;
    this.rbSafetyNo = rbSafetyNo;
    this.rbSafetyYes = rbSafetyYes;
    this.rgBleeding = rgBleeding;
    this.rgBreathing = rgBreathing;
    this.rgPulse = rgPulse;
    this.rgSafety = rgSafety;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentQuestionnaireBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentQuestionnaireBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_questionnaire, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentQuestionnaireBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.rbBleedingNo;
      RadioButton rbBleedingNo = ViewBindings.findChildViewById(rootView, id);
      if (rbBleedingNo == null) {
        break missingId;
      }

      id = R.id.rbBleedingYes;
      RadioButton rbBleedingYes = ViewBindings.findChildViewById(rootView, id);
      if (rbBleedingYes == null) {
        break missingId;
      }

      id = R.id.rbBreathingNo;
      RadioButton rbBreathingNo = ViewBindings.findChildViewById(rootView, id);
      if (rbBreathingNo == null) {
        break missingId;
      }

      id = R.id.rbBreathingYes;
      RadioButton rbBreathingYes = ViewBindings.findChildViewById(rootView, id);
      if (rbBreathingYes == null) {
        break missingId;
      }

      id = R.id.rbPulseNo;
      RadioButton rbPulseNo = ViewBindings.findChildViewById(rootView, id);
      if (rbPulseNo == null) {
        break missingId;
      }

      id = R.id.rbPulseYes;
      RadioButton rbPulseYes = ViewBindings.findChildViewById(rootView, id);
      if (rbPulseYes == null) {
        break missingId;
      }

      id = R.id.rbSafetyNo;
      RadioButton rbSafetyNo = ViewBindings.findChildViewById(rootView, id);
      if (rbSafetyNo == null) {
        break missingId;
      }

      id = R.id.rbSafetyYes;
      RadioButton rbSafetyYes = ViewBindings.findChildViewById(rootView, id);
      if (rbSafetyYes == null) {
        break missingId;
      }

      id = R.id.rgBleeding;
      RadioGroup rgBleeding = ViewBindings.findChildViewById(rootView, id);
      if (rgBleeding == null) {
        break missingId;
      }

      id = R.id.rgBreathing;
      RadioGroup rgBreathing = ViewBindings.findChildViewById(rootView, id);
      if (rgBreathing == null) {
        break missingId;
      }

      id = R.id.rgPulse;
      RadioGroup rgPulse = ViewBindings.findChildViewById(rootView, id);
      if (rgPulse == null) {
        break missingId;
      }

      id = R.id.rgSafety;
      RadioGroup rgSafety = ViewBindings.findChildViewById(rootView, id);
      if (rgSafety == null) {
        break missingId;
      }

      return new FragmentQuestionnaireBinding((ScrollView) rootView, rbBleedingNo, rbBleedingYes,
          rbBreathingNo, rbBreathingYes, rbPulseNo, rbPulseYes, rbSafetyNo, rbSafetyYes, rgBleeding,
          rgBreathing, rgPulse, rgSafety);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
