I had taken 2 cases of lifecycle into consideration
with Lifecycle and without lifecycle.

But first lets discuss in detail what is life cycle:

## LifeCycle is an architectural component 

It holds information about LifeCycle state and component is concerned with LifeCycle events of Activity and Fragment.

For LifeCycle we need to deal with
-LifeCycle
-LifeCycleOwner
-LifeCycleObserver

1)LifeCycle provides information about lifecycle owner in the terms of **Event** and **States**.

States- Enum representing lifecycle states
Event- Enum representing lifecycle events.

## LifeCycle.State

INITIALIZED - Initialized state for LifecycleOwner
CREATED - Created state for LifecycleOwner
DESTROYED - Destroyed state for LifecycleOwner
RESUMED - Resumed state for LifecycleOwner
STARTED - Started state for LifecycleOwner

## LifeCycle.Event
ON_ANY - Constant matching all events
ON_CREATE - onCreate event of the LifecycleOwner
ON_DESTROY - onDestroy event of the LifecycleOwner
ON_PAUSE - onPause event of the LifecycleOwner
ON_RESUME - onResume event of the LifecycleOwner
ON_START - onStart event of the LifecycleOwner
ON_STOP - onStop event of the LifecycleOwner

2) LifeCycleOwner:
Android Lifecycle is there when any class implements LifeCycleOwner.

3) LifeCycleObserver:
The name having observer that indicates it observes callback for listening to lifecycle that changes to a LifeCycleOwner

Just for reference purpose:
**https://medium.com/@MinaSamy/android-architecture-components-lifecycle-433ace1ec05d**
