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

/**
 * Used for managing SharedPreferences in an easy way.
 */
public final class Preferences {
    //Variables are first created here.
    private static SharedPreferences sharedPreferences;
    private static SharedPreferences.Editor editor;

    //If no custom file name is specified, This value will be used by default.
    public static final String originalPreferenceFilename = "Settings";





    //-----     Saving      ------


    /**
     * Saves a String value using SharedPreferences.
     * @param context The context of the current Activity.
     * @param valueName The name for the value that will be saved.
     * @param value The actual value to be saved.
     */
    public static void saveString(Context context, String valueName, String value) {
        sharedPreferences = context.getSharedPreferences(originalPreferenceFilename, Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
        editor.putString(valueName, value);
        editor.apply();
    }

    /**
     * Saves a String value using SharedPreferences, with a custom filename.
     * @param context The context of the current Activity.
     * @param valueName The name for the value that will be saved.
     * @param value The actual value to be saved.
     * @param preferenceFilename The custom filename where the value should be saved.
     */
    public static void saveString(Context context, String valueName, String value, String preferenceFilename) {
        sharedPreferences = context.getSharedPreferences(preferenceFilename, Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
        editor.putString(valueName, value);
        editor.apply();
    }



    /**
     * Saves an Integer value using SharedPreferences.
     * @param context The context of the current Activity.
     * @param valueName The name for the value that will be saved.
     * @param value The actual value to be saved.
     */
    public static void saveInt(Context context, String valueName, int value) {
        sharedPreferences = context.getSharedPreferences(originalPreferenceFilename, Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
        editor.putInt(valueName, value);
        editor.apply();
    }

    /**
     * Saves an Integer value using SharedPreferences, with a custom filename.
     * @param context The context of the current Activity.
     * @param valueName The name for the value that will be saved.
     * @param value The actual value to be saved.
     * @param preferenceFilename The custom filename where the value should be saved.
     */
    public static void saveInt(Context context, String valueName, int value, String preferenceFilename) {
        sharedPreferences = context.getSharedPreferences(preferenceFilename, Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
        editor.putInt(valueName, value);
        editor.apply();
    }



    /**
     * Saves a boolean value using SharedPreferences.
     * @param context The context of the current Activity.
     * @param valueName The name for the value that will be saved.
     * @param value The actual value to be saved.
     */
    public static void saveBoolean(Context context, String valueName, boolean value) {
        sharedPreferences = context.getSharedPreferences(originalPreferenceFilename, Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
        editor.putBoolean(valueName, value);
        editor.apply();
    }

    /**
     * Saves a boolean value using SharedPreferences, with a custom filename.
     * @param context The context of the current Activity.
     * @param valueName The name for the value that will be saved.
     * @param value The actual value to be saved.
     * @param preferenceFilename The custom filename where the value should be saved.
     */
    public static void saveBoolean(Context context, String valueName, boolean value, String preferenceFilename) {
        sharedPreferences = context.getSharedPreferences(preferenceFilename, Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
        editor.putBoolean(valueName, value);
        editor.apply();
    }



    /**
     * Saves a float value using SharedPreferences.
     * @param context The context of the current Activity.
     * @param valueName The name for the value that will be saved.
     * @param value The actual value to be saved.
     */
    public static void saveFloat(Context context, String valueName, float value) {
        sharedPreferences = context.getSharedPreferences(originalPreferenceFilename, Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
        editor.putFloat(valueName, value);
        editor.apply();
    }

    /**
     * Saves a float value using SharedPreferences, with a custom filename.
     * @param context The context of the current Activity.
     * @param valueName The name for the value that will be saved.
     * @param value The actual value to be saved.
     * @param preferenceFilename The custom filename where the value should be saved.
     */
    public static void saveFloat(Context context, String valueName, float value, String preferenceFilename) {
        sharedPreferences = context.getSharedPreferences(preferenceFilename, Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
        editor.putFloat(valueName, value);
        editor.apply();
    }



    /**
     * Saves a long value using SharedPreferences.
     * @param context The context of the current Activity.
     * @param valueName The name for the value that will be saved.
     * @param value The actual value to be saved.
     */
    public static  void saveLong(Context context, String valueName, long value) {
        sharedPreferences = context.getSharedPreferences(originalPreferenceFilename, Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
        editor.putLong(valueName, value);
        editor.apply();
    }

    /**
     * Saves a long value using SharedPreferences, with a custom filename.
     * @param context The context of the current Activity.
     * @param valueName The name for the value that will be saved.
     * @param value The actual value to be saved.
     * @param preferenceFilename The custom filename where the value should be saved.
     */
    public static void saveLong(Context context, String valueName, long value, String preferenceFilename) {
        sharedPreferences = context.getSharedPreferences(preferenceFilename, Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
        editor.putLong(valueName, value);
        editor.apply();
    }



    /**
     * Saves a String array using SharedPreferences.
     * @param context The context of the current Activity.
     * @param valueName The name for the value that will be saved.
     * @param array The actual value to be saved.
     */
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

    /**
     * Saves a String array using SharedPreferences, with a custom filename.
     * @param context The context of the current Activity.
     * @param valueName The name for the value that will be saved.
     * @param array The actual value to be saved.
     * @param preferenceFilename The custom filename where the value should be saved.
     */
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

    /**
     * Loads a String value using SharedPreferences.
     * @param context The context of the current Activity.
     * @param valueName The name for the value that should be loaded.
     *
     * @return Returns the requested String value. If not found, returns an empty string.
     */
    public static String loadString(Context context, String valueName) {
        if (valueName != null) {
            sharedPreferences = context.getSharedPreferences(originalPreferenceFilename, Context.MODE_PRIVATE);
            return sharedPreferences.getString(valueName, "");
        } else {
            return "";
        }
    }

    /**
     * Loads a String array using SharedPreferences, with a custom filename.
     * @param context The context of the current Activity.
     * @param valueName The name for the value that will be saved.
     * @param preferenceFilename The custom filename where the value should be loaded.
     *
     * @return Returns the requested String value. If not found, returns an empty string.
     */
    public static String loadString(Context context, String valueName, String preferenceFilename) {
        if (valueName != null) {
            sharedPreferences = context.getSharedPreferences(preferenceFilename, Context.MODE_PRIVATE);
            return sharedPreferences.getString(valueName, "");
        } else {
            return "";
        }
    }



    /**
     * Loads an Integer value using SharedPreferences.
     * @param context The context of the current Activity.
     * @param valueName The name for the value that should be loaded.
     *
     * @return Returns the requested Integer value. If not found, returns an Integer with the value of 0.
     */
    public static int loadInt(Context context, String valueName) {
        sharedPreferences = context.getSharedPreferences(originalPreferenceFilename, Context.MODE_PRIVATE);
        return sharedPreferences.getInt(valueName, 0);
    }

    /**
     * Loads an Integer value using SharedPreferences, with a custom filename.
     * @param context The context of the current Activity.
     * @param valueName The name for the value that will be saved.
     * @param preferenceFilename The custom filename where the value should be loaded.
     *
     * @return Returns the requested Integer value. If not found, returns an Integer with the value of 0.
     */
    public static int loadInt(Context context, String valueName, String preferenceFilename) {
        sharedPreferences = context.getSharedPreferences(preferenceFilename, Context.MODE_PRIVATE);
        return sharedPreferences.getInt(valueName, 0);
    }



    /**
     * Loads a boolean value using SharedPreferences.
     * @param context The context of the current Activity.
     * @param valueName The name for the value that should be loaded.
     *
     * @return Returns the requested boolean value. If not found, returns false.
     */
    public static boolean loadBoolean(Context context, String valueName) {
        sharedPreferences = context.getSharedPreferences(originalPreferenceFilename, Context.MODE_PRIVATE);
        return sharedPreferences.getBoolean(valueName, false);
    }

    /**
     * Loads a boolean value using SharedPreferences, with a custom filename.
     * @param context The context of the current Activity.
     * @param valueName The name for the value that will be saved.
     * @param preferenceFilename The custom filename where the value should be loaded.
     *
     * @return Returns the requested boolean value. If not found, returns false.
     */
    public boolean loadBoolean(Context context, String valueName, String preferenceFilename) {
        sharedPreferences = context.getSharedPreferences(preferenceFilename, Context.MODE_PRIVATE);
        return sharedPreferences.getBoolean(valueName, false);
    }



    /**
     * Loads a float value using SharedPreferences.
     * @param context The context of the current Activity.
     * @param valueName The name for the value that should be loaded.
     *
     * @return Returns the requested float value. If not found, returns 0.
     */
    public static float loadFloat(Context context, String valueName) {
        sharedPreferences = context.getSharedPreferences(originalPreferenceFilename, Context.MODE_PRIVATE);
        return sharedPreferences.getFloat(valueName, 0);
    }

    /**
     * Loads a float value using SharedPreferences, with a custom filename.
     * @param context The context of the current Activity.
     * @param valueName The name for the value that will be saved.
     * @param preferenceFilename The custom filename where the value should be loaded.
     *
     * @return Returns the requested float value. If not found, returns 0.
     */
    public static float loadFloat(Context context, String valueName, String preferenceFilename) {
        sharedPreferences = context.getSharedPreferences(preferenceFilename, Context.MODE_PRIVATE);
        return sharedPreferences.getFloat(valueName, 0);
    }



    /**
     * Loads a long value using SharedPreferences.
     * @param context The context of the current Activity.
     * @param valueName The name for the value that should be loaded.
     *
     * @return Returns the requested long value. If not found, returns 0.
     */
    public static long loadLong(Context context, String valueName) {
        sharedPreferences = context.getSharedPreferences(originalPreferenceFilename, Context.MODE_PRIVATE);
        return sharedPreferences.getLong(valueName, 0);
    }

    /**
     * Loads a long value using SharedPreferences, with a custom filename.
     * @param context The context of the current Activity.
     * @param valueName The name for the value that will be loaded.
     * @param preferenceFilename The custom filename where the value should be saved.
     *
     * @return Returns the requested long value. If not found, returns 0.
     */
    public long loadLong(Context context, String valueName, String preferenceFilename) {
        sharedPreferences = context.getSharedPreferences(preferenceFilename, Context.MODE_PRIVATE);
        return sharedPreferences.getLong(valueName, 0);
    }



    /**
     * Loads a String array using SharedPreferences.
     * @param context The context of the current Activity.
     * @param valueName The name for the value that should be loaded.
     *
     * @return Returns the requested String array. If not found, returns an empty String.
     */
    public static String[] loadStringArray(Context context, String valueName){
        sharedPreferences = context.getSharedPreferences(originalPreferenceFilename, Context.MODE_PRIVATE);
        return sharedPreferences.getString(valueName, "").split("_&#;#&_");
    }

    /**
     * Loads a String array using SharedPreferences, with a custom filename.
     * @param context The context of the current Activity.
     * @param valueName The name for the value that will be loaded.
     * @param preferenceFilename The custom filename where the value should be saved.
     *
     * @return Returns the requested long value. If not found, returns an empty String.
     */
    public static String[] loadStringArray(Context context, String valueName, String preferenceFilename){
        sharedPreferences = context.getSharedPreferences(preferenceFilename, Context.MODE_PRIVATE);
        return sharedPreferences.getString(valueName, "").split("_&#;#&_");
    }







    //-----     Deleting      ------

    /**
     * Deletes a value using SharedPreferences.
     * @param context The context of the current Activity.
     * @param valueName The name for the value that should be deleted.
     */
    public static void deleteIndividualValue(Context context, String valueName) {
        sharedPreferences = context.getSharedPreferences(originalPreferenceFilename, Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
        editor.remove(valueName);
        editor.apply();
    }

    /**
     * Deletes a value using SharedPreferences from a custom file.
     * @param context The context of the current Activity.
     * @param valueName The name for the value that should be deleted.
     */
    public static void deleteIndividualValue(Context context, String valueName, String preferenceFilename) {
        sharedPreferences = context.getSharedPreferences(preferenceFilename, Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
        editor.remove(valueName);
        editor.apply();
    }

    /**
     * Deletes all values from a file using SharedPreferences.
     * @param context The context of the current Activity.
     */
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

    /**
     * Deletes all values from a custom file using SharedPreferences.
     * @param context The context of the current Activity.
     */
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

    /**
     * Deletes a specified file
     *
     * @param context The context of the current activity.
     * @param fileName The name of the file that should be deleted.
     * @param extension The file's extension. For example, if the file's extension is .zip, a string that contains "zip" should be passed.
     *
     * @return Returns true if the file was successfully deleted, and returns false if it wasn't for whatever reason.
     */
    public static boolean deleteFile(Context context, String fileName, String extension){
        return new File(context.getFilesDir().getParent() + File.separator + "shared_prefs" + File.separator + fileName + "." + extension).delete();
    }








    //-----     Checking if file exists      ------
    /**
     * Deletes all values from a file using SharedPreferences.
     * @param context The context of the current Activity.
     *
     * @return Returns true if the file exists, and false if it doesn't.
     */
    public static boolean checkIfFileExists(Context context){
        return new File(context.getFilesDir().getParent() + File.separator + "shared_prefs" + File.separator + originalPreferenceFilename + ".xml").exists();
    }

    /**
     * Deletes all values from a custom file using SharedPreferences.
     * @param context The context of the current Activity.
     *
     * @return Returns true if the file exists, and false if it doesn't.
     */
    public boolean checkIfFileExists(Context context, String preferenceFilename){
        return new File(context.getFilesDir().getParent() + File.separator + "shared_prefs" + File.separator + preferenceFilename + ".xml").exists();
    }

}
