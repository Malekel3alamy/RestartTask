# Jetpack Compose Showcase View

This project demonstrates how to create a showcase view in Jetpack Compose, which can be used to highlight specific UI elements and provide guidance to the user.

## Features

* Navigation between 5 Tabs .
* Highlights target UI elements with a spotlight effect.
* Displaystutorial text or other content within the overlay.
* Allows customization of the overlay's appearance (e.g., background color, highlight shape).
* Provides options for dismissing the showcase (e.g., clicking on the target, clicking outside the target, using a dismiss button).

## Usage

1. Add the `ShowCaseView` composable to your UI hierarchy.
2. Define the target elements you want to highlight using `ShowCaseProperty` objects.
3. Provide tutorial content and dismissal options as needed.

## Customization

You can customize the appearance and behavior of the showcase view by modifying the following parameters:

* `targets`: A map of target elements and their properties.
* `backgroundColor`: The background color of the overlay.
* `onShowCaseCompleted`: A callback function executed when the showcase is completed.
* `TargetContent`: Customize the content and appearance of the target highlight.

## Contributing

Contributions are welcome! Please feel free to submit pull requests or open issues.
