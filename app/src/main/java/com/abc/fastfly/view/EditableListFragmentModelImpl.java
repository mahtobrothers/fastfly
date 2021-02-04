package com.abc.fastfly.view;

import com.abc.fastfly.fragment.EditableListFragment;
import com.abc.fastfly.widget.EditableListAdapter;

public interface EditableListFragmentModelImpl<V extends EditableListAdapter.EditableViewHolder>
{
    void setLayoutClickListener(EditableListFragment.LayoutClickListener<V> clickListener);
}
