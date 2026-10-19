# Implementation Plan - Add Remaining Pet Care Features

Implement Pet List, Combined Vaccination & Medication List, and Add/View Medication screens following the exact simple pattern of existing activities (`MainActivity5`-`MainActivity8`).

## User Review Required

> [!IMPORTANT]
> - **Screens to Implement**:
>   1. **Pet List** (Screen No. 4)
>   2. **Vaccination & Medication List** (Combined screens No. 7 & 9)
>   3. **Add/View Medication** (Screen No. 10)
> - **Excluded**: Stock Management (11, 12) and Health Summary (15) as requested.
> - **Pattern**: Matches existing simple activities (EdgeToEdge, ConstraintLayout, EditText, Button, TextView, Toast messages).

## Proposed Changes

### [app]

#### [NEW] [MainActivity9.java](file:///C:/Users/harma/AndroidStudioProjects/MAD_PROJECT_FINAL/app/src/main/java/com/mad_project_final/MainActivity9.java)
- Pet List activity showing added pets and details matching existing style.

#### [NEW] [activity_main9.xml](file:///C:/Users/harma/AndroidStudioProjects/MAD_PROJECT_FINAL/app/src/main/res/layout/activity_main9.xml)
- Layout for Pet List.

#### [NEW] [MainActivity10.java](file:///C:/Users/harma/AndroidStudioProjects/MAD_PROJECT_FINAL/app/src/main/java/com/mad_project_final/MainActivity10.java)
- Combined Vaccination & Medication List activity.

#### [NEW] [activity_main10.xml](file:///C:/Users/harma/AndroidStudioProjects/MAD_PROJECT_FINAL/app/src/main/res/layout/activity_main10.xml)
- Layout for Vaccination & Medication List.

#### [NEW] [MainActivity11.java](file:///C:/Users/harma/AndroidStudioProjects/MAD_PROJECT_FINAL/app/src/main/java/com/mad_project_final/MainActivity11.java)
- Add/View Medication activity.

#### [NEW] [activity_main11.xml](file:///C:/Users/harma/AndroidStudioProjects/MAD_PROJECT_FINAL/app/src/main/res/layout/activity_main11.xml)
- Layout for Add/View Medication.

#### [MODIFY] [AndroidManifest.xml](file:///C:/Users/harma/AndroidStudioProjects/MAD_PROJECT_FINAL/app/src/main/AndroidManifest.xml)
- Register MainActivity9, MainActivity10, and MainActivity11.

## Verification Plan

### Automated Tests
- Build project using Gradle (`app:assembleDebug`) to verify compilation.

### Manual Verification
- Verify layouts and activity wiring.
