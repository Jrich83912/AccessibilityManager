public class MyAccessibilityService extends AccessibilityService {
    @Override
    public void onAccessibilityEvent(AccessibilityEvent event) {
        // Handle accessibility events here
        // Example: reading screen content, detecting UI changes
    }

    @Override
    public void onInterrupt() {
        // Handle interruption of accessibility service
    }

    @Override
    protected void onServiceConnected() {
        // Configure accessibility service
        AccessibilityServiceInfo info = new AccessibilityServiceInfo();
        info.eventTypes = AccessibilityEvent.TYPES_ALL_MASK;
        info.feedbackType = AccessibilityServiceInfo.FEEDBACK_SPOKEN;
        info.notificationTimeout = 100;
        setServiceInfo(info);
    }
}
