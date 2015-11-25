[CHANGELOG](https://github.com/Bettehem/AndroidTools#changelog)

# AndroidTools - Overview
A set of tools, useful when creating android apps.

#### INDEX:
1. [SharedPreferences](https://github.com/Bettehem/AndroidTools#sharedpreferences)
2. [CustomAlertDialog](https://github.com/Bettehem/AndroidTools#customalertdialog)
3. [CustomNotification](https://github.com/Bettehem/AndroidTools#customnotification)
4. [How to use](https://github.com/Bettehem/AndroidTools#how-to-use)

# SharedPreferences
Using the Preferences class provided by this tool, you can easily manage your SharedPreferences.

#### Has the following methods:
###### Saving
`saveString`
`saveInt`
`saveBoolean`
`saveFloat`
`saveLong`
`saveStringArray`
###### Loading
`loadString`
`loadInt`
`loadBoolean`
`loadFloat`
`loadLong`
`loadStringArray`
###### Deleting
`deleteIndividualValue`
`deleteAllValues`
###### Checking
`checkIfFileExists`
More might me added later.

#### Example 1, Saving data:
```groovy
Preferences.saveString(this, "appName", "TestApp");
```
The syntax is the following for saving values(saveString as an example):
`Preferences.saveString(Context context, String valueName, String value);`
So, let's think a boolean value should be saved, the syntax is following:
`Preferences.saveBoolean(Context context, String valueName, boolean value);`

###### Note:
There is an option to use a custom filename too. By default the filename used, is Settings.
If you want to use a custom filename, just enter an additional parameter with the filename:
`Preferences.saveString(this, "appName, "TestApp", "MyFile");`
This works with all methods in Preferences.java

#### Example 2, Loading data:
```groovy
Preferences.loadString(this, "appName");
```
This works exactly the same way as saving data, with the exception of no "value" parameter needed.
You only need to give the context, the value name and optionally a custom filename. If no matching value is found, a default value will be returned, with strings it's just an empty string "", with boolean values it's false, with numbers it's 0.


#### Example 3, Checking files:
```groovy
Preferences.checkIfFileExists(this);
```
This method will check if a file exists. If no file name is given as a second parameter, it will check if the Settings file exists.
If a file name is given, the line should look something like this:
```groovy
Preferences.checkIfFileExists(this, "MyFile");
```

###### Note:
checkIfFileExists will return a boolean value, depending on the files existence. If the file exists, true will be returned, if not, false will be returned.
By just calling the method, nothing will really happen. You should save the result in to a variable so you can actually use it for something.


#### Example 4: Deleting values:
```groovy
Preferences.deleteIndividualValue(this, "appName");
```
To delete an individual value, you use the deleteIndividualValue method, and enter the context and the value name as your parameters.

to delete all values use deleteAllValues:
```groovy
Preferences.deleteAllValues(this);
```
###### Note:
As usual, you can add a custom file name as an additional parameter:
```groovy
Preferences.deleteIndividualValue(this, "appName", "MyFile");
```
and
```groovy
Preferences.deleteAllValues(this, "MyFile");
```

# CustomAlertDialog
By using the CustomAlertDialog tool provided by this tool, you can easily create AlertDialogs.
Features:
-Up to three buttons with any text you want
-Custom titles
-Custom messages
-Easy management through a listener.

There are several ways on how CustomAlertDialog can be used.
The tool provides static methods for quick use, and can be set up with one line of code.
There are three of these methods, one for each button amount.(1 static method for using one button, 1 static method for using two buttons, and one static method for using all three buttons)
These methods are called make and take following parameters:

###### One button:
1: `Context context`
<br />
2: `String title`
<br />
3: `String message`
<br />
4: `boolean isCancelable`
<br />
5: `String positiveButtonText`
<br />
6: `DialogButtonsListener dialogButtonsListener`
<br />
7: `final String id`

###### Two buttons:
1: `Context context`
<br />
2: `String title`
<br />
3: `String message`
<br />
4: `boolean isCancelable`
<br />
5: `String positiveButtonText`
<br />
6: `String negativeButtonText`
<br />
7: `DialogButtonsListener dialogButtonsListener`
<br />
8: `final String id`

###### Three buttons:
1: `Context context`
<br />
2: `String title`
<br />
3: `String message`
<br />
4: `boolean isCancelable`
<br />
5: `String positiveButtonText`
<br />
7: `String neutralButtonText`
<br />
8: `String negativeButtonText`
<br />
9: `DialogButtonsListener dialogButtonsListener`
<br />
10: `final String id`

###### Explanation:
`Context context` - context of the activity
<br />
`String title` - the title for the dialog
<br />
`String message` - the message for the dialog
<br />
`boolean isCancelable` - this value tells if the user can cancel the dialog by pressing outside of the dialog, or by pressing the back button.
<br />
`String positiveButtonText` - the text for the positive button
<br />
`String neutralButtonText` - the text for the neutral button
<br />
`String negativeButtonText` - the text for the negative button
<br />
`DialogButtonsListener dialogButtonsListener` - the listener for the button clicks
<br />
`final String id` - the id of the dialog. Every dialog needs an id, or tag, if you want to call it that. Or name.
Anyway, this is useful when handling clicks. More on this below.

#### Example 1, using static method:
```groovy
//using two buttons as an example
CustomAlertDialog.make(this, "Warning!", "Please connect to a network and try again", false, "Try again", "Exit", this, "networkErrorDialog").show();
```

#### Example 2, using non-static method:
###### Note that when using a non-static method, you set the DialogButtonsListener separately.
```groovy
//using two buttons as an example
//Set variables
CustomAlertDialog customAlertDialog;
customAlertDialog = new CustomAlertDialog(this, "Warning!", "Please connect to a network and try again", false, "Try again", "Exit", "networkErrorDialog");
customAlertDialog.setDialogButtonsListener(this);
customAlertDialog.show();
```
As of version 1.0.3, it is possible to set a few attributes on the fly when using non-static methods:
`setDialogButtonsListener(DialogButtonsListener dialogButtonsListener)`
`setCustomTitle(String title)`
`setCustomMessage(String message)`
`setIsCancelable(boolean isCancelable)`
Note that these will only work if you have already set the CustomAlertDialog up.
How to do it:
```groovy
CustomAlertDialog customAlertDialog;
customAlertDialog = new CustomAlertDialog(this, "Warning!", "Please connect to a network and try again", false, "Try again", "Exit", "networkErrorDialog");
customAlertDialog.setDialogButtonsListener(this);
customAlertDialog.show();
...
...
//At some later point AFTER the variable has been set up
customAlertDialog.setCustomTitle("Error!");
customAlertDialog.setMessage("That doesn't make any sense!");
customAlertDialog.setIsCancelable(true);
```
How you shouldn't do it:
```groovy
CustomAlertDialog customAlertDialog;
...
//At some later point BEFORE the variable has been set up
customAlertDialog.setCustomTitle("Error!");
customAlertDialog.setMessage("That doesn't make any sense!");
customAlertDialog.setIsCancelable(true);
...
customAlertDialog = new CustomAlertDialog(this, "Warning!", "Please connect to a network and try again", false, "Try again", "Exit", "networkErrorDialog");
customAlertDialog.setDialogButtonsListener(this);
customAlertDialog.show();
```
More functions will probably be added at later.

###### Note:
If you pass "this" as the DialogButtonsListener, that class has to implement the listener. The listener has three methods:
`onPositiveButtonClicked`
<br />
`onNeutralButtonClicked`
<br />
`onNegativeButtonClicked`
<br />
These methods pass a string as a parameter (`String id`). See [DialogButtonsListener](https://github.com/Bettehem/AndroidTools#dialogbuttonslistener) for more information.

#### DialogButtonsListener
When a button is clicked in the dialog, the DialogButtonsListener is called.
There is one method for each type of button.
As an example, let's assume that the class that is using the CustomAlertDialog has implemented DialogButtonsListener,
the methods would look like this:
```groovy
    @Override
    public void onPositiveButtonClicked(String id) {
        
    }

    @Override
    public void onNeutralButtonClicked(String id) {

    }

    @Override
    public void onNegativeButtonClicked(String id) {
        
    }
```

So, as you can see, each method has an id passed as a parameter.
###### Example of using the listener
```groovy
    //handle the negative button click
    @Override
    public void onNegativeButtonClicked(String id) {
        //if the id of the dialog is "networkErrorDialog, finish the activity."
        if (id.contentEquals("networkErrorDialog")){
            finish();
        }
    }
```

This is how you would use the listener.
Since you can have multiple CustomAlertDialogs, but can have only one implemented DialogButtonsListener, you have to be able to tell from which dialog the listener was called.
So just by simply testing if the id is what you want, you can perform a corresponding action.



# CustomNotification
By using the CustomNotification tool, you can easily create custom notifications.
A notification can be created and displayed simply by calling `CustomNotification.make`, and to show it, just add `show()` to the end of the line.

`CustomNotification.make` takes the following parameters:
</br />
1. `Context context`
</br />
2. `int iconId`
</br />
3. `String title`
</br />
4. `String message`
</br />
5. `Intent intent`
</br />
6. `boolean isPersistent`
</br />
7. `boolean dismissOnTap`
</br />


#### Example:
```groovy
//Set intent
Intent myIntent = new Intent(this, MainActivity.class);
//Make notification
CustomNotification.make(this, R.drawable.cool_pic, "Hello", "I'm a notification!", myIntent, false, true).show();
```

###### Note that you can only use so long messages, because CustomNotification doesn't yet support expansion.


# How to use

#### Versions before 1.0.10 are no longer available, please update to a newer version!

1. In Android Studio, go to your module's build.gradle and add a new line to your dependencies:
```groovy
compile 'com.github.bettehem:androidtools:1.1.1'
```
Then sync your gradle and you're good to go!

AndroidTools is available here too:
 [ ![Download](https://api.bintray.com/packages/bettehem/maven/androidtools/images/download.svg) ](https://bintray.com/bettehem/maven/androidtools/_latestVersion)

###### Note:
For you maven users out there, AndroidTools is available in the `mavenCentral()` repo too!

# ChangeLog

#### v1.1.0
-Added documentation to Preferences. 
