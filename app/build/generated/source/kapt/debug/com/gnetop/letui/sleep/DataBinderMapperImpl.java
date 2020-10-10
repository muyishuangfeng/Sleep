package com.gnetop.letui.sleep;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.gnetop.letui.sleep.databinding.ActivityFeedbackBindingImpl;
import com.gnetop.letui.sleep.databinding.ActivityLoginBindingImpl;
import com.gnetop.letui.sleep.databinding.ActivityMainBindingImpl;
import com.gnetop.letui.sleep.databinding.ActivityRechargeBindingImpl;
import com.gnetop.letui.sleep.databinding.ActivitySplashBindingImpl;
import com.gnetop.letui.sleep.databinding.ActivityUserBindingImpl;
import com.gnetop.letui.sleep.databinding.BalanceUserDataLayoutBindingImpl;
import com.gnetop.letui.sleep.databinding.ItemFeedbackImgLayoutBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYFEEDBACK = 1;

  private static final int LAYOUT_ACTIVITYLOGIN = 2;

  private static final int LAYOUT_ACTIVITYMAIN = 3;

  private static final int LAYOUT_ACTIVITYRECHARGE = 4;

  private static final int LAYOUT_ACTIVITYSPLASH = 5;

  private static final int LAYOUT_ACTIVITYUSER = 6;

  private static final int LAYOUT_BALANCEUSERDATALAYOUT = 7;

  private static final int LAYOUT_ITEMFEEDBACKIMGLAYOUT = 8;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(8);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.gnetop.letui.sleep.R.layout.activity_feedback, LAYOUT_ACTIVITYFEEDBACK);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.gnetop.letui.sleep.R.layout.activity_login, LAYOUT_ACTIVITYLOGIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.gnetop.letui.sleep.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.gnetop.letui.sleep.R.layout.activity_recharge, LAYOUT_ACTIVITYRECHARGE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.gnetop.letui.sleep.R.layout.activity_splash, LAYOUT_ACTIVITYSPLASH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.gnetop.letui.sleep.R.layout.activity_user, LAYOUT_ACTIVITYUSER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.gnetop.letui.sleep.R.layout.balance_user_data_layout, LAYOUT_BALANCEUSERDATALAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.gnetop.letui.sleep.R.layout.item_feedback_img_layout, LAYOUT_ITEMFEEDBACKIMGLAYOUT);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYFEEDBACK: {
          if ("layout/activity_feedback_0".equals(tag)) {
            return new ActivityFeedbackBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_feedback is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYLOGIN: {
          if ("layout/activity_login_0".equals(tag)) {
            return new ActivityLoginBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_login is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYRECHARGE: {
          if ("layout/activity_recharge_0".equals(tag)) {
            return new ActivityRechargeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_recharge is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYSPLASH: {
          if ("layout/activity_splash_0".equals(tag)) {
            return new ActivitySplashBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_splash is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYUSER: {
          if ("layout/activity_user_0".equals(tag)) {
            return new ActivityUserBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_user is invalid. Received: " + tag);
        }
        case  LAYOUT_BALANCEUSERDATALAYOUT: {
          if ("layout/balance_user_data_layout_0".equals(tag)) {
            return new BalanceUserDataLayoutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for balance_user_data_layout is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMFEEDBACKIMGLAYOUT: {
          if ("layout/item_feedback_img_layout_0".equals(tag)) {
            return new ItemFeedbackImgLayoutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_feedback_img_layout is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(2);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    result.add(new com.chad.library.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(3);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "feedBack");
      sKeys.put(2, "imageUrl");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(8);

    static {
      sKeys.put("layout/activity_feedback_0", com.gnetop.letui.sleep.R.layout.activity_feedback);
      sKeys.put("layout/activity_login_0", com.gnetop.letui.sleep.R.layout.activity_login);
      sKeys.put("layout/activity_main_0", com.gnetop.letui.sleep.R.layout.activity_main);
      sKeys.put("layout/activity_recharge_0", com.gnetop.letui.sleep.R.layout.activity_recharge);
      sKeys.put("layout/activity_splash_0", com.gnetop.letui.sleep.R.layout.activity_splash);
      sKeys.put("layout/activity_user_0", com.gnetop.letui.sleep.R.layout.activity_user);
      sKeys.put("layout/balance_user_data_layout_0", com.gnetop.letui.sleep.R.layout.balance_user_data_layout);
      sKeys.put("layout/item_feedback_img_layout_0", com.gnetop.letui.sleep.R.layout.item_feedback_img_layout);
    }
  }
}
