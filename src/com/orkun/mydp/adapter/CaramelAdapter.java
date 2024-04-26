package com.orkun.mydp.adapter;

import com.orkun.mydp.adapter.avaFilter.Caramel;

public class CaramelAdapter extends Caramel implements Filter {
    @Override
    public void apply(Image image) {
        init();
        render(image);
    }
}
