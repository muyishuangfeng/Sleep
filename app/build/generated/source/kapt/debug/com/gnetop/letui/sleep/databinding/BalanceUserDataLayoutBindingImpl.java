package com.gnetop.letui.sleep.databinding;
import com.gnetop.letui.sleep.R;
import com.gnetop.letui.sleep.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class BalanceUserDataLayoutBindingImpl extends BalanceUserDataLayoutBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.btn_one_start, 2);
        sViewsWithIds.put(R.id.btn_one_stop, 3);
        sViewsWithIds.put(R.id.btn_two_start, 4);
        sViewsWithIds.put(R.id.btn_two_stop, 5);
        sViewsWithIds.put(R.id.btn_third_start, 6);
        sViewsWithIds.put(R.id.btn_third_stop, 7);
        sViewsWithIds.put(R.id.progress, 8);
        sViewsWithIds.put(R.id.hour_picker, 9);
        sViewsWithIds.put(R.id.btn_sure, 10);
        sViewsWithIds.put(R.id.btn_cancel, 11);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public BalanceUserDataLayoutBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private BalanceUserDataLayoutBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[11]
            , (android.widget.Button) bindings[2]
            , (android.widget.Button) bindings[3]
            , (android.widget.Button) bindings[10]
            , (android.widget.Button) bindings[6]
            , (android.widget.Button) bindings[7]
            , (android.widget.Button) bindings[4]
            , (android.widget.Button) bindings[5]
            , (com.gnetop.letui.sleep.ui.datetime.time.HourAndMinutePicker) bindings[9]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[1]
            , (android.widget.SeekBar) bindings[8]
            );
        this.imgUser.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
        if (BR.imageUrl == variableId) {
            setImageUrl((java.lang.String) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setImageUrl(@Nullable java.lang.String ImageUrl) {
        this.mImageUrl = ImageUrl;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.imageUrl);
        super.requestRebind();
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
        java.lang.String imageUrl = mImageUrl;

        if ((dirtyFlags & 0x3L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.gnetop.letui.sleep.ext.BindAdapter.loadImage(this.imgUser, imageUrl, androidx.appcompat.content.res.AppCompatResources.getDrawable(imgUser.getContext(), R.drawable.ic_user));
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): imageUrl
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}