@file:kotlinx.cinterop.InteropStubs
@file:Suppress("UNUSED_VARIABLE", "UNUSED_EXPRESSION")
package glfw

import kotlin.native.SymbolName
import kotlinx.cinterop.*
import cnames.structs.GLFWcursor
import cnames.structs.GLFWmonitor
import cnames.structs.GLFWwindow
import platform.posix.__builtin_va_list

// NOTE THIS FILE IS AUTO-GENERATED

fun glfwInit(): Int {
    return kniBridge0()
}

fun glfwTerminate(): Unit {
    return kniBridge1()
}

fun glfwGetVersion(major: CValuesRef<IntVar>?, minor: CValuesRef<IntVar>?, rev: CValuesRef<IntVar>?): Unit {
    memScoped {
        return kniBridge2(major?.getPointer(memScope).rawValue, minor?.getPointer(memScope).rawValue, rev?.getPointer(memScope).rawValue)
    }
}

fun glfwGetVersionString(): CPointer<ByteVar>? {
    return interpretCPointer<ByteVar>(kniBridge3())
}

fun glfwSetErrorCallback(cbfun: GLFWerrorfun?): GLFWerrorfun? {
    return interpretCPointer<CFunction<(Int, CPointer<ByteVar>?) -> Unit>>(kniBridge4(cbfun.rawValue))
}

fun glfwGetMonitors(count: CValuesRef<IntVar>?): CPointer<CPointerVar<GLFWmonitor>>? {
    memScoped {
        return interpretCPointer<CPointerVar<GLFWmonitor>>(kniBridge5(count?.getPointer(memScope).rawValue))
    }
}

fun glfwGetPrimaryMonitor(): CPointer<GLFWmonitor>? {
    return interpretCPointer<GLFWmonitor>(kniBridge6())
}

fun glfwGetMonitorPos(monitor: CValuesRef<GLFWmonitor>?, xpos: CValuesRef<IntVar>?, ypos: CValuesRef<IntVar>?): Unit {
    memScoped {
        return kniBridge7(monitor?.getPointer(memScope).rawValue, xpos?.getPointer(memScope).rawValue, ypos?.getPointer(memScope).rawValue)
    }
}

fun glfwGetMonitorPhysicalSize(monitor: CValuesRef<GLFWmonitor>?, widthMM: CValuesRef<IntVar>?, heightMM: CValuesRef<IntVar>?): Unit {
    memScoped {
        return kniBridge8(monitor?.getPointer(memScope).rawValue, widthMM?.getPointer(memScope).rawValue, heightMM?.getPointer(memScope).rawValue)
    }
}

fun glfwGetMonitorName(monitor: CValuesRef<GLFWmonitor>?): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge9(monitor?.getPointer(memScope).rawValue))
    }
}

fun glfwSetMonitorCallback(cbfun: GLFWmonitorfun?): GLFWmonitorfun? {
    return interpretCPointer<CFunction<(CPointer<GLFWmonitor>?, Int) -> Unit>>(kniBridge10(cbfun.rawValue))
}

fun glfwGetVideoModes(monitor: CValuesRef<GLFWmonitor>?, count: CValuesRef<IntVar>?): CPointer<GLFWvidmode>? {
    memScoped {
        return interpretCPointer<GLFWvidmode>(kniBridge11(monitor?.getPointer(memScope).rawValue, count?.getPointer(memScope).rawValue))
    }
}

fun glfwGetVideoMode(monitor: CValuesRef<GLFWmonitor>?): CPointer<GLFWvidmode>? {
    memScoped {
        return interpretCPointer<GLFWvidmode>(kniBridge12(monitor?.getPointer(memScope).rawValue))
    }
}

fun glfwSetGamma(monitor: CValuesRef<GLFWmonitor>?, gamma: Float): Unit {
    memScoped {
        return kniBridge13(monitor?.getPointer(memScope).rawValue, gamma)
    }
}

fun glfwGetGammaRamp(monitor: CValuesRef<GLFWmonitor>?): CPointer<GLFWgammaramp>? {
    memScoped {
        return interpretCPointer<GLFWgammaramp>(kniBridge14(monitor?.getPointer(memScope).rawValue))
    }
}

fun glfwSetGammaRamp(monitor: CValuesRef<GLFWmonitor>?, ramp: CValuesRef<GLFWgammaramp>?): Unit {
    memScoped {
        return kniBridge15(monitor?.getPointer(memScope).rawValue, ramp?.getPointer(memScope).rawValue)
    }
}

fun glfwDefaultWindowHints(): Unit {
    return kniBridge16()
}

fun glfwWindowHint(hint: Int, value: Int): Unit {
    return kniBridge17(hint, value)
}

fun glfwCreateWindow(width: Int, height: Int, title: String?, monitor: CValuesRef<GLFWmonitor>?, share: CValuesRef<GLFWwindow>?): CPointer<GLFWwindow>? {
    memScoped {
        return interpretCPointer<GLFWwindow>(kniBridge18(width, height, title?.cstr?.getPointer(memScope).rawValue, monitor?.getPointer(memScope).rawValue, share?.getPointer(memScope).rawValue))
    }
}

fun glfwDestroyWindow(window: CValuesRef<GLFWwindow>?): Unit {
    memScoped {
        return kniBridge19(window?.getPointer(memScope).rawValue)
    }
}

fun glfwWindowShouldClose(window: CValuesRef<GLFWwindow>?): Int {
    memScoped {
        return kniBridge20(window?.getPointer(memScope).rawValue)
    }
}

fun glfwSetWindowShouldClose(window: CValuesRef<GLFWwindow>?, value: Int): Unit {
    memScoped {
        return kniBridge21(window?.getPointer(memScope).rawValue, value)
    }
}

fun glfwSetWindowTitle(window: CValuesRef<GLFWwindow>?, title: String?): Unit {
    memScoped {
        return kniBridge22(window?.getPointer(memScope).rawValue, title?.cstr?.getPointer(memScope).rawValue)
    }
}

fun glfwSetWindowIcon(window: CValuesRef<GLFWwindow>?, count: Int, images: CValuesRef<GLFWimage>?): Unit {
    memScoped {
        return kniBridge23(window?.getPointer(memScope).rawValue, count, images?.getPointer(memScope).rawValue)
    }
}

fun glfwGetWindowPos(window: CValuesRef<GLFWwindow>?, xpos: CValuesRef<IntVar>?, ypos: CValuesRef<IntVar>?): Unit {
    memScoped {
        return kniBridge24(window?.getPointer(memScope).rawValue, xpos?.getPointer(memScope).rawValue, ypos?.getPointer(memScope).rawValue)
    }
}

fun glfwSetWindowPos(window: CValuesRef<GLFWwindow>?, xpos: Int, ypos: Int): Unit {
    memScoped {
        return kniBridge25(window?.getPointer(memScope).rawValue, xpos, ypos)
    }
}

fun glfwGetWindowSize(window: CValuesRef<GLFWwindow>?, width: CValuesRef<IntVar>?, height: CValuesRef<IntVar>?): Unit {
    memScoped {
        return kniBridge26(window?.getPointer(memScope).rawValue, width?.getPointer(memScope).rawValue, height?.getPointer(memScope).rawValue)
    }
}

fun glfwSetWindowSizeLimits(window: CValuesRef<GLFWwindow>?, minwidth: Int, minheight: Int, maxwidth: Int, maxheight: Int): Unit {
    memScoped {
        return kniBridge27(window?.getPointer(memScope).rawValue, minwidth, minheight, maxwidth, maxheight)
    }
}

fun glfwSetWindowAspectRatio(window: CValuesRef<GLFWwindow>?, numer: Int, denom: Int): Unit {
    memScoped {
        return kniBridge28(window?.getPointer(memScope).rawValue, numer, denom)
    }
}

fun glfwSetWindowSize(window: CValuesRef<GLFWwindow>?, width: Int, height: Int): Unit {
    memScoped {
        return kniBridge29(window?.getPointer(memScope).rawValue, width, height)
    }
}

fun glfwGetFramebufferSize(window: CValuesRef<GLFWwindow>?, width: CValuesRef<IntVar>?, height: CValuesRef<IntVar>?): Unit {
    memScoped {
        return kniBridge30(window?.getPointer(memScope).rawValue, width?.getPointer(memScope).rawValue, height?.getPointer(memScope).rawValue)
    }
}

fun glfwGetWindowFrameSize(window: CValuesRef<GLFWwindow>?, left: CValuesRef<IntVar>?, top: CValuesRef<IntVar>?, right: CValuesRef<IntVar>?, bottom: CValuesRef<IntVar>?): Unit {
    memScoped {
        return kniBridge31(window?.getPointer(memScope).rawValue, left?.getPointer(memScope).rawValue, top?.getPointer(memScope).rawValue, right?.getPointer(memScope).rawValue, bottom?.getPointer(memScope).rawValue)
    }
}

fun glfwIconifyWindow(window: CValuesRef<GLFWwindow>?): Unit {
    memScoped {
        return kniBridge32(window?.getPointer(memScope).rawValue)
    }
}

fun glfwRestoreWindow(window: CValuesRef<GLFWwindow>?): Unit {
    memScoped {
        return kniBridge33(window?.getPointer(memScope).rawValue)
    }
}

