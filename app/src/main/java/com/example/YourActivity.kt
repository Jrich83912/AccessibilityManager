private lateinit var accessibilityManager: AccessibilityManager

// Inside onCreate or appropriate lifecycle method
accessibilityManager = getSystemService(Context.ACCESSIBILITY_SERVICE) as AccessibilityManager

// Check if accessibility features are enabled
val isAccessibilityEnabled = accessibilityManager.isEnabled

// Listen for accessibility state changes
val accessibilityListener = AccessibilityManager.AccessibilityStateChangeListener { enabled ->
    // Handle accessibility state changes
    updateUIForAccessibility(enabled)
}

accessibilityManager.addAccessibilityStateChangeListener(accessibilityListener)
