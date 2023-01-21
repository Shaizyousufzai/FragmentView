package com.example.fragmentview;

public enum ModelCourse {
    Red(R.string.red, R.layout.view_red),
    Green(R.string.green, R.layout.view_green),
    Blue(R.string.blue, R.layout.view_blue);
    private  int mTitleId;
    private int mLayoutId;

    ModelCourse(int mTitleId, int mLayoutId) {
        this.mTitleId = mTitleId;
        this.mLayoutId = mLayoutId;
    }

    public int getmTitleId() {
        return mTitleId;
    }

    public int getmLayoutId() {
        return mLayoutId;
    }
}