fun glfwMaximizeWindow(window: CValuesRef<GLFWwindow>?): Unit {
    memScoped {
        return kniBridge34(window?.getPointer(memScope).rawValue)
    }
}

fun glfwShowWindow(window: CValuesRef<GLFWwindow>?): Unit {
    memScoped {
        return kniBridge35(window?.getPointer(memScope).rawValue)
    }
}

fun glfwHideWindow(window: CValuesRef<GLFWwindow>?): Unit {
    memScoped {
        return kniBridge36(window?.getPointer(memScope).rawValue)
    }
}

fun glfwFocusWindow(window: CValuesRef<GLFWwindow>?): Unit {
    memScoped {
        return kniBridge37(window?.getPointer(memScope).rawValue)
    }
}

fun glfwGetWindowMonitor(window: CValuesRef<GLFWwindow>?): CPointer<GLFWmonitor>? {
    memScoped {
        return interpretCPointer<GLFWmonitor>(kniBridge38(window?.getPointer(memScope).rawValue))
    }
}

fun glfwSetWindowMonitor(window: CValuesRef<GLFWwindow>?, monitor: CValuesRef<GLFWmonitor>?, xpos: Int, ypos: Int, width: Int, height: Int, refreshRate: Int): Unit {
    memScoped {
        return kniBridge39(window?.getPointer(memScope).rawValue, monitor?.getPointer(memScope).rawValue, xpos, ypos, width, height, refreshRate)
    }
}

fun glfwGetWindowAttrib(window: CValuesRef<GLFWwindow>?, attrib: Int): Int {
    memScoped {
        return kniBridge40(window?.getPointer(memScope).rawValue, attrib)
    }
}

fun glfwSetWindowUserPointer(window: CValuesRef<GLFWwindow>?, pointer: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge41(window?.getPointer(memScope).rawValue, pointer?.getPointer(memScope).rawValue)
    }
}

fun glfwGetWindowUserPointer(window: CValuesRef<GLFWwindow>?): COpaquePointer? {
    memScoped {
        return interpretCPointer<COpaque>(kniBridge42(window?.getPointer(memScope).rawValue))
    }
}

fun glfwSetWindowPosCallback(window: CValuesRef<GLFWwindow>?, cbfun: GLFWwindowposfun?): GLFWwindowposfun? {
    memScoped {
        return interpretCPointer<CFunction<(CPointer<GLFWwindow>?, Int, Int) -> Unit>>(kniBridge43(window?.getPointer(memScope).rawValue, cbfun.rawValue))
    }
}

fun glfwSetWindowSizeCallback(window: CValuesRef<GLFWwindow>?, cbfun: GLFWwindowsizefun?): GLFWwindowsizefun? {
    memScoped {
        return interpretCPointer<CFunction<(CPointer<GLFWwindow>?, Int, Int) -> Unit>>(kniBridge44(window?.getPointer(memScope).rawValue, cbfun.rawValue))
    }
}

fun glfwSetWindowCloseCallback(window: CValuesRef<GLFWwindow>?, cbfun: GLFWwindowclosefun?): GLFWwindowclosefun? {
    memScoped {
        return interpretCPointer<CFunction<(CPointer<GLFWwindow>?) -> Unit>>(kniBridge45(window?.getPointer(memScope).rawValue, cbfun.rawValue))
    }
}

fun glfwSetWindowRefreshCallback(window: CValuesRef<GLFWwindow>?, cbfun: GLFWwindowrefreshfun?): GLFWwindowrefreshfun? {
    memScoped {
        return interpretCPointer<CFunction<(CPointer<GLFWwindow>?) -> Unit>>(kniBridge46(window?.getPointer(memScope).rawValue, cbfun.rawValue))
    }
}

fun glfwSetWindowFocusCallback(window: CValuesRef<GLFWwindow>?, cbfun: GLFWwindowfocusfun?): GLFWwindowfocusfun? {
    memScoped {
        return interpretCPointer<CFunction<(CPointer<GLFWwindow>?, Int) -> Unit>>(kniBridge47(window?.getPointer(memScope).rawValue, cbfun.rawValue))
    }
}

fun glfwSetWindowIconifyCallback(window: CValuesRef<GLFWwindow>?, cbfun: GLFWwindowiconifyfun?): GLFWwindowiconifyfun? {
    memScoped {
        return interpretCPointer<CFunction<(CPointer<GLFWwindow>?, Int) -> Unit>>(kniBridge48(window?.getPointer(memScope).rawValue, cbfun.rawValue))
    }
}

fun glfwSetFramebufferSizeCallback(window: CValuesRef<GLFWwindow>?, cbfun: GLFWframebuffersizefun?): GLFWframebuffersizefun? {
    memScoped {
        return interpretCPointer<CFunction<(CPointer<GLFWwindow>?, Int, Int) -> Unit>>(kniBridge49(window?.getPointer(memScope).rawValue, cbfun.rawValue))
    }
}

fun glfwPollEvents(): Unit {
    return kniBridge50()
}

fun glfwWaitEvents(): Unit {
    return kniBridge51()
}

fun glfwWaitEventsTimeout(timeout: Double): Unit {
    return kniBridge52(timeout)
}

fun glfwPostEmptyEvent(): Unit {
    return kniBridge53()
}

fun glfwGetInputMode(window: CValuesRef<GLFWwindow>?, mode: Int): Int {
    memScoped {
        return kniBridge54(window?.getPointer(memScope).rawValue, mode)
    }
}

fun glfwSetInputMode(window: CValuesRef<GLFWwindow>?, mode: Int, value: Int): Unit {
    memScoped {
        return kniBridge55(window?.getPointer(memScope).rawValue, mode, value)
    }
}

fun glfwGetKeyName(key: Int, scancode: Int): CPointer<ByteVar>? {
    return interpretCPointer<ByteVar>(kniBridge56(key, scancode))
}

fun glfwGetKey(window: CValuesRef<GLFWwindow>?, key: Int): Int {
    memScoped {
        return kniBridge57(window?.getPointer(memScope).rawValue, key)
    }
}

fun glfwGetMouseButton(window: CValuesRef<GLFWwindow>?, button: Int): Int {
    memScoped {
        return kniBridge58(window?.getPointer(memScope).rawValue, button)
    }
}

fun glfwGetCursorPos(window: CValuesRef<GLFWwindow>?, xpos: CValuesRef<DoubleVar>?, ypos: CValuesRef<DoubleVar>?): Unit {
    memScoped {
        return kniBridge59(window?.getPointer(memScope).rawValue, xpos?.getPointer(memScope).rawValue, ypos?.getPointer(memScope).rawValue)
    }
}

fun glfwSetCursorPos(window: CValuesRef<GLFWwindow>?, xpos: Double, ypos: Double): Unit {
    memScoped {
        return kniBridge60(window?.getPointer(memScope).rawValue, xpos, ypos)
    }
}

fun glfwCreateCursor(image: CValuesRef<GLFWimage>?, xhot: Int, yhot: Int): CPointer<GLFWcursor>? {
    memScoped {
        return interpretCPointer<GLFWcursor>(kniBridge61(image?.getPointer(memScope).rawValue, xhot, yhot))
    }
}

fun glfwCreateStandardCursor(shape: Int): CPointer<GLFWcursor>? {
    return interpretCPointer<GLFWcursor>(kniBridge62(shape))
}

fun glfwDestroyCursor(cursor: CValuesRef<GLFWcursor>?): Unit {
    memScoped {
        return kniBridge63(cursor?.getPointer(memScope).rawValue)
    }
}

fun glfwSetCursor(window: CValuesRef<GLFWwindow>?, cursor: CValuesRef<GLFWcursor>?): Unit {
    memScoped {
        return kniBridge64(window?.getPointer(memScope).rawValue, cursor?.getPointer(memScope).rawValue)
    }
}

fun glfwSetKeyCallback(window: CValuesRef<GLFWwindow>?, cbfun: GLFWkeyfun?): GLFWkeyfun? {
    memScoped {
        return interpretCPointer<CFunction<(CPointer<GLFWwindow>?, Int, Int, Int, Int) -> Unit>>(kniBridge65(window?.getPointer(memScope).rawValue, cbfun.rawValue))
    }
}

fun glfwSetCharCallback(window: CValuesRef<GLFWwindow>?, cbfun: GLFWcharfun?): GLFWcharfun? {
    memScoped {
        return interpretCPointer<CFunction<(CPointer<GLFWwindow>?, UInt) -> Unit>>(kniBridge66(window?.getPointer(memScope).rawValue, cbfun.rawValue))
    }
}

fun glfwSetCharModsCallback(window: CValuesRef<GLFWwindow>?, cbfun: GLFWcharmodsfun?): GLFWcharmodsfun? {
    memScoped {
        return interpretCPointer<CFunction<(CPointer<GLFWwindow>?, UInt, Int) -> Unit>>(kniBridge67(window?.getPointer(memScope).rawValue, cbfun.rawValue))
    }
}

fun glfwSetMouseButtonCallback(window: CValuesRef<GLFWwindow>?, cbfun: GLFWmousebuttonfun?): GLFWmousebuttonfun? {
    memScoped {
        return interpretCPointer<CFunction<(CPointer<GLFWwindow>?, Int, Int, Int) -> Unit>>(kniBridge68(window?.getPointer(memScope).rawValue, cbfun.rawValue))
    }
}

