package com.bettehem.tools.dialog;

/*
    Copyright 2015  Chris Mustola
    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.
    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.
    You should have received a copy of the GNU General Public License
    along with this program.  If not, see http://www.gnu.org/licenses/.
 */

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;

import com.bettehem.tools.interfaces.DialogButtonsListener;

public class CustomAlertDialog {
    private AlertDialog alertDialog;
    private static DialogButtonsListener dialogActions;
    private static boolean hasListener = false;

    private CustomAlertDialog(AlertDialog.Builder builder){
        alertDialog = builder.create();
    }

    public static CustomAlertDialog make(Context context, String title, String message, boolean isCancelable, String positiveButtonText, DialogButtonsListener dialogButtonsListener, final String id){
        dialogActions = dialogButtonsListener;
        final AlertDialog.Builder alertDialogBuilder;
        alertDialogBuilder = new AlertDialog.Builder(context);
        alertDialogBuilder.setTitle(title);
        alertDialogBuilder.setMessage(message);
        alertDialogBuilder.setCancelable(isCancelable);
        alertDialogBuilder.setPositiveButton(positiveButtonText, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialogActions.onPositiveButtonClicked(id);
            }
        });
        return new CustomAlertDialog(alertDialogBuilder);
    }

    public static CustomAlertDialog make(Context context, String title, String message, boolean isCancelable, String positiveButtonText, String negativeButtonText, DialogButtonsListener dialogButtonsListener, final String id){
        dialogActions = dialogButtonsListener;
        final AlertDialog.Builder alertDialogBuilder;
        alertDialogBuilder = new AlertDialog.Builder(context);
        alertDialogBuilder.setTitle(title);
        alertDialogBuilder.setMessage(message);
        alertDialogBuilder.setCancelable(isCancelable);
        alertDialogBuilder.setPositiveButton(positiveButtonText, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialogActions.onPositiveButtonClicked(id);
            }
        });
        alertDialogBuilder.setNegativeButton(negativeButtonText, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialogActions.onNegativeButtonClicked(id);
            }
        });
        return new CustomAlertDialog(alertDialogBuilder);
    }

    public static CustomAlertDialog make(Context context, String title, String message, boolean isCancelable, String positiveButtonText, String neutralButtonText, String negativeButtonText, DialogButtonsListener dialogButtonsListener, final String id){
        dialogActions = dialogButtonsListener;
        final AlertDialog.Builder alertDialogBuilder;
        alertDialogBuilder = new AlertDialog.Builder(context);
        alertDialogBuilder.setTitle(title);
        alertDialogBuilder.setMessage(message);
        alertDialogBuilder.setCancelable(isCancelable);
        alertDialogBuilder.setPositiveButton(positiveButtonText, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialogActions.onPositiveButtonClicked(id);
            }
        });
        alertDialogBuilder.setNeutralButton(neutralButtonText, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialogActions.onNeutralButtonClicked(id);
            }
        });
        alertDialogBuilder.setNegativeButton(negativeButtonText, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialogActions.onNegativeButtonClicked(id);
            }
        });
        return new CustomAlertDialog(alertDialogBuilder);
    }



    public CustomAlertDialog(Context context, String title, String message, boolean isCancelable, String positiveButtonText, final String id){
        final AlertDialog.Builder alertDialogBuilder;
        alertDialogBuilder = new AlertDialog.Builder(context);
        alertDialogBuilder.setTitle(title);
        alertDialogBuilder.setMessage(message);
        alertDialogBuilder.setCancelable(isCancelable);
        if (hasListener){
            alertDialogBuilder.setPositiveButton(positiveButtonText, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialogActions.onPositiveButtonClicked(id);
                }
            });
        }else{
            alertDialogBuilder.setPositiveButton(positiveButtonText, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    //if no listener is in use, don't do anything
                }
            });
        }
        alertDialogBuilder.create();
    }

    public CustomAlertDialog(Context context, String title, String message, boolean isCancelable, String positiveButtonText, String negativeButtonText, final String id){
        final AlertDialog.Builder alertDialogBuilder;
        alertDialogBuilder = new AlertDialog.Builder(context);
        alertDialogBuilder.setTitle(title);
        alertDialogBuilder.setMessage(message);
        alertDialogBuilder.setCancelable(isCancelable);
        if (hasListener){
            alertDialogBuilder.setPositiveButton(positiveButtonText, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialogActions.onPositiveButtonClicked(id);
                }
            });
            alertDialogBuilder.setNegativeButton(negativeButtonText, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialogActions.onNegativeButtonClicked(id);
                }
            });
        }else{
            alertDialogBuilder.setPositiveButton(positiveButtonText, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    //if no listener is in use, don't do anything
                }
            });
            alertDialogBuilder.setNegativeButton(negativeButtonText, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    //if no listener is in use, don't do anything
                }
            });
        }
        alertDialogBuilder.create();
    }

    public CustomAlertDialog(Context context, String title, String message, boolean isCancelable, String positiveButtonText, String neutralButtonText, String negativeButtonText, final String id){
        final AlertDialog.Builder alertDialogBuilder;
        alertDialogBuilder = new AlertDialog.Builder(context);
        alertDialogBuilder.setTitle(title);
        alertDialogBuilder.setMessage(message);
        alertDialogBuilder.setCancelable(isCancelable);
        if (hasListener){
            alertDialogBuilder.setPositiveButton(positiveButtonText, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialogActions.onPositiveButtonClicked(id);
                }
            });
            alertDialogBuilder.setNeutralButton(neutralButtonText, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialogActions.onNeutralButtonClicked(id);
                }
            });
            alertDialogBuilder.setNegativeButton(negativeButtonText, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialogActions.onNegativeButtonClicked(id);
                }
            });
        }else{
            alertDialogBuilder.setPositiveButton(positiveButtonText, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    //if no listener is in use, don't do anything
                }
            });
            alertDialogBuilder.setNeutralButton(neutralButtonText, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    //if no listener is in use, don't do anything
                }
            });
            alertDialogBuilder.setNegativeButton(negativeButtonText, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    //if no listener is in use, don't do anything
                }
            });
        }
        alertDialogBuilder.create();
    }

    public void setDialogButtonsListener(DialogButtonsListener dialogButtonsListener){
        if (alertDialog != null){
            dialogActions = dialogButtonsListener;
            hasListener = true;
        }
    }

    public void setCustomTitle(String title){
        if (alertDialog != null){
            alertDialog.setTitle(title);
        }
    }

    public void setCustomMessage(String message){
        if (alertDialog != null){
            alertDialog.setMessage(message);
        }
    }

    public void setIsCancelable(boolean isCancelable){
        if (alertDialog != null){
            alertDialog.setCancelable(isCancelable);
        }
    }

    public void show(){
        if (alertDialog != null){
            alertDialog.show();
        }
    }
}
