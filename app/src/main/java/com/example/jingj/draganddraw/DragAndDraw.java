package com.example.jingj.draganddraw;

import android.support.v4.app.Fragment;
import android.os.Bundle;

public class DragAndDraw extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return DragAndDrawFragment.newInstance();
    }
}