fun glfwSetCursorPosCallback(window: CValuesRef<GLFWwindow>?, cbfun: GLFWcursorposfun?): GLFWcursorposfun? {
    memScoped {
        return interpretCPointer<CFunction<(CPointer<GLFWwindow>?, Double, Double) -> Unit>>(kniBridge69(window?.getPointer(memScope).rawValue, cbfun.rawValue))
    }
}

fun glfwSetCursorEnterCallback(window: CValuesRef<GLFWwindow>?, cbfun: GLFWcursorenterfun?): GLFWcursorenterfun? {
    memScoped {
        return interpretCPointer<CFunction<(CPointer<GLFWwindow>?, Int) -> Unit>>(kniBridge70(window?.getPointer(memScope).rawValue, cbfun.rawValue))
    }
}

fun glfwSetScrollCallback(window: CValuesRef<GLFWwindow>?, cbfun: GLFWscrollfun?): GLFWscrollfun? {
    memScoped {
        return interpretCPointer<CFunction<(CPointer<GLFWwindow>?, Double, Double) -> Unit>>(kniBridge71(window?.getPointer(memScope).rawValue, cbfun.rawValue))
    }
}

fun glfwSetDropCallback(window: CValuesRef<GLFWwindow>?, cbfun: GLFWdropfun?): GLFWdropfun? {
    memScoped {
        return interpretCPointer<CFunction<(CPointer<GLFWwindow>?, Int, CPointer<CPointerVar<ByteVar>>?) -> Unit>>(kniBridge72(window?.getPointer(memScope).rawValue, cbfun.rawValue))
    }
}

fun glfwJoystickPresent(joy: Int): Int {
    return kniBridge73(joy)
}

fun glfwGetJoystickAxes(joy: Int, count: CValuesRef<IntVar>?): CPointer<FloatVar>? {
    memScoped {
        return interpretCPointer<FloatVar>(kniBridge74(joy, count?.getPointer(memScope).rawValue))
    }
}

fun glfwGetJoystickButtons(joy: Int, count: CValuesRef<IntVar>?): CPointer<UByteVar>? {
    memScoped {
        return interpretCPointer<UByteVar>(kniBridge75(joy, count?.getPointer(memScope).rawValue))
    }
}

fun glfwGetJoystickName(joy: Int): CPointer<ByteVar>? {
    return interpretCPointer<ByteVar>(kniBridge76(joy))
}

fun glfwSetJoystickCallback(cbfun: GLFWjoystickfun?): GLFWjoystickfun? {
    return interpretCPointer<CFunction<(Int, Int) -> Unit>>(kniBridge77(cbfun.rawValue))
}

fun glfwSetClipboardString(window: CValuesRef<GLFWwindow>?, string: String?): Unit {
    memScoped {
        return kniBridge78(window?.getPointer(memScope).rawValue, string?.cstr?.getPointer(memScope).rawValue)
    }
}

fun glfwGetClipboardString(window: CValuesRef<GLFWwindow>?): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge79(window?.getPointer(memScope).rawValue))
    }
}

fun glfwGetTime(): Double {
    return kniBridge80()
}

fun glfwSetTime(time: Double): Unit {
    return kniBridge81(time)
}

fun glfwGetTimerValue(): uint64_t {
    return kniBridge82()
}

fun glfwGetTimerFrequency(): uint64_t {
    return kniBridge83()
}

fun glfwMakeContextCurrent(window: CValuesRef<GLFWwindow>?): Unit {
    memScoped {
        return kniBridge84(window?.getPointer(memScope).rawValue)
    }
}

fun glfwGetCurrentContext(): CPointer<GLFWwindow>? {
    return interpretCPointer<GLFWwindow>(kniBridge85())
}

fun glfwSwapBuffers(window: CValuesRef<GLFWwindow>?): Unit {
    memScoped {
        return kniBridge86(window?.getPointer(memScope).rawValue)
    }
}

fun glfwSwapInterval(interval: Int): Unit {
    return kniBridge87(interval)
}

fun glfwExtensionSupported(extension: String?): Int {
    memScoped {
        return kniBridge88(extension?.cstr?.getPointer(memScope).rawValue)
    }
}

fun glfwGetProcAddress(procname: String?): GLFWglproc? {
    memScoped {
        return interpretCPointer<CFunction<() -> Unit>>(kniBridge89(procname?.cstr?.getPointer(memScope).rawValue))
    }
}

fun glfwVulkanSupported(): Int {
    return kniBridge90()
}

fun glfwGetRequiredInstanceExtensions(count: CValuesRef<uint32_tVar>?): CPointer<CPointerVar<ByteVar>>? {
    memScoped {
        return interpretCPointer<CPointerVar<ByteVar>>(kniBridge91(count?.getPointer(memScope).rawValue))
    }
}

const val __DARWIN_ONLY_64_BIT_INO_T: Int = 0

const val __DARWIN_ONLY_VERS_1050: Int = 0

const val __DARWIN_ONLY_UNIX_CONFORMANCE: Int = 1

const val __DARWIN_UNIX03: Int = 1

const val __DARWIN_64_BIT_INO_T: Int = 1

const val __DARWIN_VERS_1050: Int = 1

const val __DARWIN_NON_CANCELABLE: Int = 0

val __DARWIN_SUF_64_BIT_INO_T: String get() = "\$INODE64"

val __DARWIN_SUF_1050: String get() = "\$1050"

val __DARWIN_SUF_EXTSN: String get() = "\$DARWIN_EXTSN"

const val __DARWIN_C_ANSI: Long = 4096

const val __DARWIN_C_FULL: Long = 900000

const val __DARWIN_C_LEVEL: Long = 900000

const val __STDC_WANT_LIB_EXT1__: Int = 1

const val __DARWIN_NO_LONG_LONG: Int = 0

const val _DARWIN_FEATURE_64_BIT_INODE: Int = 1

const val _DARWIN_FEATURE_ONLY_UNIX_CONFORMANCE: Int = 1

const val _DARWIN_FEATURE_UNIX_CONFORMANCE: Int = 3

const val __PTHREAD_SIZE__: Int = 8176

const val __PTHREAD_ATTR_SIZE__: Int = 56

const val __PTHREAD_MUTEXATTR_SIZE__: Int = 8

const val __PTHREAD_MUTEX_SIZE__: Int = 56

const val __PTHREAD_CONDATTR_SIZE__: Int = 8

const val __PTHREAD_COND_SIZE__: Int = 40

const val __PTHREAD_ONCE_SIZE__: Int = 8

const val __PTHREAD_RWLOCK_SIZE__: Int = 192

const val __PTHREAD_RWLOCKATTR_SIZE__: Int = 16

const val __DARWIN_WCHAR_MAX: Int = 2147483647

const val __DARWIN_WCHAR_MIN: Int = -2147483648

const val __DARWIN_WEOF: __darwin_wint_t = -1

const val _FORTIFY_SOURCE: Int = 2

const val USER_ADDR_NULL: user_addr_t = 0u

const val __WORDSIZE: Int = 64

const val INT8_MAX: Int = 127

const val INT16_MAX: Int = 32767

const val INT32_MAX: Int = 2147483647

const val INT64_MAX: Long = 9223372036854775807

const val INT8_MIN: Int = -128

const val INT16_MIN: Int = -32768

const val INT32_MIN: Int = -2147483648

const val INT64_MIN: Long = -9223372036854775807 - 1

const val UINT8_MAX: Int = 255

const val UINT16_MAX: Int = 65535

const val UINT32_MAX: UInt = 4294967295u

const val UINT64_MAX: ULong = 18446744073709551615u

const val INT_LEAST8_MIN: Int = -128

const val INT_LEAST16_MIN: Int = -32768

const val INT_LEAST32_MIN: Int = -2147483648

const val INT_LEAST64_MIN: Long = -9223372036854775807 - 1

const val INT_LEAST8_MAX: Int = 127

const val INT_LEAST16_MAX: Int = 32767

const val INT_LEAST32_MAX: Int = 2147483647

const val INT_LEAST64_MAX: Long = 9223372036854775807

const val UINT_LEAST8_MAX: Int = 255

const val UINT_LEAST16_MAX: Int = 65535

const val UINT_LEAST32_MAX: UInt = 4294967295u

const val UINT_LEAST64_MAX: ULong = 18446744073709551615u

const val INT_FAST8_MIN: Int = -128

const val INT_FAST16_MIN: Int = -32768

const val INT_FAST32_MIN: Int = -2147483648

const val INT_FAST64_MIN: Long = -9223372036854775807 - 1

const val INT_FAST8_MAX: Int = 127

const val INT_FAST16_MAX: Int = 32767

const val INT_FAST32_MAX: Int = 2147483647

const val INT_FAST64_MAX: Long = 9223372036854775807

const val UINT_FAST8_MAX: Int = 255

const val UINT_FAST16_MAX: Int = 65535

const val UINT_FAST32_MAX: UInt = 4294967295u

const val UINT_FAST64_MAX: ULong = 18446744073709551615u

const val INTPTR_MAX: Long = 9223372036854775807

const val INTPTR_MIN: Long = -9223372036854775807 - 1

