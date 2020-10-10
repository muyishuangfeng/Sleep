// Generated by data binding compiler. Do not edit!
package com.gnetop.letui.sleep.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.SeekBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.gnetop.letui.sleep.R;
import com.gnetop.letui.sleep.ui.datetime.time.HourAndMinutePicker;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class BalanceUserDataLayoutBinding extends ViewDataBinding {
  @NonNull
  public final Button btnCancel;

  @NonNull
  public final Button btnOneStart;

  @NonNull
  public final Button btnOneStop;

  @NonNull
  public final Button btnSure;

  @NonNull
  public final Button btnThirdStart;

  @NonNull
  public final Button btnThirdStop;

  @NonNull
  public final Button btnTwoStart;

  @NonNull
  public final Button btnTwoStop;

  @NonNull
  public final HourAndMinutePicker hourPicker;

  @NonNull
  public final CircleImageView imgUser;

  @NonNull
  public final SeekBar progress;

  @Bindable
  protected String mImageUrl;

  protected BalanceUserDataLayoutBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Button btnCancel, Button btnOneStart, Button btnOneStop, Button btnSure, Button btnThirdStart,
      Button btnThirdStop, Button btnTwoStart, Button btnTwoStop, HourAndMinutePicker hourPicker,
      CircleImageView imgUser, SeekBar progress) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnCancel = btnCancel;
    this.btnOneStart = btnOneStart;
    this.btnOneStop = btnOneStop;
    this.btnSure = btnSure;
    this.btnThirdStart = btnThirdStart;
    this.btnThirdStop = btnThirdStop;
    this.btnTwoStart = btnTwoStart;
    this.btnTwoStop = btnTwoStop;
    this.hourPicker = hourPicker;
    this.imgUser = imgUser;
    this.progress = progress;
  }

  public abstract void setImageUrl(@Nullable String imageUrl);

  @Nullable
  public String getImageUrl() {
    return mImageUrl;
  }

  @NonNull
  public static BalanceUserDataLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.balance_user_data_layout, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static BalanceUserDataLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<BalanceUserDataLayoutBinding>inflateInternal(inflater, R.layout.balance_user_data_layout, root, attachToRoot, component);
  }

  @NonNull
  public static BalanceUserDataLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.balance_user_data_layout, null, false, component)
   */
  @NonNull
  @Deprecated
  public static BalanceUserDataLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<BalanceUserDataLayoutBinding>inflateInternal(inflater, R.layout.balance_user_data_layout, null, false, component);
  }

  public static BalanceUserDataLayoutBinding bind(@NonNull View view) {
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
  public static BalanceUserDataLayoutBinding bind(@NonNull View view, @Nullable Object component) {
    return (BalanceUserDataLayoutBinding)bind(component, view, R.layout.balance_user_data_layout);
  }
}