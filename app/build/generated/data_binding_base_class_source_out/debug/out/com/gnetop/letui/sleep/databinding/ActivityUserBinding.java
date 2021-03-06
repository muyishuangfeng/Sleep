// Generated by data binding compiler. Do not edit!
package com.gnetop.letui.sleep.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.gnetop.letui.sleep.R;
import com.yk.silence.toolbar.CustomTitleBar;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityUserBinding extends ViewDataBinding {
  @NonNull
  public final Button btnUserLogin;

  @NonNull
  public final Button btnUserOpen;

  @NonNull
  public final ConstraintLayout cstUserVip;

  @NonNull
  public final CircleImageView imgUserAvatar;

  @NonNull
  public final LinearLayout lytUserSound;

  @NonNull
  public final CustomTitleBar titleUser;

  @NonNull
  public final TextView txtUserAbout;

  @NonNull
  public final TextView txtUserClear;

  @NonNull
  public final TextView txtUserFeedback;

  @NonNull
  public final TextView txtUserInfo;

  @NonNull
  public final TextView txtUserProtocol;

  protected ActivityUserBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Button btnUserLogin, Button btnUserOpen, ConstraintLayout cstUserVip,
      CircleImageView imgUserAvatar, LinearLayout lytUserSound, CustomTitleBar titleUser,
      TextView txtUserAbout, TextView txtUserClear, TextView txtUserFeedback, TextView txtUserInfo,
      TextView txtUserProtocol) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnUserLogin = btnUserLogin;
    this.btnUserOpen = btnUserOpen;
    this.cstUserVip = cstUserVip;
    this.imgUserAvatar = imgUserAvatar;
    this.lytUserSound = lytUserSound;
    this.titleUser = titleUser;
    this.txtUserAbout = txtUserAbout;
    this.txtUserClear = txtUserClear;
    this.txtUserFeedback = txtUserFeedback;
    this.txtUserInfo = txtUserInfo;
    this.txtUserProtocol = txtUserProtocol;
  }

  @NonNull
  public static ActivityUserBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_user, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityUserBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityUserBinding>inflateInternal(inflater, R.layout.activity_user, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityUserBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_user, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityUserBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityUserBinding>inflateInternal(inflater, R.layout.activity_user, null, false, component);
  }

  public static ActivityUserBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ActivityUserBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityUserBinding)bind(component, view, R.layout.activity_user);
  }
}