const val UINTPTR_MAX: ULong = 18446744073709551615u

const val INTMAX_MIN: Long = -9223372036854775807 - 1

const val INTMAX_MAX: Long = 9223372036854775807

const val UINTMAX_MAX: ULong = 18446744073709551615u

const val PTRDIFF_MIN: Long = -9223372036854775807 - 1

const val PTRDIFF_MAX: Long = 9223372036854775807

const val SIZE_MAX: ULong = 18446744073709551615u

const val RSIZE_MAX: ULong = 9223372036854775807u

const val WCHAR_MAX: Int = 2147483647

const val WCHAR_MIN: Int = -2147483648

const val WINT_MIN: Int = -2147483648

const val WINT_MAX: Int = 2147483647

const val SIG_ATOMIC_MIN: Int = -2147483648

const val SIG_ATOMIC_MAX: Int = 2147483647

const val __MAC_OS_X_VERSION_MIN_REQUIRED: Int = 101100

const val GLFW_VERSION_MAJOR: Int = 3

const val GLFW_VERSION_MINOR: Int = 2

const val GLFW_VERSION_REVISION: Int = 1

const val GLFW_TRUE: Int = 1

const val GLFW_FALSE: Int = 0

const val GLFW_RELEASE: Int = 0

const val GLFW_PRESS: Int = 1

const val GLFW_REPEAT: Int = 2

const val GLFW_KEY_UNKNOWN: Int = -1

const val GLFW_KEY_SPACE: Int = 32

const val GLFW_KEY_APOSTROPHE: Int = 39

const val GLFW_KEY_COMMA: Int = 44

const val GLFW_KEY_MINUS: Int = 45

const val GLFW_KEY_PERIOD: Int = 46

const val GLFW_KEY_SLASH: Int = 47

const val GLFW_KEY_0: Int = 48

const val GLFW_KEY_1: Int = 49

const val GLFW_KEY_2: Int = 50

const val GLFW_KEY_3: Int = 51

const val GLFW_KEY_4: Int = 52

const val GLFW_KEY_5: Int = 53

const val GLFW_KEY_6: Int = 54

const val GLFW_KEY_7: Int = 55

const val GLFW_KEY_8: Int = 56

const val GLFW_KEY_9: Int = 57

const val GLFW_KEY_SEMICOLON: Int = 59

const val GLFW_KEY_EQUAL: Int = 61

const val GLFW_KEY_A: Int = 65

const val GLFW_KEY_B: Int = 66

const val GLFW_KEY_C: Int = 67

const val GLFW_KEY_D: Int = 68

const val GLFW_KEY_E: Int = 69

const val GLFW_KEY_F: Int = 70

const val GLFW_KEY_G: Int = 71

const val GLFW_KEY_H: Int = 72

const val GLFW_KEY_I: Int = 73

const val GLFW_KEY_J: Int = 74

const val GLFW_KEY_K: Int = 75

const val GLFW_KEY_L: Int = 76

const val GLFW_KEY_M: Int = 77

const val GLFW_KEY_N: Int = 78

const val GLFW_KEY_O: Int = 79

const val GLFW_KEY_P: Int = 80

const val GLFW_KEY_Q: Int = 81

const val GLFW_KEY_R: Int = 82

const val GLFW_KEY_S: Int = 83

const val GLFW_KEY_T: Int = 84

const val GLFW_KEY_U: Int = 85

const val GLFW_KEY_V: Int = 86

const val GLFW_KEY_W: Int = 87

const val GLFW_KEY_X: Int = 88

const val GLFW_KEY_Y: Int = 89

const val GLFW_KEY_Z: Int = 90

const val GLFW_KEY_LEFT_BRACKET: Int = 91

const val GLFW_KEY_BACKSLASH: Int = 92

const val GLFW_KEY_RIGHT_BRACKET: Int = 93

const val GLFW_KEY_GRAVE_ACCENT: Int = 96

const val GLFW_KEY_WORLD_1: Int = 161

const val GLFW_KEY_WORLD_2: Int = 162

const val GLFW_KEY_ESCAPE: Int = 256

const val GLFW_KEY_ENTER: Int = 257

const val GLFW_KEY_TAB: Int = 258

const val GLFW_KEY_BACKSPACE: Int = 259

const val GLFW_KEY_INSERT: Int = 260

const val GLFW_KEY_DELETE: Int = 261

const val GLFW_KEY_RIGHT: Int = 262

const val GLFW_KEY_LEFT: Int = 263

const val GLFW_KEY_DOWN: Int = 264

const val GLFW_KEY_UP: Int = 265

const val GLFW_KEY_PAGE_UP: Int = 266

const val GLFW_KEY_PAGE_DOWN: Int = 267

const val GLFW_KEY_HOME: Int = 268

const val GLFW_KEY_END: Int = 269

const val GLFW_KEY_CAPS_LOCK: Int = 280

const val GLFW_KEY_SCROLL_LOCK: Int = 281

const val GLFW_KEY_NUM_LOCK: Int = 282

const val GLFW_KEY_PRINT_SCREEN: Int = 283

const val GLFW_KEY_PAUSE: Int = 284

const val GLFW_KEY_F1: Int = 290

const val GLFW_KEY_F2: Int = 291

const val GLFW_KEY_F3: Int = 292

const val GLFW_KEY_F4: Int = 293

const val GLFW_KEY_F5: Int = 294

const val GLFW_KEY_F6: Int = 295

const val GLFW_KEY_F7: Int = 296

const val GLFW_KEY_F8: Int = 297

const val GLFW_KEY_F9: Int = 298

const val GLFW_KEY_F10: Int = 299

const val GLFW_KEY_F11: Int = 300

const val GLFW_KEY_F12: Int = 301

const val GLFW_KEY_F13: Int = 302

const val GLFW_KEY_F14: Int = 303

const val GLFW_KEY_F15: Int = 304

const val GLFW_KEY_F16: Int = 305

const val GLFW_KEY_F17: Int = 306

const val GLFW_KEY_F18: Int = 307

const val GLFW_KEY_F19: Int = 308

const val GLFW_KEY_F20: Int = 309

const val GLFW_KEY_F21: Int = 310

const val GLFW_KEY_F22: Int = 311

const val GLFW_KEY_F23: Int = 312

const val GLFW_KEY_F24: Int = 313

const val GLFW_KEY_F25: Int = 314

const val GLFW_KEY_KP_0: Int = 320

const val GLFW_KEY_KP_1: Int = 321

const val GLFW_KEY_KP_2: Int = 322

const val GLFW_KEY_KP_3: Int = 323

const val GLFW_KEY_KP_4: Int = 324

const val GLFW_KEY_KP_5: Int = 325

const val GLFW_KEY_KP_6: Int = 326

const val GLFW_KEY_KP_7: Int = 327

const val GLFW_KEY_KP_8: Int = 328

const val GLFW_KEY_KP_9: Int = 329

const val GLFW_KEY_KP_DECIMAL: Int = 330

const val GLFW_KEY_KP_DIVIDE: Int = 331

const val GLFW_KEY_KP_MULTIPLY: Int = 332

const val GLFW_KEY_KP_SUBTRACT: Int = 333

const val GLFW_KEY_KP_ADD: Int = 334

const val GLFW_KEY_KP_ENTER: Int = 335

const val GLFW_KEY_KP_EQUAL: Int = 336

const val GLFW_KEY_LEFT_SHIFT: Int = 340

const val GLFW_KEY_LEFT_CONTROL: Int = 341

const val GLFW_KEY_LEFT_ALT: Int = 342

const val GLFW_KEY_LEFT_SUPER: Int = 343

const val GLFW_KEY_RIGHT_SHIFT: Int = 344

const val GLFW_KEY_RIGHT_CONTROL: Int = 345

const val GLFW_KEY_RIGHT_ALT: Int = 346

const val GLFW_KEY_RIGHT_SUPER: Int = 347

const val GLFW_KEY_MENU: Int = 348

const val GLFW_KEY_LAST: Int = 348

const val GLFW_MOD_SHIFT: Int = 1

const val GLFW_MOD_CONTROL: Int = 2

const val GLFW_MOD_ALT: Int = 4

const val GLFW_MOD_SUPER: Int = 8

const val GLFW_MOUSE_BUTTON_1: Int = 0

const val GLFW_MOUSE_BUTTON_2: Int = 1

const val GLFW_MOUSE_BUTTON_3: Int = 2

const val GLFW_MOUSE_BUTTON_4: Int = 3

const val GLFW_MOUSE_BUTTON_5: Int = 4

const val GLFW_MOUSE_BUTTON_6: Int = 5

const val GLFW_MOUSE_BUTTON_7: Int = 6

const val GLFW_MOUSE_BUTTON_8: Int = 7

const val GLFW_MOUSE_BUTTON_LAST: Int = 7

const val GLFW_MOUSE_BUTTON_LEFT: Int = 0

const val GLFW_MOUSE_BUTTON_RIGHT: Int = 1

const val GLFW_MOUSE_BUTTON_MIDDLE: Int = 2

const val GLFW_JOYSTICK_1: Int = 0

const val GLFW_JOYSTICK_2: Int = 1

const val GLFW_JOYSTICK_3: Int = 2

const val GLFW_JOYSTICK_4: Int = 3

const val GLFW_JOYSTICK_5: Int = 4

