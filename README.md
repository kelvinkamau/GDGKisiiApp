# GDGKisiiApp
[![FOSSA Status](https://app.fossa.io/api/projects/git%2Bgithub.com%2Fkelvinkamau%2FGDGKisiiApp.svg?type=shield)](https://app.fossa.io/projects/git%2Bgithub.com%2Fkelvinkamau%2FGDGKisiiApp?ref=badge_shield)

Home repository of GDG Kisii Android Mobile App. 

We created an android application to manage our developer community.
Updates on developer events, resources and speakers are accessible via the mobile application.

Cool features include
* Bottom Navigation
* Tab Navigation
* A number of APIs including Maps API

# My Android Basics Curriculum

* [General programming practices](https://github.com/kelvinkamau/GDGKisiiApp/blob/master/README.md#general-programming-practices)
* [Introduction to Android basics](https://github.com/kelvinkamau/GDGKisiiApp/blob/master/README.md#introduction-to-android-basics)
* [Mastering layouts in Android](https://github.com/kelvinkamau/GDGKisiiApp/blob/master/README.md#mastering-layouts-in-android)
* [Build System - Working with Gradle](https://github.com/kelvinkamau/GDGKisiiApp/blob/master/README.md#build-systemworking-with-gradle)
* [Networking In Android](https://github.com/kelvinkamau/GDGKisiiApp/blob/master/README.md#networking-in-android)
* [Architecting your Android apps](https://github.com/kelvinkamau/GDGKisiiApp/blob/master/README.md#architecting-your-android-applications)
* [Testing your Android apps](https://github.com/kelvinkamau/GDGKisiiApp/blob/master/README.md#testing-your-android-applications)
* [Releasing your Android apps](https://github.com/kelvinkamau/GDGKisiiApp/blob/master/README.md#releasing-your-android-apps)
* [Securing your Android apps](https://github.com/kelvinkamau/GDGKisiiApp/blob/master/README.md#security)
* [Advanced Android](https://github.com/kelvinkamau/GDGKisiiApp/blob/master/README.md#advanced-android-topics)

## General Programming Practices
The following general programming practices are key to getting started with your successful career in development. These practices include:

* [Source Control (Git)](https://git-scm.com/) — Source control is a tool to manage versions of your code, it is great for writing software collaboratively.
* [Git Workflows](https://www.atlassian.com/git/tutorials/comparing-workflows) — There are many different ways in which software is managed when using source control. Popular methods include: Gitflow workflow, Centralized workflow, Forking workflow etc.
* [Continuous Integration](https://www.thoughtworks.com/continuous-integration) — Continuous integration ensures that your code is building on a server that is not your own machine. Look at using a build server like Jenkins, Buddybuild, Circle CI, Travis etc.
* [Pull Requests](https://www.atlassian.com/blog/git/written-unwritten-guide-pull-requests) — Pull requests are a great way to get very detailed feedback on the code that you have developed.
* [Agile/Scrum methodologies](https://www.scrumalliance.org/why-scrum/scrum-guide) — Most modern software development teams follow Scrum methodologies for working.
* Code Quality Tools – There are many tools that companies use to measure the quality of their code and the health of the codebase. Metrics such as number of lines of test coverage or how much technical debt the code base has, are made visible. Some tools that are frequently used: [Sonar](https://www.sonarqube.org/), [FindBugs](http://findbugs.sourceforge.net/), [Checkstyle](https://github.com/checkstyle/checkstyle) and [Android Lint](https://developer.android.com/studio/write/lint.html).

## Introduction to Android Basics
There are a bunch of websites that provide the basics of getting started with Android development. My recommendation is to follow the official documentation to understand the basics.

### Some getting started resources:
* [Android Application Fundamentals](https://developer.android.com/guide/components/fundamentals.html)</br>
* [Some of the main components in Android: Activities, Fragments, Services, Broadcast Receivers.](https://developer.android.com/guide/components/activities/index.html)</br>
* [Android Application Manifest](https://developer.android.com/guide/topics/manifest/manifest-intro.html)</br>
* [Code lab — Build your first Android App](https://codelabs.developers.google.com/codelabs/build-your-first-android-app/index.html)</br>

## Mastering Layouts in Android
There are a lot of different layout types in Android, from FrameLayout to RelativeLayout to ConstraintLayout. Make sure you are comfortable with these commonly used layout types: FrameLayout, RelativeLayout, LinearLayout, ConstraintLayout, CoordinatorLayout.

### Resources:
* [Supporting different screen sizes](https://developer.android.com/training/multiscreen/screensizes.html)</br>
* [Code lab — ConstraintLayout](https://codelabs.developers.google.com/codelabs/constraint-layout/index.html)</br>
* [Code lab — CoordinatorLayout](https://codelabs.developers.google.com/codelabs/mdc-android/index.html)</br>

## Build System — Working with Gradle
Working with Gradle is probably something that gets overlooked when developing Android apps. Make sure you understand the basics, even better — learn how to write your own gradle tasks!

### Resources:
* [Gradle Documentation](https://gradle.org/)</br>
* [Configure your Build](https://developer.android.com/studio/build/index.html)</br>

## Networking in Android
Although most of the Android documentation doesn’t reference Retrofit or OkHttp, these are the most commonly used libraries when it comes to networking in Android. It is also good to be familiar with the different profiling tools available in Android Studio.

### Resources:
* [Understanding RESTful Services](https://www.tutorialspoint.com/restful/)</br>
* [Retrofit](https://www.tutorialspoint.com/restful/) —A type-safe HTTP client for Android and Java</br>
* [OkHttp](http://square.github.io/okhttp/) — An HTTP & HTTP/2 client for Android and Java applications</br>
* [Network Profiler in Android](https://developer.android.com/studio/profile/network-profiler.html) — A tool in Android Studio that allows you to profile your network calls.</br>
* [Charles Proxy](https://www.charlesproxy.com/) — Useful for intercepting network calls whilst testing.

## Architecting your Android Applications
Unfortunately, writing code and getting your app to compile isn’t the end of knowing how to write a maintainable Android app. Large scale Android applications need to follow good architectural designs in order for them to be maintainable and testable. There are many different patterns you can follow when writing an Android application. Patterns such as MVP, MVVM and Clean Architecture are commonly used. Make sure you understand the differences between the patterns as you will encounter many different patterns in the wild.

### Resources:
* [Android Architecture Components Guide](https://developer.android.com/topic/libraries/architecture/index.html)</br>
* [Introduction to Android Architecture Components Video](https://www.youtube.com/watch?v=9QrFMsihBAo)</br>
* [Google Sample App Github Repository](https://github.com/googlesamples/android-architecture-components)</br>
* [Code lab — Persistence](https://codelabs.developers.google.com/codelabs/android-persistence/index.html)</br>
* [Code lab — Lifecycle Aware Components](https://codelabs.developers.google.com/codelabs/android-lifecycles/index.html)

## Testing your Android Applications
Once you have gotten the hang of creating Android apps, you will need to think of how to test them. Unit testing and UI testing are very important concepts that you need to make sure you understand. There are plenty of different tools you can use to write UI tests. Most Android developers use Espresso and JUnit to write tests but there are many other tools out there such as Robotium, Calabash, Appium etc. I would recommend using Espresso and JUnit.

### Resources:
* [Android Testing Support Library](https://developer.android.com/topic/libraries/testing-support-library/index.html)</br>
* [Espresso](https://developer.android.com/training/testing/espresso/basics.html)</br>
* [JUnit](http://junit.org/junit4/)</br>
* [Mockito](http://site.mockito.org/)</br>
* [Code lab — Android Testing](https://codelabs.developers.google.com/codelabs/android-testing/index.html)</br>
* [Code lab — Android Performance Testing](https://codelabs.developers.google.com/codelabs/android-perf-testing/index.html)

## Releasing your Android Apps
Great, you’ve made it this far!</br>
Now there are a few concepts you will need to cover in order to release your application:

* [Preparing your app for release](https://developer.android.com/studio/publish/preparing.html)</br>
* [App Signing](https://developer.android.com/studio/publish/app-signing.html)</br>
* [Versioning your App](https://developer.android.com/studio/publish/versioning.html)</br>
* [ProGuard](https://developer.android.com/studio/build/shrink-code.html)

## Security
There are plenty of things that should be done in order to secure your application and make sure no one gains access to unauthorised content. Make sure you are using ProGuard (mentioned earlier). Understand what a Man in the Middle Attack is. Understand different encryption methods and ways in which you can securely store information inside an Android App including securing your API Tokens, certificate pinning etc.

### Resources:
* [Security Tips on Android.](https://developer.android.com/training/articles/security-tips.html)</br>
* [Certificate Pinning](https://square.github.io/okhttp/3.x/okhttp/okhttp3/CertificatePinner.html)</br>
* [SafetyNet API](https://developer.android.com/training/safetynet/index.html)</br>
* [Android Keystore System](https://developer.android.com/training/articles/keystore.html)'

## Advanced Android Topics
Once you have covered all the basics of writing Android applications, there are a few advanced topics that you might need to cover in order to contribute to some codebases:

* [Kotlin](https://kotlinlang.org/) — Kotlin is the new programming language for Android, developers are actively writing their code in Kotlin. It is worth reading up about Kotlin and running through the Kotlin Koans. There is also a Kotlin code lab available.
* [RxJava](https://github.com/ReactiveX/RxJava) — RxJava is a library used for asynchronous, event-based programming. It allows you to compose operations together to do complex tasks (such as combining multiple network calls together) and can be very useful with regards to managing which thread your code is executed on. There is a great video from Jake Wharton describing how to use RxJava and the benefits of using it.
* [Dagger (Dependency Injection)](https://github.com/ReactiveX/RxJava) — Dependency Injection is a way to manage objects and their dependencies within your application. The concept of DI is not an Android one but is available in many other frameworks as well. DI can make your code more memory efficient and promotes testability. Dagger 2 is the most popular Android DI Framework.
* [Material Design](https://material.io/) — Most Android Apps follow Google’s Material Design Guidelines. The guidelines are a way of designing your apps in a standard way which users are accustomed to.
* [Support Libraries in Android](https://developer.android.com/topic/libraries/support-library/index.html) — The support libraries in Android are very important to ensure that your app looks and behaves consistently across multiple versions of Android. There are a few different libraries that have different purposes. The linked article describes the reasoning behind the libraries.
* Memory Leaks — In Android, it is quite easy to create memory leaks. This can lead to erroneous behaviour in your application (random crashes). A lot of developers use [LeakCanary](https://github.com/square/leakcanary) within their apps to ensure that there aren’t any memory leaks present.


## License
[![FOSSA Status](https://app.fossa.io/api/projects/git%2Bgithub.com%2Fkelvinkamau%2FGDGKisiiApp.svg?type=large)](https://app.fossa.io/projects/git%2Bgithub.com%2Fkelvinkamau%2FGDGKisiiApp?ref=badge_large)