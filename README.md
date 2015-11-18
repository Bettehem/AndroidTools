[How get this running with your project?](https://github.com/Bettehem/AndroidTools#how-to-use)
# AndroidTools - Overview
A set of tools, useful when creating android apps.


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


#How to use
In android studio, go to your modules build.gradle and add a new line to your dependencies:
```groovy
compile 'com.bettehem.tools:tools:1.0.0@aar'
```
Then sync your gradle and you're good to go!
