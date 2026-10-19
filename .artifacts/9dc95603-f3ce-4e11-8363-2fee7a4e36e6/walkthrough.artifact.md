# Walkthrough - Registration Feature Implementation

Implemented the registration screen and wired up the navigation from the login screen so users can successfully register.

## Changes

### UI & Layout
#### [MODIFY] [activitymain3.xml](file:///C:/Users/harma/AndroidStudioProjects/MAD_PROJECT_FINAL/app/src/main/res/layout/activitymain3.xml)
- Updated layout to include input fields for Name, Email, and Password, along with a Register button and result message text view.

### Activity Logic
#### [MODIFY] [MainActivity3.java](file:///C:/Users/harma/AndroidStudioProjects/MAD_PROJECT_FINAL/app/src/main/java/com/mad_project_final/MainActivity3.java)
- Implemented form validation for Name, Email, and Password inputs and success handling ("Registration Successful").

#### [MODIFY] [MainActivity.java](file:///C:/Users/harma/AndroidStudioProjects/MAD_PROJECT_FINAL/app/src/main/java/com/mad_project_final/MainActivity.java)
- Added a click listener to the Register text view (`textView2`) to launch `MainActivity3`.

## Verification Results

### Automated Tests
- Ran `gradle_build` (`app:assembleDebug`) successfully with status: `Build finished successfully.`
