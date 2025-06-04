# StackIt: Your Collection Management & Item Tracking Tool

![Android Logo](https://img.shields.io/badge/Platform-Android-3DDC84?style=for-the-badge&logo=android&logoColor=white)
![Kotlin Logo](https://img.shields.io/badge/Language-Kotlin-0095D5?style=for-the-badge&logo=kotlin&logoColor=white)
![Firebase Logo](https://img.shields.io/badge/Backend-Firebase-FFCA28?style=for-the-badge&logo=firebase&logoColor=black)
![Material Design Logo](https://img.shields.io/badge/UI/UX-Material%20Design-757575?style=for-the-badge&logo=material-design&logoColor=white)
![Status](https://img.shields.io/badge/Status-Development-blue?style=for-the-badge)

---

## What is StackIt?

StackIt is an intuitive Android application designed to help you **create, manage, and share your collections**. Whether it's comics, coins, figures, or any other item you wish to count and track, StackIt provides the necessary tools to organize everything.

### Key Features

* **Collection Creation and Management**: Users will be able to create their own collections.
* **Collection Sharing**: Possibility to share collections with others.
* **Item Management with Counters**: Within each collection, it will be possible to add items, which can be counted (1, 2, 3…).
* **Individual Item Counters**: Each user will have an individual counter for each item.
* **Persistent Data Storage**: All information will be stored in a database.
* **Advanced Statistical Analysis**: Allows statistical analysis of both a specific collection and all collections combined.
* **Temporal Increment Tracking**: Each time an item's counter is increased, the date of the increment will also be recorded, enabling statistics based on time periods.
* **Personalized Notes**: Users will be able to add notes when counting an item, facilitating detailed tracking of daily records with personalized observations.

---

## Technologies Used

* **Programming Language**: Kotlin
* **Platform**: Android
* **UI Architecture**: **Jetpack Compose with Jetpack Navigation Component for Compose**
* **Authentication**: Firebase Authentication
* **Database / Backend**: Firebase (for data storage and management)
* **UI Design**: Material Design 3 (M3)

---

## Project Status

The project is currently in the development phase.

---

## Contribution

This project is designed to be collaborative. If you wish to contribute, please get in touch to discuss how you can help.

---

## How to Get Started (for Developers)

1.  **Clone the repository**:
    ```bash
    git clone [https://github.com/your-username/stackit.git](https://github.com/your-username/stackit.git) # Replace with your repository URL
    ```
2.  **Open the project with Android Studio**:
    * Open Android Studio.
    * Select "Open an existing Android Studio project" and navigate to the cloned `stackit` directory.
3.  **Configure Firebase**:
    * Before building, ensure you have set up Firebase for your project. Follow the official Firebase guide for Android and add the `google-services.json` file to your `app/` directory.
    * Enable the necessary services in the Firebase console (Authentication, Firestore/Realtime Database depending on what you use for data).
4.  **Sync the project with Gradle**:
    * Android Studio should automatically sync the project. If not, click "Sync Project with Gradle Files" in the toolbar.
5.  **Run the application**:
    * Select a device or emulator and run the application.

---

Thank you for your interest in StackIt! Happy coding!