const val GLFW_JOYSTICK_6: Int = 5

const val GLFW_JOYSTICK_7: Int = 6

const val GLFW_JOYSTICK_8: Int = 7

const val GLFW_JOYSTICK_9: Int = 8

const val GLFW_JOYSTICK_10: Int = 9

const val GLFW_JOYSTICK_11: Int = 10

const val GLFW_JOYSTICK_12: Int = 11

const val GLFW_JOYSTICK_13: Int = 12

const val GLFW_JOYSTICK_14: Int = 13

const val GLFW_JOYSTICK_15: Int = 14

const val GLFW_JOYSTICK_16: Int = 15

const val GLFW_JOYSTICK_LAST: Int = 15

const val GLFW_NOT_INITIALIZED: Int = 65537

const val GLFW_NO_CURRENT_CONTEXT: Int = 65538

const val GLFW_INVALID_ENUM: Int = 65539

const val GLFW_INVALID_VALUE: Int = 65540

const val GLFW_OUT_OF_MEMORY: Int = 65541

const val GLFW_API_UNAVAILABLE: Int = 65542

const val GLFW_VERSION_UNAVAILABLE: Int = 65543

const val GLFW_PLATFORM_ERROR: Int = 65544

const val GLFW_FORMAT_UNAVAILABLE: Int = 65545

const val GLFW_NO_WINDOW_CONTEXT: Int = 65546

const val GLFW_FOCUSED: Int = 131073

const val GLFW_ICONIFIED: Int = 131074

const val GLFW_RESIZABLE: Int = 131075

const val GLFW_VISIBLE: Int = 131076

const val GLFW_DECORATED: Int = 131077

const val GLFW_AUTO_ICONIFY: Int = 131078

const val GLFW_FLOATING: Int = 131079

const val GLFW_MAXIMIZED: Int = 131080

const val GLFW_RED_BITS: Int = 135169

const val GLFW_GREEN_BITS: Int = 135170

const val GLFW_BLUE_BITS: Int = 135171

const val GLFW_ALPHA_BITS: Int = 135172

const val GLFW_DEPTH_BITS: Int = 135173

const val GLFW_STENCIL_BITS: Int = 135174

const val GLFW_ACCUM_RED_BITS: Int = 135175

const val GLFW_ACCUM_GREEN_BITS: Int = 135176

const val GLFW_ACCUM_BLUE_BITS: Int = 135177

const val GLFW_ACCUM_ALPHA_BITS: Int = 135178

const val GLFW_AUX_BUFFERS: Int = 135179

const val GLFW_STEREO: Int = 135180

const val GLFW_SAMPLES: Int = 135181

const val GLFW_SRGB_CAPABLE: Int = 135182

const val GLFW_REFRESH_RATE: Int = 135183

const val GLFW_DOUBLEBUFFER: Int = 135184

const val GLFW_CLIENT_API: Int = 139265

const val GLFW_CONTEXT_VERSION_MAJOR: Int = 139266

const val GLFW_CONTEXT_VERSION_MINOR: Int = 139267

const val GLFW_CONTEXT_REVISION: Int = 139268

const val GLFW_CONTEXT_ROBUSTNESS: Int = 139269

const val GLFW_OPENGL_FORWARD_COMPAT: Int = 139270

const val GLFW_OPENGL_DEBUG_CONTEXT: Int = 139271

const val GLFW_OPENGL_PROFILE: Int = 139272

const val GLFW_CONTEXT_RELEASE_BEHAVIOR: Int = 139273

const val GLFW_CONTEXT_NO_ERROR: Int = 139274

const val GLFW_CONTEXT_CREATION_API: Int = 139275

const val GLFW_NO_API: Int = 0

const val GLFW_OPENGL_API: Int = 196609

const val GLFW_OPENGL_ES_API: Int = 196610

const val GLFW_NO_ROBUSTNESS: Int = 0

const val GLFW_NO_RESET_NOTIFICATION: Int = 200705

const val GLFW_LOSE_CONTEXT_ON_RESET: Int = 200706

const val GLFW_OPENGL_ANY_PROFILE: Int = 0

const val GLFW_OPENGL_CORE_PROFILE: Int = 204801

const val GLFW_OPENGL_COMPAT_PROFILE: Int = 204802

const val GLFW_CURSOR: Int = 208897

const val GLFW_STICKY_KEYS: Int = 208898

const val GLFW_STICKY_MOUSE_BUTTONS: Int = 208899

const val GLFW_CURSOR_NORMAL: Int = 212993

const val GLFW_CURSOR_HIDDEN: Int = 212994

const val GLFW_CURSOR_DISABLED: Int = 212995

const val GLFW_ANY_RELEASE_BEHAVIOR: Int = 0

const val GLFW_RELEASE_BEHAVIOR_FLUSH: Int = 217089

const val GLFW_RELEASE_BEHAVIOR_NONE: Int = 217090

const val GLFW_NATIVE_CONTEXT_API: Int = 221185

const val GLFW_EGL_CONTEXT_API: Int = 221186

const val GLFW_ARROW_CURSOR: Int = 221185

const val GLFW_IBEAM_CURSOR: Int = 221186

const val GLFW_CROSSHAIR_CURSOR: Int = 221187

const val GLFW_HAND_CURSOR: Int = 221188

const val GLFW_HRESIZE_CURSOR: Int = 221189

const val GLFW_VRESIZE_CURSOR: Int = 221190

const val GLFW_CONNECTED: Int = 262145

const val GLFW_DISCONNECTED: Int = 262146

const val GLFW_DONT_CARE: Int = -1

val __DARWIN_NULL: COpaquePointer?
    get() = interpretCPointer<COpaque>(kniBridge92())

val NULL: COpaquePointer?
    get() = interpretCPointer<COpaque>(kniBridge93())

class __mbstate_t(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(128, 8)
    
    val __mbstate8: CArrayPointer<ByteVar>
        get() = arrayMemberAt(0)
    
    var _mbstateL: Long
        get() = memberAt<LongVar>(0).value
        set(value) { memberAt<LongVar>(0).value = value }
    
}

class __darwin_pthread_handler_rec(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(24, 8)
    
    var __routine: CPointer<CFunction<(COpaquePointer?) -> Unit>>?
        get() = memberAt<CPointerVar<CFunction<(COpaquePointer?) -> Unit>>>(0).value
        set(value) { memberAt<CPointerVar<CFunction<(COpaquePointer?) -> Unit>>>(0).value = value }
    
    var __arg: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(8).value
        set(value) { memberAt<COpaquePointerVar>(8).value = value }
    
    var __next: CPointer<__darwin_pthread_handler_rec>?
        get() = memberAt<CPointerVar<__darwin_pthread_handler_rec>>(16).value
        set(value) { memberAt<CPointerVar<__darwin_pthread_handler_rec>>(16).value = value }
    
}

class _opaque_pthread_attr_t(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(64, 8)
    
    var __sig: Long
        get() = memberAt<LongVar>(0).value
        set(value) { memberAt<LongVar>(0).value = value }
    
    val __opaque: CArrayPointer<ByteVar>
        get() = arrayMemberAt(8)
    
}

class _opaque_pthread_cond_t(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(48, 8)
    
    var __sig: Long
        get() = memberAt<LongVar>(0).value
        set(value) { memberAt<LongVar>(0).value = value }
    
    val __opaque: CArrayPointer<ByteVar>
        get() = arrayMemberAt(8)
    
}

class _opaque_pthread_condattr_t(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(16, 8)
    
    var __sig: Long
        get() = memberAt<LongVar>(0).value
        set(value) { memberAt<LongVar>(0).value = value }
    
    val __opaque: CArrayPointer<ByteVar>
        get() = arrayMemberAt(8)
    
}

class _opaque_pthread_mutex_t(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(64, 8)
    
    var __sig: Long
        get() = memberAt<LongVar>(0).value
        set(value) { memberAt<LongVar>(0).value = value }
    
    val __opaque: CArrayPointer<ByteVar>
        get() = arrayMemberAt(8)
    
}

class _opaque_pthread_mutexattr_t(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(16, 8)
    
    var __sig: Long
        get() = memberAt<LongVar>(0).value
        set(value) { memberAt<LongVar>(0).value = value }
    
    val __opaque: CArrayPointer<ByteVar>
        get() = arrayMemberAt(8)
    
}

class _opaque_pthread_once_t(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(16, 8)
    
    var __sig: Long
        get() = memberAt<LongVar>(0).value
        set(value) { memberAt<LongVar>(0).value = value }
    
    val __opaque: CArrayPointer<ByteVar>
        get() = arrayMemberAt(8)
    
}

class _opaque_pthread_rwlock_t(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(200, 8)
    
    var __sig: Long
        get() = memberAt<LongVar>(0).value
        set(value) { memberAt<LongVar>(0).value = value }
    
    val __opaque: CArrayPointer<ByteVar>
        get() = arrayMemberAt(8)
    
}

class _opaque_pthread_rwlockattr_t(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(24, 8)
    
    var __sig: Long
        get() = memberAt<LongVar>(0).value
        set(value) { memberAt<LongVar>(0).value = value }
    
    val __opaque: CArrayPointer<ByteVar>
        get() = arrayMemberAt(8)
    
}

