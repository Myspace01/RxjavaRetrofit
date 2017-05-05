package com.shenzhen.socialcontact.alwayschat.chat.manager;

import android.content.Context;

import com.shenzhen.socialcontact.alwayschat.R;

import cn.pedant.SweetAlert.SweetAlertDialog;

/**
 * Created by Administrator on 2017/4/26.
 * <p/>
 */
public enum DialogManager
{
    INSTANCE;

    private SweetAlertDialog mDialog;

    public void showWarningDialog(Context context, String title, String content, SweetAlertDialog.OnSweetClickListener listener)
    {
        releaseDialog();
        mDialog = new SweetAlertDialog(context, SweetAlertDialog.WARNING_TYPE).setTitleText(title).setContentText(content).setConfirmText("确定").setCancelText
                ("取消").setConfirmClickListener(listener);
        mDialog.show();
    }

    public void showErrorDialog(Context context, String title, String content, SweetAlertDialog.OnSweetClickListener listener)
    {
        releaseDialog();
        mDialog = new SweetAlertDialog(context, SweetAlertDialog.ERROR_TYPE).setConfirmText("确定").setTitleText(title).setContentText(content)
                .setConfirmClickListener(listener);
        mDialog.show();
    }

    public void showProgressDialog(Context context, String message)
    {
        releaseDialog();
        mDialog = new SweetAlertDialog(context, SweetAlertDialog.PROGRESS_TYPE);
        mDialog.getProgressHelper().setBarColor(context.getResources().getColor(R.color.colorPrimary));
        mDialog.setTitleText(message);
        mDialog.setCancelable(true);
        mDialog.show();
    }


    public void showProgressDialog(Context context, String message, int progress)
    {
        releaseDialog();
        mDialog = new SweetAlertDialog(context, SweetAlertDialog.PROGRESS_TYPE);
        mDialog.getProgressHelper().setBarColor(context.getResources().getColor(R.color.colorPrimary));
        mDialog.setTitleText(message);
        mDialog.setCancelable(true);
        mDialog.getProgressHelper().setProgress(progress);
        mDialog.show();
    }

    private void releaseDialog()
    {
        if (mDialog != null)
        {
            mDialog.dismiss();
            mDialog = null;
        }
    }

    public void dismiss()
    {
        if (mDialog != null && mDialog.isShowing())
        {
            mDialog.dismiss();
        }
    }
}
