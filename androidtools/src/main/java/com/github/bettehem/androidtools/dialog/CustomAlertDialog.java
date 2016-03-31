package com.github.bettehem.androidtools.dialog;

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

import com.github.bettehem.androidtools.interfaces.DialogButtonsListener;

import java.util.ArrayList;

public class CustomAlertDialog  {
    private AlertDialog alertDialog;
    private static DialogButtonsListener dialogActions;
    private static boolean hasListener = false;
    private String tag = "";
    private ArrayList<Tag> tags = new ArrayList<Tag>();
    private String id = "";
    private AlertDialog.Builder alertDialogBuilder;

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


    public CustomAlertDialog(Context context){
        alertDialogBuilder = new AlertDialog.Builder(context);
        alertDialog = alertDialogBuilder.create();
    }

    public CustomAlertDialog(Context context, String title, String message, boolean isCancelable, String positiveButtonText, final String id){
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
        alertDialog = alertDialogBuilder.create();
    }

    public CustomAlertDialog(Context context, String title, String message, boolean isCancelable, String positiveButtonText, String negativeButtonText, final String id){
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
        alertDialog = alertDialogBuilder.create();
    }

    public CustomAlertDialog(Context context, String title, String message, boolean isCancelable, String positiveButtonText, String neutralButtonText, String negativeButtonText, final String id){
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
        alertDialog = alertDialogBuilder.create();
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

    //returns true if text can be set
    public boolean setButtonText(final int button, String text){
        //check if button matches the AlertDialog button ids
        if (button == AlertDialog.BUTTON_POSITIVE || button == AlertDialog.BUTTON_NEGATIVE || button == AlertDialog.BUTTON_NEUTRAL){

            //check if alertDialog is initialized
            if (alertDialog != null){

                //check if the listener is initialized
                if (dialogActions != null){
                    alertDialog.setButton(button, text, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            switch (button){
                                case AlertDialog.BUTTON_POSITIVE:
                                    dialogActions.onPositiveButtonClicked(id);
                                    break;

                                case AlertDialog.BUTTON_NEGATIVE:
                                    dialogActions.onNegativeButtonClicked(id);
                                    break;

                                case AlertDialog.BUTTON_NEUTRAL:
                                    dialogActions.onNeutralButtonClicked(id);
                                    break;
                            }
                        }
                    });

                    return true;
                }else{
                    return false;
                }
            }else{
                return false;
            }
        }else{
            return false;
        }
    }

    public boolean setButtonText(final int button, String text, final DialogButtonsListener listener){
        if (button == AlertDialog.BUTTON_POSITIVE || button == AlertDialog.BUTTON_NEGATIVE || button == AlertDialog.BUTTON_NEUTRAL){
            if (alertDialog != null){
                alertDialog.setButton(button, text, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        switch (button){
                            case AlertDialog.BUTTON_POSITIVE:
                                listener.onPositiveButtonClicked(id);
                                break;

                            case AlertDialog.BUTTON_NEGATIVE:
                                listener.onNegativeButtonClicked(id);
                                break;

                            case AlertDialog.BUTTON_NEUTRAL:
                                listener.onNeutralButtonClicked(id);
                                break;
                        }
                    }
                });
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }

    public void setTag(String tag){
        this.tag = tag;
    }

    public String getTag(){
        return tag;
    }

    public boolean setTag(String key, String value){
        boolean invalidTag = false;
        for(Tag t : tags){
            if (key.contentEquals(t.key)){
                invalidTag = true;
            }
        }

        if (!invalidTag){
            tags.add(new Tag(key, value));
        }

        return !invalidTag;
    }

    public String getTag(String key){
        String value = "";
        for(Tag t : tags){
            if (t.key.contentEquals(key)){
                value = t.value;
                break;
            }
        }
        return value;
    }

    public void clearTags(){
        tag = "";
        tags.clear();
    }

    public void clearTag(String key){
        int index = 0;
        boolean keyFound = false;

        for (int i = 0; i < tags.size(); i++){
            if (tags.get(i).key.contentEquals(key)){
                index = i;
                keyFound = true;
            }
        }

        if (keyFound){
            tags.remove(index);
        }
    }

    public void setId(String id){
        this.id = id;
    }

    public String getId(){
        return id;
    }

    public void show(){
        if (alertDialog != null){
            alertDialog.show();
        }
    }









    private class Tag{
        private String key;
        private String value;

        private Tag(String key, String value){
            this.key = key;
            this.value = value;
        }
    }
}