class _opaque_pthread_t(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(8192, 8)
    
    var __sig: Long
        get() = memberAt<LongVar>(0).value
        set(value) { memberAt<LongVar>(0).value = value }
    
    var __cleanup_stack: CPointer<__darwin_pthread_handler_rec>?
        get() = memberAt<CPointerVar<__darwin_pthread_handler_rec>>(8).value
        set(value) { memberAt<CPointerVar<__darwin_pthread_handler_rec>>(8).value = value }
    
    val __opaque: CArrayPointer<ByteVar>
        get() = arrayMemberAt(16)
    
}




class GLFWvidmode(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(24, 4)
    
    var width: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var height: Int
        get() = memberAt<IntVar>(4).value
        set(value) { memberAt<IntVar>(4).value = value }
    
    var redBits: Int
        get() = memberAt<IntVar>(8).value
        set(value) { memberAt<IntVar>(8).value = value }
    
    var greenBits: Int
        get() = memberAt<IntVar>(12).value
        set(value) { memberAt<IntVar>(12).value = value }
    
    var blueBits: Int
        get() = memberAt<IntVar>(16).value
        set(value) { memberAt<IntVar>(16).value = value }
    
    var refreshRate: Int
        get() = memberAt<IntVar>(20).value
        set(value) { memberAt<IntVar>(20).value = value }
    
}

class GLFWgammaramp(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(32, 8)
    
    var red: CPointer<UShortVar>?
        get() = memberAt<CPointerVar<UShortVar>>(0).value
        set(value) { memberAt<CPointerVar<UShortVar>>(0).value = value }
    
    var green: CPointer<UShortVar>?
        get() = memberAt<CPointerVar<UShortVar>>(8).value
        set(value) { memberAt<CPointerVar<UShortVar>>(8).value = value }
    
    var blue: CPointer<UShortVar>?
        get() = memberAt<CPointerVar<UShortVar>>(16).value
        set(value) { memberAt<CPointerVar<UShortVar>>(16).value = value }
    
    var size: UInt
        get() = memberAt<UIntVar>(24).value
        set(value) { memberAt<UIntVar>(24).value = value }
    
}

class GLFWimage(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(16, 8)
    
    var width: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var height: Int
        get() = memberAt<IntVar>(4).value
        set(value) { memberAt<IntVar>(4).value = value }
    
    var pixels: CPointer<UByteVar>?
        get() = memberAt<CPointerVar<UByteVar>>(8).value
        set(value) { memberAt<CPointerVar<UByteVar>>(8).value = value }
    
}

typealias __int8_tVar = ByteVarOf<__int8_t>
typealias __int8_t = Byte

typealias __uint8_tVar = UByteVarOf<__uint8_t>
typealias __uint8_t = UByte

typealias __int16_tVar = ShortVarOf<__int16_t>
typealias __int16_t = Short

typealias __uint16_tVar = UShortVarOf<__uint16_t>
typealias __uint16_t = UShort

typealias __int32_tVar = IntVarOf<__int32_t>
typealias __int32_t = Int

typealias __uint32_tVar = UIntVarOf<__uint32_t>
typealias __uint32_t = UInt

typealias __int64_tVar = LongVarOf<__int64_t>
typealias __int64_t = Long

typealias __uint64_tVar = ULongVarOf<__uint64_t>
typealias __uint64_t = ULong

typealias __darwin_intptr_tVar = LongVarOf<__darwin_intptr_t>
typealias __darwin_intptr_t = Long

typealias __darwin_natural_tVar = UIntVarOf<__darwin_natural_t>
typealias __darwin_natural_t = UInt

typealias __darwin_ct_rune_tVar = IntVarOf<__darwin_ct_rune_t>
typealias __darwin_ct_rune_t = Int

typealias __darwin_mbstate_t = __mbstate_t

typealias __darwin_ptrdiff_tVar = LongVarOf<__darwin_ptrdiff_t>
typealias __darwin_ptrdiff_t = Long

typealias __darwin_size_tVar = ULongVarOf<__darwin_size_t>
typealias __darwin_size_t = ULong

typealias __darwin_va_listVar = CPointerVarOf<__darwin_va_list>
typealias __darwin_va_list = __builtin_va_list

typealias __darwin_wchar_tVar = IntVarOf<__darwin_wchar_t>
typealias __darwin_wchar_t = Int

typealias __darwin_rune_tVar = IntVarOf<__darwin_rune_t>
typealias __darwin_rune_t = __darwin_wchar_t

typealias __darwin_wint_tVar = IntVarOf<__darwin_wint_t>
typealias __darwin_wint_t = Int

typealias __darwin_clock_tVar = ULongVarOf<__darwin_clock_t>
typealias __darwin_clock_t = ULong

typealias __darwin_socklen_tVar = UIntVarOf<__darwin_socklen_t>
typealias __darwin_socklen_t = __uint32_t

typealias __darwin_ssize_tVar = LongVarOf<__darwin_ssize_t>
typealias __darwin_ssize_t = Long

typealias __darwin_time_tVar = LongVarOf<__darwin_time_t>
typealias __darwin_time_t = Long

typealias __darwin_blkcnt_tVar = LongVarOf<__darwin_blkcnt_t>
typealias __darwin_blkcnt_t = __int64_t

typealias __darwin_blksize_tVar = IntVarOf<__darwin_blksize_t>
typealias __darwin_blksize_t = __int32_t

typealias __darwin_dev_tVar = IntVarOf<__darwin_dev_t>
typealias __darwin_dev_t = __int32_t

typealias __darwin_fsblkcnt_tVar = UIntVarOf<__darwin_fsblkcnt_t>
typealias __darwin_fsblkcnt_t = UInt

typealias __darwin_fsfilcnt_tVar = UIntVarOf<__darwin_fsfilcnt_t>
typealias __darwin_fsfilcnt_t = UInt

typealias __darwin_gid_tVar = UIntVarOf<__darwin_gid_t>
typealias __darwin_gid_t = __uint32_t

typealias __darwin_id_tVar = UIntVarOf<__darwin_id_t>
typealias __darwin_id_t = __uint32_t

typealias __darwin_ino64_tVar = ULongVarOf<__darwin_ino64_t>
typealias __darwin_ino64_t = __uint64_t

typealias __darwin_ino_tVar = ULongVarOf<__darwin_ino_t>
typealias __darwin_ino_t = __darwin_ino64_t

typealias __darwin_mach_port_name_tVar = UIntVarOf<__darwin_mach_port_name_t>
typealias __darwin_mach_port_name_t = __darwin_natural_t

typealias __darwin_mach_port_tVar = UIntVarOf<__darwin_mach_port_t>
typealias __darwin_mach_port_t = __darwin_mach_port_name_t

typealias __darwin_mode_tVar = UShortVarOf<__darwin_mode_t>
typealias __darwin_mode_t = __uint16_t

typealias __darwin_off_tVar = LongVarOf<__darwin_off_t>
typealias __darwin_off_t = __int64_t

typealias __darwin_pid_tVar = IntVarOf<__darwin_pid_t>
typealias __darwin_pid_t = __int32_t

typealias __darwin_sigset_tVar = UIntVarOf<__darwin_sigset_t>
typealias __darwin_sigset_t = __uint32_t

typealias __darwin_suseconds_tVar = IntVarOf<__darwin_suseconds_t>
typealias __darwin_suseconds_t = __int32_t

typealias __darwin_uid_tVar = UIntVarOf<__darwin_uid_t>
typealias __darwin_uid_t = __uint32_t

typealias __darwin_useconds_tVar = UIntVarOf<__darwin_useconds_t>
typealias __darwin_useconds_t = __uint32_t

typealias __darwin_uuid_tVar = CPointerVarOf<__darwin_uuid_t>
typealias __darwin_uuid_t = CArrayPointer<UByteVar>

typealias __darwin_uuid_string_tVar = CPointerVarOf<__darwin_uuid_string_t>
typealias __darwin_uuid_string_t = CArrayPointer<ByteVar>

typealias __darwin_pthread_attr_t = _opaque_pthread_attr_t

typealias __darwin_pthread_cond_t = _opaque_pthread_cond_t

typealias __darwin_pthread_condattr_t = _opaque_pthread_condattr_t

typealias __darwin_pthread_key_tVar = ULongVarOf<__darwin_pthread_key_t>
typealias __darwin_pthread_key_t = ULong

typealias __darwin_pthread_mutex_t = _opaque_pthread_mutex_t

typealias __darwin_pthread_mutexattr_t = _opaque_pthread_mutexattr_t

typealias __darwin_pthread_once_t = _opaque_pthread_once_t

typealias __darwin_pthread_rwlock_t = _opaque_pthread_rwlock_t

typealias __darwin_pthread_rwlockattr_t = _opaque_pthread_rwlockattr_t

typealias __darwin_pthread_tVar = CPointerVarOf<__darwin_pthread_t>
typealias __darwin_pthread_t = CPointer<_opaque_pthread_t>

typealias __darwin_nl_itemVar = IntVarOf<__darwin_nl_item>
typealias __darwin_nl_item = Int

typealias __darwin_wctrans_tVar = IntVarOf<__darwin_wctrans_t>
typealias __darwin_wctrans_t = Int

typealias __darwin_wctype_tVar = UIntVarOf<__darwin_wctype_t>
typealias __darwin_wctype_t = __uint32_t

