package com.qay.qbase.dagger.util;


import android.app.Activity;
import android.content.Context;
import android.os.Process;


import java.util.Stack;

public class ActivityStack {
    private Stack<Activity> mActivities = new Stack<Activity>();
    private static ActivityStack INSTANCE;

//    private ActivityStack() {
//        if (CollectionUtil.isEmpty(mActivities)) {
//            mActivities = new Stack<Activity>();
//        }
//    }

    private ActivityStack ActivityStack() {
        if (CollectionUtil.isEmpty(mActivities)) {
            mActivities = new Stack<Activity>();
        }
        return this;
    }


    public static ActivityStack getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ActivityStack();
        }
        return INSTANCE;
    }

    public int size() {
        return mActivities.size();
    }

    /**
     * 添加activity
     */
    public void pushActivity(Activity activity) {
        if (CollectionUtil.isEmpty(mActivities)) {
            mActivities = new Stack<Activity>();
        }
        mActivities.add(activity);
    }

    /**
     * 关闭所有activity
     */
    public void finishAllActivity() {
        if (!CollectionUtil.isEmpty(mActivities)) {
            Activity activity = mActivities.lastElement();
            if (activity != null) {
                activity.finish();
                activity = null;
            }
        }
    }

    /**
     * 关闭当前指定activity
     */
    public void finishActivity(Activity activity) {
        if (activity != null) {
            activity.finish();
            if (mActivities.contains(activity)) {
                mActivities.remove(activity);
            }
            activity = null;
        }
    }

    /**
     * 关闭指定Activity
     */
    public void finishAppointActivity(Class<? extends Context> activityClass) {

        for (int i = mActivities.size() - 1; i >= 0; i--) {
            Activity activity = mActivities.elementAt(i);
            if (activity != null && activity.getClass().equals(activityClass)) {
                finishActivity(activity);
                break;
            }
        }
    }

    /**
     * 关闭顶部指定Activity
     */
    public void finishTopAppointActivity(Activity activity) {
        for (int i = mActivities.size() - 1; i >= 0; i--) {
            Activity base = mActivities.elementAt(i);
            if (activity != null && base.getClass().equals(activity.getClass())) {
                mActivities.remove(i);
                activity.finish();
                break;
            }
        }
    }

    public Activity currentActivity() {
        return mActivities.lastElement();
    }

    /**
     * 关闭其它activity
     */
    public void finishOtherActivity(Activity activity) {
        if (activity != null) {
            for (Activity item : mActivities) {
                if (!item.getClass().equals(activity.getClass())) {
                    item.finish();
                }
            }
            mActivities.removeAllElements();
            mActivities.add(activity);
        }
    }

    public void finishAllActivityUntilCls(boolean isForceClose) {
        // boolean isForceClose = false;
        while (mActivities.size() > 0) {
            finishActivity(currentActivity());
        }
        if (isForceClose) {
            Process.killProcess(Process.myPid());
        }
    }

}
