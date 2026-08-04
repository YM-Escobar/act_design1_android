# Implementation Plan - Fix Render Issues in Login Screen

The goal is to resolve the Layout Fidelity warning regarding API level 37 and fix layout issues that prevent the Login screen from rendering correctly in the Compose Preview.

## User Review Required

> [!IMPORTANT]
> I will be lowering the `compileSdk` and `targetSdk` to 35 in `build.gradle.kts` to resolve the fidelity warning, as API 37 rendering is not yet fully supported in the current environment.
> I will also be removing `fillMaxHeight()` from several `Spacer` components which are currently causing the UI to be pushed off-screen.

## Proposed Changes

### Build Configuration

#### [MODIFY] [build.gradle.kts](file:///D:/Talleres_ADSO/Components/app/build.gradle.kts)
- Change `compileSdk` version to 35.
- Change `targetSdk` to 35.

### UI Components

#### [MODIFY] [header.kt](file:///D:/Talleres_ADSO/Components/app/src/main/java/com/example/components/ui/section/login/header.kt)
- Remove `fillMaxHeight()` from the `Spacer` at the end of the `Header` composable. It's causing the header to consume all available screen height.

#### [MODIFY] [actions.kt](file:///D:/Talleres_ADSO/Components/app/src/main/java/com/example/components/ui/section/login/actions.kt)
- Remove `fillMaxHeight()` from the `Spacer` at the end of the `Actions` composable.

#### [MODIFY] [image_people.kt](file:///D:/Talleres_ADSO/Components/app/src/main/java/com/example/components/ui/section/login/image_people.kt)
- Move the `Spacer` outside of the `Box` so it actually provides vertical spacing in the parent `Column`.
- Remove `fillMaxWidth()` from the `Spacer` (unnecessary for vertical spacing).

#### [MODIFY] [information.kt](file:///D:/Talleres_ADSO/Components/app/src/main/java/com/example/components/ui/component/login/information.kt)
- Remove `fillMaxWidth()` from the `Spacer` (cleanup).

## Verification Plan

### Manual Verification
- Render the `Login` preview again using `render_compose_preview` to ensure all elements are visible and correctly positioned.
- Verify that the API fidelity warning is no longer present (or is resolved by the SDK change).