typealias int8_tVar = ByteVarOf<int8_t>
typealias int8_t = Byte

typealias int16_tVar = ShortVarOf<int16_t>
typealias int16_t = Short

typealias int32_tVar = IntVarOf<int32_t>
typealias int32_t = Int

typealias int64_tVar = LongVarOf<int64_t>
typealias int64_t = Long

typealias u_int8_tVar = UByteVarOf<u_int8_t>
typealias u_int8_t = UByte

typealias u_int16_tVar = UShortVarOf<u_int16_t>
typealias u_int16_t = UShort

typealias u_int32_tVar = UIntVarOf<u_int32_t>
typealias u_int32_t = UInt

typealias u_int64_tVar = ULongVarOf<u_int64_t>
typealias u_int64_t = ULong

typealias register_tVar = LongVarOf<register_t>
typealias register_t = int64_t

typealias intptr_tVar = LongVarOf<intptr_t>
typealias intptr_t = __darwin_intptr_t

typealias uintptr_tVar = ULongVarOf<uintptr_t>
typealias uintptr_t = ULong

typealias user_addr_tVar = ULongVarOf<user_addr_t>
typealias user_addr_t = u_int64_t

typealias user_size_tVar = ULongVarOf<user_size_t>
typealias user_size_t = u_int64_t

typealias user_ssize_tVar = LongVarOf<user_ssize_t>
typealias user_ssize_t = int64_t

typealias user_long_tVar = LongVarOf<user_long_t>
typealias user_long_t = int64_t

typealias user_ulong_tVar = ULongVarOf<user_ulong_t>
typealias user_ulong_t = u_int64_t

typealias user_time_tVar = LongVarOf<user_time_t>
typealias user_time_t = int64_t

typealias user_off_tVar = LongVarOf<user_off_t>
typealias user_off_t = int64_t

typealias syscall_arg_tVar = ULongVarOf<syscall_arg_t>
typealias syscall_arg_t = u_int64_t

typealias ptrdiff_tVar = LongVarOf<ptrdiff_t>
typealias ptrdiff_t = __darwin_ptrdiff_t

typealias rsize_tVar = ULongVarOf<rsize_t>
typealias rsize_t = __darwin_size_t

typealias size_tVar = ULongVarOf<size_t>
typealias size_t = __darwin_size_t

typealias wchar_tVar = IntVarOf<wchar_t>
typealias wchar_t = __darwin_wchar_t

typealias wint_tVar = IntVarOf<wint_t>
typealias wint_t = __darwin_wint_t

typealias uint8_tVar = UByteVarOf<uint8_t>
typealias uint8_t = UByte

typealias uint16_tVar = UShortVarOf<uint16_t>
typealias uint16_t = UShort

typealias uint32_tVar = UIntVarOf<uint32_t>
typealias uint32_t = UInt

typealias uint64_tVar = ULongVarOf<uint64_t>
typealias uint64_t = ULong

typealias int_least8_tVar = ByteVarOf<int_least8_t>
typealias int_least8_t = int8_t

typealias int_least16_tVar = ShortVarOf<int_least16_t>
typealias int_least16_t = int16_t

typealias int_least32_tVar = IntVarOf<int_least32_t>
typealias int_least32_t = int32_t

typealias int_least64_tVar = LongVarOf<int_least64_t>
typealias int_least64_t = int64_t

typealias uint_least8_tVar = UByteVarOf<uint_least8_t>
typealias uint_least8_t = uint8_t

typealias uint_least16_tVar = UShortVarOf<uint_least16_t>
typealias uint_least16_t = uint16_t

typealias uint_least32_tVar = UIntVarOf<uint_least32_t>
typealias uint_least32_t = uint32_t

typealias uint_least64_tVar = ULongVarOf<uint_least64_t>
typealias uint_least64_t = uint64_t

typealias int_fast8_tVar = ByteVarOf<int_fast8_t>
typealias int_fast8_t = int8_t

typealias int_fast16_tVar = ShortVarOf<int_fast16_t>
typealias int_fast16_t = int16_t

typealias int_fast32_tVar = IntVarOf<int_fast32_t>
typealias int_fast32_t = int32_t

typealias int_fast64_tVar = LongVarOf<int_fast64_t>
typealias int_fast64_t = int64_t

typealias uint_fast8_tVar = UByteVarOf<uint_fast8_t>
typealias uint_fast8_t = uint8_t

typealias uint_fast16_tVar = UShortVarOf<uint_fast16_t>
typealias uint_fast16_t = uint16_t

typealias uint_fast32_tVar = UIntVarOf<uint_fast32_t>
typealias uint_fast32_t = uint32_t

typealias uint_fast64_tVar = ULongVarOf<uint_fast64_t>
typealias uint_fast64_t = uint64_t

typealias intmax_tVar = LongVarOf<intmax_t>
typealias intmax_t = Long

typealias uintmax_tVar = ULongVarOf<uintmax_t>
typealias uintmax_t = ULong

typealias GLFWglprocVar = CPointerVarOf<GLFWglproc>
typealias GLFWglproc = CPointer<CFunction<() -> Unit>>

typealias GLFWvkprocVar = CPointerVarOf<GLFWvkproc>
typealias GLFWvkproc = CPointer<CFunction<() -> Unit>>

typealias GLFWerrorfunVar = CPointerVarOf<GLFWerrorfun>
typealias GLFWerrorfun = CPointer<CFunction<(Int, CPointer<ByteVar>?) -> Unit>>

typealias GLFWwindowposfunVar = CPointerVarOf<GLFWwindowposfun>
typealias GLFWwindowposfun = CPointer<CFunction<(CPointer<GLFWwindow>?, Int, Int) -> Unit>>

typealias GLFWwindowsizefunVar = CPointerVarOf<GLFWwindowsizefun>
typealias GLFWwindowsizefun = CPointer<CFunction<(CPointer<GLFWwindow>?, Int, Int) -> Unit>>

typealias GLFWwindowclosefunVar = CPointerVarOf<GLFWwindowclosefun>
typealias GLFWwindowclosefun = CPointer<CFunction<(CPointer<GLFWwindow>?) -> Unit>>

typealias GLFWwindowrefreshfunVar = CPointerVarOf<GLFWwindowrefreshfun>
typealias GLFWwindowrefreshfun = CPointer<CFunction<(CPointer<GLFWwindow>?) -> Unit>>

typealias GLFWwindowfocusfunVar = CPointerVarOf<GLFWwindowfocusfun>
typealias GLFWwindowfocusfun = CPointer<CFunction<(CPointer<GLFWwindow>?, Int) -> Unit>>

typealias GLFWwindowiconifyfunVar = CPointerVarOf<GLFWwindowiconifyfun>
typealias GLFWwindowiconifyfun = CPointer<CFunction<(CPointer<GLFWwindow>?, Int) -> Unit>>

typealias GLFWframebuffersizefunVar = CPointerVarOf<GLFWframebuffersizefun>
typealias GLFWframebuffersizefun = CPointer<CFunction<(CPointer<GLFWwindow>?, Int, Int) -> Unit>>

typealias GLFWmousebuttonfunVar = CPointerVarOf<GLFWmousebuttonfun>
typealias GLFWmousebuttonfun = CPointer<CFunction<(CPointer<GLFWwindow>?, Int, Int, Int) -> Unit>>

typealias GLFWcursorposfunVar = CPointerVarOf<GLFWcursorposfun>
typealias GLFWcursorposfun = CPointer<CFunction<(CPointer<GLFWwindow>?, Double, Double) -> Unit>>

typealias GLFWcursorenterfunVar = CPointerVarOf<GLFWcursorenterfun>
typealias GLFWcursorenterfun = CPointer<CFunction<(CPointer<GLFWwindow>?, Int) -> Unit>>

typealias GLFWscrollfunVar = CPointerVarOf<GLFWscrollfun>
typealias GLFWscrollfun = CPointer<CFunction<(CPointer<GLFWwindow>?, Double, Double) -> Unit>>

typealias GLFWkeyfunVar = CPointerVarOf<GLFWkeyfun>
typealias GLFWkeyfun = CPointer<CFunction<(CPointer<GLFWwindow>?, Int, Int, Int, Int) -> Unit>>

typealias GLFWcharfunVar = CPointerVarOf<GLFWcharfun>
typealias GLFWcharfun = CPointer<CFunction<(CPointer<GLFWwindow>?, UInt) -> Unit>>

typealias GLFWcharmodsfunVar = CPointerVarOf<GLFWcharmodsfun>
typealias GLFWcharmodsfun = CPointer<CFunction<(CPointer<GLFWwindow>?, UInt, Int) -> Unit>>

typealias GLFWdropfunVar = CPointerVarOf<GLFWdropfun>
typealias GLFWdropfun = CPointer<CFunction<(CPointer<GLFWwindow>?, Int, CPointer<CPointerVar<ByteVar>>?) -> Unit>>

typealias GLFWmonitorfunVar = CPointerVarOf<GLFWmonitorfun>
typealias GLFWmonitorfun = CPointer<CFunction<(CPointer<GLFWmonitor>?, Int) -> Unit>>

typealias GLFWjoystickfunVar = CPointerVarOf<GLFWjoystickfun>
typealias GLFWjoystickfun = CPointer<CFunction<(Int, Int) -> Unit>>

