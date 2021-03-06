// Generated by data binding compiler. Do not edit!
package com.gnetop.letui.sleep.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.gnetop.letui.sleep.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityLoginBinding extends ViewDataBinding {
  @NonNull
  public final ConstraintLayout ctlLogin;

  @NonNull
  public final AppCompatEditText edtLoginCode;

  @NonNull
  public final AppCompatEditText edtLoginPhone;

  @NonNull
  public final FrameLayout fytLoginCode;

  @NonNull
  public final AppCompatImageView imgFbLogin;

  @NonNull
  public final AppCompatImageView imgGoogleLogin;

  @NonNull
  public final AppCompatImageView imgWxLogin;

  @NonNull
  public final TextView txtLogin;

  @NonNull
  public final TextView txtLoginCode;

  @NonNull
  public final TextView txtLoginFb;

  @NonNull
  public final TextView txtLoginProtocol;

  @NonNull
  public final TextView txtLoginTitle;

  @NonNull
  public final TextView txtOtherLogin;

  protected ActivityLoginBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ConstraintLayout ctlLogin, AppCompatEditText edtLoginCode, AppCompatEditText edtLoginPhone,
      FrameLayout fytLoginCode, AppCompatImageView imgFbLogin, AppCompatImageView imgGoogleLogin,
      AppCompatImageView imgWxLogin, TextView txtLogin, TextView txtLoginCode, TextView txtLoginFb,
      TextView txtLoginProtocol, TextView txtLoginTitle, TextView txtOtherLogin) {
    super(_bindingComponent, _root, _localFieldCount);
    this.ctlLogin = ctlLogin;
    this.edtLoginCode = edtLoginCode;
    this.edtLoginPhone = edtLoginPhone;
    this.fytLoginCode = fytLoginCode;
    this.imgFbLogin = imgFbLogin;
    this.imgGoogleLogin = imgGoogleLogin;
    this.imgWxLogin = imgWxLogin;
    this.txtLogin = txtLogin;
    this.txtLoginCode = txtLoginCode;
    this.txtLoginFb = txtLoginFb;
    this.txtLoginProtocol = txtLoginProtocol;
    this.txtLoginTitle = txtLoginTitle;
    this.txtOtherLogin = txtOtherLogin;
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_login, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityLoginBinding>inflateInternal(inflater, R.layout.activity_login, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_login, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityLoginBinding>inflateInternal(inflater, R.layout.activity_login, null, false, component);
  }

  public static ActivityLoginBinding bind(@NonNull View view) {
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
  public static ActivityLoginBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityLoginBinding)bind(component, view, R.layout.activity_login);
  }
}
