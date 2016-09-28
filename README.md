[CHANGELOG](https://github.com/Bettehem/AndroidTools#changelog)

# AndroidTools - Overview
A set of tools, useful when creating android apps.

#### INDEX:
1. [SharedPreferences](https://github.com/Bettehem/AndroidTools#sharedpreferences)
2. [CustomAlertDialog](https://github.com/Bettehem/AndroidTools#customalertdialog)
3. [CustomNotification](https://github.com/Bettehem/AndroidTools#customnotification)
4. [Time](https://github.com/Bettehem/AndroidTools#time)
5. [How to use](https://github.com/Bettehem/AndroidTools#how-to-use)

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
`deleteFile`
###### Checking
`checkIfFileExists (NOTE: DEPRECATED! USE fileExists INSTEAD)`
`fileExists`
`filenameContains`
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

-------------------------------------------------------------
###### `checkIfFileExists` is deprecated! use `fileExists` instead!
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

-------------------------------------------------------------
<br />
<br />

```groovy
Preferences.fileExists(this, "RandomData", "txt");
```
`fileExists` takes 3 parameters:
1. `Context context`
2. `String fileName`
3. `String extension`

Explanation:
`fileName`: The name of the file that should be checked.
`extension`: The file's extension. For example, if the file's extension is .zip, a string that contains "zip" should be passed.

###### Note: Returns a boolean value; true if the file exists, and returns false if it doesn't.


```groovy
Preferences.filenameContains(this, "Random");
```
`filenameContains` takes 2 parameters:
1. `Context context`
2. `String possibleFilename`

Explanation:
`fileName`: A part of the name of a possible file. This means, that if for example, you have a file with the name RandomData.txt, you can just enter "Random", or "Rand", or Data, or "RandomDat", or "omD", or whatever you want.
This is useful when you might not know the whole filename, but you still want to check if it exists.




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

#### Example 5: Deleting files:
```groovy
Preferences.deleteFile(this, "RandomData", "txt");
```
`deleteFile` takes 3 parameters:
1. `Context context`
2. `String fileName`
3. `String extension`

Explanation:
`fileName`: The name of the file that should be deleted.
`extension`: The file's extension. For example, if the file's extension is .zip, a string that contains "zip" should be passed.

###### Note: Returns a boolean value; true if the file was successfully deleted, and returns false if it wasn't for whatever reason.


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


# Time
By using the Time Object, you can easily manage time in your project.
The Time Object is basically a simplified Calendar Object.
A time object can be created using one of the four constructors:

</br />
`public Time (Calendar date)`
</br />
`public Time (int year, int month, int date, int hour, int minute, int second)`
</br />
`public Time (Date date)`
</br />
`public Time (long milliseconds)`
</br />

#### Example: 
```groovy
//Create Time object
Time time1 = new Time(2016, 8, 4, 6, 30, 0)


//Create another Time object

//First create a Calendar object as an example
Calendar calendar = Calendar.getInstance();

//Create the second Time Object
Time time2 = new Time(calendar);
```

It's possible to compare Time Objects.
#### Example:
```groovy
//Create a ArrayList of Time ojects
Arraylist<Time> timeList = new ArrayList<>();

//add the previously created Time Objects to the list
timelist.add(time1);
timelist.add(time2);

//Sort the list
Collections.sort(timeList);
```


# How to use


#### A Beta version is available: 1.1.63-beta, but it might have bugs. Use only for testing, or if you don't mind possible bugs!


1. In Android Studio, go to your module's build.gradle and add a new line to your dependencies:
```groovy
compile 'com.github.bettehem:androidtools:1.1.4'
```
Then sync your gradle and you're good to go!

AndroidTools is available here too:
 [ ![Download](https://api.bintray.com/packages/bettehem/maven/androidtools/images/download.svg) ](https://bintray.com/bettehem/maven/androidtools/_latestVersion)

###### Note:
For you maven users out there, AndroidTools is available in the `mavenCentral()` repo too!

# ChangeLog

#### v1.1.71
-Fixed Preferences.loadBoolean method with filename specification not being static

#### v1.1.7
-Added new Time constructor:
    *You can now create Time Objects with passing milliseconds to the constructor.

#### v.1.1.63-beta (Might contain bugs)
-Fixed CustomAlertDialog bugs, hopefully all of them.

#### v1.1.6-beta (Might contain bugs)
-Added a new features to CustomAlertDialogs:
    *You can now add a tag when creating the dialog.
    *You can add two kinds of tags.
        >>The first type is a global tag for that object that you can set and get with just calling setTag("myTag"); to set it and getTag(); to get it.
        >>The second type is a key based tag, that let's you save multiple tags with a unique key separating them from each other: setTag("myKey"); and getTag("myKey") to get it.
        >>In theory, you can store one global tag, and 2147483647 tags that are assigned with keys.
    *You can now add buttons when using the non-static way of using CustomAlertDialog.
    *You can now create a CustomAlertDialog by just using the new constructor that takes only Context as a parameter.

#### v1.1.5-beta (Might have bugs)
-Added a new Time object that should simplify handling time and dates more easily.

#### v1.1.4
-When creating a custom notification, it uses the default notification sound.
-Added Documentation for the new method added in v1.1.4-beta.

#### v1.1.4-beta (Might be unstable)
-Added new method for checking if a file exists with only part of the name given.
-No documentation for the new method, and it might not work anyway.

#### v1.1.3
-Added new method to the Preferences tool: `fileExists`
<br />
-Changed `checkIfFileExists(Context context, String preferenceFilename)` to be static
<br />
-Deprecated the `checkIfFileExists` -methods in favor of the new method `fileExists`
<br />

#### v1.1.2
-Added a new method to the Preferences tool: `deleteFile`

#### v1.1.1
-Added more documentation to Preferences.
-Changed the Preferences class to be final. 

#### v1.1.0
-Added documentation to Preferences. 

[Back to top](#androidtools---overview)