@SymbolName("glfw_kniBridge0")
private external fun kniBridge0(): Int
@SymbolName("glfw_kniBridge1")
private external fun kniBridge1(): Unit
@SymbolName("glfw_kniBridge2")
private external fun kniBridge2(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("glfw_kniBridge3")
private external fun kniBridge3(): NativePtr
@SymbolName("glfw_kniBridge4")
private external fun kniBridge4(p0: NativePtr): NativePtr
@SymbolName("glfw_kniBridge5")
private external fun kniBridge5(p0: NativePtr): NativePtr
@SymbolName("glfw_kniBridge6")
private external fun kniBridge6(): NativePtr
@SymbolName("glfw_kniBridge7")
private external fun kniBridge7(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("glfw_kniBridge8")
private external fun kniBridge8(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("glfw_kniBridge9")
private external fun kniBridge9(p0: NativePtr): NativePtr
@SymbolName("glfw_kniBridge10")
private external fun kniBridge10(p0: NativePtr): NativePtr
@SymbolName("glfw_kniBridge11")
private external fun kniBridge11(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("glfw_kniBridge12")
private external fun kniBridge12(p0: NativePtr): NativePtr
@SymbolName("glfw_kniBridge13")
private external fun kniBridge13(p0: NativePtr, p1: Float): Unit
@SymbolName("glfw_kniBridge14")
private external fun kniBridge14(p0: NativePtr): NativePtr
@SymbolName("glfw_kniBridge15")
private external fun kniBridge15(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("glfw_kniBridge16")
private external fun kniBridge16(): Unit
@SymbolName("glfw_kniBridge17")
private external fun kniBridge17(p0: Int, p1: Int): Unit
@SymbolName("glfw_kniBridge18")
private external fun kniBridge18(p0: Int, p1: Int, p2: NativePtr, p3: NativePtr, p4: NativePtr): NativePtr
@SymbolName("glfw_kniBridge19")
private external fun kniBridge19(p0: NativePtr): Unit
@SymbolName("glfw_kniBridge20")
private external fun kniBridge20(p0: NativePtr): Int
@SymbolName("glfw_kniBridge21")
private external fun kniBridge21(p0: NativePtr, p1: Int): Unit
@SymbolName("glfw_kniBridge22")
private external fun kniBridge22(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("glfw_kniBridge23")
private external fun kniBridge23(p0: NativePtr, p1: Int, p2: NativePtr): Unit
@SymbolName("glfw_kniBridge24")
private external fun kniBridge24(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("glfw_kniBridge25")
private external fun kniBridge25(p0: NativePtr, p1: Int, p2: Int): Unit
@SymbolName("glfw_kniBridge26")
private external fun kniBridge26(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("glfw_kniBridge27")
private external fun kniBridge27(p0: NativePtr, p1: Int, p2: Int, p3: Int, p4: Int): Unit
@SymbolName("glfw_kniBridge28")
private external fun kniBridge28(p0: NativePtr, p1: Int, p2: Int): Unit
@SymbolName("glfw_kniBridge29")
private external fun kniBridge29(p0: NativePtr, p1: Int, p2: Int): Unit
@SymbolName("glfw_kniBridge30")
private external fun kniBridge30(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("glfw_kniBridge31")
private external fun kniBridge31(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): Unit
@SymbolName("glfw_kniBridge32")
private external fun kniBridge32(p0: NativePtr): Unit
@SymbolName("glfw_kniBridge33")
private external fun kniBridge33(p0: NativePtr): Unit
@SymbolName("glfw_kniBridge34")
private external fun kniBridge34(p0: NativePtr): Unit
@SymbolName("glfw_kniBridge35")
private external fun kniBridge35(p0: NativePtr): Unit
@SymbolName("glfw_kniBridge36")
private external fun kniBridge36(p0: NativePtr): Unit
@SymbolName("glfw_kniBridge37")
private external fun kniBridge37(p0: NativePtr): Unit
@SymbolName("glfw_kniBridge38")
private external fun kniBridge38(p0: NativePtr): NativePtr
@SymbolName("glfw_kniBridge39")
private external fun kniBridge39(p0: NativePtr, p1: NativePtr, p2: Int, p3: Int, p4: Int, p5: Int, p6: Int): Unit
@SymbolName("glfw_kniBridge40")
private external fun kniBridge40(p0: NativePtr, p1: Int): Int
@SymbolName("glfw_kniBridge41")
private external fun kniBridge41(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("glfw_kniBridge42")
private external fun kniBridge42(p0: NativePtr): NativePtr
@SymbolName("glfw_kniBridge43")
private external fun kniBridge43(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("glfw_kniBridge44")
private external fun kniBridge44(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("glfw_kniBridge45")
private external fun kniBridge45(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("glfw_kniBridge46")
private external fun kniBridge46(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("glfw_kniBridge47")
private external fun kniBridge47(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("glfw_kniBridge48")
private external fun kniBridge48(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("glfw_kniBridge49")
private external fun kniBridge49(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("glfw_kniBridge50")
private external fun kniBridge50(): Unit
@SymbolName("glfw_kniBridge51")
private external fun kniBridge51(): Unit
@SymbolName("glfw_kniBridge52")
private external fun kniBridge52(p0: Double): Unit
@SymbolName("glfw_kniBridge53")
private external fun kniBridge53(): Unit
@SymbolName("glfw_kniBridge54")
private external fun kniBridge54(p0: NativePtr, p1: Int): Int
@SymbolName("glfw_kniBridge55")
private external fun kniBridge55(p0: NativePtr, p1: Int, p2: Int): Unit
@SymbolName("glfw_kniBridge56")
private external fun kniBridge56(p0: Int, p1: Int): NativePtr
@SymbolName("glfw_kniBridge57")
private external fun kniBridge57(p0: NativePtr, p1: Int): Int
@SymbolName("glfw_kniBridge58")
private external fun kniBridge58(p0: NativePtr, p1: Int): Int
@SymbolName("glfw_kniBridge59")
private external fun kniBridge59(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@SymbolName("glfw_kniBridge60")
private external fun kniBridge60(p0: NativePtr, p1: Double, p2: Double): Unit
@SymbolName("glfw_kniBridge61")
private external fun kniBridge61(p0: NativePtr, p1: Int, p2: Int): NativePtr
@SymbolName("glfw_kniBridge62")
private external fun kniBridge62(p0: Int): NativePtr
@SymbolName("glfw_kniBridge63")
private external fun kniBridge63(p0: NativePtr): Unit
@SymbolName("glfw_kniBridge64")
private external fun kniBridge64(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("glfw_kniBridge65")
private external fun kniBridge65(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("glfw_kniBridge66")
private external fun kniBridge66(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("glfw_kniBridge67")
private external fun kniBridge67(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("glfw_kniBridge68")
private external fun kniBridge68(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("glfw_kniBridge69")
private external fun kniBridge69(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("glfw_kniBridge70")
private external fun kniBridge70(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("glfw_kniBridge71")
private external fun kniBridge71(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("glfw_kniBridge72")
private external fun kniBridge72(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("glfw_kniBridge73")
private external fun kniBridge73(p0: Int): Int
@SymbolName("glfw_kniBridge74")
private external fun kniBridge74(p0: Int, p1: NativePtr): NativePtr
@SymbolName("glfw_kniBridge75")
private external fun kniBridge75(p0: Int, p1: NativePtr): NativePtr
@SymbolName("glfw_kniBridge76")
private external fun kniBridge76(p0: Int): NativePtr
@SymbolName("glfw_kniBridge77")
private external fun kniBridge77(p0: NativePtr): NativePtr
@SymbolName("glfw_kniBridge78")
private external fun kniBridge78(p0: NativePtr, p1: NativePtr): Unit
@SymbolName("glfw_kniBridge79")
private external fun kniBridge79(p0: NativePtr): NativePtr
@SymbolName("glfw_kniBridge80")
private external fun kniBridge80(): Double
@SymbolName("glfw_kniBridge81")
private external fun kniBridge81(p0: Double): Unit
@SymbolName("glfw_kniBridge82")
private external fun kniBridge82(): ULong
@SymbolName("glfw_kniBridge83")
private external fun kniBridge83(): ULong
@SymbolName("glfw_kniBridge84")
private external fun kniBridge84(p0: NativePtr): Unit
@SymbolName("glfw_kniBridge85")
private external fun kniBridge85(): NativePtr
@SymbolName("glfw_kniBridge86")
private external fun kniBridge86(p0: NativePtr): Unit
@SymbolName("glfw_kniBridge87")
private external fun kniBridge87(p0: Int): Unit
@SymbolName("glfw_kniBridge88")
private external fun kniBridge88(p0: NativePtr): Int
@SymbolName("glfw_kniBridge89")
private external fun kniBridge89(p0: NativePtr): NativePtr
@SymbolName("glfw_kniBridge90")
private external fun kniBridge90(): Int
@SymbolName("glfw_kniBridge91")
private external fun kniBridge91(p0: NativePtr): NativePtr
@SymbolName("glfw_kniBridge92")
private external fun kniBridge92(): NativePtr
@SymbolName("glfw_kniBridge93")
private external fun kniBridge93(): NativePtr
