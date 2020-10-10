package com.gnetop.letui.sleep.databinding;
import com.gnetop.letui.sleep.R;
import com.gnetop.letui.sleep.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMainBindingImpl extends ActivityMainBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.img_main_photo, 1);
        sViewsWithIds.put(R.id.txt_main_name, 2);
        sViewsWithIds.put(R.id.img_main_user, 3);
        sViewsWithIds.put(R.id.img_main_setting, 4);
        sViewsWithIds.put(R.id.rlv_main, 5);
        sViewsWithIds.put(R.id.txt_sound_name, 6);
        sViewsWithIds.put(R.id.img_main_sound, 7);
        sViewsWithIds.put(R.id.img_second_sound, 8);
        sViewsWithIds.put(R.id.img_third_sound, 9);
        sViewsWithIds.put(R.id.txt_main_sound_name, 10);
        sViewsWithIds.put(R.id.txt_second_sound_name, 11);
        sViewsWithIds.put(R.id.txt_third_sound_name, 12);
        sViewsWithIds.put(R.id.btn_start_sleep, 13);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityMainBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 14, sIncludes, sViewsWithIds));
    }
    private ActivityMainBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[13]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[4]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[7]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[3]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[8]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[9]
            , (androidx.recyclerview.widget.RecyclerView) bindings[5]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[12]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
            return variableSet;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}