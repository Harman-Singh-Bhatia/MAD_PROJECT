# Implement Registration Feature

Fix the registration flow in the app where clicking "Register" on the login screen (`MainActivity`) currently does nothing because the click listener is missing and `MainActivity3` is currently a duplicate of Forgot Password instead of Registration.

## User Review Required

> [!IMPORTANT]
> We will update `MainActivity3` and its layout (`activitymain3.xml`) to serve as the Registration screen (Name, Email, Password, Register Button) using the existing strings (`m7` to `m11`), and wire up `textView2` in `MainActivity` to open `MainActivity3`.

## Proposed Changes

### App Component

#### [MODIFY] [activitymain3.xml](file:///C:/Users/harma/AndroidStudioProjects/MAD_PROJECT_FINAL/app/src/main/res/layout/activitymain3.xml)
- Change layout to include `EditText` for Name (`m7`), Email (`m8`), Password (`m9`), and a `Button` for Register (`m10`).

#### [MODIFY] [MainActivity3.java](file:///C:/Users/harma/AndroidStudioProjects/MAD_PROJECT_FINAL/app/src/main/java/com/mad_project_final/MainActivity3.java)
- Update inputs to handle Name, Email, and Password validation.
- Show success toast ("Registration Successful") and finish or return to login upon successful registration.

#### [MODIFY] [MainActivity.java](file:///C:/Users/harma/AndroidStudioProjects/MAD_PROJECT_FINAL/app/src/main/java/com/mad_project_final/MainActivity.java)
- Add click listener to `t2` ("Register" / `R.id.textView2`) to launch `MainActivity3`.

## Verification Plan

### Automated Tests
- Run `gradle_build` (`app:assembleDebug`) to ensure compilation succeeds.

### Manual Verification
- Deploy app and tap "Register" on the login screen to verify it opens the registration screen.
- Enter details and click Register to verify success message.
