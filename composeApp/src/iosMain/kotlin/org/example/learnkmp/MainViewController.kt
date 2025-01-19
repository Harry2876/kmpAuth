package org.example.learnkmp

import androidx.compose.ui.window.ComposeUIViewController
import io.github.jan.supabase.auth.handleDeeplinks
import kotlinx.cinterop.ExperimentalForeignApi
import platform.Foundation.NSURL
import platform.UIKit.UIApplication
import platform.UIKit.UIApplicationDelegateProtocol
import platform.UIKit.UIApplicationLaunchOptionsKey
import platform.UIKit.UIResponder
import platform.UIKit.UIScreen
import platform.UIKit.UIWindow
import io.github.jan.supabase.auth.handleDeeplinks as supabaseHandleDeeplinks

fun MainViewController() = ComposeUIViewController { App()


}
