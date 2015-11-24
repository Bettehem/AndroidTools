package com.github.bettehem.androidtools;

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
import android.content.SharedPreferences;

import java.io.File;

public class Preferences {
    //Variables are first created here.
    private static SharedPreferences sharedPreferences;
    private static SharedPreferences.Editor editor;

    //If no custom file name is specified, This value will be used by default.
    public static final String originalPreferenceFilename = "Settings";





    //-----     Saving      ------


    public static void saveString(Context context, String valueName, String value) {
        sharedPreferences = context.getSharedPreferences(originalPreferenceFilename, Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
        editor.putString(valueName, value);
        editor.apply();
    }

    public static void saveString(Context context, String valueName, String value, String preferenceFilename) {
        sharedPreferences = context.getSharedPreferences(preferenceFilename, Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
        editor.putString(valueName, value);
        editor.apply();
    }



    public static void saveInt(Context context, String valueName, int value) {
        sharedPreferences = context.getSharedPreferences(originalPreferenceFilename, Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
        editor.putInt(valueName, value);
        editor.apply();
    }

    public static void saveInt(Context context, String valueName, int value, String preferenceFilename) {
        sharedPreferences = context.getSharedPreferences(preferenceFilename, Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
        editor.putInt(valueName, value);
        editor.apply();
    }



    public static void saveBoolean(Context context, String valueName, boolean value) {
        sharedPreferences = context.getSharedPreferences(originalPreferenceFilename, Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
        editor.putBoolean(valueName, value);
        editor.apply();
    }

    public static void saveBoolean(Context context, String valueName, boolean value, String preferenceFilename) {
        sharedPreferences = context.getSharedPreferences(preferenceFilename, Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
        editor.putBoolean(valueName, value);
        editor.apply();
    }



    public static void saveFloat(Context context, String valueName, float value) {
        sharedPreferences = context.getSharedPreferences(originalPreferenceFilename, Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
        editor.putFloat(valueName, value);
        editor.apply();
    }

    public static void saveFloat(Context context, String valueName, float value, String preferenceFilename) {
        sharedPreferences = context.getSharedPreferences(preferenceFilename, Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
        editor.putFloat(valueName, value);
        editor.apply();
    }



    public static  void saveLong(Context context, String valueName, long value) {
        sharedPreferences = context.getSharedPreferences(originalPreferenceFilename, Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
        editor.putLong(valueName, value);
        editor.apply();
    }

    public static void saveLong(Context context, String valueName, long value, String preferenceFilename) {
        sharedPreferences = context.getSharedPreferences(preferenceFilename, Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
        editor.putLong(valueName, value);
        editor.apply();
    }



    public static void saveStringArray(Context context, String valueName, String[] array){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < array.length; i++){
            if (i != (array.length-1)){
                stringBuilder.append(array[i]).append("_&#;#&_");
            }else{
                stringBuilder.append(array[i]);
            }
        }
        sharedPreferences = context.getSharedPreferences(originalPreferenceFilename, Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
        editor.putString(valueName, stringBuilder.toString());
        editor.apply();
    }

    public static void saveStringArray(Context context, String valueName, String[] array, String preferenceFilename){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < array.length; i++){
            if (i != (array.length-1)){
                stringBuilder.append(array[i]).append("_&#;#&_");
            }else{
                stringBuilder.append(array[i]);
            }
        }
        sharedPreferences = context.getSharedPreferences(preferenceFilename, Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
        editor.putString(valueName, stringBuilder.toString());
        editor.apply();
    }




    //-----     Loading      ------

    public static String loadString(Context context, String valueName) {
        if (valueName != null) {
            sharedPreferences = context.getSharedPreferences(originalPreferenceFilename, Context.MODE_PRIVATE);
            return sharedPreferences.getString(valueName, "");
        } else {
            return "";
        }
    }

    public static String loadString(Context context, String valueName, String preferenceFilename) {
        if (valueName != null) {
            sharedPreferences = context.getSharedPreferences(preferenceFilename, Context.MODE_PRIVATE);
            return sharedPreferences.getString(valueName, "");
        } else {
            return "";
        }
    }



    public static int loadInt(Context context, String valueName) {
        sharedPreferences = context.getSharedPreferences(originalPreferenceFilename, Context.MODE_PRIVATE);
        return sharedPreferences.getInt(valueName, 0);
    }

    public static int loadInt(Context context, String valueName, String preferenceFilename) {
        sharedPreferences = context.getSharedPreferences(preferenceFilename, Context.MODE_PRIVATE);
        return sharedPreferences.getInt(valueName, 0);
    }



    public static boolean loadBoolean(Context context, String valueName) {
        sharedPreferences = context.getSharedPreferences(originalPreferenceFilename, Context.MODE_PRIVATE);
        return sharedPreferences.getBoolean(valueName, false);
    }

    public boolean loadBoolean(Context context, String valueName, String preferenceFilename) {
        sharedPreferences = context.getSharedPreferences(preferenceFilename, Context.MODE_PRIVATE);
        return sharedPreferences.getBoolean(valueName, false);
    }



    public static float loadFloat(Context context, String valueName) {
        sharedPreferences = context.getSharedPreferences(originalPreferenceFilename, Context.MODE_PRIVATE);
        return sharedPreferences.getFloat(valueName, 0);
    }

    public static float loadFloat(Context context, String valueName, String preferenceFilename) {
        sharedPreferences = context.getSharedPreferences(preferenceFilename, Context.MODE_PRIVATE);
        return sharedPreferences.getFloat(valueName, 0);
    }



    public static long loadLong(Context context, String valueName) {
        sharedPreferences = context.getSharedPreferences(originalPreferenceFilename, Context.MODE_PRIVATE);
        return sharedPreferences.getLong(valueName, 0);
    }

    public long loadLong(Context context, String valueName, String preferenceFilename) {
        sharedPreferences = context.getSharedPreferences(preferenceFilename, Context.MODE_PRIVATE);
        return sharedPreferences.getLong(valueName, 0);
    }



    public static String[] loadStringArray(Context context, String valueName){
        sharedPreferences = context.getSharedPreferences(originalPreferenceFilename, Context.MODE_PRIVATE);
        return sharedPreferences.getString(valueName, "").split("_&#;#&_");
    }

    public static String[] loadStringArray(Context context, String valueName, String preferenceFilename){
        sharedPreferences = context.getSharedPreferences(preferenceFilename, Context.MODE_PRIVATE);
        return sharedPreferences.getString(valueName, "").split("_&#;#&_");
    }







    //-----     Deleting      ------

    public static void deleteIndividualValue(Context context, String valueName) {
        sharedPreferences = context.getSharedPreferences(originalPreferenceFilename, Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
        editor.remove(valueName);
        editor.apply();
    }

    public static void deleteIndividualValue(Context context, String valueName, String preferenceFilename) {
        sharedPreferences = context.getSharedPreferences(preferenceFilename, Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
        editor.remove(valueName);
        editor.apply();
    }

    public static void deleteAllValues(Context context) {
        sharedPreferences = context.getSharedPreferences(originalPreferenceFilename, Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
        editor.clear();
        editor.apply();
        File file = new File(context.getFilesDir().getParent() + File.separator + "shared_prefs" + File.separator + originalPreferenceFilename + ".xml");
        boolean fileDeleted = file.delete();
        File fileBak = new File(context.getFilesDir().getParent() + File.separator + "shared_prefs" + File.separator + originalPreferenceFilename + ".xml.bak");
        if (fileBak.exists()){
            boolean fileBakDeleted = fileBak.delete();
        }
    }

    public static void deleteAllValues(Context context, String preferenceFilename) {
        sharedPreferences = context.getSharedPreferences(preferenceFilename, Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
        editor.clear();
        editor.apply();
        File file = new File(context.getFilesDir().getParent() + File.separator + "shared_prefs" + File.separator + preferenceFilename + ".xml");
        boolean fileDeleted = file.delete();
        File fileBak = new File(context.getFilesDir().getParent() + File.separator + "shared_prefs" + File.separator + preferenceFilename + ".xml.bak");
        if (fileBak.exists()){
            boolean fileBakDeleted = fileBak.delete();
        }
    }









    //-----     Checking if file exists      ------
    public static boolean checkIfFileExists(Context context){
        return new File(context.getFilesDir().getParent() + File.separator + "shared_prefs" + File.separator + originalPreferenceFilename + ".xml").exists();
    }

    public boolean checkIfFileExists(Context context, String preferenceFilename){
        return new File(context.getFilesDir().getParent() + File.separator + "shared_prefs" + File.separator + preferenceFilename + ".xml").exists();
    }

}
