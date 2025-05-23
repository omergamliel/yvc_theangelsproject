// Generated by view binder compiler. Do not edit!
package co.median.android.a2025_theangels_new.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import co.median.android.a2025_theangels_new.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentVolStatusBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button btnArrived;

  @NonNull
  public final Button btnCall;

  @NonNull
  public final Button btnCancelEvent;

  @NonNull
  public final Button btnNavigate;

  private FragmentVolStatusBinding(@NonNull LinearLayout rootView, @NonNull Button btnArrived,
      @NonNull Button btnCall, @NonNull Button btnCancelEvent, @NonNull Button btnNavigate) {
    this.rootView = rootView;
    this.btnArrived = btnArrived;
    this.btnCall = btnCall;
    this.btnCancelEvent = btnCancelEvent;
    this.btnNavigate = btnNavigate;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentVolStatusBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentVolStatusBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_vol_status, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentVolStatusBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnArrived;
      Button btnArrived = ViewBindings.findChildViewById(rootView, id);
      if (btnArrived == null) {
        break missingId;
      }

      id = R.id.btnCall;
      Button btnCall = ViewBindings.findChildViewById(rootView, id);
      if (btnCall == null) {
        break missingId;
      }

      id = R.id.btnCancelEvent;
      Button btnCancelEvent = ViewBindings.findChildViewById(rootView, id);
      if (btnCancelEvent == null) {
        break missingId;
      }

      id = R.id.btnNavigate;
      Button btnNavigate = ViewBindings.findChildViewById(rootView, id);
      if (btnNavigate == null) {
        break missingId;
      }

      return new FragmentVolStatusBinding((LinearLayout) rootView, btnArrived, btnCall,
          btnCancelEvent, btnNavigate);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
